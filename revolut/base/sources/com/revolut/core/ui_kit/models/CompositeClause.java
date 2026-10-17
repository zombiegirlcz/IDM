package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/CompositeClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Lcom/revolut/core/ui_kit/models/UIKitClause;", "Law0/fa;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompositeClause implements Clause, fa, oy0.b {

    @NotNull
    public static final Parcelable.Creator<CompositeClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f57747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57749c;
    public final Clause d;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CompositeClause.class, parcel, arrayList, iE, 1);
            }
            return new CompositeClause(arrayList, (Clause) parcel.readParcelable(CompositeClause.class.getClassLoader()), (Style) parcel.readParcelable(CompositeClause.class.getClassLoader()), (Clause) parcel.readParcelable(CompositeClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CompositeClause[i];
        }
    }

    public CompositeClause(List clauses, Clause clause, Style style, Clause clause2) {
        Intrinsics.checkNotNullParameter(clauses, "clauses");
        this.f57747a = clauses;
        this.f57748b = clause;
        this.f57749c = style;
        this.d = clause2;
    }

    public static CompositeClause a(CompositeClause compositeClause, List clauses, Style style, int i) {
        if ((i & 1) != 0) {
            clauses = compositeClause.f57747a;
        }
        Clause clause = compositeClause.f57748b;
        if ((i & 4) != 0) {
            style = compositeClause.f57749c;
        }
        Clause clause2 = compositeClause.d;
        compositeClause.getClass();
        Intrinsics.checkNotNullParameter(clauses, "clauses");
        return new CompositeClause(clauses, clause, style, clause2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CompositeClause)) {
            return false;
        }
        CompositeClause compositeClause = (CompositeClause) obj2;
        return Intrinsics.f(this.f57747a, compositeClause.f57747a) && Intrinsics.f(this.f57748b, compositeClause.f57748b) && Intrinsics.f(this.f57749c, compositeClause.f57749c) && Intrinsics.f(this.d, compositeClause.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59927c() {
        return this.d;
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57906c() {
        return this.f57749c;
    }

    public final int hashCode() {
        int iHashCode = this.f57747a.hashCode() * 31;
        Clause clause = this.f57748b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Style style = this.f57749c;
        int iHashCode3 = (iHashCode2 + (style == null ? 0 : style.hashCode())) * 31;
        Clause clause2 = this.d;
        return iHashCode3 + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f57747a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f57748b, i);
        dest.writeParcelable(this.f57749c, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ CompositeClause(List list, Clause clause, Style style, Clause clause2, int i) {
        this(list, (i & 2) != 0 ? null : clause, (i & 4) != 0 ? null : style, (i & 8) != 0 ? null : clause2);
    }
}

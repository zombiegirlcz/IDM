package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.e7;
import aw0.fa;
import aw0.s1;
import com.revolut.core.ui_kit.models.ResourceId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/TextLocalisedQuantityClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/e7;", "Law0/fa;", "Law0/s1;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextLocalisedQuantityClause implements Clause, e7, fa, s1 {

    @NotNull
    public static final Parcelable.Creator<TextLocalisedQuantityClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceId f57949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f57950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57951c;
    public final Clause d;
    public final Style e;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ResourceId resourceId = (ResourceId) j6.a.f(parcel, "parcel", TextLocalisedQuantityClause.class);
            Number number = (Number) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readValue(TextLocalisedQuantityClause.class.getClassLoader()));
            }
            return new TextLocalisedQuantityClause(resourceId, number, arrayList, (Clause) parcel.readParcelable(TextLocalisedQuantityClause.class.getClassLoader()), (Style) parcel.readParcelable(TextLocalisedQuantityClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextLocalisedQuantityClause[i];
        }
    }

    public TextLocalisedQuantityClause(ResourceId resId, Number quantity, List args, Clause clause, Style style) {
        Intrinsics.checkNotNullParameter(resId, "resId");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f57949a = resId;
        this.f57950b = quantity;
        this.f57951c = args;
        this.d = clause;
        this.e = style;
    }

    @Override // aw0.e7
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ResourceId getF57940a() {
        return this.f57949a;
    }

    @Override // aw0.s1
    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF57941b() {
        return this.f57951c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextLocalisedQuantityClause)) {
            return false;
        }
        TextLocalisedQuantityClause textLocalisedQuantityClause = (TextLocalisedQuantityClause) obj2;
        return Intrinsics.f(this.f57949a, textLocalisedQuantityClause.f57949a) && Intrinsics.f(this.f57950b, textLocalisedQuantityClause.f57950b) && Intrinsics.f(this.f57951c, textLocalisedQuantityClause.f57951c) && Intrinsics.f(this.d, textLocalisedQuantityClause.d) && Intrinsics.f(this.e, textLocalisedQuantityClause.e);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57823c() {
        return this.e;
    }

    public final int hashCode() {
        int iD = p.a.d((this.f57950b.hashCode() + (this.f57949a.hashCode() * 31)) * 31, 31, this.f57951c);
        Clause clause = this.d;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        Style style = this.e;
        return iHashCode + (style != null ? style.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57949a, i);
        dest.writeSerializable(this.f57950b);
        Iterator itV = p.a.v(this.f57951c, dest);
        while (itV.hasNext()) {
            dest.writeValue(itV.next());
        }
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ TextLocalisedQuantityClause(ResourceId.IntResourceId intResourceId, Number number, List list, Custom custom, int i) {
        this(intResourceId, number, (i & 4) != 0 ? zhm.u.c(number) : list, (Clause) null, (i & 16) != 0 ? null : custom);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextLocalisedQuantityClause(int i, Number quantity, List list, Style style, int i2) {
        List args = (i2 & 4) != 0 ? zhm.u.c(quantity) : list;
        style = (i2 & 16) != 0 ? null : style;
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(args, "args");
        this(new ResourceId.IntResourceId(i), quantity, args, (Clause) null, style);
    }
}

package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.e7;
import aw0.fa;
import aw0.s1;
import com.revolut.core.ui_kit.models.ResourceId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/TextLocalisedClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/e7;", "Law0/fa;", "Law0/s1;", "", "toString", "()Ljava/lang/String;", "CREATOR", "a", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextLocalisedClause implements Clause, e7, fa, s1 {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceId f57940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57942c;
    public final Clause d;
    public final boolean e;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.models.TextLocalisedClause$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator {
        private Companion() {
        }

        public static final ClassLoader a(Companion companion) {
            companion.getClass();
            ClassLoader classLoader = TextLocalisedClause.class.getClassLoader();
            if (classLoader != null) {
                return classLoader;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(source, "source");
            Companion companion = TextLocalisedClause.INSTANCE;
            Parcelable parcelable = source.readParcelable(a(companion));
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ArrayList arrayList = new ArrayList();
            source.readList(arrayList, a(companion));
            Unit unit = Unit.f186387a;
            return new TextLocalisedClause((ResourceId) parcelable, arrayList, (Style) source.readParcelable(a(companion)), (Clause) source.readParcelable(a(companion)), 16);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextLocalisedClause[i];
        }
    }

    public TextLocalisedClause(int i, List list, Style style, int i2) {
        this(i, (i2 & 2) != 0 ? zhm.f0.f322471a : list, (i2 & 4) != 0 ? null : style);
    }

    public static TextLocalisedClause c(TextLocalisedClause textLocalisedClause, List list, Style style, int i) {
        ResourceId resId = textLocalisedClause.f57940a;
        if ((i & 2) != 0) {
            list = textLocalisedClause.f57941b;
        }
        List args = list;
        if ((i & 4) != 0) {
            style = textLocalisedClause.f57942c;
        }
        Clause clause = textLocalisedClause.d;
        boolean z = textLocalisedClause.e;
        textLocalisedClause.getClass();
        Intrinsics.checkNotNullParameter(resId, "resId");
        Intrinsics.checkNotNullParameter(args, "args");
        return new TextLocalisedClause(resId, args, style, clause, z);
    }

    @Override // aw0.e7
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ResourceId getF57949a() {
        return this.f57940a;
    }

    @Override // aw0.s1
    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF57951c() {
        return this.f57941b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextLocalisedClause)) {
            return false;
        }
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) obj2;
        return Intrinsics.f(this.f57940a, textLocalisedClause.f57940a) && Intrinsics.f(this.f57941b, textLocalisedClause.f57941b) && Intrinsics.f(this.f57942c, textLocalisedClause.f57942c) && Intrinsics.f(this.d, textLocalisedClause.d) && this.e == textLocalisedClause.e;
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57751b() {
        return this.f57942c;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f57940a.hashCode() * 31, 31, this.f57941b);
        Style style = this.f57942c;
        int iHashCode = (iD + (style == null ? 0 : style.hashCode())) * 31;
        Clause clause = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57940a, i);
        dest.writeList(this.f57941b);
        dest.writeParcelable(this.f57942c, i);
        dest.writeParcelable(this.d, i);
    }

    public TextLocalisedClause(ResourceId resourceId, List list, Style style, Clause clause, int i) {
        this(resourceId, (i & 2) != 0 ? zhm.f0.f322471a : list, (i & 4) != 0 ? null : style, (i & 8) != 0 ? null : clause, (i & 16) == 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextLocalisedClause(String resKey, List list, Clause clause, boolean z, int i) {
        List args = (i & 2) != 0 ? zhm.f0.f322471a : list;
        Clause clause2 = (i & 8) != 0 ? null : clause;
        z = (i & 16) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        Intrinsics.checkNotNullParameter(args, "args");
        this(new ResourceId.StringResourceId(resKey), args, (Style) null, clause2, z);
    }

    public TextLocalisedClause(ResourceId resId, List args, Style style, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(resId, "resId");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f57940a = resId;
        this.f57941b = args;
        this.f57942c = style;
        this.d = clause;
        this.e = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextLocalisedClause(int i, List args, Style style) {
        this(new ResourceId.IntResourceId(i), args, style, (Clause) null, 16);
        Intrinsics.checkNotNullParameter(args, "args");
    }
}

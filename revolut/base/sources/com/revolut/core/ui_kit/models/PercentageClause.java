package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.p9;
import aw0.wa;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/PercentageClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "", "toString", "()Ljava/lang/String;", "Format", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PercentageClause implements Clause, fa {

    @NotNull
    public static final Parcelable.Creator<PercentageClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f57904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f57905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57906c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PercentageClause((BigDecimal) parcel.readSerializable(), (Format) parcel.readParcelable(PercentageClause.class.getClassLoader()), (Style) parcel.readParcelable(PercentageClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PercentageClause[i];
        }
    }

    public PercentageClause(BigDecimal percent, Format format, Style style) {
        Intrinsics.checkNotNullParameter(percent, "percent");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f57904a = percent;
        this.f57905b = format;
        this.f57906c = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Format getF57905b() {
        return this.f57905b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getF57904a() {
        return this.f57904a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PercentageClause)) {
            return false;
        }
        PercentageClause percentageClause = (PercentageClause) obj2;
        return Intrinsics.f(this.f57904a, percentageClause.f57904a) && Intrinsics.f(this.f57905b, percentageClause.f57905b) && Intrinsics.f(this.f57906c, percentageClause.f57906c);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57937b() {
        return this.f57906c;
    }

    public final int hashCode() {
        int iHashCode = (this.f57905b.hashCode() + (this.f57904a.hashCode() * 31)) * 31;
        Style style = this.f57906c;
        return iHashCode + (style == null ? 0 : style.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f57904a);
        dest.writeParcelable(this.f57905b, i);
        dest.writeParcelable(this.f57906c, i);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/PercentageClause$Format;", "Landroid/os/Parcelable;", "Default", "Long", "Custom", "Lcom/revolut/core/ui_kit/models/PercentageClause$Format$Custom;", "Lcom/revolut/core/ui_kit/models/PercentageClause$Format$Default;", "Lcom/revolut/core/ui_kit/models/PercentageClause$Format$Long;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Format extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/PercentageClause$Format$Default;", "Lcom/revolut/core/ui_kit/models/PercentageClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default implements Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f57910a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f57910a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            private Default() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/PercentageClause$Format$Long;", "Lcom/revolut/core/ui_kit/models/PercentageClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Long implements Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Long f57911a = new Long();

            @NotNull
            public static final Parcelable.Creator<Long> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Long.f57911a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Long[i];
                }
            }

            private Long() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/PercentageClause$Format$Custom;", "Lcom/revolut/core/ui_kit/models/PercentageClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements Format {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57907a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RoundingMode f57908b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final p9 f57909c;
            public final wa d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom(parcel.readInt(), p9.valueOf(parcel.readString()), wa.valueOf(parcel.readString()), RoundingMode.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(int i, p9 signShowingPolicy, wa trailingZeroPolicy, RoundingMode roundingMode) {
                Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                Intrinsics.checkNotNullParameter(trailingZeroPolicy, "trailingZeroPolicy");
                this.f57907a = i;
                this.f57908b = roundingMode;
                this.f57909c = signShowingPolicy;
                this.d = trailingZeroPolicy;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57907a() {
                return this.f57907a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final RoundingMode getF57908b() {
                return this.f57908b;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final p9 getF57909c() {
                return this.f57909c;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final wa getD() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) obj2;
                return this.f57907a == custom.f57907a && this.f57908b == custom.f57908b && this.f57909c == custom.f57909c && this.d == custom.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.f57909c.hashCode() + ((this.f57908b.hashCode() + (Integer.hashCode(this.f57907a) * 31)) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57907a);
                dest.writeString(this.f57908b.name());
                dest.writeString(this.f57909c.name());
                dest.writeString(this.d.name());
            }

            public /* synthetic */ Custom(int i, int i2, p9 p9Var, wa waVar, RoundingMode roundingMode) {
                this(i, (i2 & 4) != 0 ? p9.ONLY_NEGATIVE : p9Var, (i2 & 8) != 0 ? wa.STRIP_ALL_TRAILING_ZEROES : waVar, (i2 & 2) != 0 ? RoundingMode.DOWN : roundingMode);
            }
        }
    }

    public /* synthetic */ PercentageClause(BigDecimal bigDecimal, Format format, Style style, int i) {
        this(bigDecimal, (i & 2) != 0 ? Format.Default.f57910a : format, (i & 4) != 0 ? null : style);
    }

    public /* synthetic */ PercentageClause(double d, Format format, Custom custom, int i) {
        this(d, (i & 2) != 0 ? Format.Default.f57910a : format, (i & 4) != 0 ? null : custom);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PercentageClause(double d, Format format, Style style) {
        Intrinsics.checkNotNullParameter(format, "format");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        this(bigDecimalValueOf, format, style);
    }
}

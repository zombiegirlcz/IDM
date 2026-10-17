package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.n9;
import aw0.o9;
import aw0.p9;
import aw0.wa;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/NumberClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "Law0/n9;", "", "toString", "()Ljava/lang/String;", "Format", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NumberClause implements Clause, fa, n9 {

    @NotNull
    public static final Parcelable.Creator<NumberClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f57894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f57895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57896c;
    public final o9 d;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/models/NumberClause$Format;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "FixedDigitsAfterDot", "AllDigitsAfterDot", "Compact", "Lcom/revolut/core/ui_kit/models/NumberClause$Format$AllDigitsAfterDot;", "Lcom/revolut/core/ui_kit/models/NumberClause$Format$Compact;", "Lcom/revolut/core/ui_kit/models/NumberClause$Format$Default;", "Lcom/revolut/core/ui_kit/models/NumberClause$Format$FixedDigitsAfterDot;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Format implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NumberClause$Format$AllDigitsAfterDot;", "Lcom/revolut/core/ui_kit/models/NumberClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AllDigitsAfterDot extends Format {

            @NotNull
            public static final Parcelable.Creator<AllDigitsAfterDot> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final wa f57897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p9 f57898b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AllDigitsAfterDot(wa.valueOf(parcel.readString()), p9.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllDigitsAfterDot[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AllDigitsAfterDot() {
                this(null, 0 == true ? 1 : 0, 3);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final p9 getF57898b() {
                return this.f57898b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final wa getF57897a() {
                return this.f57897a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AllDigitsAfterDot)) {
                    return false;
                }
                AllDigitsAfterDot allDigitsAfterDot = (AllDigitsAfterDot) obj2;
                return this.f57897a == allDigitsAfterDot.f57897a && this.f57898b == allDigitsAfterDot.f57898b;
            }

            public final int hashCode() {
                return this.f57898b.hashCode() + (this.f57897a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57897a.name());
                dest.writeString(this.f57898b.name());
            }

            public AllDigitsAfterDot(wa trailingZeroPolicy, p9 signShowingPolicy) {
                Intrinsics.checkNotNullParameter(trailingZeroPolicy, "trailingZeroPolicy");
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                this.f57897a = trailingZeroPolicy;
                this.f57898b = signShowingPolicy;
            }

            public /* synthetic */ AllDigitsAfterDot(wa waVar, p9 p9Var, int i) {
                this((i & 1) != 0 ? wa.STRIP_ALL_TRAILING_ZEROES : waVar, (i & 2) != 0 ? p9.ONLY_NEGATIVE : p9Var);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/NumberClause$Format$Default;", "Lcom/revolut/core/ui_kit/models/NumberClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default extends Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f57900a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f57900a;
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

        private Format() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NumberClause$Format$Compact;", "Lcom/revolut/core/ui_kit/models/NumberClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Compact extends Format {

            @NotNull
            public static final Parcelable.Creator<Compact> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f57899a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Compact(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Compact[i];
                }
            }

            public Compact(boolean z) {
                this.f57899a = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF57899a() {
                return this.f57899a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Compact) && this.f57899a == ((Compact) obj2).f57899a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f57899a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57899a ? 1 : 0);
            }

            public Compact() {
                this(true);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NumberClause$Format$FixedDigitsAfterDot;", "Lcom/revolut/core/ui_kit/models/NumberClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FixedDigitsAfterDot extends Format {

            @NotNull
            public static final Parcelable.Creator<FixedDigitsAfterDot> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RoundingMode f57902b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final wa f57903c;
            public final p9 d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    RoundingMode roundingModeValueOf = RoundingMode.valueOf(parcel.readString());
                    return new FixedDigitsAfterDot(i, p9.valueOf(parcel.readString()), wa.valueOf(parcel.readString()), roundingModeValueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FixedDigitsAfterDot[i];
                }
            }

            public FixedDigitsAfterDot(int i, p9 signShowingPolicy, wa trailingZeroPolicy, RoundingMode roundingMode) {
                Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
                Intrinsics.checkNotNullParameter(trailingZeroPolicy, "trailingZeroPolicy");
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                this.f57901a = i;
                this.f57902b = roundingMode;
                this.f57903c = trailingZeroPolicy;
                this.d = signShowingPolicy;
            }

            public static FixedDigitsAfterDot a(FixedDigitsAfterDot fixedDigitsAfterDot, wa trailingZeroPolicy, int i) {
                int i2 = (i & 1) != 0 ? fixedDigitsAfterDot.f57901a : 0;
                RoundingMode roundingMode = fixedDigitsAfterDot.f57902b;
                if ((i & 4) != 0) {
                    trailingZeroPolicy = fixedDigitsAfterDot.f57903c;
                }
                p9 signShowingPolicy = fixedDigitsAfterDot.d;
                Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
                Intrinsics.checkNotNullParameter(trailingZeroPolicy, "trailingZeroPolicy");
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                return new FixedDigitsAfterDot(i2, signShowingPolicy, trailingZeroPolicy, roundingMode);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getF57901a() {
                return this.f57901a;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final RoundingMode getF57902b() {
                return this.f57902b;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final p9 getD() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final wa getF57903c() {
                return this.f57903c;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof FixedDigitsAfterDot)) {
                    return false;
                }
                FixedDigitsAfterDot fixedDigitsAfterDot = (FixedDigitsAfterDot) obj2;
                return this.f57901a == fixedDigitsAfterDot.f57901a && this.f57902b == fixedDigitsAfterDot.f57902b && this.f57903c == fixedDigitsAfterDot.f57903c && this.d == fixedDigitsAfterDot.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.f57903c.hashCode() + ((this.f57902b.hashCode() + (Integer.hashCode(this.f57901a) * 31)) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57901a);
                dest.writeString(this.f57902b.name());
                dest.writeString(this.f57903c.name());
                dest.writeString(this.d.name());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ FixedDigitsAfterDot(int i, int i2, p9 p9Var, wa waVar, RoundingMode roundingMode) {
                roundingMode = (i2 & 2) != 0 ? RoundingMode.DOWN : roundingMode;
                this(i, (i2 & 8) != 0 ? p9.ONLY_NEGATIVE : p9Var, (i2 & 4) != 0 ? wa.STRIP_ALL_TRAILING_ZEROES : waVar, roundingMode);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NumberClause((BigDecimal) parcel.readSerializable(), (Format) parcel.readParcelable(NumberClause.class.getClassLoader()), (Style) parcel.readParcelable(NumberClause.class.getClassLoader()), o9.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NumberClause[i];
        }
    }

    public NumberClause(BigDecimal number, Format format, Style style, o9 sensitivity) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        this.f57894a = number;
        this.f57895b = format;
        this.f57896c = style;
        this.d = sensitivity;
    }

    @Override // aw0.n9
    /* JADX INFO: renamed from: a, reason: from getter */
    public final o9 getF57742b() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Format getF57895b() {
        return this.f57895b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getF57894a() {
        return this.f57894a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NumberClause)) {
            return false;
        }
        NumberClause numberClause = (NumberClause) obj2;
        return Intrinsics.f(this.f57894a, numberClause.f57894a) && Intrinsics.f(this.f57895b, numberClause.f57895b) && Intrinsics.f(this.f57896c, numberClause.f57896c) && this.d == numberClause.d;
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57913b() {
        return this.f57896c;
    }

    public final int hashCode() {
        int iHashCode = (this.f57895b.hashCode() + (this.f57894a.hashCode() * 31)) * 31;
        Style style = this.f57896c;
        return this.d.hashCode() + ((iHashCode + (style == null ? 0 : style.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f57894a);
        dest.writeParcelable(this.f57895b, i);
        dest.writeParcelable(this.f57896c, i);
        dest.writeString(this.d.name());
    }

    public /* synthetic */ NumberClause(BigDecimal bigDecimal, Format format, Style style, o9 o9Var, int i) {
        this(bigDecimal, (i & 2) != 0 ? Format.Default.f57900a : format, (i & 4) != 0 ? null : style, (i & 8) != 0 ? o9.NON_SENSITIVE : o9Var);
    }

    public /* synthetic */ NumberClause(int i, Format.Compact compact, Custom custom, int i2) {
        this(i, (i2 & 2) != 0 ? Format.Default.f57900a : compact, (Style) ((i2 & 4) != 0 ? null : custom));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NumberClause(int i, Format format, Style style) {
        Intrinsics.checkNotNullParameter(format, "format");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        this(bigDecimalValueOf, format, style, null, 8);
    }

    public /* synthetic */ NumberClause(long j2, Format.Compact compact, int i) {
        this(j2, (i & 2) != 0 ? Format.Default.f57900a : compact, (Custom) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NumberClause(long j2, Format format, Custom custom) {
        Intrinsics.checkNotNullParameter(format, "format");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        this(bigDecimalValueOf, format, custom, null, 8);
    }
}

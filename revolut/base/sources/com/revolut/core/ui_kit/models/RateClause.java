package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/RateClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "", "toString", "()Ljava/lang/String;", "Format", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RateClause implements Clause, fa {

    @NotNull
    public static final Parcelable.Creator<RateClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f57927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f57928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format f57929c;
    public final Style d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/RateClause$Format;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Pretty", "ExchangeRate", "Lcom/revolut/core/ui_kit/models/RateClause$Format$Default;", "Lcom/revolut/core/ui_kit/models/RateClause$Format$ExchangeRate;", "Lcom/revolut/core/ui_kit/models/RateClause$Format$Pretty;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Format implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/RateClause$Format$Default;", "Lcom/revolut/core/ui_kit/models/RateClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default extends Format {

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f57930a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final xi0.b f57931b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Default((xi0.b) parcel.readSerializable(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            public Default(xi0.b bVar, boolean z) {
                this.f57930a = z;
                this.f57931b = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final xi0.b getF57931b() {
                return this.f57931b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF57930a() {
                return this.f57930a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Default)) {
                    return false;
                }
                Default r56 = (Default) obj2;
                return this.f57930a == r56.f57930a && Intrinsics.f(this.f57931b, r56.f57931b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f57930a) * 31;
                xi0.b bVar = this.f57931b;
                return iHashCode + (bVar == null ? 0 : bVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57930a ? 1 : 0);
                dest.writeSerializable(this.f57931b);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/RateClause$Format$Pretty;", "Lcom/revolut/core/ui_kit/models/RateClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Pretty extends Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Pretty f57933a = new Pretty();

            @NotNull
            public static final Parcelable.Creator<Pretty> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Pretty.f57933a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pretty[i];
                }
            }

            private Pretty() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/RateClause$Format$ExchangeRate;", "Lcom/revolut/core/ui_kit/models/RateClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ExchangeRate extends Format {

            @NotNull
            public static final Parcelable.Creator<ExchangeRate> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f57932a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ExchangeRate(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExchangeRate[i];
                }
            }

            public ExchangeRate(boolean z) {
                this.f57932a = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF57932a() {
                return this.f57932a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ExchangeRate) && this.f57932a == ((ExchangeRate) obj2).f57932a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f57932a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57932a ? 1 : 0);
            }

            public ExchangeRate() {
                this(true);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RateClause((BigDecimal) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), (Format) parcel.readParcelable(RateClause.class.getClassLoader()), (Style) parcel.readParcelable(RateClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RateClause[i];
        }
    }

    public RateClause(BigDecimal amount, xi0.b currency, Format format, Style style) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f57927a = amount;
        this.f57928b = currency;
        this.f57929c = format;
        this.d = style;
    }

    /* JADX INFO: renamed from: T8, reason: from getter */
    public final xi0.b getF57928b() {
        return this.f57928b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getF57927a() {
        return this.f57927a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Format getF57929c() {
        return this.f57929c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RateClause)) {
            return false;
        }
        RateClause rateClause = (RateClause) obj2;
        return Intrinsics.f(this.f57927a, rateClause.f57927a) && Intrinsics.f(this.f57928b, rateClause.f57928b) && Intrinsics.f(this.f57929c, rateClause.f57929c) && Intrinsics.f(this.d, rateClause.d);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getE() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f57929c.hashCode() + h30.l.j(this.f57928b, this.f57927a.hashCode() * 31, 31)) * 31;
        Style style = this.d;
        return iHashCode + (style == null ? 0 : style.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f57927a);
        dest.writeSerializable(this.f57928b);
        dest.writeParcelable(this.f57929c, i);
        dest.writeParcelable(this.d, i);
    }
}

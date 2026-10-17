package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/CurrencyClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "", "toString", "()Ljava/lang/String;", "Format", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyClause implements Clause, fa {

    @NotNull
    public static final Parcelable.Creator<CurrencyClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f57752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f57753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57754c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/CurrencyClause$Format;", "Landroid/os/Parcelable;", "DisplayName", "Ticker", "Lcom/revolut/core/ui_kit/models/CurrencyClause$Format$DisplayName;", "Lcom/revolut/core/ui_kit/models/CurrencyClause$Format$Ticker;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Format extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/CurrencyClause$Format$DisplayName;", "Lcom/revolut/core/ui_kit/models/CurrencyClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DisplayName implements Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DisplayName f57755a = new DisplayName();

            @NotNull
            public static final Parcelable.Creator<DisplayName> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DisplayName.f57755a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DisplayName[i];
                }
            }

            private DisplayName() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/CurrencyClause$Format$Ticker;", "Lcom/revolut/core/ui_kit/models/CurrencyClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Ticker implements Format {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Ticker f57756a = new Ticker();

            @NotNull
            public static final Parcelable.Creator<Ticker> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Ticker.f57756a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Ticker[i];
                }
            }

            private Ticker() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyClause((xi0.b) parcel.readSerializable(), (Format) parcel.readParcelable(CurrencyClause.class.getClassLoader()), (Style) parcel.readParcelable(CurrencyClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencyClause[i];
        }
    }

    public CurrencyClause(xi0.b currency, Format format, Style style) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f57752a = currency;
        this.f57753b = format;
        this.f57754c = style;
    }

    /* JADX INFO: renamed from: T8, reason: from getter */
    public final xi0.b getF57752a() {
        return this.f57752a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Format getF57753b() {
        return this.f57753b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrencyClause)) {
            return false;
        }
        CurrencyClause currencyClause = (CurrencyClause) obj2;
        return Intrinsics.f(this.f57752a, currencyClause.f57752a) && Intrinsics.f(this.f57753b, currencyClause.f57753b) && Intrinsics.f(this.f57754c, currencyClause.f57754c);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57913b() {
        return this.f57754c;
    }

    public final int hashCode() {
        int iHashCode = (this.f57753b.hashCode() + (this.f57752a.hashCode() * 31)) * 31;
        Style style = this.f57754c;
        return iHashCode + (style == null ? 0 : style.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f57752a);
        dest.writeParcelable(this.f57753b, i);
        dest.writeParcelable(this.f57754c, i);
    }

    public /* synthetic */ CurrencyClause(xi0.b bVar, Format format, Style style, int i) {
        this(bVar, (i & 2) != 0 ? Format.DisplayName.f57755a : format, (i & 4) != 0 ? null : style);
    }
}

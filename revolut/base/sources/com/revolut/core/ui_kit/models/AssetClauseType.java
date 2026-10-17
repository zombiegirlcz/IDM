package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/models/AssetClauseType;", "Landroid/os/Parcelable;", "<init>", "()V", "Stock", "Money", "Crypto", "Commodity", "Lcom/revolut/core/ui_kit/models/AssetClauseType$Commodity;", "Lcom/revolut/core/ui_kit/models/AssetClauseType$Crypto;", "Lcom/revolut/core/ui_kit/models/AssetClauseType$Money;", "Lcom/revolut/core/ui_kit/models/AssetClauseType$Stock;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AssetClauseType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/AssetClauseType$Commodity;", "Lcom/revolut/core/ui_kit/models/AssetClauseType;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Commodity extends AssetClauseType {

        @NotNull
        public static final Parcelable.Creator<Commodity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyClause.Format f57734a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Commodity((MoneyClause.Format) parcel.readParcelable(Commodity.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodity[i];
            }
        }

        public Commodity(MoneyClause.Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f57734a = format;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MoneyClause.Format getF57734a() {
            return this.f57734a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Commodity) && Intrinsics.f(this.f57734a, ((Commodity) obj2).f57734a);
        }

        public final int hashCode() {
            return this.f57734a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57734a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/AssetClauseType$Crypto;", "Lcom/revolut/core/ui_kit/models/AssetClauseType;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crypto extends AssetClauseType {

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyClause.Format f57735a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto((MoneyClause.Format) parcel.readParcelable(Crypto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public Crypto(MoneyClause.Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f57735a = format;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MoneyClause.Format getF57735a() {
            return this.f57735a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Crypto) && Intrinsics.f(this.f57735a, ((Crypto) obj2).f57735a);
        }

        public final int hashCode() {
            return this.f57735a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57735a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/AssetClauseType$Money;", "Lcom/revolut/core/ui_kit/models/AssetClauseType;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Money extends AssetClauseType {

        @NotNull
        public static final Parcelable.Creator<Money> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyClause.Format f57736a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Money((MoneyClause.Format) parcel.readParcelable(Money.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Money[i];
            }
        }

        public Money(MoneyClause.Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f57736a = format;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MoneyClause.Format getF57736a() {
            return this.f57736a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Money) && Intrinsics.f(this.f57736a, ((Money) obj2).f57736a);
        }

        public final int hashCode() {
            return this.f57736a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57736a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/AssetClauseType$Stock;", "Lcom/revolut/core/ui_kit/models/AssetClauseType;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stock extends AssetClauseType {

        @NotNull
        public static final Parcelable.Creator<Stock> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NumberClause.Format f57737a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stock((NumberClause.Format) parcel.readParcelable(Stock.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stock[i];
            }
        }

        public Stock() {
            this(0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NumberClause.Format getF57737a() {
            return this.f57737a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Stock) && Intrinsics.f(this.f57737a, ((Stock) obj2).f57737a);
        }

        public final int hashCode() {
            return this.f57737a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57737a, i);
        }

        public Stock(NumberClause.Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f57737a = format;
        }

        public /* synthetic */ Stock(int i) {
            this(new NumberClause.Format.AllDigitsAfterDot(null, null, 3));
        }
    }

    private AssetClauseType() {
    }
}

package com.revolut.feature.crypto.exchange.fees.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "Initial", "Details", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem$Details;", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem$Initial;", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoExchangeFeesControllerContract$PagerItem implements FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem$Details;", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends CryptoExchangeFeesControllerContract$PagerItem {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoExchangeFees f70837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70838b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details((CryptoExchangeFees) parcel.readParcelable(Details.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(CryptoExchangeFees fees) {
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.f70837a = fees;
            this.f70838b = ((hha.d) d0.b0(fees.f70809a)).f152287a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f70837a, ((Details) obj2).f70837a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF70838b() {
            return this.f70838b;
        }

        public final int hashCode() {
            return this.f70837a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70837a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem$Initial;", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem;", "<init>", "()V", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial extends CryptoExchangeFeesControllerContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f70839a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f70839a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    private CryptoExchangeFeesControllerContract$PagerItem() {
    }
}

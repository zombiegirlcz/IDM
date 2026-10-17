package com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto_feed/impl/chat_widgets/crypto_tokens/list/CryptoTokensListDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/crypto_feed/impl/chat_widgets/crypto_tokens/list/CryptoTokensListDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_crypto_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoTokensListDestination extends InternalDestination<InputData> {

    @NotNull
    public static final Parcelable.Creator<CryptoTokensListDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f71361b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto_feed/impl/chat_widgets/crypto_tokens/list/CryptoTokensListDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Item", "Price", "feature_crypto_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f71364c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_feed/impl/chat_widgets/crypto_tokens/list/CryptoTokensListDestination$InputData$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f71365a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f71366b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Price f71367c;
            public final double d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString(), parcel.readString(), Price.CREATOR.createFromParcel(parcel), parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(String symbol, String subtitle, Price price, double d) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(price, "price");
                this.f71365a = symbol;
                this.f71366b = subtitle;
                this.f71367c = price;
                this.d = d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj2;
                return Intrinsics.f(this.f71365a, item.f71365a) && Intrinsics.f(this.f71366b, item.f71366b) && Intrinsics.f(this.f71367c, item.f71367c) && Double.compare(this.d, item.d) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.d) + ((this.f71367c.hashCode() + p.a.c(this.f71365a.hashCode() * 31, 31, this.f71366b)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f71365a);
                dest.writeString(this.f71366b);
                this.f71367c.writeToParcel(dest, i);
                dest.writeDouble(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_feed/impl/chat_widgets/crypto_tokens/list/CryptoTokensListDestination$InputData$Price;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Price implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Price> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f71368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f71369b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Price(parcel.readLong(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Price[i];
                }
            }

            public Price(long j2, String currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f71368a = j2;
                this.f71369b = currency;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Price)) {
                    return false;
                }
                Price price = (Price) obj2;
                return this.f71368a == price.f71368a && Intrinsics.f(this.f71369b, price.f71369b);
            }

            public final int hashCode() {
                return this.f71369b.hashCode() + (Long.hashCode(this.f71368a) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.f71368a);
                dest.writeString(this.f71369b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new InputData(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(String title, String subtitle, ArrayList items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f71362a = title;
            this.f71363b = subtitle;
            this.f71364c = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f71362a, inputData.f71362a) && Intrinsics.f(this.f71363b, inputData.f71363b) && this.f71364c.equals(inputData.f71364c);
        }

        public final int hashCode() {
            return this.f71364c.hashCode() + p.a.c(this.f71362a.hashCode() * 31, 31, this.f71363b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71362a);
            dest.writeString(this.f71363b);
            Iterator itY = j6.a.y(this.f71364c, dest);
            while (itY.hasNext()) {
                ((Item) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTokensListDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoTokensListDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTokensListDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f71361b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f71361b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoTokensListDestination) && Intrinsics.f(this.f71361b, ((CryptoTokensListDestination) obj2).f71361b);
    }

    public final int hashCode() {
        return this.f71361b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71361b.writeToParcel(dest, i);
    }
}

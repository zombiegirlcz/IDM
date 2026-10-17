package com.revolut.feature.credit.card.api.models.creditcard;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ll4.i;
import ll4.j;
import org.jetbrains.annotations.NotNull;
import yw4.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardFeatureConfig;", "Landroid/os/Parcelable;", "MoveMoneyFeatureConfig", "ll4/i", "ll4/j", "UnsupportedFeatureConfig", "Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardFeatureConfig$MoveMoneyFeatureConfig;", "Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardFeatureConfig$UnsupportedFeatureConfig;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardFeatureConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardFeatureConfig$MoveMoneyFeatureConfig;", "Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyFeatureConfig implements CreditCardFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyFeatureConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f68731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f68732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f68733c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i iVarValueOf = i.valueOf(parcel.readString());
                f fVarValueOf = f.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(j.valueOf(parcel.readString()));
                }
                return new MoveMoneyFeatureConfig(iVarValueOf, fVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyFeatureConfig[i];
            }
        }

        public MoveMoneyFeatureConfig(i currency, f feature, ArrayList products) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(products, "products");
            this.f68731a = currency;
            this.f68732b = feature;
            this.f68733c = products;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoneyFeatureConfig)) {
                return false;
            }
            MoveMoneyFeatureConfig moveMoneyFeatureConfig = (MoveMoneyFeatureConfig) obj2;
            return this.f68731a == moveMoneyFeatureConfig.f68731a && this.f68732b == moveMoneyFeatureConfig.f68732b && this.f68733c.equals(moveMoneyFeatureConfig.f68733c);
        }

        public final int hashCode() {
            return this.f68733c.hashCode() + ((this.f68732b.hashCode() + (this.f68731a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68731a.name());
            dest.writeString(this.f68732b.name());
            Iterator itY = j6.a.y(this.f68733c, dest);
            while (itY.hasNext()) {
                dest.writeString(((j) itY.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardFeatureConfig$UnsupportedFeatureConfig;", "Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardFeatureConfig;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnsupportedFeatureConfig implements CreditCardFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnsupportedFeatureConfig f68734a = new UnsupportedFeatureConfig();

        @NotNull
        public static final Parcelable.Creator<UnsupportedFeatureConfig> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnsupportedFeatureConfig.f68734a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnsupportedFeatureConfig[i];
            }
        }

        private UnsupportedFeatureConfig() {
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

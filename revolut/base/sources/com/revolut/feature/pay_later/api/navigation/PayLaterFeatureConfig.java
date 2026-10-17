package com.revolut.feature.pay_later.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pay_later.api.models.PayLaterFaqKey;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Faq", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterFeatureConfig$Faq;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PayLaterFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterFeatureConfig$Faq;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Faq extends PayLaterFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Faq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayLaterFaqKey f78821a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Faq(PayLaterFaqKey.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Faq[i];
            }
        }

        public Faq(PayLaterFaqKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f78821a = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Faq) && this.f78821a == ((Faq) obj2).f78821a;
        }

        public final int hashCode() {
            return this.f78821a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f78821a.writeToParcel(dest, i);
        }
    }

    private PayLaterFeatureConfig() {
    }
}

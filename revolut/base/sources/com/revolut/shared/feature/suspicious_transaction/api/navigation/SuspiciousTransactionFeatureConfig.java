package com.revolut.shared.feature.suspicious_transaction.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/navigation/SuspiciousTransactionFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "SuspiciousTransaction", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuspiciousTransactionFeatureConfig extends KompotBridgeFeatureConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspiciousTransactionFeatureConfig(SuspiciousTransaction destination) {
        super((ActivityAnimation) null, (ParcelableDestination) destination, false, (Integer) null, 0, 52);
        Intrinsics.checkNotNullParameter(destination, "destination");
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF89980g() {
        return null;
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/navigation/SuspiciousTransactionFeatureConfig$SuspiciousTransaction;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SuspiciousTransaction implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SuspiciousTransaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f104983b;

        /* JADX INFO: loaded from: classes12.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new SuspiciousTransaction(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuspiciousTransaction[i];
            }
        }

        public SuspiciousTransaction(String transactionId, Map params) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f104982a = transactionId;
            this.f104983b = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SuspiciousTransaction)) {
                return false;
            }
            SuspiciousTransaction suspiciousTransaction = (SuspiciousTransaction) obj2;
            return Intrinsics.f(this.f104982a, suspiciousTransaction.f104982a) && Intrinsics.f(this.f104983b, suspiciousTransaction.f104983b);
        }

        public final int hashCode() {
            return this.f104983b.hashCode() + (this.f104982a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104982a);
            Iterator itT = o.t(this.f104983b, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        public /* synthetic */ SuspiciousTransaction(String str) {
            this(str, r0.g());
        }
    }
}

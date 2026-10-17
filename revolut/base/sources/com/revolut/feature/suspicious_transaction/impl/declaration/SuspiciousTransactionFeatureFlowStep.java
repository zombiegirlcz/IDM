package com.revolut.feature.suspicious_transaction.impl.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.FeatureFlowStep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/suspicious_transaction/impl/declaration/SuspiciousTransactionFeatureFlowStep;", "Lcom/revolut/kompot/FeatureFlowStep;", "<init>", "()V", "SuspiciousTransactionFlow", "Lcom/revolut/feature/suspicious_transaction/impl/declaration/SuspiciousTransactionFeatureFlowStep$SuspiciousTransactionFlow;", "feature_suspicious_transaction_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SuspiciousTransactionFeatureFlowStep implements FeatureFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/suspicious_transaction/impl/declaration/SuspiciousTransactionFeatureFlowStep$SuspiciousTransactionFlow;", "Lcom/revolut/feature/suspicious_transaction/impl/declaration/SuspiciousTransactionFeatureFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SuspiciousTransactionFlow extends SuspiciousTransactionFeatureFlowStep {

        @NotNull
        public static final Parcelable.Creator<SuspiciousTransactionFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f89447b;

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
                return new SuspiciousTransactionFlow(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuspiciousTransactionFlow[i];
            }
        }

        public SuspiciousTransactionFlow(String transactionId, Map params) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f89446a = transactionId;
            this.f89447b = params;
        }

        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF89446a() {
            return this.f89446a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Map getF89447b() {
            return this.f89447b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SuspiciousTransactionFlow)) {
                return false;
            }
            SuspiciousTransactionFlow suspiciousTransactionFlow = (SuspiciousTransactionFlow) obj2;
            return Intrinsics.f(this.f89446a, suspiciousTransactionFlow.f89446a) && Intrinsics.f(this.f89447b, suspiciousTransactionFlow.f89447b);
        }

        public final int hashCode() {
            return this.f89447b.hashCode() + (this.f89446a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89446a);
            Iterator itZ = j6.a.z(this.f89447b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    private SuspiciousTransactionFeatureFlowStep() {
    }
}

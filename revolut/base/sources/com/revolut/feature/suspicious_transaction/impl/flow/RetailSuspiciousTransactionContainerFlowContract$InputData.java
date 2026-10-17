package com.revolut.feature.suspicious_transaction.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/suspicious_transaction/impl/flow/RetailSuspiciousTransactionContainerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RetailSuspiciousTransactionContainerFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RetailSuspiciousTransactionContainerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f89450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RetailSuspiciousTransactionContainerFlowContract$Step f89451c;

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
            return new RetailSuspiciousTransactionContainerFlowContract$InputData(string, linkedHashMap, (RetailSuspiciousTransactionContainerFlowContract$Step) parcel.readParcelable(RetailSuspiciousTransactionContainerFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RetailSuspiciousTransactionContainerFlowContract$InputData[i];
        }
    }

    public RetailSuspiciousTransactionContainerFlowContract$InputData(String transactionId, Map params, RetailSuspiciousTransactionContainerFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f89449a = transactionId;
        this.f89450b = params;
        this.f89451c = initialStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RetailSuspiciousTransactionContainerFlowContract$InputData)) {
            return false;
        }
        RetailSuspiciousTransactionContainerFlowContract$InputData retailSuspiciousTransactionContainerFlowContract$InputData = (RetailSuspiciousTransactionContainerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f89449a, retailSuspiciousTransactionContainerFlowContract$InputData.f89449a) && Intrinsics.f(this.f89450b, retailSuspiciousTransactionContainerFlowContract$InputData.f89450b) && Intrinsics.f(this.f89451c, retailSuspiciousTransactionContainerFlowContract$InputData.f89451c);
    }

    public final int hashCode() {
        return this.f89451c.hashCode() + p.a.e(this.f89449a.hashCode() * 31, 31, this.f89450b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89449a);
        Iterator itZ = j6.a.z(this.f89450b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeParcelable(this.f89451c, i);
    }
}

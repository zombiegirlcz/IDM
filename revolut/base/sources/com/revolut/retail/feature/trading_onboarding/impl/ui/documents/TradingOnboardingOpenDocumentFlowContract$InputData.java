package com.revolut.retail.feature.trading_onboarding.impl.ui.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/documents/TradingOnboardingOpenDocumentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradingOnboardingOpenDocumentFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TradingOnboardingOpenDocumentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f104152b;

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
            return new TradingOnboardingOpenDocumentFlowContract$InputData(linkedHashMap, string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingOnboardingOpenDocumentFlowContract$InputData[i];
        }
    }

    public TradingOnboardingOpenDocumentFlowContract$InputData(LinkedHashMap params, String documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f104151a = documentType;
        this.f104152b = params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradingOnboardingOpenDocumentFlowContract$InputData)) {
            return false;
        }
        TradingOnboardingOpenDocumentFlowContract$InputData tradingOnboardingOpenDocumentFlowContract$InputData = (TradingOnboardingOpenDocumentFlowContract$InputData) obj2;
        return Intrinsics.f(this.f104151a, tradingOnboardingOpenDocumentFlowContract$InputData.f104151a) && this.f104152b.equals(tradingOnboardingOpenDocumentFlowContract$InputData.f104152b);
    }

    public final int hashCode() {
        return this.f104152b.hashCode() + (this.f104151a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104151a);
        LinkedHashMap linkedHashMap = this.f104152b;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}

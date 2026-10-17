package com.revolut.retail.feature.esim.impl.ui.flows.get_plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import dej.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Purchase", "DataPlanCheckout", "MobilePlanCheckout", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData$DataPlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData$MobilePlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData$Purchase;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimGetPlanFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData$DataPlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataPlanCheckout implements EsimGetPlanFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DataPlanCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100609c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataPlanCheckout(parcel.readString(), parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(DataPlanCheckout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataPlanCheckout[i];
            }
        }

        public DataPlanCheckout(String dataPlanId, String str, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            this.f100607a = dataPlanId;
            this.f100608b = str;
            this.f100609c = esimGiftRecipient;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData
        /* JADX INFO: renamed from: F0, reason: from getter */
        public final EsimGiftRecipient getD() {
            return this.f100609c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DataPlanCheckout)) {
                return false;
            }
            DataPlanCheckout dataPlanCheckout = (DataPlanCheckout) obj2;
            return Intrinsics.f(this.f100607a, dataPlanCheckout.f100607a) && Intrinsics.f(this.f100608b, dataPlanCheckout.f100608b) && Intrinsics.f(this.f100609c, dataPlanCheckout.f100609c);
        }

        public final int hashCode() {
            int iHashCode = this.f100607a.hashCode() * 31;
            String str = this.f100608b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100609c;
            return iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100607a);
            dest.writeString(this.f100608b);
            dest.writeParcelable(this.f100609c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData$MobilePlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanCheckout implements EsimGetPlanFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<MobilePlanCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100612c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanCheckout(parcel.readString(), parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(MobilePlanCheckout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanCheckout[i];
            }
        }

        public MobilePlanCheckout(String mobilePlanId, String str, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f100610a = mobilePlanId;
            this.f100611b = str;
            this.f100612c = esimGiftRecipient;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData
        /* JADX INFO: renamed from: F0, reason: from getter */
        public final EsimGiftRecipient getD() {
            return this.f100612c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanCheckout)) {
                return false;
            }
            MobilePlanCheckout mobilePlanCheckout = (MobilePlanCheckout) obj2;
            return Intrinsics.f(this.f100610a, mobilePlanCheckout.f100610a) && Intrinsics.f(this.f100611b, mobilePlanCheckout.f100611b) && Intrinsics.f(this.f100612c, mobilePlanCheckout.f100612c);
        }

        public final int hashCode() {
            int iHashCode = this.f100610a.hashCode() * 31;
            String str = this.f100611b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100612c;
            return iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100610a);
            dest.writeString(this.f100611b);
            dest.writeParcelable(this.f100612c, i);
        }
    }

    /* JADX INFO: renamed from: F0 */
    EsimGiftRecipient getD();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData$Purchase;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Purchase implements EsimGetPlanFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Purchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f100614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGetPlanLaunchMode f100615c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Purchase(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), (EsimGetPlanLaunchMode) parcel.readParcelable(Purchase.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(Purchase.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Purchase[i];
            }
        }

        public Purchase(String str, m mVar, EsimGetPlanLaunchMode esimGetPlanLaunchMode, EsimGiftRecipient esimGiftRecipient) {
            this.f100613a = str;
            this.f100614b = mVar;
            this.f100615c = esimGetPlanLaunchMode;
            this.d = esimGiftRecipient;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData
        /* JADX INFO: renamed from: F0, reason: from getter */
        public final EsimGiftRecipient getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Purchase)) {
                return false;
            }
            Purchase purchase = (Purchase) obj2;
            return Intrinsics.f(this.f100613a, purchase.f100613a) && this.f100614b == purchase.f100614b && Intrinsics.f(this.f100615c, purchase.f100615c) && Intrinsics.f(this.d, purchase.d);
        }

        public final int hashCode() {
            String str = this.f100613a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            m mVar = this.f100614b;
            int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.f100615c;
            int iHashCode3 = (iHashCode2 + (esimGetPlanLaunchMode == null ? 0 : esimGetPlanLaunchMode.hashCode())) * 31;
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iHashCode3 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100613a);
            m mVar = this.f100614b;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
            dest.writeParcelable(this.f100615c, i);
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ Purchase(String str, m mVar, EsimGetPlanLaunchMode esimGetPlanLaunchMode, EsimGiftRecipient esimGiftRecipient, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : mVar, esimGetPlanLaunchMode, (i & 8) != 0 ? null : esimGiftRecipient);
        }
    }
}

package com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import dej.t3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData", "Landroid/os/Parcelable;", "UrlParcel", "ActionParcel", "DownloadContractSummaryParcel", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData$ActionParcel;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData$DownloadContractSummaryParcel;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData$UrlParcel;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public interface EsimDynamicTermsMapper$TermsClickData extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData$ActionParcel;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionParcel implements EsimDynamicTermsMapper$TermsClickData {

        @NotNull
        public static final Parcelable.Creator<ActionParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t3 f100940b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionParcel(parcel.readString(), t3.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionParcel[i];
            }
        }

        public ActionParcel(String mobilePlanId, t3 action) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f100939a = mobilePlanId;
            this.f100940b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActionParcel)) {
                return false;
            }
            ActionParcel actionParcel = (ActionParcel) obj2;
            return Intrinsics.f(this.f100939a, actionParcel.f100939a) && this.f100940b == actionParcel.f100940b;
        }

        public final int hashCode() {
            return this.f100940b.hashCode() + (this.f100939a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100939a);
            dest.writeString(this.f100940b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData$DownloadContractSummaryParcel;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownloadContractSummaryParcel implements EsimDynamicTermsMapper$TermsClickData {

        @NotNull
        public static final Parcelable.Creator<DownloadContractSummaryParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f100943c;
        public final String d;
        public final EsimDataPlanOfferInfo e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                return new DownloadContractSummaryParcel(parcel.readLong(), (EsimDataPlanOfferInfo) parcel.readParcelable(DownloadContractSummaryParcel.class.getClassLoader()), string, string2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DownloadContractSummaryParcel[i];
            }
        }

        public DownloadContractSummaryParcel(long j2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, String mobilePlanId, String str, String contractVersion) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(contractVersion, "contractVersion");
            this.f100941a = mobilePlanId;
            this.f100942b = str;
            this.f100943c = j2;
            this.d = contractVersion;
            this.e = esimDataPlanOfferInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DownloadContractSummaryParcel)) {
                return false;
            }
            DownloadContractSummaryParcel downloadContractSummaryParcel = (DownloadContractSummaryParcel) obj2;
            return Intrinsics.f(this.f100941a, downloadContractSummaryParcel.f100941a) && Intrinsics.f(this.f100942b, downloadContractSummaryParcel.f100942b) && this.f100943c == downloadContractSummaryParcel.f100943c && Intrinsics.f(this.d, downloadContractSummaryParcel.d) && Intrinsics.f(this.e, downloadContractSummaryParcel.e);
        }

        public final int hashCode() {
            int iHashCode = this.f100941a.hashCode() * 31;
            String str = this.f100942b;
            int iC = p.a.c(a0.d.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f100943c), 31, this.d);
            EsimDataPlanOfferInfo esimDataPlanOfferInfo = this.e;
            return iC + (esimDataPlanOfferInfo != null ? esimDataPlanOfferInfo.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100941a);
            dest.writeString(this.f100942b);
            dest.writeLong(this.f100943c);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData$UrlParcel;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/mappers/EsimDynamicTermsMapper$TermsClickData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UrlParcel implements EsimDynamicTermsMapper$TermsClickData {

        @NotNull
        public static final Parcelable.Creator<UrlParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100945b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UrlParcel(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UrlParcel[i];
            }
        }

        public UrlParcel(String mobilePlanId, String url2) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f100944a = mobilePlanId;
            this.f100945b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UrlParcel)) {
                return false;
            }
            UrlParcel urlParcel = (UrlParcel) obj2;
            return Intrinsics.f(this.f100944a, urlParcel.f100944a) && Intrinsics.f(this.f100945b, urlParcel.f100945b);
        }

        public final int hashCode() {
            return this.f100945b.hashCode() + (this.f100944a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100944a);
            dest.writeString(this.f100945b);
        }
    }
}

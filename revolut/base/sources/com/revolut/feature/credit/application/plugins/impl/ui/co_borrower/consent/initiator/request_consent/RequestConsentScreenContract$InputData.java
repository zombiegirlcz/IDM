package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower;
import com.revolut.kompot.common.IOData$Input;
import ft3.h1;
import iu3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/request_consent/RequestConsentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequestConsentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RequestConsentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f67226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zv3.a f67227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f67228c;
    public final CoBorrower d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RequestConsentScreenContract$InputData((h1) parcel.readSerializable(), zv3.a.valueOf(parcel.readString()), (g) parcel.readSerializable(), (CoBorrower) parcel.readParcelable(RequestConsentScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RequestConsentScreenContract$InputData[i];
        }
    }

    public RequestConsentScreenContract$InputData(h1 productPayload, zv3.a navigationIcon, g configuration, CoBorrower coBorrower) {
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(coBorrower, "coBorrower");
        this.f67226a = productPayload;
        this.f67227b = navigationIcon;
        this.f67228c = configuration;
        this.d = coBorrower;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RequestConsentScreenContract$InputData)) {
            return false;
        }
        RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = (RequestConsentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67226a, requestConsentScreenContract$InputData.f67226a) && this.f67227b == requestConsentScreenContract$InputData.f67227b && Intrinsics.f(this.f67228c, requestConsentScreenContract$InputData.f67228c) && Intrinsics.f(this.d, requestConsentScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f67228c.hashCode() + ((this.f67227b.hashCode() + (this.f67226a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67226a);
        dest.writeString(this.f67227b.name());
        dest.writeSerializable(this.f67228c);
        dest.writeParcelable(this.d, i);
    }
}

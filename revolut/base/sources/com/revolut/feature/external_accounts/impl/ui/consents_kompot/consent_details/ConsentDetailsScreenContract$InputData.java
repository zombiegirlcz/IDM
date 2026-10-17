package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/consent_details/ConsentDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ConsentDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundOpenBankingClient f72771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OpenBankingConsent f72772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72773c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentDetailsScreenContract$InputData((OutboundOpenBankingClient) parcel.readParcelable(ConsentDetailsScreenContract$InputData.class.getClassLoader()), (OpenBankingConsent) parcel.readParcelable(ConsentDetailsScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentDetailsScreenContract$InputData[i];
        }
    }

    public ConsentDetailsScreenContract$InputData(OutboundOpenBankingClient client, OpenBankingConsent selectedConsent, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(selectedConsent, "selectedConsent");
        this.f72771a = client;
        this.f72772b = selectedConsent;
        this.f72773c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentDetailsScreenContract$InputData)) {
            return false;
        }
        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData = (ConsentDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f72771a, consentDetailsScreenContract$InputData.f72771a) && Intrinsics.f(this.f72772b, consentDetailsScreenContract$InputData.f72772b) && this.f72773c == consentDetailsScreenContract$InputData.f72773c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72773c) + ((this.f72772b.hashCode() + (this.f72771a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72771a, i);
        dest.writeParcelable(this.f72772b, i);
        dest.writeInt(this.f72773c ? 1 : 0);
    }
}

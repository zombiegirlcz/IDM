package com.revolut.feature.apm.wero.impl.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDestinationContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import t02.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/common/ApmTransferDestinationWero;", "Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMethod", "method", "Lcom/revolut/feature/apm/wero/impl/common/ApmTransferDestinationWero$Body;", "b", "Lcom/revolut/feature/apm/wero/impl/common/ApmTransferDestinationWero$Body;", "getBody", "()Lcom/revolut/feature/apm/wero/impl/common/ApmTransferDestinationWero$Body;", "body", "Body", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferDestinationWero implements ApmTransferDestination {

    @NotNull
    public static final Parcelable.Creator<ApmTransferDestinationWero> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("method")
    @NotNull
    private final String method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("WERO")
    @NotNull
    private final Body body;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/common/ApmTransferDestinationWero$Body;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "a", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "getContact", "()Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "contact", "b", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "c", "getShareUrl", "shareUrl", "d", "getOpenRequestId", "openRequestId", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Body implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Body> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("contact")
        private final ApmPaymentDestinationContact contact;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("beneficiaryId")
        private final String beneficiaryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("shareUrl")
        private final String shareUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("openRequestId")
        private final String openRequestId;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Body((ApmPaymentDestinationContact) parcel.readParcelable(Body.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Body[i];
            }
        }

        public Body(ApmPaymentDestinationContact apmPaymentDestinationContact, String str, String str2, String str3) {
            this.contact = apmPaymentDestinationContact;
            this.beneficiaryId = str;
            this.shareUrl = str2;
            this.openRequestId = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Body)) {
                return false;
            }
            Body body = (Body) obj2;
            return Intrinsics.f(this.contact, body.contact) && Intrinsics.f(this.beneficiaryId, body.beneficiaryId) && Intrinsics.f(this.shareUrl, body.shareUrl) && Intrinsics.f(this.openRequestId, body.openRequestId);
        }

        public final int hashCode() {
            ApmPaymentDestinationContact apmPaymentDestinationContact = this.contact;
            int iHashCode = (apmPaymentDestinationContact == null ? 0 : apmPaymentDestinationContact.hashCode()) * 31;
            String str = this.beneficiaryId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.shareUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.openRequestId;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.contact, i);
            dest.writeString(this.beneficiaryId);
            dest.writeString(this.shareUrl);
            dest.writeString(this.openRequestId);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmTransferDestinationWero(parcel.readString(), Body.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferDestinationWero[i];
        }
    }

    public ApmTransferDestinationWero(String method, Body body) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        this.method = method;
        this.body = body;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmTransferDestinationWero)) {
            return false;
        }
        ApmTransferDestinationWero apmTransferDestinationWero = (ApmTransferDestinationWero) obj2;
        return Intrinsics.f(this.method, apmTransferDestinationWero.method) && Intrinsics.f(this.body, apmTransferDestinationWero.body);
    }

    @Override // com.revolut.feature.apm.core.models.transfers.ApmTransferDestination
    public final String getMethod() {
        return this.method;
    }

    public final int hashCode() {
        return this.body.hashCode() + (this.method.hashCode() * 31);
    }

    @Override // com.revolut.feature.apm.core.models.transfers.ApmTransferDestination
    /* JADX INFO: renamed from: s2 */
    public final ApmPaymentMethod getF62480a() {
        return ApmPaymentMethod.WERO.f62179a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.method);
        this.body.writeToParcel(dest, i);
    }

    public /* synthetic */ ApmTransferDestinationWero(Body body) {
        this("WERO", body);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApmTransferDestinationWero(WeroContact contact) {
        this(new Body(e.a(contact), e.b(contact), contact.f62161h, null));
        Intrinsics.checkNotNullParameter(contact, "contact");
    }
}

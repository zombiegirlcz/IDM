package com.revolut.feature.apm.breb.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDestinationContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ApmTransferDestinationBreb;", "Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMethod", "method", "Lcom/revolut/feature/apm/breb/impl/ApmTransferDestinationBreb$Body;", "b", "Lcom/revolut/feature/apm/breb/impl/ApmTransferDestinationBreb$Body;", "getBody", "()Lcom/revolut/feature/apm/breb/impl/ApmTransferDestinationBreb$Body;", "body", "Companion", "Body", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferDestinationBreb implements ApmTransferDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    @NotNull
    private final String method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("BREB")
    @NotNull
    private final Body body;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ApmTransferDestinationBreb> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ApmTransferDestinationBreb$Body;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "a", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "getContact", "()Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "contact", "b", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "c", "getQrCode", "qrCode", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Body implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Body> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("contact")
        private final ApmPaymentDestinationContact contact;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("beneficiaryId")
        private final String beneficiaryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("qrCode")
        private final String qrCode;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Body((ApmPaymentDestinationContact) parcel.readParcelable(Body.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Body[i];
            }
        }

        public Body(ApmPaymentDestinationContact apmPaymentDestinationContact, String str, String str2) {
            this.contact = apmPaymentDestinationContact;
            this.beneficiaryId = str;
            this.qrCode = str2;
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
            return Intrinsics.f(this.contact, body.contact) && Intrinsics.f(this.beneficiaryId, body.beneficiaryId) && Intrinsics.f(this.qrCode, body.qrCode);
        }

        public final int hashCode() {
            ApmPaymentDestinationContact apmPaymentDestinationContact = this.contact;
            int iHashCode = (apmPaymentDestinationContact == null ? 0 : apmPaymentDestinationContact.hashCode()) * 31;
            String str = this.beneficiaryId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.qrCode;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.contact, i);
            dest.writeString(this.beneficiaryId);
            dest.writeString(this.qrCode);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.apm.breb.impl.ApmTransferDestinationBreb$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmTransferDestinationBreb(parcel.readString(), Body.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferDestinationBreb[i];
        }
    }

    public ApmTransferDestinationBreb(String method, Body body) {
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
        if (!(obj2 instanceof ApmTransferDestinationBreb)) {
            return false;
        }
        ApmTransferDestinationBreb apmTransferDestinationBreb = (ApmTransferDestinationBreb) obj2;
        return Intrinsics.f(this.method, apmTransferDestinationBreb.method) && Intrinsics.f(this.body, apmTransferDestinationBreb.body);
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
        return ApmPaymentMethod.BREB.f62167a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.method);
        this.body.writeToParcel(dest, i);
    }
}

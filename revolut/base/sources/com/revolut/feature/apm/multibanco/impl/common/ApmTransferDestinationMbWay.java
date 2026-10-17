package com.revolut.feature.apm.multibanco.impl.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDestinationContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/common/ApmTransferDestinationMbWay;", "Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMethod", "method", "Lcom/revolut/feature/apm/multibanco/impl/common/ApmTransferDestinationMbWay$Body;", "b", "Lcom/revolut/feature/apm/multibanco/impl/common/ApmTransferDestinationMbWay$Body;", "getBody", "()Lcom/revolut/feature/apm/multibanco/impl/common/ApmTransferDestinationMbWay$Body;", "body", "Body", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferDestinationMbWay implements ApmTransferDestination {

    @NotNull
    public static final Parcelable.Creator<ApmTransferDestinationMbWay> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("method")
    @NotNull
    private final String method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("MBWAY")
    @NotNull
    private final Body body;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/common/ApmTransferDestinationMbWay$Body;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "a", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "getContact", "()Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "contact", "b", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "c", "getRecipientPhone", "recipientPhone", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Body implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Body> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("contact")
        @NotNull
        private final ApmPaymentDestinationContact contact;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("beneficiaryId")
        private final String beneficiaryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("recipientPhone")
        @NotNull
        private final String recipientPhone;

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

        public Body(ApmPaymentDestinationContact contact, String str, String recipientPhone) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(recipientPhone, "recipientPhone");
            this.contact = contact;
            this.beneficiaryId = str;
            this.recipientPhone = recipientPhone;
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
            return Intrinsics.f(this.contact, body.contact) && Intrinsics.f(this.beneficiaryId, body.beneficiaryId) && Intrinsics.f(this.recipientPhone, body.recipientPhone);
        }

        public final int hashCode() {
            int iHashCode = this.contact.hashCode() * 31;
            String str = this.beneficiaryId;
            return this.recipientPhone.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.contact, i);
            dest.writeString(this.beneficiaryId);
            dest.writeString(this.recipientPhone);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmTransferDestinationMbWay(parcel.readString(), Body.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferDestinationMbWay[i];
        }
    }

    public ApmTransferDestinationMbWay(String method, Body body) {
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
        if (!(obj2 instanceof ApmTransferDestinationMbWay)) {
            return false;
        }
        ApmTransferDestinationMbWay apmTransferDestinationMbWay = (ApmTransferDestinationMbWay) obj2;
        return Intrinsics.f(this.method, apmTransferDestinationMbWay.method) && Intrinsics.f(this.body, apmTransferDestinationMbWay.body);
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
        return ApmPaymentMethod.MBWAY.f62173a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.method);
        this.body.writeToParcel(dest, i);
    }
}

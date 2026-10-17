package com.revolut.feature.apm.qvik.impl.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDestinationContact;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r02.c;
import t02.e;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0002\u0011\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/common/ApmTransferDestinationQvik;", "Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "Lr02/c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMethod", "method", "Lcom/revolut/feature/apm/qvik/impl/common/ApmTransferDestinationQvik$Body;", "b", "Lcom/revolut/feature/apm/qvik/impl/common/ApmTransferDestinationQvik$Body;", "getBody", "()Lcom/revolut/feature/apm/qvik/impl/common/ApmTransferDestinationQvik$Body;", "body", "Companion", "Body", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferDestinationQvik implements ApmTransferDestination, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    @NotNull
    private final String method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("GIRO_QVIK")
    @NotNull
    private final Body body;

    @NotNull
    public static final Parcelable.Creator<ApmTransferDestinationQvik> CREATOR = new b();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/common/ApmTransferDestinationQvik$Body;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "a", "Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "getContact", "()Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "contact", "b", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "c", "getEamEncoded", "eamEncoded", "", "d", "Ljava/util/List;", "getModifiableFields", "()Ljava/util/List;", "modifiableFields", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Body implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Body> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("contact")
        @NotNull
        private final ApmPaymentDestinationContact contact;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("beneficiaryId")
        private final String beneficiaryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("eamEncoded")
        private final String eamEncoded;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("modifiableFields")
        private final List<String> modifiableFields;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Body((ApmPaymentDestinationContact) parcel.readParcelable(Body.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Body[i];
            }
        }

        public Body(ApmPaymentDestinationContact contact, String str, String str2, List list) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.contact = contact;
            this.beneficiaryId = str;
            this.eamEncoded = str2;
            this.modifiableFields = list;
        }

        public static Body a(Body body, List list) {
            ApmPaymentDestinationContact contact = body.contact;
            String str = body.beneficiaryId;
            String str2 = body.eamEncoded;
            body.getClass();
            Intrinsics.checkNotNullParameter(contact, "contact");
            return new Body(contact, str, str2, list);
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
            return Intrinsics.f(this.contact, body.contact) && Intrinsics.f(this.beneficiaryId, body.beneficiaryId) && Intrinsics.f(this.eamEncoded, body.eamEncoded) && Intrinsics.f(this.modifiableFields, body.modifiableFields);
        }

        public final int hashCode() {
            int iHashCode = this.contact.hashCode() * 31;
            String str = this.beneficiaryId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.eamEncoded;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.modifiableFields;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.contact, i);
            dest.writeString(this.beneficiaryId);
            dest.writeString(this.eamEncoded);
            dest.writeStringList(this.modifiableFields);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmTransferDestinationQvik(parcel.readString(), Body.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferDestinationQvik[i];
        }
    }

    public ApmTransferDestinationQvik(String method, Body body) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        this.method = method;
        this.body = body;
    }

    public final ApmTransferDestinationQvik a(ApmTransferPayerSettings apmTransferPayerSettings) {
        List listL;
        if (apmTransferPayerSettings != null) {
            String[] elements = {apmTransferPayerSettings.f62180a ? "amount" : null, apmTransferPayerSettings.f62181b ? "reference" : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = d.L(elements);
        } else {
            listL = f0.f322471a;
        }
        Body body = Body.a(this.body, listL);
        String method = this.method;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        return new ApmTransferDestinationQvik(method, body);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmTransferDestinationQvik)) {
            return false;
        }
        ApmTransferDestinationQvik apmTransferDestinationQvik = (ApmTransferDestinationQvik) obj2;
        return Intrinsics.f(this.method, apmTransferDestinationQvik.method) && Intrinsics.f(this.body, apmTransferDestinationQvik.body);
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
        return ApmPaymentMethod.GIRO_QVIK.f62170a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.method);
        this.body.writeToParcel(dest, i);
    }

    public /* synthetic */ ApmTransferDestinationQvik(Body body) {
        this("GIRO_QVIK", body);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApmTransferDestinationQvik(QvikContact contact) {
        this(new Body(e.a(contact), e.b(contact), null, f0.f322471a));
        Intrinsics.checkNotNullParameter(contact, "contact");
    }
}

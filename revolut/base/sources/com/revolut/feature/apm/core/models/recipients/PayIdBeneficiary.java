package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import f5j.c;
import jli.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/PayIdBeneficiary;", "Lcom/revolut/feature/apm/core/models/recipients/ApmBeneficiary;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayIdBeneficiary implements ApmBeneficiary {

    @NotNull
    public static final Parcelable.Creator<PayIdBeneficiary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmIdentifier f62134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5j.a f62136c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayIdBeneficiary((ApmIdentifier) parcel.readParcelable(PayIdBeneficiary.class.getClassLoader()), parcel.readString(), (f5j.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayIdBeneficiary[i];
        }
    }

    public PayIdBeneficiary(ApmIdentifier id10, String recipientName, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(recipientName, "recipientName");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f62134a = id10;
        this.f62135b = recipientName;
        this.f62136c = beneficiary;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean E3() {
        return true;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getF62135b() {
        return this.f62135b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayIdBeneficiary)) {
            return false;
        }
        PayIdBeneficiary payIdBeneficiary = (PayIdBeneficiary) obj2;
        return Intrinsics.f(this.f62134a, payIdBeneficiary.f62134a) && Intrinsics.f(this.f62135b, payIdBeneficiary.f62135b) && Intrinsics.f(this.f62136c, payIdBeneficiary.f62136c);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean g8(String str) {
        return str == null || d0.W(str) || g.d(this.f62135b, str);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final String getDisplayName() {
        return this.f62135b;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final ApmIdentifier getF62134a() {
        return this.f62134a;
    }

    public final int hashCode() {
        return this.f62136c.hashCode() + p.a.c(this.f62134a.hashCode() * 31, 31, this.f62135b);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmBeneficiary
    /* JADX INFO: renamed from: s, reason: from getter */
    public final f5j.a getF62136c() {
        return this.f62136c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62134a, i);
        dest.writeString(this.f62135b);
        dest.writeSerializable(this.f62136c);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final String x0() {
        String strA = c.a(this.f62136c);
        return strA == null ? "" : strA;
    }
}

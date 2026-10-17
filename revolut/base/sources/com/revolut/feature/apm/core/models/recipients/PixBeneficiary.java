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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/PixBeneficiary;", "Lcom/revolut/feature/apm/core/models/recipients/ApmBeneficiary;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixBeneficiary implements ApmBeneficiary {

    @NotNull
    public static final Parcelable.Creator<PixBeneficiary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmIdentifier f62137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5j.a f62139c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixBeneficiary((ApmIdentifier) parcel.readParcelable(PixBeneficiary.class.getClassLoader()), parcel.readString(), (f5j.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixBeneficiary[i];
        }
    }

    public PixBeneficiary(ApmIdentifier id10, String recipientName, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(recipientName, "recipientName");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f62137a = id10;
        this.f62138b = recipientName;
        this.f62139c = beneficiary;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean E3() {
        return true;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getF62135b() {
        return this.f62138b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixBeneficiary)) {
            return false;
        }
        PixBeneficiary pixBeneficiary = (PixBeneficiary) obj2;
        return Intrinsics.f(this.f62137a, pixBeneficiary.f62137a) && Intrinsics.f(this.f62138b, pixBeneficiary.f62138b) && Intrinsics.f(this.f62139c, pixBeneficiary.f62139c);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean g8(String str) {
        return str == null || d0.W(str) || g.d(this.f62138b, str);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final String getDisplayName() {
        return this.f62138b;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final ApmIdentifier getF62134a() {
        return this.f62137a;
    }

    public final int hashCode() {
        return this.f62139c.hashCode() + p.a.c(this.f62137a.hashCode() * 31, 31, this.f62138b);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmBeneficiary
    /* JADX INFO: renamed from: s, reason: from getter */
    public final f5j.a getF62136c() {
        return this.f62139c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62137a, i);
        dest.writeString(this.f62138b);
        dest.writeSerializable(this.f62139c);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final String x0() {
        String strA = c.a(this.f62139c);
        return strA == null ? "" : strA;
    }
}

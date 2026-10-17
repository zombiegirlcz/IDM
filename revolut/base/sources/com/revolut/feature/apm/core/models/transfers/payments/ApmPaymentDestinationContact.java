package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDestinationContact;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "value", "b", "getType", "type", "c", "getName", "name", "d", "getIdentityType", "identityType", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentDestinationContact implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentDestinationContact> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("identityType")
    private final String identityType;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPaymentDestinationContact(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentDestinationContact[i];
        }
    }

    public ApmPaymentDestinationContact(String value, String type, String name, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.value = value;
        this.type = type;
        this.name = name;
        this.identityType = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentDestinationContact)) {
            return false;
        }
        ApmPaymentDestinationContact apmPaymentDestinationContact = (ApmPaymentDestinationContact) obj2;
        return Intrinsics.f(this.value, apmPaymentDestinationContact.value) && Intrinsics.f(this.type, apmPaymentDestinationContact.type) && Intrinsics.f(this.name, apmPaymentDestinationContact.name) && Intrinsics.f(this.identityType, apmPaymentDestinationContact.identityType);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.value.hashCode() * 31, 31, this.type), 31, this.name);
        String str = this.identityType;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.value);
        dest.writeString(this.type);
        dest.writeString(this.name);
        dest.writeString(this.identityType);
    }
}

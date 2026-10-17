package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/models/WhatsAppEvidence;", "Lcom/revolut/sso/api/models/Evidence;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WhatsAppEvidence implements Evidence {

    @NotNull
    public static final Parcelable.Creator<WhatsAppEvidence> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f106005b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WhatsAppEvidence(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WhatsAppEvidence[i];
        }
    }

    public WhatsAppEvidence(String secret, boolean z) {
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.f106004a = secret;
        this.f106005b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WhatsAppEvidence)) {
            return false;
        }
        WhatsAppEvidence whatsAppEvidence = (WhatsAppEvidence) obj2;
        return Intrinsics.f(this.f106004a, whatsAppEvidence.f106004a) && this.f106005b == whatsAppEvidence.f106005b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106005b) + (this.f106004a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106004a);
        dest.writeInt(this.f106005b ? 1 : 0);
    }
}

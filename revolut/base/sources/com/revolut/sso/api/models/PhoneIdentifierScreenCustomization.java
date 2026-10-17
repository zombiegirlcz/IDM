package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/PhoneIdentifierScreenCustomization;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhoneIdentifierScreenCustomization implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105967a;

    @NotNull
    public static final Parcelable.Creator<PhoneIdentifierScreenCustomization> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhoneIdentifierScreenCustomization(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhoneIdentifierScreenCustomization[i];
        }
    }

    public PhoneIdentifierScreenCustomization(boolean z) {
        this.f105967a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PhoneIdentifierScreenCustomization) && this.f105967a == ((PhoneIdentifierScreenCustomization) obj2).f105967a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105967a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f105967a ? 1 : 0);
    }

    public PhoneIdentifierScreenCustomization() {
        this(true);
    }
}

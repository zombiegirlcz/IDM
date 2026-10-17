package com.revolut.feature.apm.upi.impl.flow.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/model/ScreenConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f62986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62988c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62989g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z29 = false;
            boolean z31 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z29 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z31 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z11 = z6;
            } else {
                z11 = z6;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = z;
            }
            if (parcel.readInt() == 0) {
                z12 = z;
            }
            return new ScreenConfiguration(z29, z31, z3, z4, z6, z11, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenConfiguration[i];
        }
    }

    public ScreenConfiguration() {
        this(false, CertificateBody.profileType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenConfiguration)) {
            return false;
        }
        ScreenConfiguration screenConfiguration = (ScreenConfiguration) obj2;
        return this.f62986a == screenConfiguration.f62986a && this.f62987b == screenConfiguration.f62987b && this.f62988c == screenConfiguration.f62988c && this.d == screenConfiguration.d && this.e == screenConfiguration.e && this.f == screenConfiguration.f && this.f62989g == screenConfiguration.f62989g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62989g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f62986a) * 31, 31, this.f62987b), 31, this.f62988c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f62986a ? 1 : 0);
        dest.writeInt(this.f62987b ? 1 : 0);
        dest.writeInt(this.f62988c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f62989g ? 1 : 0);
    }

    public ScreenConfiguration(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f62986a = z;
        this.f62987b = z3;
        this.f62988c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f62989g = z29;
    }

    public /* synthetic */ ScreenConfiguration(boolean z, int i) {
        this(false, (i & 2) != 0 ? false : z, true, true, true, true, true);
    }
}

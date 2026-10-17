package com.revolut.feature.security_hub.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/api/navigation/SecurityHubDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/security_hub/api/navigation/SecurityHubInputData;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecurityHubDestination extends InternalDestination<SecurityHubInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SecurityHubDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecurityHubStartScreen f85460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85461c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SecurityHubStartScreen securityHubStartScreen = (SecurityHubStartScreen) parcel.readParcelable(SecurityHubDestination.class.getClassLoader());
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new SecurityHubDestination(securityHubStartScreen, z6, string, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecurityHubDestination[i];
        }
    }

    public SecurityHubDestination() {
        this((SecurityHubStartScreen) null, false, (String) null, false, 31);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SecurityHubStartScreen getF85460b() {
        return this.f85460b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecurityHubDestination)) {
            return false;
        }
        SecurityHubDestination securityHubDestination = (SecurityHubDestination) obj2;
        return Intrinsics.f(this.f85460b, securityHubDestination.f85460b) && this.f85461c == securityHubDestination.f85461c && Intrinsics.f(this.d, securityHubDestination.d) && this.e == securityHubDestination.e && this.f == securityHubDestination.f;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f85460b.hashCode() * 31, 31, this.f85461c);
        String str = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getF85461c() {
        return this.f85461c;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85460b, i);
        dest.writeInt(this.f85461c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ SecurityHubDestination(SecurityHubStartScreen securityHubStartScreen, boolean z, String str, boolean z3, int i) {
        this((i & 1) != 0 ? SecurityHubStartScreen.SecurityHub.f85386a : securityHubStartScreen, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z3, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityHubDestination(SecurityHubStartScreen screen, boolean z, String str, boolean z3, boolean z4) {
        super(new SecurityHubInputData(screen, z, str, z3));
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f85460b = screen;
        this.f85461c = z;
        this.d = str;
        this.e = z3;
        this.f = z4;
    }
}

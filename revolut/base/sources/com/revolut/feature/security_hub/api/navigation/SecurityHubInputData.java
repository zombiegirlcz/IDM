package com.revolut.feature.security_hub.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/navigation/SecurityHubInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecurityHubInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SecurityHubInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityHubStartScreen f85462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85464c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecurityHubInputData((SecurityHubStartScreen) parcel.readParcelable(SecurityHubInputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecurityHubInputData[i];
        }
    }

    public SecurityHubInputData(SecurityHubStartScreen screen, boolean z, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f85462a = screen;
        this.f85463b = z;
        this.f85464c = str;
        this.d = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF85464c() {
        return this.f85464c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SecurityHubStartScreen getF85462a() {
        return this.f85462a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF85463b() {
        return this.f85463b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecurityHubInputData)) {
            return false;
        }
        SecurityHubInputData securityHubInputData = (SecurityHubInputData) obj2;
        return Intrinsics.f(this.f85462a, securityHubInputData.f85462a) && this.f85463b == securityHubInputData.f85463b && Intrinsics.f(this.f85464c, securityHubInputData.f85464c) && this.d == securityHubInputData.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f85462a.hashCode() * 31, 31, this.f85463b);
        String str = this.f85464c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85462a, i);
        dest.writeInt(this.f85463b ? 1 : 0);
        dest.writeString(this.f85464c);
        dest.writeInt(this.d ? 1 : 0);
    }
}

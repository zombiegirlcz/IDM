package com.revolut.feature.security_hub.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/api/navigation/SecurityDelayDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/security_hub/api/navigation/SecurityDelayInputData;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecurityDelayDestination extends InternalDestination<SecurityDelayInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SecurityDelayDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecurityDelayType f85455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85456c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecurityDelayDestination((SecurityDelayType) parcel.readParcelable(SecurityDelayDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecurityDelayDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityDelayDestination(SecurityDelayType type, boolean z) {
        super(new SecurityDelayInputData(type));
        Intrinsics.checkNotNullParameter(type, "type");
        this.f85455b = type;
        this.f85456c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecurityDelayDestination)) {
            return false;
        }
        SecurityDelayDestination securityDelayDestination = (SecurityDelayDestination) obj2;
        return Intrinsics.f(this.f85455b, securityDelayDestination.f85455b) && this.f85456c == securityDelayDestination.f85456c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85456c) + (this.f85455b.hashCode() * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF85456c() {
        return this.f85456c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85455b, i);
        dest.writeInt(this.f85456c ? 1 : 0);
    }
}

package com.revolut.sso.impl.ui.phone.change_flow;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.o;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChangePhoneFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChangePhoneFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f106640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SsoChangeClaimMode f106642c;
    public final o d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangePhoneFlowContract$InputData(parcel.readInt() != 0, parcel.readString(), (SsoChangeClaimMode) parcel.readParcelable(ChangePhoneFlowContract$InputData.class.getClassLoader()), o.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChangePhoneFlowContract$InputData[i];
        }
    }

    public ChangePhoneFlowContract$InputData(boolean z, String clientId, SsoChangeClaimMode mode, o successNotificationType) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(successNotificationType, "successNotificationType");
        this.f106640a = z;
        this.f106641b = clientId;
        this.f106642c = mode;
        this.d = successNotificationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChangePhoneFlowContract$InputData)) {
            return false;
        }
        ChangePhoneFlowContract$InputData changePhoneFlowContract$InputData = (ChangePhoneFlowContract$InputData) obj2;
        return this.f106640a == changePhoneFlowContract$InputData.f106640a && Intrinsics.f(this.f106641b, changePhoneFlowContract$InputData.f106641b) && Intrinsics.f(this.f106642c, changePhoneFlowContract$InputData.f106642c) && this.d == changePhoneFlowContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f106642c.hashCode() + p.a.c(Boolean.hashCode(this.f106640a) * 31, 31, this.f106641b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f106640a ? 1 : 0);
        dest.writeString(this.f106641b);
        dest.writeParcelable(this.f106642c, i);
        dest.writeString(this.d.name());
    }

    public /* synthetic */ ChangePhoneFlowContract$InputData(String str, SsoChangeClaimMode ssoChangeClaimMode, o oVar) {
        this(false, str, ssoChangeClaimMode, oVar);
    }
}

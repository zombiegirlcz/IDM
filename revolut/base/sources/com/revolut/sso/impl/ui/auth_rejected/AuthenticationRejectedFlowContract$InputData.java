package com.revolut.sso.impl.ui.auth_rejected;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.R$string;
import ehe.n;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jkl.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthenticationRejectedFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AuthenticationRejectedFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f106382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f106383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f106384c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(a3.valueOf(parcel.readString()));
            }
            return new AuthenticationRejectedFlowContract$InputData(zonedDateTime, linkedHashSet, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthenticationRejectedFlowContract$InputData[i];
        }
    }

    public AuthenticationRejectedFlowContract$InputData(ZonedDateTime zonedDateTime, Set availableActions, int i) {
        Intrinsics.checkNotNullParameter(availableActions, "availableActions");
        this.f106382a = zonedDateTime;
        this.f106383b = availableActions;
        this.f106384c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AuthenticationRejectedFlowContract$InputData)) {
            return false;
        }
        AuthenticationRejectedFlowContract$InputData authenticationRejectedFlowContract$InputData = (AuthenticationRejectedFlowContract$InputData) obj2;
        return Intrinsics.f(this.f106382a, authenticationRejectedFlowContract$InputData.f106382a) && Intrinsics.f(this.f106383b, authenticationRejectedFlowContract$InputData.f106383b) && this.f106384c == authenticationRejectedFlowContract$InputData.f106384c;
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.f106382a;
        return Integer.hashCode(this.f106384c) + p.a.f((zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31, 31, this.f106383b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f106382a);
        Iterator itV = n.v(this.f106383b, dest);
        while (itV.hasNext()) {
            dest.writeString(((a3) itV.next()).name());
        }
        dest.writeInt(this.f106384c);
    }

    public /* synthetic */ AuthenticationRejectedFlowContract$InputData(ZonedDateTime zonedDateTime, Set set) {
        this(zonedDateTime, set, R$string.revolut_sso_common_actions_retry);
    }
}

package com.feature.user.details.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import cm.c;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/feature/user/details/impl/ui/flow/UserDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UserDetailsFlowContract$InputData> CREATOR = new c(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26232b;

    public UserDetailsFlowContract$InputData(String str, String str2) {
        this.f26231a = str;
        this.f26232b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserDetailsFlowContract$InputData)) {
            return false;
        }
        UserDetailsFlowContract$InputData userDetailsFlowContract$InputData = (UserDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f26231a, userDetailsFlowContract$InputData.f26231a) && Intrinsics.f(this.f26232b, userDetailsFlowContract$InputData.f26232b);
    }

    public final int hashCode() {
        String str = this.f26231a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26232b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return j6.a.s("InputData(workflowId=", this.f26231a, ", stepId=", this.f26232b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f26231a);
        dest.writeString(this.f26232b);
    }

    public /* synthetic */ UserDetailsFlowContract$InputData() {
        this(null, null);
    }
}

package com.feature.user.details.impl.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import cm.c;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/feature/user/details/impl/ui/details/UserDetailsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDetailsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UserDetailsControllerContract$InputData> CREATOR = new c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26227a;

    public UserDetailsControllerContract$InputData(String str) {
        this.f26227a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof UserDetailsControllerContract$InputData) && Intrinsics.f(this.f26227a, ((UserDetailsControllerContract$InputData) obj2).f26227a);
    }

    public final int hashCode() {
        String str = this.f26227a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return p.a.p("InputData(stepId=", this.f26227a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f26227a);
    }
}

package com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import djl.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReauthenticationWrapperFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReauthenticationWrapperFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f106690c;
    public final c d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReauthenticationWrapperFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReauthenticationWrapperFlowContract$InputData[i];
        }
    }

    public ReauthenticationWrapperFlowContract$InputData(String url2, String state, List securityProfiles, c finishConfig) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        Intrinsics.checkNotNullParameter(finishConfig, "finishConfig");
        this.f106688a = url2;
        this.f106689b = state;
        this.f106690c = securityProfiles;
        this.d = finishConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReauthenticationWrapperFlowContract$InputData)) {
            return false;
        }
        ReauthenticationWrapperFlowContract$InputData reauthenticationWrapperFlowContract$InputData = (ReauthenticationWrapperFlowContract$InputData) obj2;
        return Intrinsics.f(this.f106688a, reauthenticationWrapperFlowContract$InputData.f106688a) && Intrinsics.f(this.f106689b, reauthenticationWrapperFlowContract$InputData.f106689b) && Intrinsics.f(this.f106690c, reauthenticationWrapperFlowContract$InputData.f106690c) && this.d == reauthenticationWrapperFlowContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f106688a.hashCode() * 31, 31, this.f106689b), 31, this.f106690c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106688a);
        dest.writeString(this.f106689b);
        dest.writeStringList(this.f106690c);
        dest.writeString(this.d.name());
    }
}

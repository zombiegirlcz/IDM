package com.revolut.feature.external_accounts.impl.flow.link_result;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/flow/link_result/LinkResultFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkResultFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LinkResultFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f72422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72423c;
    public final ExternalAccountsFeatureConfig.LinkSuccess.UseCase d;
    public final NaviCommand e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new LinkResultFlowContract$InputData(string, z3, parcel.readInt() == 0 ? z : true, (ExternalAccountsFeatureConfig.LinkSuccess.UseCase) parcel.readParcelable(LinkResultFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(LinkResultFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkResultFlowContract$InputData[i];
        }
    }

    public LinkResultFlowContract$InputData(String institutionId, boolean z, boolean z3, ExternalAccountsFeatureConfig.LinkSuccess.UseCase useCase, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f72421a = institutionId;
        this.f72422b = z;
        this.f72423c = z3;
        this.d = useCase;
        this.e = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkResultFlowContract$InputData)) {
            return false;
        }
        LinkResultFlowContract$InputData linkResultFlowContract$InputData = (LinkResultFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72421a, linkResultFlowContract$InputData.f72421a) && this.f72422b == linkResultFlowContract$InputData.f72422b && this.f72423c == linkResultFlowContract$InputData.f72423c && Intrinsics.f(this.d, linkResultFlowContract$InputData.d) && Intrinsics.f(this.e, linkResultFlowContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.c(j6.a.c(this.f72421a.hashCode() * 31, 31, this.f72422b), 31, this.f72423c)) * 31;
        NaviCommand naviCommand = this.e;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72421a);
        dest.writeInt(this.f72422b ? 1 : 0);
        dest.writeInt(this.f72423c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}

package com.revolut.feature.joint.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.joint.api.data.JointAccountCloseReason;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Close$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointAccountsFeatureConfig$Close$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JointAccountsFeatureConfig$Close$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId.Joint f76487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JointAccountCloseReason f76488b;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointAccountsFeatureConfig$Close$Destination((AccountId.Joint) parcel.readParcelable(JointAccountsFeatureConfig$Close$Destination.class.getClassLoader()), (JointAccountCloseReason) parcel.readParcelable(JointAccountsFeatureConfig$Close$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointAccountsFeatureConfig$Close$Destination[i];
        }
    }

    public JointAccountsFeatureConfig$Close$Destination(AccountId.Joint accountId, JointAccountCloseReason closeReason) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        this.f76487a = accountId;
        this.f76488b = closeReason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JointAccountsFeatureConfig$Close$Destination)) {
            return false;
        }
        JointAccountsFeatureConfig$Close$Destination jointAccountsFeatureConfig$Close$Destination = (JointAccountsFeatureConfig$Close$Destination) obj2;
        return Intrinsics.f(this.f76487a, jointAccountsFeatureConfig$Close$Destination.f76487a) && Intrinsics.f(this.f76488b, jointAccountsFeatureConfig$Close$Destination.f76488b);
    }

    public final int hashCode() {
        return this.f76488b.hashCode() + (this.f76487a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76487a, i);
        dest.writeParcelable(this.f76488b, i);
    }
}

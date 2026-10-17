package com.revolut.feature.bank_account_switching.impl.domain.joint_account;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/domain/joint_account/JointAccountData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointAccountData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JointAccountData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63902b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointAccountData(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointAccountData[i];
        }
    }

    public JointAccountData(String personalAccountName, ArrayList jointAccountOwners) {
        Intrinsics.checkNotNullParameter(personalAccountName, "personalAccountName");
        Intrinsics.checkNotNullParameter(jointAccountOwners, "jointAccountOwners");
        this.f63901a = personalAccountName;
        this.f63902b = jointAccountOwners;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JointAccountData)) {
            return false;
        }
        JointAccountData jointAccountData = (JointAccountData) obj2;
        return Intrinsics.f(this.f63901a, jointAccountData.f63901a) && Intrinsics.f(this.f63902b, jointAccountData.f63902b);
    }

    public final int hashCode() {
        return this.f63902b.hashCode() + (this.f63901a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63901a);
        dest.writeStringList(this.f63902b);
    }
}

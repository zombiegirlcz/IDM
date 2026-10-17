package com.revolut.feature.joint.impl.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/account/model/JointTopUpMethodsAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointTopUpMethodsAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JointTopUpMethodsAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f76504a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointTopUpMethodsAction((b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointTopUpMethodsAction[i];
        }
    }

    public JointTopUpMethodsAction(b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f76504a = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JointTopUpMethodsAction) && Intrinsics.f(this.f76504a, ((JointTopUpMethodsAction) obj2).f76504a);
    }

    public final int hashCode() {
        return this.f76504a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f76504a);
    }
}

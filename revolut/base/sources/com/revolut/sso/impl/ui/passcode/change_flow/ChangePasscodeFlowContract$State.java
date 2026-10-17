package com.revolut.sso.impl.ui.passcode.change_flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/passcode/change_flow/ChangePasscodeFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChangePasscodeFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChangePasscodeFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106592b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangePasscodeFlowContract$State(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChangePasscodeFlowContract$State[i];
        }
    }

    public ChangePasscodeFlowContract$State(String passcodeOnChange, String phone) {
        Intrinsics.checkNotNullParameter(passcodeOnChange, "passcodeOnChange");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f106591a = passcodeOnChange;
        this.f106592b = phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChangePasscodeFlowContract$State)) {
            return false;
        }
        ChangePasscodeFlowContract$State changePasscodeFlowContract$State = (ChangePasscodeFlowContract$State) obj2;
        return Intrinsics.f(this.f106591a, changePasscodeFlowContract$State.f106591a) && Intrinsics.f(this.f106592b, changePasscodeFlowContract$State.f106592b);
    }

    public final int hashCode() {
        return this.f106592b.hashCode() + (this.f106591a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106591a);
        dest.writeString(this.f106592b);
    }
}

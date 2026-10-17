package com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAddPhoneNumberScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<JuniorAddPhoneNumberScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77206c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAddPhoneNumberScreenContract$RetainedState(parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAddPhoneNumberScreenContract$RetainedState[i];
        }
    }

    public JuniorAddPhoneNumberScreenContract$RetainedState(String phoneNumber, String phoneCode, b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        this.f77204a = countryCode;
        this.f77205b = phoneNumber;
        this.f77206c = phoneCode;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAddPhoneNumberScreenContract$RetainedState)) {
            return false;
        }
        JuniorAddPhoneNumberScreenContract$RetainedState juniorAddPhoneNumberScreenContract$RetainedState = (JuniorAddPhoneNumberScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f77204a, juniorAddPhoneNumberScreenContract$RetainedState.f77204a) && Intrinsics.f(this.f77205b, juniorAddPhoneNumberScreenContract$RetainedState.f77205b) && Intrinsics.f(this.f77206c, juniorAddPhoneNumberScreenContract$RetainedState.f77206c) && this.d == juniorAddPhoneNumberScreenContract$RetainedState.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f77204a.f297794a.hashCode() * 31, 31, this.f77205b), 31, this.f77206c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77204a);
        dest.writeString(this.f77205b);
        dest.writeString(this.f77206c);
        dest.writeInt(this.d ? 1 : 0);
    }
}

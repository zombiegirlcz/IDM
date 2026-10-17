package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$MandatoryCheckbox", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivationRequestScreenContract$MandatoryCheckbox implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActivationRequestScreenContract$MandatoryCheckbox> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationRequestScreenContract$CheckboxData f76675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76676b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivationRequestScreenContract$MandatoryCheckbox((ActivationRequestScreenContract$CheckboxData) parcel.readParcelable(ActivationRequestScreenContract$MandatoryCheckbox.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivationRequestScreenContract$MandatoryCheckbox[i];
        }
    }

    public ActivationRequestScreenContract$MandatoryCheckbox(ActivationRequestScreenContract$CheckboxData checkboxData, boolean z) {
        Intrinsics.checkNotNullParameter(checkboxData, "checkboxData");
        this.f76675a = checkboxData;
        this.f76676b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivationRequestScreenContract$MandatoryCheckbox)) {
            return false;
        }
        ActivationRequestScreenContract$MandatoryCheckbox activationRequestScreenContract$MandatoryCheckbox = (ActivationRequestScreenContract$MandatoryCheckbox) obj2;
        return Intrinsics.f(this.f76675a, activationRequestScreenContract$MandatoryCheckbox.f76675a) && this.f76676b == activationRequestScreenContract$MandatoryCheckbox.f76676b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76676b) + (this.f76675a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76675a, i);
        dest.writeInt(this.f76676b ? 1 : 0);
    }
}

package com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/hidden_accounts/impl/ui/biometric_authentication/BiometricAuthenticationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Authentication", "Lcom/revolut/feature/hidden_accounts/impl/ui/biometric_authentication/BiometricAuthenticationFlowContract$Step$Authentication;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BiometricAuthenticationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/biometric_authentication/BiometricAuthenticationFlowContract$Step$Authentication;", "Lcom/revolut/feature/hidden_accounts/impl/ui/biometric_authentication/BiometricAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Authentication extends BiometricAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Authentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PinCodeView.Mode f74653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f74654b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Authentication((PinCodeView.Mode) parcel.readParcelable(Authentication.class.getClassLoader()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Authentication[i];
            }
        }

        public Authentication(PinCodeView.Mode passcodeScreenMode, d credentialsType) {
            Intrinsics.checkNotNullParameter(passcodeScreenMode, "passcodeScreenMode");
            Intrinsics.checkNotNullParameter(credentialsType, "credentialsType");
            this.f74653a = passcodeScreenMode;
            this.f74654b = credentialsType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Authentication)) {
                return false;
            }
            Authentication authentication = (Authentication) obj2;
            return Intrinsics.f(this.f74653a, authentication.f74653a) && this.f74654b == authentication.f74654b;
        }

        public final int hashCode() {
            return this.f74654b.hashCode() + (this.f74653a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74653a, i);
            dest.writeString(this.f74654b.name());
        }
    }

    private BiometricAuthenticationFlowContract$Step() {
    }
}

package com.revolut.feature.external_accounts.impl.ui.colombia.pse;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/colombia/pse/PseFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AuthorisationRequest", "VerificationCode", "Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/PseFlowContract$Step$AuthorisationRequest;", "Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/PseFlowContract$Step$VerificationCode;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PseFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/PseFlowContract$Step$AuthorisationRequest;", "Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/PseFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthorisationRequest implements PseFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuthorisationRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72719a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuthorisationRequest(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthorisationRequest[i];
            }
        }

        public AuthorisationRequest(String authorisationId) {
            Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
            this.f72719a = authorisationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AuthorisationRequest) && Intrinsics.f(this.f72719a, ((AuthorisationRequest) obj2).f72719a);
        }

        public final int hashCode() {
            return this.f72719a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72719a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/PseFlowContract$Step$VerificationCode;", "Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/PseFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerificationCode implements PseFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VerificationCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72720a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerificationCode(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerificationCode[i];
            }
        }

        public VerificationCode(String authorisationId) {
            Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
            this.f72720a = authorisationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VerificationCode) && Intrinsics.f(this.f72720a, ((VerificationCode) obj2).f72720a);
        }

        public final int hashCode() {
            return this.f72720a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72720a);
        }
    }
}

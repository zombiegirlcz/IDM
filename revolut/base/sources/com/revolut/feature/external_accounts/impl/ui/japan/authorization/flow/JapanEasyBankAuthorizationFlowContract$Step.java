package com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/japan/authorization/flow/JapanEasyBankAuthorizationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AuthorizationWebView", "Lcom/revolut/feature/external_accounts/impl/ui/japan/authorization/flow/JapanEasyBankAuthorizationFlowContract$Step$AuthorizationWebView;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JapanEasyBankAuthorizationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/japan/authorization/flow/JapanEasyBankAuthorizationFlowContract$Step$AuthorizationWebView;", "Lcom/revolut/feature/external_accounts/impl/ui/japan/authorization/flow/JapanEasyBankAuthorizationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthorizationWebView extends JapanEasyBankAuthorizationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuthorizationWebView> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72949b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuthorizationWebView(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthorizationWebView[i];
            }
        }

        public AuthorizationWebView(String content, String consentId) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72948a = content;
            this.f72949b = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthorizationWebView)) {
                return false;
            }
            AuthorizationWebView authorizationWebView = (AuthorizationWebView) obj2;
            return Intrinsics.f(this.f72948a, authorizationWebView.f72948a) && Intrinsics.f(this.f72949b, authorizationWebView.f72949b);
        }

        public final int hashCode() {
            return this.f72949b.hashCode() + (this.f72948a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72948a);
            dest.writeString(this.f72949b);
        }
    }

    private JapanEasyBankAuthorizationFlowContract$Step() {
    }
}

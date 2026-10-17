package com.revolut.sso.impl.ui.signup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.domain.models.Claim;
import ehe.n;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jkl.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/signup/SignUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ContinueWithExistingAccount", "StartAccountCreation", "AuthRejected", "Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$AuthRejected;", "Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$ContinueWithExistingAccount;", "Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$StartAccountCreation;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SignUpFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$AuthRejected;", "Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthRejected implements SignUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuthRejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Claim f106756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZonedDateTime f106757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f106758c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Claim claim = (Claim) j6.a.f(parcel, "parcel", AuthRejected.class);
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new AuthRejected(claim, zonedDateTime, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthRejected[i];
            }
        }

        public AuthRejected(Claim claim, ZonedDateTime zonedDateTime, Set actions) {
            Intrinsics.checkNotNullParameter(claim, "claim");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106756a = claim;
            this.f106757b = zonedDateTime;
            this.f106758c = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthRejected)) {
                return false;
            }
            AuthRejected authRejected = (AuthRejected) obj2;
            return Intrinsics.f(this.f106756a, authRejected.f106756a) && Intrinsics.f(this.f106757b, authRejected.f106757b) && Intrinsics.f(this.f106758c, authRejected.f106758c);
        }

        public final int hashCode() {
            int iHashCode = this.f106756a.hashCode() * 31;
            ZonedDateTime zonedDateTime = this.f106757b;
            return this.f106758c.hashCode() + ((iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106756a, i);
            dest.writeSerializable(this.f106757b);
            Iterator itV = n.v(this.f106758c, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$ContinueWithExistingAccount;", "Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContinueWithExistingAccount implements SignUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContinueWithExistingAccount f106766a = new ContinueWithExistingAccount();

        @NotNull
        public static final Parcelable.Creator<ContinueWithExistingAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContinueWithExistingAccount.f106766a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContinueWithExistingAccount[i];
            }
        }

        private ContinueWithExistingAccount() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$StartAccountCreation;", "Lcom/revolut/sso/impl/ui/signup/SignUpFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StartAccountCreation implements SignUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StartAccountCreation f106767a = new StartAccountCreation();

        @NotNull
        public static final Parcelable.Creator<StartAccountCreation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StartAccountCreation.f106767a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartAccountCreation[i];
            }
        }

        private StartAccountCreation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}

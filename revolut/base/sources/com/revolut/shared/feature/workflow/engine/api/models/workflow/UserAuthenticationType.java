package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType;", "Landroid/os/Parcelable;", "<init>", "()V", "Reauthentication", "IdentitySignIn", "RegisteredIdentitySignIn", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType$IdentitySignIn;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType$Reauthentication;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType$RegisteredIdentitySignIn;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UserAuthenticationType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType$IdentitySignIn;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdentitySignIn extends UserAuthenticationType {

        @NotNull
        public static final Parcelable.Creator<IdentitySignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105655a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdentitySignIn(((IndividualIdentityId) parcel.readParcelable(IdentitySignIn.class.getClassLoader())).f74763a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentitySignIn[i];
            }
        }

        public IdentitySignIn(String identityId) {
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            this.f105655a = identityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IdentitySignIn) && Intrinsics.f(this.f105655a, ((IdentitySignIn) obj2).f105655a);
        }

        public final int hashCode() {
            return this.f105655a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new IndividualIdentityId(this.f105655a), i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType$Reauthentication;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reauthentication extends UserAuthenticationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Reauthentication f105656a = new Reauthentication();

        @NotNull
        public static final Parcelable.Creator<Reauthentication> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Reauthentication.f105656a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reauthentication[i];
            }
        }

        private Reauthentication() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType$RegisteredIdentitySignIn;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/UserAuthenticationType;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegisteredIdentitySignIn extends UserAuthenticationType {

        @NotNull
        public static final Parcelable.Creator<RegisteredIdentitySignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105658b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RegisteredIdentitySignIn(((IndividualIdentityId) parcel.readParcelable(RegisteredIdentitySignIn.class.getClassLoader())).f74763a, ((RegisteredIdentityId) parcel.readParcelable(RegisteredIdentitySignIn.class.getClassLoader())).f74764a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegisteredIdentitySignIn[i];
            }
        }

        public RegisteredIdentitySignIn(String identityId, String registeredIdentityId) {
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
            this.f105657a = identityId;
            this.f105658b = registeredIdentityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RegisteredIdentitySignIn)) {
                return false;
            }
            RegisteredIdentitySignIn registeredIdentitySignIn = (RegisteredIdentitySignIn) obj2;
            return Intrinsics.f(this.f105657a, registeredIdentitySignIn.f105657a) && Intrinsics.f(this.f105658b, registeredIdentitySignIn.f105658b);
        }

        public final int hashCode() {
            return this.f105658b.hashCode() + (this.f105657a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new IndividualIdentityId(this.f105657a), i);
            e.x(this.f105658b, dest, i);
        }
    }

    private UserAuthenticationType() {
    }
}

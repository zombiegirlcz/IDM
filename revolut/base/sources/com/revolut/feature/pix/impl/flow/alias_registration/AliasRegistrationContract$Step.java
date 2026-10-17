package com.revolut.feature.pix.impl.flow.alias_registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectType", "InputAlias", "VerifyOwnership", "RegisterAlias", "RequestPortability", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$InputAlias;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$RegisterAlias;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$RequestPortability;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$SelectType;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$VerifyOwnership;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AliasRegistrationContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$InputAlias;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputAlias extends AliasRegistrationContract$Step {

        @NotNull
        public static final Parcelable.Creator<InputAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AliasRegistrationType.Inputtable f80577a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputAlias((AliasRegistrationType.Inputtable) parcel.readParcelable(InputAlias.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputAlias[i];
            }
        }

        public InputAlias(AliasRegistrationType.Inputtable type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f80577a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputAlias) && Intrinsics.f(this.f80577a, ((InputAlias) obj2).f80577a);
        }

        public final int hashCode() {
            return this.f80577a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80577a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$RegisterAlias;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegisterAlias extends AliasRegistrationContract$Step {

        @NotNull
        public static final Parcelable.Creator<RegisterAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AliasRegistrationType f80578a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RegisterAlias((AliasRegistrationType) parcel.readParcelable(RegisterAlias.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegisterAlias[i];
            }
        }

        public RegisterAlias(AliasRegistrationType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f80578a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RegisterAlias) && Intrinsics.f(this.f80578a, ((RegisterAlias) obj2).f80578a);
        }

        public final int hashCode() {
            return this.f80578a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80578a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$RequestPortability;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestPortability extends AliasRegistrationContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestPortability> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortabilityRequestArgsModel f80579a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestPortability((PortabilityRequestArgsModel) parcel.readParcelable(RequestPortability.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestPortability[i];
            }
        }

        public RequestPortability(PortabilityRequestArgsModel args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.f80579a = args;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestPortability) && Intrinsics.f(this.f80579a, ((RequestPortability) obj2).f80579a);
        }

        public final int hashCode() {
            return this.f80579a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80579a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$SelectType;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectType extends AliasRegistrationContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectType f80580a = new SelectType();

        @NotNull
        public static final Parcelable.Creator<SelectType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectType.f80580a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectType[i];
            }
        }

        private SelectType() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step$VerifyOwnership;", "Lcom/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerifyOwnership extends AliasRegistrationContract$Step {

        @NotNull
        public static final Parcelable.Creator<VerifyOwnership> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TokenVerificationScreenContract$InputData f80581a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerifyOwnership(TokenVerificationScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerifyOwnership[i];
            }
        }

        public VerifyOwnership(TokenVerificationScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f80581a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VerifyOwnership) && Intrinsics.f(this.f80581a, ((VerifyOwnership) obj2).f80581a);
        }

        public final int hashCode() {
            return this.f80581a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f80581a.writeToParcel(dest, i);
        }
    }

    private AliasRegistrationContract$Step() {
    }
}

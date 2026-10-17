package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "StoredMethodDetails", "EditAlias", "RevokeConfirmation", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step$EditAlias;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step$RevokeConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step$StoredMethodDetails;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilStoredMethodDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step$EditAlias;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditAlias extends BrazilStoredMethodDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90802b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditAlias(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditAlias[i];
            }
        }

        public EditAlias(String consentId, String alias) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f90801a = consentId;
            this.f90802b = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditAlias)) {
                return false;
            }
            EditAlias editAlias = (EditAlias) obj2;
            return Intrinsics.f(this.f90801a, editAlias.f90801a) && Intrinsics.f(this.f90802b, editAlias.f90802b);
        }

        public final int hashCode() {
            return this.f90802b.hashCode() + (this.f90801a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90801a);
            dest.writeString(this.f90802b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step$RevokeConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeConfirmation extends BrazilStoredMethodDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevokeConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90804b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeConfirmation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeConfirmation[i];
            }
        }

        public RevokeConfirmation(String thirdPartyTitle, String consentId) {
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f90803a = thirdPartyTitle;
            this.f90804b = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevokeConfirmation)) {
                return false;
            }
            RevokeConfirmation revokeConfirmation = (RevokeConfirmation) obj2;
            return Intrinsics.f(this.f90803a, revokeConfirmation.f90803a) && Intrinsics.f(this.f90804b, revokeConfirmation.f90804b);
        }

        public final int hashCode() {
            return this.f90804b.hashCode() + (this.f90803a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90803a);
            dest.writeString(this.f90804b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step$StoredMethodDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/brazil/BrazilStoredMethodDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoredMethodDetails extends BrazilStoredMethodDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StoredMethodDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90805a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoredMethodDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoredMethodDetails[i];
            }
        }

        public StoredMethodDetails(String consentId) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f90805a = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StoredMethodDetails) && Intrinsics.f(this.f90805a, ((StoredMethodDetails) obj2).f90805a);
        }

        public final int hashCode() {
            return this.f90805a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90805a);
        }
    }

    private BrazilStoredMethodDetailsFlowContract$Step() {
    }
}

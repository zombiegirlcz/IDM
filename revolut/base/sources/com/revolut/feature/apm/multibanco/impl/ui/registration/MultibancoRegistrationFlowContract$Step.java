package com.revolut.feature.apm.multibanco.impl.ui.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "Confirmation", "Lcom/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlowContract$Step$Intro;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoRegistrationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements MultibancoRegistrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultibancoRegistrationTerms f62624a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((MultibancoRegistrationTerms) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(MultibancoRegistrationTerms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f62624a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f62624a, ((Confirmation) obj2).f62624a);
        }

        public final int hashCode() {
            return this.f62624a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62624a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements MultibancoRegistrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultibancoRegistrationTerms f62625a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((MultibancoRegistrationTerms) parcel.readParcelable(Intro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(MultibancoRegistrationTerms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f62625a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f62625a, ((Intro) obj2).f62625a);
        }

        public final int hashCode() {
            return this.f62625a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62625a, i);
        }
    }
}

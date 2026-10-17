package com.revolut.feature.apm.multibanco.impl.ui.enrollment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Entry", "Confirmation", "NoMultibancoCard", "Registration", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$Entry;", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$NoMultibancoCard;", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$Registration;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MultibancoExternalEnrollmentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends MultibancoExternalEnrollmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62578b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(String cardId, boolean z) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f62577a = cardId;
            this.f62578b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f62577a, confirmation.f62577a) && this.f62578b == confirmation.f62578b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62578b) + (this.f62577a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62577a);
            dest.writeInt(this.f62578b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$Entry;", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry extends MultibancoExternalEnrollmentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f62579a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f62579a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entry[i];
            }
        }

        private Entry() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$NoMultibancoCard;", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoMultibancoCard extends MultibancoExternalEnrollmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NoMultibancoCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultibancoRegistrationTerms f62580a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoMultibancoCard((MultibancoRegistrationTerms) parcel.readParcelable(NoMultibancoCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoMultibancoCard[i];
            }
        }

        public NoMultibancoCard(MultibancoRegistrationTerms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f62580a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NoMultibancoCard) && Intrinsics.f(this.f62580a, ((NoMultibancoCard) obj2).f62580a);
        }

        public final int hashCode() {
            return this.f62580a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62580a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step$Registration;", "Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registration extends MultibancoExternalEnrollmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Registration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultibancoRegistrationTerms f62581a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registration((MultibancoRegistrationTerms) parcel.readParcelable(Registration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registration[i];
            }
        }

        public Registration(MultibancoRegistrationTerms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f62581a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Registration) && Intrinsics.f(this.f62581a, ((Registration) obj2).f62581a);
        }

        public final int hashCode() {
            return this.f62581a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62581a, i);
        }
    }

    private MultibancoExternalEnrollmentFlowContract$Step() {
    }
}

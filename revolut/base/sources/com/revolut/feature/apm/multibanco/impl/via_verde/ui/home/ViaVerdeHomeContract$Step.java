package com.revolut.feature.apm.multibanco.impl.via_verde.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddEnrollment", "AddEnrollmentDialog", "Details", "SeeAllEnrollments", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$AddEnrollment;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$AddEnrollmentDialog;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$Details;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$SeeAllEnrollments;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ViaVerdeHomeContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$AddEnrollment;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddEnrollment implements ViaVerdeHomeContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddEnrollment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f92.b f62658a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddEnrollment(f92.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddEnrollment[i];
            }
        }

        public AddEnrollment(f92.b type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f62658a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddEnrollment) && this.f62658a == ((AddEnrollment) obj2).f62658a;
        }

        public final int hashCode() {
            return this.f62658a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62658a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$AddEnrollmentDialog;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddEnrollmentDialog implements ViaVerdeHomeContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddEnrollmentDialog f62659a = new AddEnrollmentDialog();

        @NotNull
        public static final Parcelable.Creator<AddEnrollmentDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddEnrollmentDialog.f62659a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddEnrollmentDialog[i];
            }
        }

        private AddEnrollmentDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$Details;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements ViaVerdeHomeContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViaVerdeEnrollment f62660a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(ViaVerdeEnrollment.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(ViaVerdeEnrollment enrollment) {
            Intrinsics.checkNotNullParameter(enrollment, "enrollment");
            this.f62660a = enrollment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f62660a, ((Details) obj2).f62660a);
        }

        public final int hashCode() {
            return this.f62660a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62660a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step$SeeAllEnrollments;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Step;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeeAllEnrollments implements ViaVerdeHomeContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeAllEnrollments f62661a = new SeeAllEnrollments();

        @NotNull
        public static final Parcelable.Creator<SeeAllEnrollments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeeAllEnrollments.f62661a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllEnrollments[i];
            }
        }

        private SeeAllEnrollments() {
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

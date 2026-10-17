package com.revolut.feature.apm.multibanco.impl.via_verde.ui.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.kompot.navigable.flow.FlowStep;
import f92.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddEnrollment", "Details", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListContract$Step$AddEnrollment;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListContract$Step$Details;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EnrollmentListContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListContract$Step$AddEnrollment;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddEnrollment implements EnrollmentListContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddEnrollment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f62668a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddEnrollment(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddEnrollment[i];
            }
        }

        public AddEnrollment(b type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f62668a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddEnrollment) && this.f62668a == ((AddEnrollment) obj2).f62668a;
        }

        public final int hashCode() {
            return this.f62668a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62668a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListContract$Step$Details;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements EnrollmentListContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViaVerdeEnrollment f62669a;

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
            this.f62669a = enrollment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f62669a, ((Details) obj2).f62669a);
        }

        public final int hashCode() {
            return this.f62669a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62669a.writeToParcel(dest, i);
        }
    }
}

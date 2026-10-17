package com.revolut.feature.apm.multibanco.impl.via_verde.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action", "Landroid/os/Parcelable;", "AddEnrollment", "SeeAllEnrollments", "SeeAllTransactions", "Help", "Retry", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$AddEnrollment;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$Help;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$Retry;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$SeeAllEnrollments;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$SeeAllTransactions;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ViaVerdeHomeContract$Action extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$AddEnrollment;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddEnrollment implements ViaVerdeHomeContract$Action {

        @NotNull
        public static final Parcelable.Creator<AddEnrollment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f92.b f62653a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddEnrollment(parcel.readInt() == 0 ? null : f92.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddEnrollment[i];
            }
        }

        public AddEnrollment(f92.b bVar) {
            this.f62653a = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddEnrollment) && this.f62653a == ((AddEnrollment) obj2).f62653a;
        }

        public final int hashCode() {
            f92.b bVar = this.f62653a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            f92.b bVar = this.f62653a;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$Help;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Help implements ViaVerdeHomeContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Help f62654a = new Help();

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Help.f62654a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Help[i];
            }
        }

        private Help() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$Retry;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Retry implements ViaVerdeHomeContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Retry f62655a = new Retry();

        @NotNull
        public static final Parcelable.Creator<Retry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Retry.f62655a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Retry[i];
            }
        }

        private Retry() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$SeeAllEnrollments;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeeAllEnrollments implements ViaVerdeHomeContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeAllEnrollments f62656a = new SeeAllEnrollments();

        @NotNull
        public static final Parcelable.Creator<SeeAllEnrollments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeeAllEnrollments.f62656a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action$SeeAllTransactions;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeContract$Action;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeeAllTransactions implements ViaVerdeHomeContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeAllTransactions f62657a = new SeeAllTransactions();

        @NotNull
        public static final Parcelable.Creator<SeeAllTransactions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeeAllTransactions.f62657a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllTransactions[i];
            }
        }

        private SeeAllTransactions() {
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

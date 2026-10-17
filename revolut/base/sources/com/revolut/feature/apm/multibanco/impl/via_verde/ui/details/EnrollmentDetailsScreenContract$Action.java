package com.revolut.feature.apm.multibanco.impl.via_verde.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action", "Landroid/os/Parcelable;", "Edit", "CopyReference", "CopyIdentifier", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action$CopyIdentifier;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action$CopyReference;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action$Edit;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EnrollmentDetailsScreenContract$Action extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action$CopyIdentifier;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CopyIdentifier implements EnrollmentDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CopyIdentifier f62645a = new CopyIdentifier();

        @NotNull
        public static final Parcelable.Creator<CopyIdentifier> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CopyIdentifier.f62645a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CopyIdentifier[i];
            }
        }

        private CopyIdentifier() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action$CopyReference;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CopyReference implements EnrollmentDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CopyReference f62646a = new CopyReference();

        @NotNull
        public static final Parcelable.Creator<CopyReference> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CopyReference.f62646a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CopyReference[i];
            }
        }

        private CopyReference() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action$Edit;", "Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreenContract$Action;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Edit implements EnrollmentDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Edit f62647a = new Edit();

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Edit.f62647a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        private Edit() {
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

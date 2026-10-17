package com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow;

import android.os.Parcel;
import android.os.Parcelable;
import bz3.f;
import bz3.g;
import com.revolut.kompot.navigable.flow.FlowStep;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Loading", "Intro", "Requirements", "Summary", "DeleteConfirmation", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$DeleteConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Loading;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Requirements;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Summary;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PhotosUploadFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$DeleteConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteConfirmation implements PhotosUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeleteConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bz3.c f68190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68191b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteConfirmation((bz3.c) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteConfirmation[i];
            }
        }

        public DeleteConfirmation(bz3.c config, String photoPath) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(photoPath, "photoPath");
            this.f68190a = config;
            this.f68191b = photoPath;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeleteConfirmation)) {
                return false;
            }
            DeleteConfirmation deleteConfirmation = (DeleteConfirmation) obj2;
            return Intrinsics.f(this.f68190a, deleteConfirmation.f68190a) && Intrinsics.f(this.f68191b, deleteConfirmation.f68191b);
        }

        public final int hashCode() {
            return this.f68191b.hashCode() + (this.f68190a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68190a);
            dest.writeString(this.f68191b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements PhotosUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f68192a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(g config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f68192a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f68192a, ((Intro) obj2).f68192a);
        }

        public final int hashCode() {
            return this.f68192a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68192a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Loading;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements PhotosUploadFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f68193a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f68193a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Requirements;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Requirements implements PhotosUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Requirements> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f68194a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Requirements((l0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Requirements[i];
            }
        }

        public Requirements(l0 config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f68194a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Requirements) && Intrinsics.f(this.f68194a, ((Requirements) obj2).f68194a);
        }

        public final int hashCode() {
            return this.f68194a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68194a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step$Summary;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/flow/PhotosUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements PhotosUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f68195a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Summary((f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(f config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f68195a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Summary) && Intrinsics.f(this.f68195a, ((Summary) obj2).f68195a);
        }

        public final int hashCode() {
            return this.f68195a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68195a);
        }
    }
}

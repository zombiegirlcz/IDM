package com.revolut.feature.profile.impl.ui.details.name.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/profile/impl/ui/details/name/flow/ChangeNameFlowContract$ChangeNameMode", "Landroid/os/Parcelable;", "DocumentSubmission", "Lcom/revolut/feature/profile/impl/ui/details/name/flow/ChangeNameFlowContract$ChangeNameMode$DocumentSubmission;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChangeNameFlowContract$ChangeNameMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/name/flow/ChangeNameFlowContract$ChangeNameMode$DocumentSubmission;", "Lcom/revolut/feature/profile/impl/ui/details/name/flow/ChangeNameFlowContract$ChangeNameMode;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentSubmission implements ChangeNameFlowContract$ChangeNameMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentSubmission f81402a = new DocumentSubmission();

        @NotNull
        public static final Parcelable.Creator<DocumentSubmission> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentSubmission.f81402a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSubmission[i];
            }
        }

        private DocumentSubmission() {
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

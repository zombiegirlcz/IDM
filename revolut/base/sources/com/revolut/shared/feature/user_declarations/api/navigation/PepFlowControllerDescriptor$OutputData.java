package com.revolut.shared.feature.user_declarations.api.navigation;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "Cancel", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData$Cancel;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData$Success;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PepFlowControllerDescriptor$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData$Cancel;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData;", "<init>", "()V", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancel extends PepFlowControllerDescriptor$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancel f105066a = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.f105066a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData$Success;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData;", "<init>", "()V", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Success extends PepFlowControllerDescriptor$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f105067a = new Success();

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Success.f105067a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        private Success() {
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

    private PepFlowControllerDescriptor$OutputData() {
    }
}

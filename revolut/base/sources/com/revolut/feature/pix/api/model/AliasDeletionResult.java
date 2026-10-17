package com.revolut.feature.pix.api.model;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasDeletionResult;", "Landroid/os/Parcelable;", "Laii/r;", "Success", "Pending", "Failed", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AliasDeletionResult extends Parcelable, r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasDeletionResult$Failed;", "Lcom/revolut/feature/pix/api/model/AliasDeletionResult;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Failed implements AliasDeletionResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Failed f80380a = new Failed();

        @NotNull
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Failed.f80380a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Failed[i];
            }
        }

        private Failed() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasDeletionResult$Pending;", "Lcom/revolut/feature/pix/api/model/AliasDeletionResult;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements AliasDeletionResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f80381a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f80381a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        private Pending() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasDeletionResult$Success;", "Lcom/revolut/feature/pix/api/model/AliasDeletionResult;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Success implements AliasDeletionResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f80382a = new Success();

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Success.f80382a;
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
}

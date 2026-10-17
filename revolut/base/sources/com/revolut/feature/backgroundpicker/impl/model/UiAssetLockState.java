package com.revolut.feature.backgroundpicker.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockState;", "Landroid/os/Parcelable;", "<init>", "()V", "Locked", "Available", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockState$Available;", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockState$Locked;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UiAssetLockState implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockState$Available;", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockState;", "<init>", "()V", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Available extends UiAssetLockState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Available f63805a = new Available();

        @NotNull
        public static final Parcelable.Creator<Available> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Available.f63805a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Available[i];
            }
        }

        private Available() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockState$Locked;", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockState;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Locked extends UiAssetLockState {

        @NotNull
        public static final Parcelable.Creator<Locked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UiAssetLockReason f63806a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Locked((UiAssetLockReason) parcel.readParcelable(Locked.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Locked[i];
            }
        }

        public Locked(UiAssetLockReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f63806a = reason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Locked) && Intrinsics.f(this.f63806a, ((Locked) obj2).f63806a);
        }

        public final int hashCode() {
            return this.f63806a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63806a, i);
        }
    }

    private UiAssetLockState() {
    }
}

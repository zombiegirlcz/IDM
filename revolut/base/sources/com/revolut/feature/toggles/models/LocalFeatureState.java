package com.revolut.feature.toggles.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/toggles/models/LocalFeatureState;", "Landroid/os/Parcelable;", "<init>", "()V", "Binary", "Lcom/revolut/feature/toggles/models/LocalFeatureState$Binary;", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LocalFeatureState implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/toggles/models/LocalFeatureState$Binary;", "Lcom/revolut/feature/toggles/models/LocalFeatureState;", "", "toString", "()Ljava/lang/String;", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Binary extends LocalFeatureState {

        @NotNull
        public static final Parcelable.Creator<Binary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f90453a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Binary(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Binary[i];
            }
        }

        public Binary(boolean z) {
            this.f90453a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Binary) && this.f90453a == ((Binary) obj2).f90453a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90453a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f90453a ? 1 : 0);
        }
    }

    private LocalFeatureState() {
    }
}

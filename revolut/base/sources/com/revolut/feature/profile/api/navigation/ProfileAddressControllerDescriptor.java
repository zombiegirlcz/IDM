package com.revolut.feature.profile.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileAddressControllerDescriptor implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputData f81344a;

    public ProfileAddressControllerDescriptor(InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f81344a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ProfileAddressControllerDescriptor) && Intrinsics.f(this.f81344a, ((ProfileAddressControllerDescriptor) obj2).f81344a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81344a.f81345a);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/ProfileAddressControllerDescriptor$InputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f81345a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(boolean z) {
            this.f81345a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && this.f81345a == ((InputData) obj2).f81345a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f81345a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f81345a ? 1 : 0);
        }

        public InputData() {
            this(true);
        }
    }

    public ProfileAddressControllerDescriptor() {
        this(new InputData(true));
    }
}

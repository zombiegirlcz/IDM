package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/models/AnimationRequest;", "Landroid/os/Parcelable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimationRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AnimationRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f57724a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnimationRequest(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnimationRequest[i];
        }
    }

    public AnimationRequest(boolean z) {
        this.f57724a = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF57724a() {
        return this.f57724a;
    }

    public final void b() {
        this.f57724a = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f57724a ? 1 : 0);
    }

    public AnimationRequest() {
        this(false);
    }
}

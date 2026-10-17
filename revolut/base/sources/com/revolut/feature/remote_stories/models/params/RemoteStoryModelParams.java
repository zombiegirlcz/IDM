package com.revolut.feature.remote_stories.models.params;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/models/params/RemoteStoryModelParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoteStoryModelParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemoteStoryModelParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemoteStoryModelButtonParams f82015c;
    public final RemoteStoryModelButtonParams d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            RemoteStoryModelButtonParams remoteStoryModelButtonParams;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z6 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z11 = z;
            }
            Parcelable.Creator<RemoteStoryModelButtonParams> creator = RemoteStoryModelButtonParams.CREATOR;
            RemoteStoryModelButtonParams remoteStoryModelButtonParamsCreateFromParcel = creator.createFromParcel(parcel);
            RemoteStoryModelButtonParams remoteStoryModelButtonParamsCreateFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z4 = z3;
                remoteStoryModelButtonParams = remoteStoryModelButtonParamsCreateFromParcel;
            } else {
                remoteStoryModelButtonParams = remoteStoryModelButtonParamsCreateFromParcel;
                z4 = z;
            }
            return new RemoteStoryModelParams(z6, z11, remoteStoryModelButtonParams, remoteStoryModelButtonParamsCreateFromParcel2, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemoteStoryModelParams[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteStoryModelParams() {
        RemoteStoryModelButtonParams remoteStoryModelButtonParams = null;
        this(remoteStoryModelButtonParams, remoteStoryModelButtonParams, false, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemoteStoryModelParams)) {
            return false;
        }
        RemoteStoryModelParams remoteStoryModelParams = (RemoteStoryModelParams) obj2;
        return this.f82013a == remoteStoryModelParams.f82013a && this.f82014b == remoteStoryModelParams.f82014b && Intrinsics.f(this.f82015c, remoteStoryModelParams.f82015c) && Intrinsics.f(this.d, remoteStoryModelParams.d) && this.e == remoteStoryModelParams.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f82015c.hashCode() + j6.a.c(Boolean.hashCode(this.f82013a) * 31, 31, this.f82014b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f82013a ? 1 : 0);
        dest.writeInt(this.f82014b ? 1 : 0);
        this.f82015c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    public RemoteStoryModelParams(boolean z, boolean z3, RemoteStoryModelButtonParams mainButton, RemoteStoryModelButtonParams secondaryButton, boolean z4) {
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f82013a = z;
        this.f82014b = z3;
        this.f82015c = mainButton;
        this.d = secondaryButton;
        this.e = z4;
    }

    public /* synthetic */ RemoteStoryModelParams(RemoteStoryModelButtonParams remoteStoryModelButtonParams, RemoteStoryModelButtonParams remoteStoryModelButtonParams2, boolean z, int i) {
        this((i & 1) == 0, (i & 2) != 0, (i & 4) != 0 ? new RemoteStoryModelButtonParams((tza.a) null, 3) : remoteStoryModelButtonParams, (i & 8) != 0 ? new RemoteStoryModelButtonParams(tza.a.BLACK, 2) : remoteStoryModelButtonParams2, (i & 16) != 0 ? true : z);
    }
}

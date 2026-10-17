package com.revolut.camerakit.core.camerax.extras.model;

import android.os.Parcel;
import android.os.Parcelable;
import iw.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/camerakit/core/camerax/extras/model/ResultInternal;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "camera_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResultInternal implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f50736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f50737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f50738c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ResultInternal> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.camerakit.core.camerax.extras.model.ResultInternal$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResultInternal((a) parcel.readSerializable(), (a) parcel.readSerializable(), (a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResultInternal[i];
        }
    }

    public ResultInternal(a aVar, a aVar2, a aVar3) {
        this.f50736a = aVar;
        this.f50737b = aVar2;
        this.f50738c = aVar3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ResultInternal)) {
            return false;
        }
        ResultInternal resultInternal = (ResultInternal) obj2;
        return Intrinsics.f(this.f50736a, resultInternal.f50736a) && Intrinsics.f(this.f50737b, resultInternal.f50737b) && Intrinsics.f(this.f50738c, resultInternal.f50738c);
    }

    public final int hashCode() {
        a aVar = this.f50736a;
        int iHashCode = (aVar == null ? 0 : aVar.f168885a.hashCode()) * 31;
        a aVar2 = this.f50737b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.f168885a.hashCode())) * 31;
        a aVar3 = this.f50738c;
        return iHashCode2 + (aVar3 != null ? aVar3.f168885a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f50736a);
        dest.writeSerializable(this.f50737b);
        dest.writeSerializable(this.f50738c);
    }
}

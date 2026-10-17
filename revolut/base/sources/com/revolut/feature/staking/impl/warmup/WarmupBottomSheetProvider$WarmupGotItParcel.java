package com.revolut.feature.staking.impl.warmup;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/staking/impl/warmup/WarmupBottomSheetProvider$WarmupGotItParcel", "Landroid/os/Parcelable;", "<init>", "()V", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WarmupBottomSheetProvider$WarmupGotItParcel implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WarmupBottomSheetProvider$WarmupGotItParcel f88170a = new WarmupBottomSheetProvider$WarmupGotItParcel();

    @NotNull
    public static final Parcelable.Creator<WarmupBottomSheetProvider$WarmupGotItParcel> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return WarmupBottomSheetProvider$WarmupGotItParcel.f88170a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WarmupBottomSheetProvider$WarmupGotItParcel[i];
        }
    }

    private WarmupBottomSheetProvider$WarmupGotItParcel() {
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

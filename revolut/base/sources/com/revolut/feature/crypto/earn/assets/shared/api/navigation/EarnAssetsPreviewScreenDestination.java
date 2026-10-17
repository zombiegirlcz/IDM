package com.revolut.feature.crypto.earn.assets.shared.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/api/navigation/EarnAssetsPreviewScreenDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "feature_crypto_earn_assets_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EarnAssetsPreviewScreenDestination extends InternalDestination<IOData$EmptyInput> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EarnAssetsPreviewScreenDestination f70787b = new EarnAssetsPreviewScreenDestination();

    @NotNull
    public static final Parcelable.Creator<EarnAssetsPreviewScreenDestination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return EarnAssetsPreviewScreenDestination.f70787b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EarnAssetsPreviewScreenDestination[i];
        }
    }

    private EarnAssetsPreviewScreenDestination() {
        super(IOData$EmptyInput.f98299a);
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

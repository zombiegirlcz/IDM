package com.revolut.feature.extension_auth.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/extension_auth/api/ExtensionAuthFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtensionAuthFeatureConfig implements FeatureConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExtensionAuthFeatureConfig f72163a = new ExtensionAuthFeatureConfig();

    @NotNull
    public static final Parcelable.Creator<ExtensionAuthFeatureConfig> CREATOR = new a();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ExtensionAuthFeatureConfig.f72163a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtensionAuthFeatureConfig[i];
        }
    }

    private ExtensionAuthFeatureConfig() {
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

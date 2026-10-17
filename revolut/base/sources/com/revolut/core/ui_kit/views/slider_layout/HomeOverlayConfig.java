package com.revolut.core.ui_kit.views.slider_layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/slider_layout/HomeOverlayConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HomeOverlayConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59655a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<HomeOverlayConfig> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HomeOverlayConfig f59654b = new HomeOverlayConfig(false);

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HomeOverlayConfig(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HomeOverlayConfig[i];
        }
    }

    public HomeOverlayConfig(boolean z) {
        this.f59655a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof HomeOverlayConfig) && this.f59655a == ((HomeOverlayConfig) obj2).f59655a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59655a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f59655a ? 1 : 0);
    }

    public HomeOverlayConfig() {
        this(false);
    }
}

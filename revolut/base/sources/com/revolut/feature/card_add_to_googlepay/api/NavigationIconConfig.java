package com.revolut.feature.card_add_to_googlepay.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/api/NavigationIconConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavigationIconConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NavigationIconConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f64436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f64437b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NavigationIconConfig((ResourceImage) parcel.readParcelable(NavigationIconConfig.class.getClassLoader()), (NaviCommand) parcel.readParcelable(NavigationIconConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavigationIconConfig[i];
        }
    }

    public NavigationIconConfig(ResourceImage icon, NaviCommand command) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(command, "command");
        this.f64436a = icon;
        this.f64437b = command;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NavigationIconConfig)) {
            return false;
        }
        NavigationIconConfig navigationIconConfig = (NavigationIconConfig) obj2;
        return Intrinsics.f(this.f64436a, navigationIconConfig.f64436a) && Intrinsics.f(this.f64437b, navigationIconConfig.f64437b);
    }

    public final int hashCode() {
        return this.f64437b.hashCode() + (this.f64436a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64436a, i);
        dest.writeParcelable(this.f64437b, i);
    }
}

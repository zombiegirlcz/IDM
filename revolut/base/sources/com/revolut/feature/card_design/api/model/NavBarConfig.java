package com.revolut.feature.card_design.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/api/model/NavBarConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavBarConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NavBarConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f64591a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NavBarConfig((Clause) parcel.readParcelable(NavBarConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavBarConfig[i];
        }
    }

    public NavBarConfig(Clause menuItemText) {
        Intrinsics.checkNotNullParameter(menuItemText, "menuItemText");
        this.f64591a = menuItemText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NavBarConfig) && Intrinsics.f(this.f64591a, ((NavBarConfig) obj2).f64591a);
    }

    public final int hashCode() {
        return this.f64591a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64591a, i);
    }
}

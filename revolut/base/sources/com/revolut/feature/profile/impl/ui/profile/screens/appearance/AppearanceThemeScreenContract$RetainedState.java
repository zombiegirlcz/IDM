package com.revolut.feature.profile.impl.ui.profile.screens.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.recycler.ScrollOffsetData;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/ui/profile/screens/appearance/AppearanceThemeScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/screen/ScreenStates$RetainedDomain;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppearanceThemeScreenContract$RetainedState implements ScreenStates$RetainedDomain {

    @NotNull
    public static final Parcelable.Creator<AppearanceThemeScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollOffsetData f81440a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppearanceThemeScreenContract$RetainedState((ScrollOffsetData) parcel.readParcelable(AppearanceThemeScreenContract$RetainedState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppearanceThemeScreenContract$RetainedState[i];
        }
    }

    public AppearanceThemeScreenContract$RetainedState(ScrollOffsetData scrollOffsetData) {
        this.f81440a = scrollOffsetData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AppearanceThemeScreenContract$RetainedState) && Intrinsics.f(this.f81440a, ((AppearanceThemeScreenContract$RetainedState) obj2).f81440a);
    }

    public final int hashCode() {
        ScrollOffsetData scrollOffsetData = this.f81440a;
        if (scrollOffsetData == null) {
            return 0;
        }
        return scrollOffsetData.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81440a, i);
    }
}

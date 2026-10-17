package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$SavedState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThemeCustomisationContract$SavedState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationContract$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f63776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63777b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThemeCustomisationContract$SavedState(parcel.readBundle(ThemeCustomisationContract$SavedState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationContract$SavedState[i];
        }
    }

    public ThemeCustomisationContract$SavedState(Bundle state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f63776a = state;
        this.f63777b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThemeCustomisationContract$SavedState)) {
            return false;
        }
        ThemeCustomisationContract$SavedState themeCustomisationContract$SavedState = (ThemeCustomisationContract$SavedState) obj2;
        return Intrinsics.f(this.f63776a, themeCustomisationContract$SavedState.f63776a) && this.f63777b == themeCustomisationContract$SavedState.f63777b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63777b) + (this.f63776a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeBundle(this.f63776a);
        dest.writeInt(this.f63777b ? 1 : 0);
    }
}

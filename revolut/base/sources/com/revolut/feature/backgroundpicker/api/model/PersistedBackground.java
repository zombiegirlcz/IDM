package com.revolut.feature.backgroundpicker.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/model/PersistedBackground;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersistedBackground implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PersistedBackground> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChosenBackground f63743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63744b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PersistedBackground(ChosenBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersistedBackground[i];
        }
    }

    public PersistedBackground(ChosenBackground backgroundInfo, boolean z) {
        Intrinsics.checkNotNullParameter(backgroundInfo, "backgroundInfo");
        this.f63743a = backgroundInfo;
        this.f63744b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PersistedBackground)) {
            return false;
        }
        PersistedBackground persistedBackground = (PersistedBackground) obj2;
        return Intrinsics.f(this.f63743a, persistedBackground.f63743a) && this.f63744b == persistedBackground.f63744b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63744b) + (this.f63743a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f63743a.writeToParcel(dest, i);
        dest.writeInt(this.f63744b ? 1 : 0);
    }
}

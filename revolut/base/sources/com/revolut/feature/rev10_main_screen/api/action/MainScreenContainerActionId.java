package com.revolut.feature.rev10_main_screen.api.action;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/action/MainScreenContainerActionId;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MainScreenContainerActionId implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MainScreenContainerActionId> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83423a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MainScreenContainerActionId(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainScreenContainerActionId[i];
        }
    }

    public MainScreenContainerActionId(String stringValue) {
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        this.f83423a = stringValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof MainScreenContainerActionId) && Intrinsics.f(this.f83423a, ((MainScreenContainerActionId) obj2).f83423a);
    }

    public final int hashCode() {
        return this.f83423a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83423a);
    }
}

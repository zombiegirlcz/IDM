package com.revolut.feature.rev10_main_screen.api.action;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/action/MainScreenContainerActionData;", "Landroid/os/Parcelable;", "Payload", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MainScreenContainerActionData<Payload extends Parcelable> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MainScreenContainerActionData<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainScreenContainerActionId f83421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f83422b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MainScreenContainerActionData(MainScreenContainerActionId.CREATOR.createFromParcel(parcel), parcel.readParcelable(MainScreenContainerActionData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainScreenContainerActionData[i];
        }
    }

    public MainScreenContainerActionData(MainScreenContainerActionId id10, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f83421a = id10;
        this.f83422b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MainScreenContainerActionData)) {
            return false;
        }
        MainScreenContainerActionData mainScreenContainerActionData = (MainScreenContainerActionData) obj2;
        return Intrinsics.f(this.f83421a, mainScreenContainerActionData.f83421a) && Intrinsics.f(this.f83422b, mainScreenContainerActionData.f83422b);
    }

    public final int hashCode() {
        int iHashCode = this.f83421a.f83423a.hashCode() * 31;
        Parcelable parcelable = this.f83422b;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f83421a.writeToParcel(dest, i);
        dest.writeParcelable(this.f83422b, i);
    }
}

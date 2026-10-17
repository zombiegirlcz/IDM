package com.revolut.feature.rev10_main_screen.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$Step$Modal$CustomizationMenu", "", "<init>", "()V", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainContainerFlowContract$Step$Modal$CustomizationMenu implements MainContainerFlowContract$Step {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MainContainerFlowContract$Step$Modal$CustomizationMenu f83434a = new MainContainerFlowContract$Step$Modal$CustomizationMenu();

    @NotNull
    public static final Parcelable.Creator<MainContainerFlowContract$Step$Modal$CustomizationMenu> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return MainContainerFlowContract$Step$Modal$CustomizationMenu.f83434a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainContainerFlowContract$Step$Modal$CustomizationMenu[i];
        }
    }

    private MainContainerFlowContract$Step$Modal$CustomizationMenu() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.navigable.flow.ReusableFlowStep
    public final String getKey() {
        return "CustomizationMenu";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}

package com.revolut.feature.rev10_main_screen.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Launch", "Action", "Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$InputData$Action;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$InputData$Launch;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MainContainerFlowContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SliderLayout.SlidingSpec f83429a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$InputData$Action;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action extends MainContainerFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MainScreenTab f83430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MainScreenContainerActionData f83431c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action((MainScreenTab) parcel.readParcelable(Action.class.getClassLoader()), (MainScreenContainerActionData) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(MainScreenTab initialTab, MainScreenContainerActionData action) {
            super(null);
            Intrinsics.checkNotNullParameter(initialTab, "initialTab");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f83430b = initialTab;
            this.f83431c = action;
        }

        @Override // com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final MainScreenTab getF83432b() {
            return this.f83430b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return Intrinsics.f(this.f83430b, action.f83430b) && Intrinsics.f(this.f83431c, action.f83431c);
        }

        public final int hashCode() {
            return this.f83431c.hashCode() + (this.f83430b.f83420a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83430b, i);
            dest.writeParcelable(this.f83431c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$InputData$Launch;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Launch extends MainContainerFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Launch> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MainScreenTab f83432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SliderLayout.SlidingSpec f83433c;
        public final Parcelable d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Launch((MainScreenTab) parcel.readParcelable(Launch.class.getClassLoader()), (SliderLayout.SlidingSpec) parcel.readParcelable(Launch.class.getClassLoader()), parcel.readParcelable(Launch.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Launch[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Launch(MainScreenTab initialTab, SliderLayout.SlidingSpec slidingSpec, Parcelable parcelable) {
            super(slidingSpec);
            Intrinsics.checkNotNullParameter(initialTab, "initialTab");
            this.f83432b = initialTab;
            this.f83433c = slidingSpec;
            this.d = parcelable;
        }

        @Override // com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final MainScreenTab getF83432b() {
            return this.f83432b;
        }

        @Override // com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final SliderLayout.SlidingSpec getF83429a() {
            return this.f83433c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Launch)) {
                return false;
            }
            Launch launch = (Launch) obj2;
            return Intrinsics.f(this.f83432b, launch.f83432b) && Intrinsics.f(this.f83433c, launch.f83433c) && Intrinsics.f(this.d, launch.d);
        }

        public final int hashCode() {
            int iHashCode = this.f83432b.f83420a.hashCode() * 31;
            SliderLayout.SlidingSpec slidingSpec = this.f83433c;
            int iHashCode2 = (iHashCode + (slidingSpec == null ? 0 : slidingSpec.hashCode())) * 31;
            Parcelable parcelable = this.d;
            return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83432b, i);
            dest.writeParcelable(this.f83433c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    public MainContainerFlowContract$InputData(SliderLayout.SlidingSpec slidingSpec) {
        this.f83429a = slidingSpec;
    }

    /* JADX INFO: renamed from: a */
    public abstract MainScreenTab getF83432b();

    /* JADX INFO: renamed from: b, reason: from getter */
    public SliderLayout.SlidingSpec getF83429a() {
        return this.f83429a;
    }
}

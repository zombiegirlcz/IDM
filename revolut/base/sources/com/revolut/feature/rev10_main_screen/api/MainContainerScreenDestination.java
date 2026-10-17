package com.revolut.feature.rev10_main_screen.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.navigation.MainContainerScreenFeatureConfig;
import com.revolut.kompot.bridge.navigation.AppHomeDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import dy0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination;", "Lcom/revolut/kompot/bridge/navigation/AppHomeDestination;", "<init>", "()V", "JustShow", "Slide", "Action", "Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination$Action;", "Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination$JustShow;", "Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination$Slide;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MainContainerScreenDestination implements AppHomeDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination$Action;", "Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action extends MainContainerScreenDestination {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MainScreenContainerActionData f83412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FeatureCommand f83413b;

        /* JADX INFO: loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(MainScreenContainerActionData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(MainScreenContainerActionData actionData) {
            Intrinsics.checkNotNullParameter(actionData, "actionData");
            this.f83412a = actionData;
            this.f83413b = new FeatureCommand(new MainContainerScreenFeatureConfig(this, 603979776, false));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Action) && Intrinsics.f(this.f83412a, ((Action) obj2).f83412a);
        }

        @Override // com.revolut.kompot.bridge.navigation.AppHomeDestination
        /* JADX INFO: renamed from: g1, reason: from getter */
        public final FeatureCommand getF83419c() {
            return this.f83413b;
        }

        public final int hashCode() {
            return this.f83412a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f83412a.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination$Slide;", "Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Slide extends MainContainerScreenDestination {

        @NotNull
        public static final Parcelable.Creator<Slide> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f83417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FeatureCommand f83419c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Slide(o.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Slide[i];
            }
        }

        public Slide(o direction, boolean z) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f83417a = direction;
            this.f83418b = z;
            this.f83419c = new FeatureCommand(new MainContainerScreenFeatureConfig(this, 335577088, false));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Slide)) {
                return false;
            }
            Slide slide = (Slide) obj2;
            return this.f83417a == slide.f83417a && this.f83418b == slide.f83418b;
        }

        @Override // com.revolut.kompot.bridge.navigation.AppHomeDestination
        /* JADX INFO: renamed from: g1, reason: from getter */
        public final FeatureCommand getF83419c() {
            return this.f83419c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83418b) + (this.f83417a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83417a.name());
            dest.writeInt(this.f83418b ? 1 : 0);
        }
    }

    private MainContainerScreenDestination() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination$JustShow;", "Lcom/revolut/feature/rev10_main_screen/api/MainContainerScreenDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JustShow extends MainContainerScreenDestination {

        @NotNull
        public static final Parcelable.Creator<JustShow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SliderLayout.SlidingSpec f83415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Parcelable f83416c;
        public final TransitionAnimation d;
        public final FeatureCommand e;

        /* JADX INFO: loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JustShow(parcel.readString(), (SliderLayout.SlidingSpec) parcel.readParcelable(JustShow.class.getClassLoader()), parcel.readParcelable(JustShow.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(JustShow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JustShow[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public JustShow(MainScreenTab tab2, Parcelable parcelable, AccountCreationTransitionAnimation accountCreationTransitionAnimation, int i) {
            parcelable = (i & 2) != 0 ? null : parcelable;
            accountCreationTransitionAnimation = (i & 4) != 0 ? null : accountCreationTransitionAnimation;
            Intrinsics.checkNotNullParameter(tab2, "tab");
            this(tab2.getF83420a(), (SliderLayout.SlidingSpec) null, parcelable, accountCreationTransitionAnimation);
        }

        @Override // com.revolut.kompot.bridge.navigation.AppHomeDestination, aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JustShow)) {
                return false;
            }
            JustShow justShow = (JustShow) obj2;
            return Intrinsics.f(this.f83414a, justShow.f83414a) && Intrinsics.f(this.f83415b, justShow.f83415b) && Intrinsics.f(this.f83416c, justShow.f83416c) && Intrinsics.f(this.d, justShow.d);
        }

        @Override // com.revolut.kompot.bridge.navigation.AppHomeDestination
        /* JADX INFO: renamed from: g1, reason: from getter */
        public final FeatureCommand getF83419c() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = this.f83414a.hashCode() * 31;
            SliderLayout.SlidingSpec slidingSpec = this.f83415b;
            int iHashCode2 = (iHashCode + (slidingSpec == null ? 0 : slidingSpec.hashCode())) * 31;
            Parcelable parcelable = this.f83416c;
            int iHashCode3 = (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            TransitionAnimation transitionAnimation = this.d;
            return iHashCode3 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83414a);
            dest.writeParcelable(this.f83415b, i);
            dest.writeParcelable(this.f83416c, i);
            dest.writeParcelable(this.d, i);
        }

        public JustShow(String initialTabId, SliderLayout.SlidingSpec slidingSpec, Parcelable parcelable, TransitionAnimation transitionAnimation) {
            Intrinsics.checkNotNullParameter(initialTabId, "initialTabId");
            this.f83414a = initialTabId;
            this.f83415b = slidingSpec;
            this.f83416c = parcelable;
            this.d = transitionAnimation;
            this.e = new FeatureCommand(new MainContainerScreenFeatureConfig(this, 335577088, false));
        }

        public /* synthetic */ JustShow(String str, SliderLayout.SlidingSpec slidingSpec, Parcelable parcelable, int i) {
            this(str, (i & 2) != 0 ? null : slidingSpec, (i & 4) != 0 ? null : parcelable, (i & 8) != 0 ? null : TransitionAnimation.FADE.f98392a);
        }
    }
}

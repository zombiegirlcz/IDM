package com.revolut.kompot.common.transition;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qo0.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/common/transition/ZoomTransitionAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation$Custom;", "Lqo0/f;", "Default", "Widgets", "Lcom/revolut/kompot/common/transition/ZoomTransitionAnimation$Default;", "Lcom/revolut/kompot/common/transition/ZoomTransitionAnimation$Widgets;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ZoomTransitionAnimation extends TransitionAnimation.Custom, f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/transition/ZoomTransitionAnimation$Default;", "Lcom/revolut/kompot/common/transition/ZoomTransitionAnimation;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements ZoomTransitionAnimation {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZoomTarget f98366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f98367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f98368c;
        public boolean d;
        public String e;
        public final HomeOverlayConfig f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f98369g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ZoomTarget zoomTarget = (ZoomTarget) parcel.readParcelable(Default.class.getClassLoader());
                String string = parcel.readString();
                boolean z4 = false;
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                String string2 = parcel.readString();
                HomeOverlayConfig homeOverlayConfig = (HomeOverlayConfig) parcel.readParcelable(Default.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Default(zoomTarget, string, z6, z4, string2, homeOverlayConfig, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public /* synthetic */ Default(ZoomTarget zoomTarget, HomeOverlayConfig homeOverlayConfig, int i) {
            this(zoomTarget, null, false, false, null, (i & 32) != 0 ? null : homeOverlayConfig, (i & 64) == 0);
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: E4, reason: from getter */
        public final boolean getF98369g() {
            return this.f98369g;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void O2(String str) {
            this.f98367b = str;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: O6, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void X5() {
            this.f98368c = true;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void a6(String str) {
            this.e = str;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: d8, reason: from getter */
        public final boolean getF98372c() {
            return this.f98368c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f98366a, r56.f98366a) && Intrinsics.f(this.f98367b, r56.f98367b) && this.f98368c == r56.f98368c && this.d == r56.d && Intrinsics.f(this.e, r56.e) && Intrinsics.f(this.f, r56.f) && this.f98369g == r56.f98369g;
        }

        public final int hashCode() {
            ZoomTarget zoomTarget = this.f98366a;
            int iHashCode = (zoomTarget == null ? 0 : zoomTarget.hashCode()) * 31;
            String str = this.f98367b;
            int iC = j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f98368c), 31, this.d);
            String str2 = this.e;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            HomeOverlayConfig homeOverlayConfig = this.f;
            return Boolean.hashCode(this.f98369g) + ((iHashCode2 + (homeOverlayConfig != null ? Boolean.hashCode(homeOverlayConfig.f59655a) : 0)) * 31);
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: j7, reason: from getter */
        public final HomeOverlayConfig getF() {
            return this.f;
        }

        @Override // com.revolut.kompot.navigable.TransitionAnimation
        /* JADX INFO: renamed from: m3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: m6, reason: from getter */
        public final ZoomTarget getF98370a() {
            return this.f98366a;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void o3(boolean z) {
            this.d = z;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void q9(ZoomTarget.ViewId viewId) {
            this.f98366a = viewId;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: r8, reason: from getter */
        public final String getF98371b() {
            return this.f98367b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98366a, i);
            dest.writeString(this.f98367b);
            dest.writeInt(this.f98368c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f98369g ? 1 : 0);
        }

        public Default(ZoomTarget zoomTarget, String str, boolean z, boolean z3, String str2, HomeOverlayConfig homeOverlayConfig, boolean z4) {
            this.f98366a = zoomTarget;
            this.f98367b = str;
            this.f98368c = z;
            this.d = z3;
            this.e = str2;
            this.f = homeOverlayConfig;
            this.f98369g = z4;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/transition/ZoomTransitionAnimation$Widgets;", "Lcom/revolut/kompot/common/transition/ZoomTransitionAnimation;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Widgets implements ZoomTransitionAnimation {

        @NotNull
        public static final Parcelable.Creator<Widgets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZoomTarget f98370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f98371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f98372c;
        public boolean d;
        public String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ZoomTarget zoomTarget = (ZoomTarget) parcel.readParcelable(Widgets.class.getClassLoader());
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new Widgets(zoomTarget, string, z3, parcel.readInt() == 0 ? z : true, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Widgets[i];
            }
        }

        public Widgets() {
            this(0);
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: E4 */
        public final boolean getF98369g() {
            return false;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void O2(String str) {
            this.f98371b = str;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: O6, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void X5() {
            this.f98372c = true;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void a6(String str) {
            this.e = str;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: d8, reason: from getter */
        public final boolean getF98372c() {
            return this.f98372c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Widgets)) {
                return false;
            }
            Widgets widgets = (Widgets) obj2;
            return Intrinsics.f(this.f98370a, widgets.f98370a) && Intrinsics.f(this.f98371b, widgets.f98371b) && this.f98372c == widgets.f98372c && this.d == widgets.d && Intrinsics.f(this.e, widgets.e);
        }

        public final int hashCode() {
            ZoomTarget zoomTarget = this.f98370a;
            int iHashCode = (zoomTarget == null ? 0 : zoomTarget.hashCode()) * 31;
            String str = this.f98371b;
            int iC = j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f98372c), 31, this.d);
            String str2 = this.e;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: j7 */
        public final HomeOverlayConfig getF() {
            return null;
        }

        @Override // com.revolut.kompot.navigable.TransitionAnimation
        /* JADX INFO: renamed from: m3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: m6, reason: from getter */
        public final ZoomTarget getF98370a() {
            return this.f98370a;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void o3(boolean z) {
            this.d = z;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        public final void q9(ZoomTarget.ViewId viewId) {
            this.f98370a = viewId;
        }

        @Override // com.revolut.kompot.common.transition.ZoomTransitionAnimation
        /* JADX INFO: renamed from: r8, reason: from getter */
        public final String getF98371b() {
            return this.f98371b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98370a, i);
            dest.writeString(this.f98371b);
            dest.writeInt(this.f98372c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }

        public /* synthetic */ Widgets(int i) {
            this(null, null, false, false, null);
        }

        public Widgets(ZoomTarget zoomTarget, String str, boolean z, boolean z3, String str2) {
            this.f98370a = zoomTarget;
            this.f98371b = str;
            this.f98372c = z;
            this.d = z3;
            this.e = str2;
        }
    }

    @Override // qo0.f
    default boolean E0() {
        return getF() != null;
    }

    /* JADX INFO: renamed from: E4 */
    boolean getF98369g();

    @Override // com.revolut.kompot.navigable.TransitionAnimation
    default boolean I0() {
        return false;
    }

    void O2(String str);

    /* JADX INFO: renamed from: O6 */
    String getE();

    void X5();

    void a6(String str);

    /* JADX INFO: renamed from: d8 */
    boolean getF98372c();

    /* JADX INFO: renamed from: j7 */
    HomeOverlayConfig getF();

    /* JADX INFO: renamed from: m6 */
    ZoomTarget getF98370a();

    void o3(boolean z);

    void q9(ZoomTarget.ViewId viewId);

    /* JADX INFO: renamed from: r8 */
    String getF98371b();
}

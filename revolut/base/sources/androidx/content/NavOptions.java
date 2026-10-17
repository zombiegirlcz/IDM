package androidx.content;

import androidx.content.serialization.RouteSerializerKt;
import jh.d;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001:\u00013B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010 R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0017\u0010\t\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b&\u0010 R\u0017\u0010\n\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b(\u0010 R\u0017\u0010\f\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b)\u0010 R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010\"R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Landroidx/navigation/NavOptions;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "Lkotlin/reflect/KClass;", "popUpToRouteClass", "(ZZLkotlin/reflect/KClass;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "shouldLaunchSingleTop", "()Z", "shouldRestoreState", "isPopUpToInclusive", "shouldPopUpToSaveState", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "I", "getPopUpToId", "getEnterAnim", "getExitAnim", "getPopEnterAnim", "getPopExitAnim", "value", "Ljava/lang/String;", "getPopUpToRoute", "Lkotlin/reflect/KClass;", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "Builder", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;
    private final int popUpToId;
    private final boolean popUpToInclusive;
    private String popUpToRoute;
    private KClass popUpToRouteClass;
    private Object popUpToRouteObject;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    public NavOptions(boolean z, boolean z3, int i, boolean z4, boolean z6, int i2, int i3, int i5, int i6) {
        this.singleTop = z;
        this.restoreState = z3;
        this.popUpToId = i;
        this.popUpToInclusive = z4;
        this.popUpToSaveState = z6;
        this.enterAnim = i2;
        this.exitAnim = i3;
        this.popEnterAnim = i5;
        this.popExitAnim = i6;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavOptions)) {
            NavOptions navOptions = (NavOptions) other;
            if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && Intrinsics.f(this.popUpToRoute, navOptions.popUpToRoute) && Intrinsics.f(this.popUpToRouteClass, navOptions.popUpToRouteClass) && Intrinsics.f(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final KClass getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public int hashCode() {
        int i = ((((getRestoreState() ? 1 : 0) + ((getSingleTop() ? 1 : 0) * 31)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        KClass kClass = this.popUpToRouteClass;
        int iHashCode2 = (iHashCode + (kClass != null ? kClass.hashCode() : 0)) * 31;
        Object obj2 = this.popUpToRouteObject;
        return (((((((((getPopUpToSaveState() ? 1 : 0) + (((getPopUpToInclusive() ? 1 : 0) + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    /* JADX INFO: renamed from: isPopUpToInclusive, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    /* JADX INFO: renamed from: shouldLaunchSingleTop, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* JADX INFO: renamed from: shouldPopUpToSaveState, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* JADX INFO: renamed from: shouldRestoreState, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("NavOptions(");
        if (this.singleTop) {
            sb6.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb6.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb6.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb6.append(str2);
            } else {
                KClass kClass = this.popUpToRouteClass;
                if (kClass != null) {
                    sb6.append(kClass);
                } else {
                    Object obj2 = this.popUpToRouteObject;
                    if (obj2 != null) {
                        sb6.append(obj2);
                    } else {
                        sb6.append("0x");
                        sb6.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb6.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb6.append(" saveState");
            }
            sb6.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb6.append("anim(enterAnim=0x");
            e.y(sb6, " exitAnim=0x", this.enterAnim);
            e.y(sb6, " popEnterAnim=0x", this.exitAnim);
            e.y(sb6, " popExitAnim=0x", this.popEnterAnim);
            e.y(sb6, ")", this.popExitAnim);
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0012J9\u0010\u000e\u001a\u00020\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0015J3\u0010\u000e\u001a\u00020\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u0019J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006."}, d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "<init>", "()V", "", "singleTop", "setLaunchSingleTop", "(Z)Landroidx/navigation/NavOptions$Builder;", "restoreState", "setRestoreState", "", "destinationId", "inclusive", "saveState", "setPopUpTo", "(IZZ)Landroidx/navigation/NavOptions$Builder;", "", "route", "(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;", "T", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;ZZ)Landroidx/navigation/NavOptions$Builder;", "(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;", "enterAnim", "setEnterAnim", "(I)Landroidx/navigation/NavOptions$Builder;", "exitAnim", "setExitAnim", "popEnterAnim", "setPopEnterAnim", "popExitAnim", "setPopExitAnim", "Landroidx/navigation/NavOptions;", "build", "()Landroidx/navigation/NavOptions;", "Z", "popUpToId", "I", "popUpToRoute", "Ljava/lang/String;", "popUpToRouteClass", "Lkotlin/reflect/KClass;", "popUpToRouteObject", "Ljava/lang/Object;", "popUpToInclusive", "popUpToSaveState", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private boolean popUpToInclusive;
        private String popUpToRoute;
        private KClass popUpToRouteClass;
        private Object popUpToRouteObject;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;
        private int popUpToId = -1;
        private int enterAnim = -1;
        private int exitAnim = -1;
        private int popEnterAnim = -1;
        private int popExitAnim = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i, boolean z, boolean z3, int i2, Object obj2) {
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            return builder.setPopUpTo(i, z, z3);
        }

        @NotNull
        public final NavOptions build() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            KClass kClass = this.popUpToRouteClass;
            if (kClass != null) {
                return new NavOptions(this.singleTop, this.restoreState, kClass, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj2 = this.popUpToRouteObject;
            if (obj2 == null) {
                return new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            boolean z = this.singleTop;
            boolean z3 = this.restoreState;
            Intrinsics.h(obj2);
            return new NavOptions(z, z3, obj2, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        @NotNull
        public final Builder setEnterAnim(int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        @NotNull
        public final Builder setExitAnim(int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        @NotNull
        public final Builder setLaunchSingleTop(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        @NotNull
        public final Builder setPopEnterAnim(int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        @NotNull
        public final Builder setPopExitAnim(int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        @NotNull
        public final Builder setPopUpTo(int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @NotNull
        public final Builder setRestoreState(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }

        @NotNull
        public final Builder setPopUpTo(String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @NotNull
        public final <T> Builder setPopUpTo(@NotNull KClass route, boolean inclusive, boolean saveState) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.popUpToRouteClass = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @NotNull
        public final <T> Builder setPopUpTo(@NotNull T route, boolean inclusive, boolean saveState) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.popUpToRouteObject = route;
            setPopUpTo(RouteSerializerKt.generateHashCode(d.u(o0.f186429a.b(route.getClass()))), inclusive, saveState);
            return this;
        }
    }

    public NavOptions(boolean z, boolean z3, String str, boolean z4, boolean z6, int i, int i2, int i3, int i5) {
        this(z, z3, NavDestination.INSTANCE.createRoute(str).hashCode(), z4, z6, i, i2, i3, i5);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z, boolean z3, KClass kClass, boolean z4, boolean z6, int i, int i2, int i3, int i5) {
        this(z, z3, RouteSerializerKt.generateHashCode(d.u(kClass)), z4, z6, i, i2, i3, i5);
        Intrinsics.h(kClass);
        this.popUpToRouteClass = kClass;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z, boolean z3, @NotNull Object popUpToRouteObject, boolean z4, boolean z6, int i, int i2, int i3, int i5) {
        this(z, z3, RouteSerializerKt.generateHashCode(d.u(o0.f186429a.b(popUpToRouteObject.getClass()))), z4, z6, i, i2, i3, i5);
        Intrinsics.checkNotNullParameter(popUpToRouteObject, "popUpToRouteObject");
        this.popUpToRouteObject = popUpToRouteObject;
    }
}

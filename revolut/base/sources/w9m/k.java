package w9m;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import tb.p;

/* JADX INFO: loaded from: classes23.dex */
public final class k implements FlingBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f295784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecayAnimationSpec f295785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationSpec f295786c;
    public final Function3 d;
    public final Function1 e;
    public final MutableState f;

    public k(b layoutInfo, DecayAnimationSpec decayAnimationSpec, AnimationSpec springAnimationSpec) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(springAnimationSpec, "springAnimationSpec");
        p snapIndex = p.f;
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        Function1 function1 = m.f295788b;
        this.f295784a = layoutInfo;
        this.f295785b = decayAnimationSpec;
        this.f295786c = springAnimationSpec;
        this.d = snapIndex;
        this.e = function1;
        this.f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final boolean a(k kVar, AnimationScope animationScope, c cVar, int i, Function1 function1) {
        LazyListItemInfo lazyListItemInfo = cVar.f295766a;
        float fFloatValue = ((Number) animationScope.getVelocity()).floatValue();
        b bVar = kVar.f295784a;
        int iC = (fFloatValue <= BitmapDescriptorFactory.HUE_RED || lazyListItemInfo.getIndex() < i) ? (fFloatValue >= BitmapDescriptorFactory.HUE_RED || lazyListItemInfo.getIndex() > i - 1) ? 0 : bVar.c(lazyListItemInfo.getIndex() + 1) : bVar.c(lazyListItemInfo.getIndex());
        if (iC == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iC));
        return true;
    }

    public final float b(float f) {
        b bVar = this.f295784a;
        return ((f >= BitmapDescriptorFactory.HUE_RED || bVar.b()) && (f <= BitmapDescriptorFactory.HUE_RED || bVar.a())) ? BitmapDescriptorFactory.HUE_RED : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(androidx.compose.foundation.gestures.ScrollScope r10, int r11, float r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9m.k.c(androidx.compose.foundation.gestures.ScrollScope, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(androidx.compose.foundation.gestures.ScrollScope r19, w9m.c r20, int r21, float r22, boolean r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9m.k.d(androidx.compose.foundation.gestures.ScrollScope, w9m.c, int, float, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(androidx.compose.foundation.gestures.ScrollScope r23, w9m.c r24, int r25, float r26, gim.c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9m.k.e(androidx.compose.foundation.gestures.ScrollScope, w9m.c, int, float, gim.c):java.lang.Object");
    }

    public final void f(Integer num) {
        this.f.setValue(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r17, float r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9m.k.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

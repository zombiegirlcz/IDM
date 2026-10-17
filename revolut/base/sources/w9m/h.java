package w9m;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.ktor.utils.io.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends u implements Function1 {
    public final /* synthetic */ m0 f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f295776h;
    public final /* synthetic */ m0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f295777j;
    public final /* synthetic */ boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f295778l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m0 m0Var, ScrollScope scrollScope, m0 m0Var2, k kVar, boolean z, int i) {
        super(1);
        this.f = m0Var;
        this.f295776h = scrollScope;
        this.i = m0Var2;
        this.f295777j = kVar;
        this.k = z;
        this.f295778l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AnimationScope animateDecay = (AnimationScope) obj2;
        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
        float fFloatValue = ((Number) animateDecay.getValue()).floatValue();
        m0 m0Var = this.f;
        float f = fFloatValue - m0Var.f186427a;
        float fScrollBy = this.f295776h.scrollBy(f);
        m0Var.f186427a = ((Number) animateDecay.getValue()).floatValue();
        this.i.f186427a = ((Number) animateDecay.getVelocity()).floatValue();
        if (Math.abs(f - fScrollBy) > 0.5f) {
            animateDecay.cancelAnimation();
        }
        k kVar = this.f295777j;
        c cVarE = kVar.f295784a.e();
        if (cVarE == null) {
            animateDecay.cancelAnimation();
        } else {
            LazyListItemInfo lazyListItemInfo = cVarE.f295766a;
            boolean zIsRunning = animateDecay.isRunning();
            int i = this.f295778l;
            if (zIsRunning && this.k) {
                if (((Number) animateDecay.getVelocity()).floatValue() > BitmapDescriptorFactory.HUE_RED && lazyListItemInfo.getIndex() == i - 1) {
                    animateDecay.cancelAnimation();
                } else if (((Number) animateDecay.getVelocity()).floatValue() < BitmapDescriptorFactory.HUE_RED && lazyListItemInfo.getIndex() == i) {
                    animateDecay.cancelAnimation();
                }
            }
            if (animateDecay.isRunning() && k.a(kVar, animateDecay, cVarE, i, new h0(1, this.f295776h, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0, 1))) {
                animateDecay.cancelAnimation();
            }
        }
        return Unit.f186387a;
    }
}

package w9m;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import io.ktor.utils.io.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes23.dex */
public final class j extends u implements Function1 {
    public final /* synthetic */ m0 f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f295782h;
    public final /* synthetic */ m0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f295783j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m0 m0Var, ScrollScope scrollScope, m0 m0Var2, k kVar, int i) {
        super(1);
        this.f = m0Var;
        this.f295782h = scrollScope;
        this.i = m0Var2;
        this.f295783j = kVar;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AnimationScope animateTo = (AnimationScope) obj2;
        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
        float fFloatValue = ((Number) animateTo.getValue()).floatValue();
        m0 m0Var = this.f;
        float f = fFloatValue - m0Var.f186427a;
        float fScrollBy = this.f295782h.scrollBy(f);
        m0Var.f186427a = ((Number) animateTo.getValue()).floatValue();
        this.i.f186427a = ((Number) animateTo.getVelocity()).floatValue();
        k kVar = this.f295783j;
        c cVarE = kVar.f295784a.e();
        if (cVarE == null) {
            animateTo.cancelAnimation();
        } else {
            if (k.a(kVar, animateTo, cVarE, this.k, new h0(1, this.f295782h, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0, 2)) || Math.abs(f - fScrollBy) > 0.5f) {
                animateTo.cancelAnimation();
            }
        }
        return Unit.f186387a;
    }
}

package h1;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m0;
import yrb.s;
import yrb.u;
import yrb.w;
import yrb.x;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f148439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f148440c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(float f, m0 m0Var, ScrollScope scrollScope, Function1 function1, int i) {
        this.f148438a = i;
        this.f148439b = f;
        this.f148440c = m0Var;
        this.d = scrollScope;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f148438a) {
            case 0:
                return SnapFlingBehaviorKt.animateDecay$lambda$0(this.f148439b, (m0) this.f148440c, (ScrollScope) this.d, (Function1) this.e, (AnimationScope) obj2);
            case 1:
                return SnapFlingBehaviorKt.animateWithTarget$lambda$0(this.f148439b, (m0) this.f148440c, (ScrollScope) this.d, (Function1) this.e, (AnimationScope) obj2);
            default:
                cy0.a aVar = (cy0.a) this.f148440c;
                s sVar = (s) this.d;
                u uVar = (u) this.e;
                x update = (x) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                w wVar = update.f;
                int i = aVar.f110014a;
                wVar.getClass();
                return x.a(update, null, null, null, sVar.q3(this.f148439b, uVar.f316248c.a(), uVar.f316247b), null, new w(i, true), false, null, null, null, null, null, null, null, null, 32663);
        }
    }

    public /* synthetic */ a(cy0.a aVar, s sVar, float f, u uVar) {
        this.f148438a = 2;
        this.f148440c = aVar;
        this.d = sVar;
        this.f148439b = f;
        this.e = uVar;
    }
}

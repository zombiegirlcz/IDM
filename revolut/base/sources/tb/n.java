package tb;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class n extends kotlin.jvm.internal.u implements Function2 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Modifier f269395h;
    public final /* synthetic */ a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f269396j;
    public final /* synthetic */ PaddingValues k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f269397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f269398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f269399n;
    public final /* synthetic */ oim.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f269400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f269401q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i, Modifier modifier, a0 a0Var, float f, PaddingValues paddingValues, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z, oim.n nVar, int i2, int i3) {
        super(2);
        this.f = i;
        this.f269395h = modifier;
        this.i = a0Var;
        this.f269396j = f;
        this.k = paddingValues;
        this.f269397l = horizontal;
        this.f269398m = flingBehavior;
        this.f269399n = z;
        this.o = nVar;
        this.f269400p = i2;
        this.f269401q = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        o.b(this.f, this.f269395h, this.i, this.f269396j, this.k, this.f269397l, this.f269398m, this.f269399n, this.o, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(this.f269400p | 1), RecomposeScopeImplKt.updateChangedFlags(this.f269401q));
        return Unit.f186387a;
    }
}

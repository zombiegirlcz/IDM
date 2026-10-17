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
public final class m extends kotlin.jvm.internal.u implements Function2 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Modifier f269387h;
    public final /* synthetic */ a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f269388j;
    public final /* synthetic */ FlingBehavior k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f269389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f269390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f269391n;
    public final /* synthetic */ Alignment.Horizontal o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ oim.n f269392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f269393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f269394r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i, Modifier modifier, a0 a0Var, float f, FlingBehavior flingBehavior, PaddingValues paddingValues, boolean z, Alignment.Vertical vertical, Alignment.Horizontal horizontal, oim.n nVar, int i2, int i3) {
        super(2);
        this.f = i;
        this.f269387h = modifier;
        this.i = a0Var;
        this.f269388j = f;
        this.k = flingBehavior;
        this.f269389l = paddingValues;
        this.f269390m = z;
        this.f269391n = vertical;
        this.o = horizontal;
        this.f269392p = nVar;
        this.f269393q = i2;
        this.f269394r = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        o.a(this.f, this.f269387h, this.i, this.f269388j, this.k, this.f269389l, this.f269390m, this.f269391n, this.o, this.f269392p, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(this.f269393q | 1), RecomposeScopeImplKt.updateChangedFlags(this.f269394r));
        return Unit.f186387a;
    }
}

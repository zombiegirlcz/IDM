package tb;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class s extends kotlin.jvm.internal.u implements Function2 {
    public final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269404h;
    public final /* synthetic */ Modifier i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f269405j;
    public final /* synthetic */ long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f269406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f269407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f269408n;
    public final /* synthetic */ float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Shape f269409p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f269410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f269411r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, int i, Modifier modifier, Function1 function1, long j2, long j3, float f, float f4, float f5, Shape shape, int i2) {
        super(2);
        this.f269411r = uVar;
        this.f269404h = i;
        this.i = modifier;
        this.f269405j = function1;
        this.k = j2;
        this.f269406l = j3;
        this.f269407m = f;
        this.f269408n = f4;
        this.o = f5;
        this.f269409p = shape;
        this.f269410q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        switch (this.f) {
            case 0:
                ((Number) obj3).intValue();
                v.b((a0) this.f269411r, this.i, this.f269404h, this.f269405j, this.k, this.f269406l, this.f269407m, this.f269408n, this.o, this.f269409p, composer, RecomposeScopeImplKt.updateChangedFlags(this.f269410q | 1));
                break;
            default:
                ((Number) obj3).intValue();
                v.a((u) this.f269411r, this.f269404h, this.i, this.f269405j, this.k, this.f269406l, this.f269407m, this.f269408n, this.o, this.f269409p, composer, RecomposeScopeImplKt.updateChangedFlags(this.f269410q | 1));
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, Modifier modifier, int i, Function1 function1, long j2, long j3, float f, float f4, float f5, Shape shape, int i2) {
        super(2);
        this.f269411r = a0Var;
        this.i = modifier;
        this.f269404h = i;
        this.f269405j = function1;
        this.k = j2;
        this.f269406l = j3;
        this.f269407m = f;
        this.f269408n = f4;
        this.o = f5;
        this.f269409p = shape;
        this.f269410q = i2;
    }
}

package oqk;

import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import tof.q6;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227975a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ifm.b f227976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f227977c;
    public final /* synthetic */ q6[] d;

    public /* synthetic */ p(ifm.b bVar, g0 g0Var, q6[] q6VarArr) {
        this.f227976b = bVar;
        this.f227977c = g0Var;
        this.d = q6VarArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227975a) {
            case 0:
                g0 g0Var = this.f227977c;
                com.revolut.domain.interactors.transactions.a aVar = g0Var.f227939c;
                q6[] q6VarArr = this.d;
                ((mjf.b0) aVar).t((q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length));
                pfm.a aVarE = ((mjf.b0) aVar).g((q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length)).e(g0Var.f227938b.f248320a.switchMapCompletable(new oq3.f(16, new r(g0Var, q6VarArr, 0))));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.a aVar2 = new pfm.a(aVarE, new m3l.d(11, new oma.n(new BreadcrumbException(), 5)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar2.w(new o9h.d(2, a0.f227922a), z.f227997a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                te0.w.j0(this.f227976b, hVarW);
                break;
            default:
                kotlinx.coroutines.d dVar = p0.f264003c;
                g0 g0Var2 = this.f227977c;
                q6[] q6VarArr2 = this.d;
                pfm.a aVar3 = new pfm.a(pd.b.n(dVar, new b0(g0Var2, q6VarArr2, null, 1)), new m3l.d(11, new oma.n(new BreadcrumbException(), 6)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                ofm.h hVarW2 = aVar3.w(new o9h.d(2, d0.f227932a), c0.f227928a);
                Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                ifm.b bVar = this.f227976b;
                te0.w.j0(bVar, hVarW2);
                pfm.a aVarE2 = pd.b.n(dVar, new b0(g0Var2, q6VarArr2, null, 2)).e(g0Var2.f227938b.f248320a.switchMapCompletable(new oq3.f(17, new r(g0Var2, q6VarArr2, 1))));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                pfm.a aVar4 = new pfm.a(aVarE2, new m3l.d(11, new oma.n(new BreadcrumbException(), 7)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                ofm.h hVarW3 = aVar4.w(new o9h.d(2, f0.f227935a), e0.f227933a);
                Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
                te0.w.j0(bVar, hVarW3);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ p(g0 g0Var, q6[] q6VarArr, ifm.b bVar) {
        this.f227977c = g0Var;
        this.d = q6VarArr;
        this.f227976b = bVar;
    }
}

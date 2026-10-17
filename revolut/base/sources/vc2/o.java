package vc2;

import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f287628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Alias f287629c;

    public /* synthetic */ o(u uVar, Alias alias, int i) {
        this.f287627a = i;
        this.f287628b = uVar;
        this.f287629c = alias;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        tji.l lVarB;
        switch (this.f287627a) {
            case 0:
                u uVar = this.f287628b;
                uVar.l2(new q(uVar, this.f287629c, null, 0), new yi5.b(26));
                return Unit.f186387a;
            default:
                u uVar2 = this.f287628b;
                v02.c cVar = uVar2.f287642s;
                zz1.e eVar = (zz1.e) obj2;
                int i = eVar == null ? -1 : r.f287633a[eVar.ordinal()];
                if (i == -1) {
                    lVarB = ((j12.d) cVar).b();
                } else if (i == 1) {
                    lVarB = ((j12.d) cVar).g(this.f287629c.f61878a);
                } else if (i == 2 || i == 3) {
                    lVarB = ((j12.d) cVar).e(ApmQvik.f61823c.e());
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVarB = ((j12.d) cVar).b();
                }
                uVar2.X1(lVarB);
                return Unit.f186387a;
        }
    }
}

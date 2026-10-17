package vv8;

import aw0.n6;
import cli.y;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import vv8.c;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FourthlineViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(FourthlineViewController fourthlineViewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = fourthlineViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.v, continuation, 0);
            default:
                return new v(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FourthlineViewController fourthlineViewController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fourthlineViewController.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) ((d) fourthlineViewController.T.getValue());
                y yVar = qVar.f292497s;
                y yVar2 = qVar.f292497s;
                b bVar = (b) ((j2) yVar.f22677a).getValue();
                j jVar = bVar.f292472b;
                j jVar2 = bVar.f292473c;
                if (!bVar.f292471a) {
                    qVar.l2(new vmf.k(qVar, null, 10), new yi5.b(26));
                } else if (jVar instanceof g) {
                    qVar.J2();
                } else {
                    boolean z = jVar instanceof f;
                    c.a aVar3 = c.a.f292474a;
                    if (z) {
                        t3i.i iVar = ((f) jVar).f292479a;
                        if (iVar instanceof t3i.f) {
                            t3i.f fVar = (t3i.f) iVar;
                            qVar.H2(yVar2, new l(fVar, 0));
                            qVar.l2(new vnl.o(qVar, fVar, null, 10), new vrl.n(qVar, fVar, 8));
                        } else if (iVar instanceof t3i.e) {
                            qVar.J2();
                        } else {
                            if (!(iVar instanceof t3i.g)) {
                                throw new IllegalStateException("Documents scanResult should not be in state " + iVar);
                            }
                            qVar.C2(aVar3);
                        }
                    } else if (jVar2 instanceof g) {
                        qVar.K2();
                    } else if (jVar2 instanceof f) {
                        t3i.i iVar2 = ((f) jVar2).f292479a;
                        if (iVar2 instanceof t3i.h) {
                            t3i.h hVar = (t3i.h) iVar2;
                            qVar.H2(yVar2, new m(hVar, 0));
                            qVar.l2(new vnl.o(qVar, hVar, null, 11), new vrl.n(qVar, hVar, 9));
                        } else if (iVar2 instanceof t3i.e) {
                            qVar.K2();
                        } else {
                            if (!(iVar2 instanceof t3i.g)) {
                                throw new IllegalStateException("Selfie scanResult should not be in state " + iVar2);
                            }
                            qVar.C2(aVar3);
                        }
                    } else {
                        qVar.C2(c.b.f292475a);
                    }
                }
                return Unit.f186387a;
        }
    }
}

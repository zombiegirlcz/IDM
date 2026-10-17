package hmc;

import au0.z5;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$Input;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f153625w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f153625w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f153625w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f153625w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b(this.f153625w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            default:
                b bVar4 = new b(this.f153625w, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final int i2 = 0;
        Continuation continuation = null;
        final int i3 = 1;
        c cVar = this.f153625w;
        switch (i) {
            case 0:
                q qVar = (q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVar = cVar.d;
                String portfolioId = qVar.f153657a;
                Template template = qVar.f153658b;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(template, "template");
                j60.a.v(eVar.f153637n, false, new a2.a(eVar, 14, portfolioId, template), 1);
                break;
            case 1:
                s sVar = (s) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final e eVar2 = cVar.d;
                ilc.a roboContext = sVar.f153660a;
                final String portfolioId2 = sVar.f153661b;
                Template recommendedTemplate = sVar.f153662c;
                Intrinsics.checkNotNullParameter(roboContext, "roboContext");
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
                if (((Boolean) eVar2.f153640r.getValue()).booleanValue()) {
                    yji.n.P2(eVar2, eVar2.o2(new k5f.f(new k5f.a(portfolioId2))), null, new Function1() { // from class: hmc.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i3) {
                                case 0:
                                    mtg.c output = (mtg.c) obj3;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, mtg.c.f208826a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    e eVar3 = eVar2;
                                    eVar3.V2(new z5(eVar3, portfolioId2, (Continuation) null), new yi5.b(29));
                                    return Unit.f186387a;
                                default:
                                    k5f.e it8 = (k5f.e) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Template template2 = it8.f181502a;
                                    e eVar4 = eVar2;
                                    eVar4.V2(new gsh.w(eVar4, portfolioId2, template2, null, 25), new yi5.b(29));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                } else {
                    yji.n.O2(eVar2, new TemplatesScreen(new TemplatesScreenContract$Input.ChangeCurrentTemplate(portfolioId2)), new dqd.a(eVar2, roboContext, portfolioId2, recommendedTemplate, 23), 1);
                }
                break;
            case 2:
                t tVar = (t) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVar3 = cVar.d;
                String portfolioId3 = tVar.f153663a;
                Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                eVar3.V2(new gsh.w(eVar3, portfolioId3, continuation, 24), new yi5.b(29));
                break;
            default:
                r rVar = (r) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final e eVar4 = cVar.d;
                final String portfolioId4 = rVar.f153659a;
                Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                yji.n.P2(eVar4, eVar4.o2(new mtg.a(portfolioId4)), null, new Function1() { // from class: hmc.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                            case 0:
                                mtg.c output = (mtg.c) obj3;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!Intrinsics.f(output, mtg.c.f208826a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                e eVar32 = eVar4;
                                eVar32.V2(new z5(eVar32, portfolioId4, (Continuation) null), new yi5.b(29));
                                return Unit.f186387a;
                            default:
                                k5f.e it8 = (k5f.e) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                if (it8 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Template template2 = it8.f181502a;
                                e eVar42 = eVar4;
                                eVar42.V2(new gsh.w(eVar42, portfolioId4, template2, null, 25), new yi5.b(29));
                                return Unit.f186387a;
                        }
                    }
                }, 1);
                break;
        }
        return Unit.f186387a;
    }
}

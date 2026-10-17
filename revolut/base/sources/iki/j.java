package iki;

import aii.t;
import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.root.RootFlow;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootFlow f161986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f161987b;

    public j(RootFlow rootFlow) {
        Intrinsics.checkNotNullParameter(rootFlow, "rootFlow");
        this.f161986a = rootFlow;
        this.f161987b = new ArrayList();
    }

    public static com.revolut.kompot.navigable.a a(com.revolut.kompot.navigable.a aVar) {
        return ((aVar instanceof BaseFlow) || (aVar instanceof yki.f)) ? aVar : aVar.f98405m;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(ExternalDestination destination, com.revolut.kompot.navigable.a aVar) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Integer i = destination.getI();
        RootFlow rootFlow = this.f161986a;
        if (i == null) {
            if (aVar == null) {
                aVar = rootFlow;
            }
            Intent intent = com.revolut.kompot.common.a.a(destination, rootFlow.m2());
            aVar.getClass();
            Intrinsics.checkNotNullParameter(intent, "intent");
            ((aii.b) aVar.k.getValue()).a(intent);
            return;
        }
        Iterator it8 = this.f161987b.iterator();
        while (it8.hasNext()) {
            ((Function0) it8.next()).invoke();
        }
        if (aVar == null) {
            aVar = rootFlow;
        }
        Intent intentA = com.revolut.kompot.common.a.a(destination, rootFlow.m2());
        Integer i2 = destination.getI();
        aVar.N2(intentA, i2 != null ? i2.intValue() : 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(ModalDestination destination, com.revolut.kompot.navigable.a callerController, boolean z) {
        boolean z3;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(callerController, "callerController");
        if (destination instanceof t) {
            destination = ((t) destination).a();
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = destination instanceof com.revolut.kompot.common.d;
        RootFlow rootFlow = this.f161986a;
        if (z4) {
            com.revolut.kompot.common.d dVar = (com.revolut.kompot.common.d) destination;
            BaseScreen baseScreenA = dVar.a();
            Intrinsics.i(baseScreenA, "null cannot be cast to non-null type com.revolut.kompot.navigable.Controller");
            final BaseScreen baseScreen = baseScreenA;
            final int i = 0;
            baseScreen.j2(new Function0() { // from class: iki.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            ((hli.e) baseScreen.D2()).setFitStatusBar(true);
                            break;
                        case 1:
                            ((hli.e) baseScreen.D2()).setFitStatusBar(true);
                            break;
                        default:
                            ((hli.e) baseScreen.D2()).setFitStatusBar(true);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            g48.h hVar = new g48.h(z3, baseScreenA, dVar, 10);
            Intrinsics.checkNotNullParameter(hVar, "<set-?>");
            baseScreenA.H = hVar;
            rootFlow.k3(baseScreen, dVar.b(), a(callerController), z, false);
            return;
        }
        if (destination instanceof com.revolut.kompot.common.c) {
            com.revolut.kompot.common.c cVar = (com.revolut.kompot.common.c) destination;
            Object objA = cVar.a();
            Intrinsics.i(objA, "null cannot be cast to non-null type com.revolut.kompot.navigable.Controller");
            final com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) objA;
            final int i2 = 2;
            aVar.j2(new Function0() { // from class: iki.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            ((hli.e) aVar.D2()).setFitStatusBar(true);
                            break;
                        case 1:
                            ((hli.e) aVar.D2()).setFitStatusBar(true);
                            break;
                        default:
                            ((hli.e) aVar.D2()).setFitStatusBar(true);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            g48.h hVar2 = new g48.h(z3, objA, cVar, 11);
            Intrinsics.checkNotNullParameter(hVar2, "<set-?>");
            ((BaseFlow) objA).J = hVar2;
            rootFlow.k3(aVar, cVar.b(), a(callerController), z, false);
            return;
        }
        if (destination instanceof com.revolut.kompot.common.e) {
            com.revolut.kompot.common.e eVar = (com.revolut.kompot.common.e) destination;
            eki.h hVarA = eVar.a();
            Intrinsics.i(hVarA, "null cannot be cast to non-null type com.revolut.kompot.navigable.Controller");
            final com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) hVarA;
            final int i3 = 1;
            aVar2.j2(new Function0() { // from class: iki.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            ((hli.e) aVar2.D2()).setFitStatusBar(true);
                            break;
                        case 1:
                            ((hli.e) aVar2.D2()).setFitStatusBar(true);
                            break;
                        default:
                            ((hli.e) aVar2.D2()).setFitStatusBar(true);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            ((BaseScrollerFlow) hVarA).X2(new gae.a(z3, hVarA, eVar));
            rootFlow.k3(aVar2, eVar.b(), a(callerController), z, false);
            return;
        }
        if (!(destination instanceof com.revolut.kompot.common.b)) {
            if (!(destination instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("StickyModalDestination should be unpacked.");
        }
        com.revolut.kompot.common.b bVar = (com.revolut.kompot.common.b) destination;
        com.revolut.kompot.navigable.a aVarA = bVar.a();
        if (!z3) {
            if (aVarA instanceof ViewController) {
                ViewController viewController = (ViewController) aVarA;
                ijg.c cVar2 = new ijg.c(viewController, viewController.H, 7);
                Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
                viewController.H = cVar2;
            } else if (aVarA instanceof BaseScreen) {
                BaseScreen baseScreen2 = (BaseScreen) aVarA;
                ijg.c cVar3 = new ijg.c(baseScreen2, baseScreen2.H, 5);
                Intrinsics.checkNotNullParameter(cVar3, "<set-?>");
                baseScreen2.H = cVar3;
            } else if (aVarA instanceof p) {
                p pVar = (p) aVarA;
                BaseFlow baseFlow = (BaseFlow) pVar;
                ijg.c cVar4 = new ijg.c(pVar, baseFlow.J, 4);
                Intrinsics.checkNotNullParameter(cVar4, "<set-?>");
                baseFlow.J = cVar4;
            } else {
                if (!(aVarA instanceof eki.h)) {
                    throw new IllegalStateException(("Unsupported modal controller type: " + bVar.a().getClass() + "}").toString());
                }
                BaseScrollerFlow baseScrollerFlow = (BaseScrollerFlow) ((eki.h) aVarA);
                baseScrollerFlow.X2(new ijg.c(baseScrollerFlow, baseScrollerFlow.getI(), 6));
            }
        }
        rootFlow.k3(aVarA, bVar.c(), a(callerController), z, bVar.b());
    }
}

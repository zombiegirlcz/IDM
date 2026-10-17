package yma;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f314930b;

    public /* synthetic */ q(a0 a0Var, int i) {
        this.f314929a = i;
        this.f314930b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f314929a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                a0 a0Var = this.f314930b;
                e0 e0Var = (e0) a0Var.k;
                efm.k kVarFirstElement = e0Var.f314903a.k3().firstElement();
                r rVar = new r(new b0(e0Var, 2), 5);
                kVarFirstElement.getClass();
                pfm.a aVar = new pfm.a(kVarFirstElement, rVar, 3);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                efm.b bVarH = mo3.a.u(o70.a.g(aVar), a0Var.f314897q, true).h(f9b.f.a(a0Var.o));
                Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                return bVarH;
            case 1:
                e0 e0Var2 = (e0) this.f314930b.k;
                efm.k kVarFirstElement2 = e0Var2.f314903a.k3().firstElement();
                r rVar2 = new r(new b0(e0Var2, 3), 6);
                kVarFirstElement2.getClass();
                pfm.a aVar2 = new pfm.a(kVarFirstElement2, rVar2, 3);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 2:
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                e0 e0Var3 = (e0) this.f314930b.k;
                efm.k kVarFirstElement3 = e0Var3.f314903a.f314924b.o0().firstElement();
                v60.i commandsSubject = e0Var3.i;
                Intrinsics.checkNotNullExpressionValue(commandsSubject, "commandsSubject");
                r rVar3 = new r(new yea.l(1, commandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 8), 1);
                kVarFirstElement3.getClass();
                dfm.c cVar = mfm.f.d;
                rfm.s sVar = new rfm.s(new rfm.y(kVarFirstElement3, cVar, rVar3, cVar, mfm.f.f205043c));
                Intrinsics.checkNotNullExpressionValue(sVar, "ignoreElement(...)");
                return sVar;
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                e0 e0Var4 = (e0) this.f314930b.k;
                e0Var4.getClass();
                pfm.h hVar = new pfm.h(new c0(e0Var4, 6), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 4:
                Long it11 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return this.f314930b.f314893l.j3();
            default:
                Pair it12 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                e0 e0Var5 = (e0) this.f314930b.k;
                efm.k kVarFirstElement4 = e0Var5.f314903a.k3().firstElement();
                r rVar4 = new r(new b0(e0Var5, 4), 7);
                kVarFirstElement4.getClass();
                pfm.a aVar3 = new pfm.a(kVarFirstElement4, rVar4, 3);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
        }
    }
}

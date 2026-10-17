package xzc;

import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ozc.m;
import ozc.n;
import ozc.o;
import ozc.s0;
import ozc.t;
import rfm.j;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f309922b;

    public /* synthetic */ f(i iVar, int i) {
        this.f309921a = i;
        this.f309922b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f309921a) {
            case 0:
                CharSequence text = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(text, "text");
                ozc.d dVar = this.f309922b.f309925j;
                String userDefinedType = text.toString();
                t tVar = (t) dVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
                te0.e eVarO0 = ((s0) tVar.f231329b).O0();
                od0.i.Companion.getClass();
                return w.z0(eVarO0, od0.h.a(userDefinedType));
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                i iVar = this.f309922b;
                t tVar2 = (t) iVar.f309925j;
                d0 d0VarC = w.C(((s0) tVar2.f231329b).K0());
                o oVar = new o(12, new n(3));
                d0VarC.getClass();
                pfm.a aVar = new pfm.a(new j(d0VarC, oVar, 0), new o(13, new m(tVar2, 12)), 3);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar.e(((qri.b) iVar.f309926l).m());
        }
    }
}

package s6d;

import au6.e0;
import et6.q0;
import et6.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import s6d.k;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.shared.branding.impl.ui.settings.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k6d.h f260256w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.shared.branding.impl.ui.settings.a aVar, k6d.h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f260256w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f260256w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        k6d.a aVar;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.shared.branding.impl.ui.settings.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            t0 t0Var = aVar2.o;
            this.u = 1;
            e0 e0Var = ((q0) t0Var.f129328a).f129306a;
            k6d.h hVar = this.f260256w;
            k6d.a aVar3 = hVar.f181685a;
            String str2 = hVar.f181686b;
            if (str2 == null) {
                str2 = "";
            }
            k6d.b bVar = hVar.f181687c;
            boolean z = hVar.d;
            String str3 = str2;
            boolean z3 = hVar.e;
            boolean z4 = hVar.f;
            boolean z6 = hVar.f181688g;
            k6d.c cVar = hVar.f181689h;
            Continuation continuation = null;
            String str4 = cVar != null ? cVar.f181682a : null;
            if (str4 == null) {
                str4 = "";
            }
            k6d.c cVar2 = hVar.i;
            String str5 = cVar2 != null ? cVar2.f181682a : null;
            if (str5 == null) {
                aVar = aVar3;
                str = "";
            } else {
                str = str5;
                aVar = aVar3;
            }
            k6d.i iVar = new k6d.i(aVar, str3, bVar, z, z3, z4, z6, str4, str);
            e0Var.getClass();
            ald.l lVar = new ald.l(e0Var, iVar, continuation, 18);
            p0 p0Var = p0.f264001a;
            Object objJ = skm.e0.J(elm.f.f127540b, lVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.C2(k.a.f260243a);
        return Unit.f186387a;
    }
}

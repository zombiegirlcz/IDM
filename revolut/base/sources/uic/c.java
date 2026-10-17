package uic;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.impl.R$string;
import elm.f;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ku1.v;
import n14.k;
import nii.c0;
import oki.h;
import phc.j;
import skm.e0;
import skm.p0;
import ugc.g;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f280372w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f280372w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f280372w, continuation, 0);
            default:
                return new c(this.f280372w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objP;
        int i = this.u;
        d dVar = this.f280372w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                bgc.e eVar = dVar.f280373p;
                b bVar = dVar.o;
                String str = bVar.f280370a;
                String str2 = bVar.f280371b;
                this.v = 1;
                oqk.i iVar = new oqk.i((j) ((g) eVar).f280008b, str, str2, null, 20);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(f.f127540b, iVar, this);
                return objJ == aVar ? aVar : objJ;
            default:
                yki.i iVar2 = dVar.f280377t;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    dVar.f280374q.getClass();
                    c0 c0Var = new c0(new TextLocalisedClause(R$string.perks_access_loading_title, null, null, 14), null, null, false, null, false, false, null, 1918);
                    lic.a aVar3 = new lic.a(dVar, 21);
                    v vVar = new v(29);
                    c cVar = new c(dVar, null, 0);
                    this.v = 1;
                    objP = k.P(dVar.X(), c0Var, aVar3, vVar, cVar, this);
                    if (objP == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        h.D2(iVar2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar2 = (nii.e) objP;
                if (!(eVar2 instanceof nii.d)) {
                    if (!(eVar2 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(iVar2);
                    return Unit.f186387a;
                }
                x xVar = dVar.f280375r;
                String str3 = ((ggc.k) ((nii.d) eVar2).f216133a).f143639a;
                lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                Boolean bool = Boolean.FALSE;
                this.v = 2;
                if (xVar.L1(str3, aVar4, bool, this) == aVar2) {
                    return aVar2;
                }
                h.D2(iVar2);
                return Unit.f186387a;
        }
    }
}

package lmf;

import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Map;
import k71.k;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.o;
import tof.a3;
import tof.s2;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements o {
    public /* synthetic */ a3 u;
    public /* synthetic */ t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Map f196974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ na7.a f196975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f196976y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(5, continuation);
        this.f196976y = bVar;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        a aVar = new a(this.f196976y, (Continuation) obj6);
        aVar.u = (a3) obj2;
        aVar.v = (t3) obj3;
        aVar.f196974w = (Map) obj4;
        aVar.f196975x = (na7.a) obj5;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a3 a3Var = this.u;
        t3 t3Var = this.v;
        Map map = this.f196974w;
        na7.a aVar = this.f196975x;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = b.z;
        s2 s2Var = t3Var != null ? t3Var.f273079t0 : null;
        boolean z = k.c1(a3Var) && k.s(a3Var) && s2Var != null && !s2Var.f273041b;
        Pair pair = !z ? new Pair(new Integer(R$attr.uikit_colorForeground), new Integer(R$attr.uikit_colorForeground_80)) : new Pair(new Integer(R$attr.uikit_colorGreyTone50), new Integer(R$attr.uikit_colorGreyTone50));
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        b bVar = this.f196976y;
        cmf.h hVarF = vlf.b.f(bVar.f, a3Var, map, aVar, null, false, iIntValue, iIntValue2, 8);
        return bVar.f196977g.b(a3Var, map, aVar, cmf.h.a(hVarF, null, null, null, null, !z ? hVarF.e : new AccentCircleBadge(dw0.a.Pending), false, false, null, null, null, 2031), iIntValue);
    }
}

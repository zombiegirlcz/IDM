package jvh;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import elm.f;
import gim.c;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import vkm.d;
import w4l.h;
import xkl.e;
import z8k.p0;
import zr5.k;
import zuh.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f178883a;

    public a(o workflowRepository) {
        Intrinsics.checkNotNullParameter(workflowRepository, "workflowRepository");
        this.f178883a = workflowRepository;
    }

    public static Object i(a aVar, String str, List list, ArrayList arrayList, String str2, i iVar, int i) throws Throwable {
        ArrayList arrayList2 = (i & 4) != 0 ? null : arrayList;
        String str3 = (i & 8) != 0 ? null : str2;
        o oVar = aVar.f178883a;
        if (str3 == null) {
            oVar.getClass();
            p0 p0Var = new p0(7, oVar, str, list, arrayList2, null);
            skm.p0 p0Var2 = skm.p0.f264001a;
            Object objJ = e0.J(f.f127540b, p0Var, iVar);
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            if (objJ != aVar2) {
                objJ = Unit.f186387a;
            }
            return objJ == aVar2 ? objJ : Unit.f186387a;
        }
        oVar.getClass();
        e eVar = new e(oVar, str3, str, list, arrayList2, (Continuation) null, 13);
        skm.p0 p0Var3 = skm.p0.f264001a;
        Object objJ2 = e0.J(f.f127540b, eVar, iVar);
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        if (objJ2 != aVar3) {
            objJ2 = Unit.f186387a;
        }
        return objJ2 == aVar3 ? objJ2 : Unit.f186387a;
    }

    public final Object a(WorkflowName workflowName, c cVar) {
        o oVar = this.f178883a;
        oVar.getClass();
        k kVar = new k(oVar, workflowName, null, 6);
        skm.p0 p0Var = skm.p0.f264001a;
        return e0.J(f.f127540b, kVar, cVar);
    }

    public final Object b(Map map, c cVar) {
        o oVar = this.f178883a;
        oVar.getClass();
        k kVar = new k(oVar, map, null, 7);
        skm.p0 p0Var = skm.p0.f264001a;
        return e0.J(f.f127540b, kVar, cVar);
    }

    public final Object c(i iVar) {
        o oVar = this.f178883a;
        oVar.getClass();
        zuh.i iVar2 = new zuh.i(oVar, null, 0);
        skm.p0 p0Var = skm.p0.f264001a;
        return e0.J(f.f127540b, iVar2, iVar);
    }

    public final Object d(c cVar) {
        o oVar = this.f178883a;
        oVar.getClass();
        zuh.i iVar = new zuh.i(oVar, null, 1);
        skm.p0 p0Var = skm.p0.f264001a;
        return e0.J(f.f127540b, iVar, cVar);
    }

    public final d e(WorkflowName flowName, boolean z) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        o oVar = this.f178883a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        return oVar.f325483g.b(new zuh.e(flowName), z ? w4l.i.f294643c : h.f294642c);
    }

    public final d f(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        o oVar = this.f178883a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return oVar.f325483g.b(new zuh.f(params), w4l.i.f294643c);
    }

    public final Object g(String str, String str2, c cVar) throws Throwable {
        o oVar = this.f178883a;
        oVar.getClass();
        z9m.a aVar = new z9m.a(12, oVar, str2, str, (Continuation) null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = e0.J(f.f127540b, aVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    public final Object j(String str, MobileScreenParams mobileScreenParams, Continuation continuation) throws Throwable {
        o oVar = this.f178883a;
        oVar.getClass();
        z9m.a aVar = new z9m.a(13, oVar, mobileScreenParams, str, (Continuation) null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = e0.J(f.f127540b, aVar, continuation);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}

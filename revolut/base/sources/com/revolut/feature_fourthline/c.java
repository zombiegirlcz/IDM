package com.revolut.feature_fourthline;

import com.fourthline.orca.workflow.WorkflowSession;
import com.revolut.feature_fourthline.FourthlineSdkImpl;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import rd0.d;
import skm.l;
import t3i.o;
import t3i.q;
import yhm.m;
import yhm.n;
import zhm.h0;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f97004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f97005b;

    public c(FourthlineSdkImpl fourthlineSdkImpl, String str, l lVar) {
        this.f97004a = str;
        this.f97005b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = ((m) obj2).f314193a;
        m.Companion companion = m.INSTANCE;
        WorkflowSession workflowSession = (WorkflowSession) (obj3 instanceof n ? null : obj3);
        l lVar = this.f97005b;
        String str = this.f97004a;
        if (workflowSession != null) {
            FourthlineSdkImpl.Companion companion2 = FourthlineSdkImpl.INSTANCE;
            q qVar = new q(workflowSession, str);
            companion2.getClass();
            FourthlineSdkImpl.cachedSession = qVar;
            lVar.resumeWith(o.f267802a);
        } else {
            Throwable thA = m.a(obj3);
            if (thA == null) {
                thA = new IllegalStateException("Failed to start Fourthline session");
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, "validationCode: " + str, thA, h0Var);
            lVar.resumeWith(new t3i.n(thA));
        }
        return Unit.f186387a;
    }
}

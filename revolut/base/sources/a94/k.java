package a94;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import vkm.j2;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends yji.n implements vki.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xw3.a f2316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f2317n;

    public k(String applicationId, xw3.a debtsInteractor) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
        this.f2315l = applicationId;
        this.f2316m = debtsInteractor;
        this.f2317n = pyd.c.a(this, new r(new Data(null, null, true, 3, null), null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(a94.k r6, gim.c r7) {
        /*
            vki.a r0 = r6.f2317n
            boolean r1 = r7 instanceof a94.f
            if (r1 == 0) goto L15
            r1 = r7
            a94.f r1 = (a94.f) r1
            int r2 = r1.f2312w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f2312w = r2
            goto L1a
        L15:
            a94.f r1 = new a94.f
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f2312w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            goto L53
        L29:
            r7 = move-exception
            goto L81
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            xw3.a r7 = r6.f2316m     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            java.lang.String r3 = r6.f2315l     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            java.lang.Object r5 = r0.f22677a     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            vkm.j2 r5 = (vkm.j2) r5     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            a94.r r5 = (a94.r) r5     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            qu3.e r5 = r5.f2329b     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            if (r5 == 0) goto L61
            java.lang.String r5 = r5.f249200a     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            r1.f2312w = r4     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            java.lang.Object r7 = r7.a(r3, r5, r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            if (r7 != r2) goto L53
            return r2
        L53:
            a82.l r7 = new a82.l     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            r1 = 22
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            r6.X2(r0, r7)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
        L5d:
            r6.t2()
            goto L7e
        L61:
            java.lang.String r7 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
            throw r0     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L69
        L69:
            mii.h r7 = new mii.h     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "debt_delete_error"
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause     // Catch: java.lang.Throwable -> L29
            int r2 = com.revolut.feature.credit.core.R$string.credit_common_error_title     // Catch: java.lang.Throwable -> L29
            r3 = 14
            r4 = 0
            r1.<init>(r2, r4, r4, r3)     // Catch: java.lang.Throwable -> L29
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> L29
            r6.L2(r7)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L7e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L81:
            r6.t2()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a94.k.Z2(a94.k, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        xw3.a aVar = this.f2316m;
        aVar.getClass();
        String applicationId = this.f2315l;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        d34.e eVar = aVar.f309327a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.n.j2(this, rd0.e.n(nim.a.v(pyd.c.m(eVar.f.b(new d34.a(applicationId), loadingStrategy)), new h0() { // from class: a94.i
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((qu3.g) obj2).f249207a;
            }
        }), zhm.h0.f322473a), null, new h(this, null, 1), 3);
    }

    public final void b3(String debtId) {
        Intrinsics.checkNotNullParameter(debtId, "debtId");
        vki.a aVar = this.f2317n;
        Object content = ((r) ((j2) aVar.f22677a).getValue()).f2328a.getContent();
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayListF1 = d0.f1((Collection) content);
        Iterator it8 = arrayListF1.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((qu3.e) it8.next()).f249200a, debtId)) {
                break;
            } else {
                i++;
            }
        }
        qu3.e eVar = (qu3.e) arrayListF1.remove(i);
        X2(aVar, new e(arrayListF1, eVar, i, 0));
        yji.n.j2(this, L2(new mii.f("debt_deleted", new TextLocalisedClause(R$string.credit_application_outstanding_debts_delete_success_title, u.c(new TextLocalisedClause(cp5.c.w(eVar.f249201b), null, null, 14)), null, 12), new TextLocalisedClause(R$string.credit_application_outstanding_debts_delete_success_action, null, null, 14), null, null, null, SyslogConstants.LOG_CLOCK)), null, new h(this, null, 0), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f2317n;
    }
}

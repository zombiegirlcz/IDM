package jec;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.terms.api.model.TermsScope;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jnd.t;
import jni.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zg3.r;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f173267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f173268x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f173267w = obj2;
        this.f173268x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p((q) this.f173267w, (l6c.h) this.f173268x, continuation, 0);
            case 1:
                return new p((jf2.i) this.f173267w, (ResolveAlias) this.f173268x, continuation, 1);
            case 2:
                p pVar = new p((fti.b) this.f173268x, continuation, 2);
                pVar.f173267w = obj2;
                return pVar;
            case 3:
                return new p((xo9.h) this.f173267w, (jg2.c) this.f173268x, continuation, 3);
            case 4:
                return new p((com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) this.f173267w, (String) this.f173268x, continuation, 4);
            case 5:
                p pVar2 = new p((r) this.f173268x, continuation, 5);
                pVar2.f173267w = obj2;
                return pVar2;
            case 6:
                return new p((jh9.p) this.f173267w, (PaymentData) this.f173268x, continuation, 6);
            case 7:
                return new p((jh9.p) this.f173267w, (h1j.d) this.f173268x, continuation, 7);
            case 8:
                return new p((ji5.e) this.f173267w, (ec5.c) this.f173268x, continuation, 8);
            case 9:
                p pVar3 = new p((jid.q) this.f173268x, continuation, 9);
                pVar3.f173267w = obj2;
                return pVar3;
            case 10:
                return new p((jj9.m) this.f173267w, (ux4.d) this.f173268x, continuation, 10);
            case 11:
                p pVar4 = new p((com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a) this.f173268x, continuation, 11);
                pVar4.f173267w = obj2;
                return pVar4;
            case 12:
                return new p((jk7.k) this.f173267w, (File) this.f173268x, continuation, 12);
            case 13:
                return new p((jl9.b) this.f173267w, (String) this.f173268x, continuation, 13);
            case 14:
                return new p((jl9.b) this.f173267w, (File) this.f173268x, continuation, 14);
            case 15:
                p pVar5 = new p((jlh.o) this.f173268x, continuation, 15);
                pVar5.f173267w = obj2;
                return pVar5;
            case 16:
                return new p((jn7.h) this.f173267w, (rr7.b) this.f173268x, continuation, 16);
            case 17:
                return new p((t) this.f173268x, continuation, 17);
            case 18:
                p pVar6 = new p((s) this.f173268x, continuation, 18);
                pVar6.f173267w = obj2;
                return pVar6;
            case 19:
                return new p((s) this.f173267w, (String) this.f173268x, continuation, 19);
            case 20:
                return new p((jnj.g) this.f173267w, (String) this.f173268x, continuation, 20);
            case 21:
                return new p((joa.i) this.f173267w, (TermsScope) this.f173268x, continuation, 21);
            case 22:
                return new p((job.b) this.f173267w, (String) this.f173268x, continuation, 22);
            case 23:
                return new p((job.c) this.f173267w, (String) this.f173268x, continuation, 23);
            case 24:
                return new p((jq4.n) this.f173267w, (ssi.k) this.f173268x, continuation, 24);
            case 25:
                return new p((jqj.l) this.f173267w, (ArrayList) this.f173268x, continuation, 25);
            case 26:
                return new p((List) this.f173267w, (jqj.l) this.f173268x, continuation, 26);
            case 27:
                return new p((jr1.e) this.f173267w, (TermsScope) this.f173268x, continuation, 27);
            case 28:
                return new p((com.revolut.feature.voluntary.offboarding.impl.ui.flow.e) this.f173268x, continuation, 28);
            default:
                return new p((com.revolut.feature.voluntary.offboarding.impl.ui.flow.e) this.f173267w, (ksg.g) this.f173268x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x033b -> B:179:0x031a). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jec.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f173268x = obj2;
    }
}

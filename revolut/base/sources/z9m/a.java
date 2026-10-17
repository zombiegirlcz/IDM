package z9m;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zuh.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f320512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f320513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f320514y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f320513x = obj2;
        this.f320512w = str;
        this.f320514y = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((e) this.f320514y, continuation, 0);
            case 1:
                return new a((k) this.f320514y, continuation, 1);
            case 2:
                return new a((com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) this.f320514y, continuation, 2);
            case 3:
                return new a((com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) this.f320513x, (zg6.a) this.f320514y, (String) this.f320512w, continuation);
            case 4:
                a aVar = new a((zge.i) this.f320514y, continuation, 4);
                aVar.f320513x = obj2;
                return aVar;
            case 5:
                a aVar2 = new a((zl1.l) this.f320514y, continuation, 5);
                aVar2.f320513x = obj2;
                return aVar2;
            case 6:
                return new a((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.f320513x, (amd.i) this.f320514y, continuation, 6);
            case 7:
                return new a((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.f320512w, (ind.g) this.f320513x, (mpd.c) this.f320514y, continuation, 7);
            case 8:
                return new a((com.revolut.feature.crypto.withdraw.impl.ui_v3.a) this.f320512w, (CryptoAddress) this.f320513x, (xi0.b) this.f320514y, continuation, 8);
            case 9:
                a aVar3 = new a((File) this.f320513x, (uc.d) this.f320514y, continuation, 9);
                aVar3.f320512w = obj2;
                return aVar3;
            case 10:
                return new a((ztc.f) this.f320513x, (jf0.c) this.f320514y, continuation, 10);
            case 11:
                return new a(11, (zue.a) this.f320513x, (String) this.f320514y, (String) this.f320512w, continuation);
            case 12:
                return new a(12, (o) this.f320513x, (String) this.f320514y, (String) this.f320512w, continuation);
            case 13:
                return new a(13, (o) this.f320513x, (MobileScreenParams) this.f320514y, (String) this.f320512w, continuation);
            case 14:
                return new a(14, (o) this.f320513x, (ArrayList) this.f320514y, (String) this.f320512w, continuation);
            default:
                return new a((com.revolut.feature.topup_screen.impl.google_pay.flow.b) this.f320512w, (xze.d) this.f320513x, (GooglePayFee) this.f320514y, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x052f, code lost:
    
        if (r8.equals("webp") != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0538, code lost:
    
        if (r8.equals("jpeg") == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0541, code lost:
    
        if (r8.equals("png") == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x054a, code lost:
    
        if (r8.equals("jpg") == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0553, code lost:
    
        if (r8.equals("gif") == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x055c, code lost:
    
        if (r8.equals("bmp") == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x055f, code lost:
    
        r18.f320512w = r2;
        r18.v = 1;
        r1 = uc.d.g(r7, r1, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0567, code lost:
    
        if (r1 != r4) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:438:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z9m.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b bVar, zg6.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f320513x = bVar;
        this.f320514y = aVar;
        this.f320512w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320513x = obj2;
        this.f320514y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320514y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(oki.h hVar, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320512w = hVar;
        this.f320513x = obj2;
        this.f320514y = obj3;
    }
}

package a9j;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import com.revolut.feature.transport.models.transit.TransitTicket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f2700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f2701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f2702y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar, l1j.f fVar, String str, s56.o oVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f2700w = bVar;
        this.f2702y = fVar;
        this.z = str;
        this.A = oVar;
        this.f2701x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f2701x, (u) this.f2702y, (xi0.b) this.z, (od0.i) this.A, continuation);
                oVar.f2700w = obj2;
                return oVar;
            case 1:
                o oVar2 = new o((com.revolut.feature.external_accounts.impl.ui.consents_kompot.c) this.f2702y, (OpenBankingConsentsFlowContract$FlowType) this.z, (OpenBankingConsent) this.A, this.f2701x, continuation, 1);
                oVar2.f2700w = obj2;
                return oVar2;
            case 2:
                return new o((jfb.f) this.f2700w, (Uri) this.f2702y, this.f2701x, (JavaScriptReplyProxy) this.z, (WebView) this.A, continuation);
            case 3:
                o oVar3 = new o((akg.n) this.f2702y, (xi0.b) this.z, (k18.c) this.A, this.f2701x, continuation, 3);
                oVar3.f2700w = obj2;
                return oVar3;
            case 4:
                return new o((com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.f2700w, (l1j.f) this.f2702y, (String) this.z, (s56.o) this.A, this.f2701x, continuation);
            case 5:
                return new o((sca.e) this.z, (jf0.c) this.A, this.f2701x, continuation, 5);
            case 6:
                o oVar4 = new o((kq2.b) this.z, (w4k.k) this.A, this.f2701x, continuation, 6);
                oVar4.f2700w = obj2;
                return oVar4;
            default:
                return new o((wwf.o) this.f2700w, this.f2701x, (bxf.e) this.f2702y, (pza.d) this.z, (TransitTicket) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9j.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, Object obj4, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2702y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.f2701x = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
        this.f2701x = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jfb.f fVar, Uri uri2, boolean z, JavaScriptReplyProxy javaScriptReplyProxy, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f2700w = fVar;
        this.f2702y = uri2;
        this.f2701x = z;
        this.z = javaScriptReplyProxy;
        this.A = webView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wwf.o oVar, boolean z, bxf.e eVar, pza.d dVar, TransitTicket transitTicket, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f2700w = oVar;
        this.f2701x = z;
        this.f2702y = eVar;
        this.z = dVar;
        this.A = transitTicket;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z, u uVar, xi0.b bVar, od0.i iVar, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f2701x = z;
        this.f2702y = uVar;
        this.z = bVar;
        this.A = iVar;
    }
}

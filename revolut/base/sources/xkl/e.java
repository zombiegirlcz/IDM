package xkl;

import cam.t;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateCreatePayload;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Challenge;
import ft3.a1;
import ft3.d1;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okl.s;
import org.joda.time.Instant;
import y20.b1;
import y20.p;
import zuh.o;
import zw5.n;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f306872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f306873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f306874y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Serializable serializable, Object obj2, Object obj3, Object obj4, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f306873x = obj2;
        this.f306874y = serializable;
        this.z = obj3;
        this.A = obj4;
        this.f306872w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((i) this.f306873x, (String) this.f306872w, (Challenge) this.f306874y, (o10.c) this.z, (s) this.A, continuation, 0);
            case 1:
                return new e(1, (d1) this.f306874y, (xr3.l) this.f306873x, (a1) this.z, (IntendedPricingPlan) this.A, (String) this.f306872w, continuation);
            case 2:
                return new e(2, (ZonedDateTime) this.f306874y, (ZonedDateTime) this.f306873x, (List) this.z, (xvj.e) this.A, (String) this.f306872w, continuation);
            case 3:
                return new e((b1) this.f306873x, (p) this.f306872w, (Instant) this.f306874y, (Instant) this.z, (Instant) this.A, continuation, 3);
            case 4:
                return new e((yji.l) this.f306873x, (AccountId) this.f306874y, (String) this.f306872w, (String) this.z, (k1j.a) this.A, continuation, 4);
            case 5:
                e eVar = new e((y9d.e) this.z, (InvoiceTemplateCreatePayload) this.A, continuation, 5);
                eVar.f306874y = obj2;
                return eVar;
            case 6:
                e eVar2 = new e((dam.s) this.f306874y, (t) this.z, (dam.i) this.A, continuation);
                eVar2.f306872w = obj2;
                return eVar2;
            case 7:
                return new e((yji.l) this.f306873x, (AccountId) this.f306874y, (String) this.f306872w, (String) this.z, (k1j.a) this.A, continuation, 7);
            case 8:
                return new e((yji.l) this.f306873x, (AccountId) this.f306874y, (String) this.f306872w, (String) this.z, (k1j.a) this.A, continuation, 8);
            case 9:
                e eVar3 = new e((zge.i) this.z, (Map) this.A, continuation, 9);
                eVar3.f306874y = obj2;
                return eVar3;
            case 10:
                e eVar4 = new e((zkl.a) this.f306874y, (AuthAction) this.z, (String) this.f306872w, (Function0) this.A, continuation);
                eVar4.f306873x = obj2;
                return eVar4;
            case 11:
                return new e((zpl.g) this.f306873x, (String) this.f306872w, (String) this.f306874y, (String) this.z, (a3l.b) this.A, continuation, 11);
            case 12:
                return new e((String) this.f306872w, (String) this.f306873x, (sil.i) this.f306874y, (o) this.z, (String) this.A, continuation);
            case 13:
                return new e((o) this.f306873x, (String) this.f306872w, (String) this.f306874y, (List) this.z, (List) this.A, continuation, 13);
            default:
                return new e((String) this.f306872w, (xi0.b) this.f306874y, (n) this.z, (k1j.a) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:203|(1:(1:(3:207|225|226)(2:208|209))(1:210))(2:211|(1:386))|214|354|215|(1:217)|218|219|(4:222|(1:387)|225|226)(2:227|228)) */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05a6, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0679, code lost:
    
        if (r2 == r1) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x06ae, code lost:
    
        if (r2 == r1) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06e3, code lost:
    
        if (r2 == r1) goto L273;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v24, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkl.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dam.s sVar, t tVar, dam.i iVar, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f306874y = sVar;
        this.z = tVar;
        this.A = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306873x = obj2;
        this.f306872w = obj3;
        this.f306874y = obj4;
        this.z = obj5;
        this.A = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, sil.i iVar, o oVar, String str3, Continuation continuation) {
        super(2, continuation);
        this.u = 12;
        this.f306872w = str;
        this.f306873x = str2;
        this.f306874y = iVar;
        this.z = oVar;
        this.A = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, xi0.b bVar, n nVar, k1j.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.f306872w = str;
        this.f306874y = bVar;
        this.z = nVar;
        this.A = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(yji.l lVar, AccountId accountId, String str, String str2, k1j.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306873x = lVar;
        this.f306874y = accountId;
        this.f306872w = str;
        this.z = str2;
        this.A = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zkl.a aVar, AuthAction authAction, String str, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f306874y = aVar;
        this.z = authAction;
        this.f306872w = str;
        this.A = function0;
    }
}

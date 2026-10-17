package bn4;

import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vge.t2;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f17105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f17106y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Continuation continuation, b0 b0Var, CreditCardDeeplink creditCardDeeplink, boolean z) {
        super(2, continuation);
        this.u = 0;
        this.f17106y = b0Var;
        this.z = creditCardDeeplink;
        this.f17105x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(continuation, (b0) this.f17106y, (CreditCardDeeplink) this.z, this.f17105x);
                zVar.f17104w = ((Boolean) obj2).booleanValue();
                return zVar;
            case 1:
                return new z((com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d) this.f17106y, this.f17104w, (String) this.z, this.f17105x, continuation, 1);
            case 2:
                return new z((com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.f17106y, this.f17104w, (Set) this.z, this.f17105x, continuation, 2);
            default:
                return new z((t2) this.f17106y, (String) this.z, this.f17105x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                break;
        }
        return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(oki.h hVar, boolean z, Object obj2, boolean z3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17106y = hVar;
        this.f17104w = z;
        this.z = obj2;
        this.f17105x = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t2 t2Var, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f17106y = t2Var;
        this.z = str;
        this.f17105x = z;
    }
}

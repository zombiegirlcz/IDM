package ikf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import pfm.r;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f161945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f161946x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f161945w = hVar;
        this.f161946x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f161945w, this.f161946x, continuation, 0);
            default:
                return new f(this.f161945w, this.f161946x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        String str = this.f161946x;
        h hVar = this.f161945w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        r rVarA = hVar.f161951n.a(hVar.f161952p.a());
                        this.v = 1;
                        if (nim.a.a(rVarA, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    hVar.f161955s.k(Unit.f186387a);
                    return hVar.L2(new k("CANCEL_SUCCESS_TOAST_ID", new TextLocalisedClause(Intrinsics.f(str, "awaiting_cardholder_verification") ? R$string.transactionUI_transaction_cancel_success_message : R.string.transfer_action_revert_success_message_no_details, null, null, 14), null, null, null, 28));
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                    return hVar.L2(new mii.h(new TextLocalisedClause(R.string.error_generic, null, null, 14), "CANCEL_ERROR_TOAST_ID"));
                }
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar = new f(hVar, str, continuation, 0);
                this.v = 1;
                Object objY2 = hVar.Y2(this, fVar);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}

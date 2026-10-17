package k50;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class s3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f181241x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(j4 j4Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f181240w = j4Var;
        this.f181241x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s3(this.f181240w, this.f181241x, continuation, 0);
            default:
                return new s3(this.f181240w, this.f181241x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j4 j4Var = this.f181240w;
        String str = this.f181241x;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    r3 r3Var = new r3(j4Var, str, continuation, 0);
                    this.v = 1;
                    if (j4Var.p2(this, r3Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        yhm.o.b(obj2);
                        r3 r3Var2 = new r3(j4Var, str, continuation, i2);
                        this.v = 1;
                        if (j4Var.p2(this, r3Var2) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return j4Var.X1(new mii.k("subscribed_to_incident_" + str, new TextLocalisedClause(R$string.chat_ongoing_outage_notify_toast, null, null, 14), null, null, null, 28));
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, null, null, e, h0Var);
                    return j4Var.X1(new mii.h(new TextLocalisedClause(R$string.chat_error_something_went_wrong, null, null, 14), j6.a.q("subscribed_to_incident_error_", str)));
                }
        }
    }
}

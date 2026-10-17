package rc8;

import aii.u;
import com.revolut.feature.junior.accounts.models.JuniorAccountPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public e u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f253218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f253219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f253220y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f253218w = eVar;
        this.f253219x = str;
        this.f253220y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.f253218w, this.f253219x, this.f253220y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar2 = this.f253218w;
            q78.e eVar3 = eVar2.f253226r;
            String str = this.f253220y;
            String str2 = this.f253219x;
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new JuniorAccountPayload.AccountClosed(str2, str));
            this.u = eVar2;
            this.v = 1;
            Object objC = u68.b.c(eVar3, str2, null, action, this, 10);
            if (objC == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.u;
            o.b(obj2);
        }
        eVar.A2((u) obj2);
        return Unit.f186387a;
    }
}

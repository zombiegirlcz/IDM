package ttl;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f274475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LocalDate f274476x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, LocalDate localDate, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274475w = xVar;
        this.f274476x = localDate;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f274475w, this.f274476x, continuation, 0);
            default:
                return new w(this.f274475w, this.f274476x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar = this.f274475w;
                v vVar = new v(xVar, this.f274476x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(xVar.k, "on_date_picker_click", vVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar2 = this.f274475w;
                v vVar2 = new v(xVar2, this.f274476x, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(xVar2.k, "on_show_date_picker_dialog", vVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}

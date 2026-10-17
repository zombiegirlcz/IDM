package lr;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yui.v;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f199339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f199340x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199339w = eVar;
        this.f199340x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f199339w, this.f199340x, continuation, 0);
            default:
                return new d(this.f199339w, this.f199340x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    zq.a aVarG = this.f199339w.f199341a.g();
                    this.v = 1;
                    if (DBUtil.performSuspending((RoomDatabase) aVarG.f324335b, false, true, new v(this.f199340x, 25), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    zq.a aVarG2 = this.f199339w.f199341a.g();
                    this.v = 1;
                    obj2 = DBUtil.performSuspending((RoomDatabase) aVarG2.f324335b, true, false, new v(this.f199340x, 24), this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ar.a aVar3 = (ar.a) obj2;
                if (aVar3 != null) {
                    return aVar3.f8475b;
                }
                return null;
        }
    }
}

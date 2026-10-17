package y5b;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f311061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Serializable f311062x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f311061w = tVar;
        this.f311062x = str;
        this.v = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s((t) this.f311061w, (String) this.f311062x, this.v, continuation);
            default:
                s sVar = new s((yh7.j) this.f311061w, (dsh.e) this.f311062x, continuation);
                sVar.v = ((Boolean) obj2).booleanValue();
                return sVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((s) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Serializable serializable = this.f311062x;
        Object obj3 = this.f311061w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((t) obj3).f311063a;
                String str = (String) serializable;
                if (str == null) {
                    str = "";
                }
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, cVar, "card_benefits_expanded_".concat(str), Boolean.valueOf(this.v));
                return Unit.f186387a;
            default:
                boolean z = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z) {
                    return zi0.c.i(yh7.d.f313871a);
                }
                yh7.j jVar = (yh7.j) obj3;
                return nim.a.v(jVar.j(jVar.i, (dsh.e) serializable), new ye1.m(29));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yh7.j jVar, dsh.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f311061w = jVar;
        this.f311062x = eVar;
    }
}

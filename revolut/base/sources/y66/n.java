package y66;

import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f311194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f311195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f311196y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, xi0.b bVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f311194w = str;
        this.f311195x = bVar;
        this.f311196y = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f311194w, this.f311195x, this.f311196y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar = this.v;
            a76.b bVar = oVar.f311199r;
            ihm.f fVar = oVar.f311200s;
            SortingType.MarketCap marketCap = new SortingType.MarketCap(0);
            wk5.a aVar2 = oVar.o.f71882c;
            this.u = 1;
            if (((a76.e) bVar).a(fVar, marketCap, this.f311194w, this.f311195x, this.f311196y, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}

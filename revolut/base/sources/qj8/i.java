package qj8;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ int u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f246785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hlm.a f246786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f246787y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(hlm.a aVar, Continuation continuation, j jVar, String str, List list, int i) {
        super(2, continuation);
        this.u = i;
        this.f246786x = aVar;
        this.f246787y = jVar;
        this.z = str;
        this.A = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f246786x, continuation, this.f246787y, this.z, this.A, 0);
            default:
                return new i(this.f246786x, continuation, this.f246787y, this.z, this.A, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        List list = this.A;
        String str = this.z;
        j jVar = this.f246787y;
        hlm.a aVar = this.f246786x;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f246785w;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = aVar;
                    this.f246785w = 1;
                    if (aVar.lock(null, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.v;
                    o.b(obj2);
                }
                try {
                    ue0.c cVar = jVar.f246790c;
                    String strA = e.a(j.Companion, str);
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(com.revolut.feature.junior_profile.api.models.a.class);
                    companion.getClass();
                    cVar.G(list, strA, z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                    Unit unit = Unit.f186387a;
                    aVar.unlock(null);
                    return Unit.f186387a;
                } finally {
                }
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f246785w;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = aVar;
                    this.f246785w = 1;
                    if (aVar.lock(null, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.v;
                    o.b(obj2);
                }
                try {
                    jVar.f246789b.f(e.a(j.Companion, str), list);
                    Unit unit2 = Unit.f186387a;
                    aVar.unlock(null);
                    return Unit.f186387a;
                } finally {
                }
        }
    }
}

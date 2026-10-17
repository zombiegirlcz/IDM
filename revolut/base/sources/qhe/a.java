package qhe;

import a5d.k;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f246602w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f246602w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f246602w, continuation);
        aVar.v = ((Number) obj2).intValue();
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create(Integer.valueOf(((Number) obj2).intValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.u;
        if (i2 == 0) {
            o.b(obj2);
            zfe.b bVar = this.f246602w.f246603a;
            this.v = i;
            this.u = 1;
            obj2 = bVar.b(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        NavBarWithContainerBackground navBarWithContainerBackground = (NavBarWithContainerBackground) obj2;
        if (navBarWithContainerBackground == null) {
            navBarWithContainerBackground = NavBarWithContainerBackground.TransparentBackground.f57882a;
        }
        return new k(navBarWithContainerBackground, i);
    }
}

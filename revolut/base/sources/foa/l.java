package foa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a59.b f136874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a59.a f136875x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar, a59.b bVar, a59.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f136874w = bVar;
        this.f136875x = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f136874w, this.f136875x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            r10.a aVar = this.v.f81471s;
            this.u = 1;
            gsh.w wVar = new gsh.w(this.f136874w, this.f136875x, (h59.c) aVar.f250811a, null, 17);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, wVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
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

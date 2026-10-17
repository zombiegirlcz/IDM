package ua7;

import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import u6b.k;
import wa7.m;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f278555w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f278555w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f278555w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            m mVar = fVar.f278556l;
            this.u = 1;
            Object objA = mVar.a(this.f278555w, "SECRET_ACCOUNTS", this);
            if (objA != aVar) {
                objA = Unit.f186387a;
            }
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        fVar.N2(fVar.f278557m.a(), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new k(fVar, 16));
        return Unit.f186387a;
    }
}

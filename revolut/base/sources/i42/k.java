package i42;

import cli.y;
import com.revolut.core.model.FileExtension;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTerms$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar = this.v;
        y yVar = lVar.f158278q;
        ApmRegistrationTerms$InputData apmRegistrationTerms$InputData = lVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            if (!a0.y(apmRegistrationTerms$InputData.f62272a, ".pdf", true)) {
                lVar.H2(yVar, new i30.a(lVar, 6));
                return Unit.f186387a;
            }
            ufm.i iVar = new ufm.i(lVar.f158277p.b(apmRegistrationTerms$InputData.f62272a, true, FileExtension.Pdf.f51406b), new i31.e(13, new i3k.h(3)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            this.u = 1;
            obj2 = nim.a.b(iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        lVar.H2(yVar, new i30.a((a) obj2, 5));
        return Unit.f186387a;
    }
}

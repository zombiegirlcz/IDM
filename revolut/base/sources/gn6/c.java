package gn6;

import com.revolut.domain.models.openbanking.instructions.InstructionsSecondaryButton;
import com.revolut.feature.external_accounts.impl.ui.link.instructions.InstructionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import we6.g0;
import we6.h0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InstructionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InstructionsScreen instructionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = instructionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        InstructionsScreen instructionsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((f) instructionsScreen.O.getValue())).C2(g0.a.f296643a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((f) instructionsScreen.O.getValue());
                jVar.getClass();
                jVar.n2(new i(jVar, null, 1), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar2 = (j) ((f) instructionsScreen.O.getValue());
                InstructionsSecondaryButton instructionsSecondaryButton = ((d) ((j2) jVar2.f144927q.f22677a).getValue()).f144915a.f60411c;
                if (instructionsSecondaryButton != null && (str = instructionsSecondaryButton.f60413b) != null) {
                    jVar2.C2(new h0(str));
                }
                break;
        }
        return Unit.f186387a;
    }
}

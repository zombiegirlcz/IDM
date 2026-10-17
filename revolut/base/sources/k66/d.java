package k66;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ DeFiRecoveryPhraseScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen, Continuation continuation) {
        super(2, continuation);
        this.u = deFiRecoveryPhraseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a aVar2 = (com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a) ((f) this.u.L.getValue());
        i iVar = ((e) ((j2) aVar2.f71877r.f22677a).getValue()).f181648a;
        if (iVar instanceof h) {
            c66.e eVar = ((h) iVar).f181650a;
            aVar2.o.c(null, d0.k0(kotlin.ranges.f.o(0, eVar.f21683a.size()), " ", null, null, 0, new k65.d(1, eVar, c66.e.class, "get", "get(I)Ljava/lang/String;", 0, 2), 30), true, new jj2.a(aVar2, 26));
        }
        return Unit.f186387a;
    }
}

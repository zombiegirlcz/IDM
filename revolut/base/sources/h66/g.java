package h66;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecoveryPhraseConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RecoveryPhraseConsentScreen recoveryPhraseConsentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recoveryPhraseConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.T.getValue();
        String listId = model.f52519a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        y yVar = eVar.f149601s;
        if (!((a) ((j2) yVar.f22677a).getValue()).d) {
            int iHashCode = listId.hashCode();
            if (iHashCode != -481899918) {
                if (iHashCode != -240888402) {
                    if (iHashCode == -221992128 && listId.equals("DEFI_RECOVERY_PHRASE_REVOLUT_CONSENT_LIST_ID")) {
                        eVar.H2(yVar, new h5i.b(13));
                    }
                } else if (listId.equals("DEFI_RECOVERY_PHRASE_LIABILITY_CONSENT_LIST_ID")) {
                    eVar.H2(yVar, new h5i.b(12));
                }
            } else if (listId.equals("DEFI_RECOVERY_PHRASE_LOSS_CONSENT_LIST_ID")) {
                eVar.H2(yVar, new h5i.b(11));
            }
        }
        return Unit.f186387a;
    }
}

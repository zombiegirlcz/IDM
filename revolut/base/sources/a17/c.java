package a17;

import au6.k2;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.freelancer.impl.ui.profile.vat_prompt.VatPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import wim.z;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ VatPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VatPromptScreen vatPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = vatPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.u.W.getValue();
        ((k2) hVar.f555p.f129237b).d.G(Boolean.TRUE, "STORAGE_KEY_GET_VAT_PROMPT", z.d(o0.b(Boolean.TYPE)));
        hVar.u2();
        return Unit.f186387a;
    }
}

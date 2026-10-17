package s6d;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ BrandingSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BrandingSettingsScreen brandingSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = brandingSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.shared.branding.impl.ui.settings.a aVar2 = (com.revolut.feature.shared.branding.impl.ui.settings.a) this.u.R2();
        aVar2.getClass();
        aVar2.l2(new s64.a(aVar2, null, 3), new yi5.b(26));
        return Unit.f186387a;
    }
}

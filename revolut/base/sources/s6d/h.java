package s6d;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrandingSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BrandingSettingsScreen brandingSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brandingSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String id10 = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.shared.branding.impl.ui.settings.a aVar2 = (com.revolut.feature.shared.branding.impl.ui.settings.a) lVarE3;
        y yVar = aVar2.f86085y;
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj3 instanceof Boolean) {
            switch (id10.hashCode()) {
                case 1442685206:
                    if (id10.equals("FULL_ADDRESS_ID")) {
                        aVar2.H2(yVar, new ib6.j(obj3, 24));
                    }
                    break;
                case 1543805118:
                    if (id10.equals("EMAIL_ID")) {
                        aVar2.H2(yVar, new ib6.j(obj3, 28));
                    }
                    break;
                case 1591141408:
                    if (id10.equals("PHONE_NUMBER_ID")) {
                        aVar2.H2(yVar, new ib6.j(obj3, 27));
                    }
                    break;
                case 1802267487:
                    if (id10.equals("WEBSITE_ID")) {
                        aVar2.H2(yVar, new ib6.j(obj3, 26));
                    }
                    break;
            }
        }
        return Unit.f186387a;
    }
}

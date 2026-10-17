package s6d;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.shared.branding.api.PaymentLinkPreviewScreenProvider$InputData;
import com.revolut.feature.shared.branding.impl.R$string;
import com.revolut.feature.shared.branding.impl.ui.preview.PaymentLinkPreviewScreen;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import com.revolut.kompot.common.ModalDestination;
import ip0.xo0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BrandingSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(BrandingSettingsScreen brandingSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = brandingSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BrandingSettingsScreen brandingSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared.branding.impl.ui.settings.a) brandingSettingsScreen.R2()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared.branding.impl.ui.settings.a aVar3 = (com.revolut.feature.shared.branding.impl.ui.settings.a) brandingSettingsScreen.R2();
                y yVar = aVar3.f86085y;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                Object content = ((j) j2Var.getValue()).f260240a.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                k6d.h brandingSettings = (k6d.h) content;
                l6d.a aVar4 = aVar3.f86081s;
                k6d.j jVar = ((j) j2Var2.getValue()).d;
                String str = jVar != null ? jVar.f181697c : null;
                if (str == null) {
                    str = "";
                }
                String businessName = str;
                aVar3.o.getClass();
                List allowedPaymentMethods = ((j) j2Var2.getValue()).f260242c;
                k6d.j settings = ((j) j2Var2.getValue()).d;
                if (settings == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Address address = ((j) j2Var2.getValue()).e;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(businessName, "businessName");
                Intrinsics.checkNotNullParameter("checkout.revolut.com", "brandingAuthority");
                Intrinsics.checkNotNullParameter(brandingSettings, "brandingSettings");
                Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
                Intrinsics.checkNotNullParameter(settings, "settings");
                String string = aVar4.a(allowedPaymentMethods, businessName, settings, address, brandingSettings).build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                yji.l.g2(aVar3, new PaymentLinkPreviewScreen(new PaymentLinkPreviewScreenProvider$InputData(string, j6.a.q("Revolut/", aVar3.f86082t.a()), new TextLocalisedClause(R$string.merchant_profile_branding_preview_button_title, null, null, 14), xo0.WRAP_CONTENT)), ModalDestination.Style.POPUP.f98311a, null, 2);
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared.branding.impl.ui.settings.a aVar6 = (com.revolut.feature.shared.branding.impl.ui.settings.a) brandingSettingsScreen.R2();
                k6d.h hVar = (k6d.h) ((j) ((j2) aVar6.f86085y.f22677a).getValue()).f260240a.getContent();
                if (hVar != null) {
                    aVar6.n2(new s09.c(aVar6, hVar, null, 16), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}

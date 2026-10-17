package ch6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import vkm.j2;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreateMandateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CreateMandateScreen createMandateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = createMandateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            default:
                return new f(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreateMandateScreen createMandateScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                createMandateScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) createMandateScreen.R2();
                Object value = ((j2) bVar.f72449y.f22677a).getValue();
                i iVar = value instanceof i ? (i) value : null;
                if (iVar != null) {
                    j60.a aVar3 = bVar.v;
                    a aVar4 = bVar.f72447w;
                    dj0.d upperLimit = iVar.f;
                    ((b) aVar4).getClass();
                    Intrinsics.checkNotNullParameter(upperLimit, "upperLimit");
                    t tVar = new t(new TextLocalisedClause(R$string.open_banking_mandate_info_title, null, null, 14), null, null, 30);
                    List listK = v.k(new RowDelegate.Model("ITEM1_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check_verification, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.open_banking_mandate_info_first_point_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_banking_mandate_info_first_point_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ITEM2_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.open_banking_mandate_info_second_point_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_banking_mandate_info_second_point_description, u.c(new MoneyClause(upperLimit, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ITEM3_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.open_banking_mandate_info_third_point_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_banking_mandate_info_third_point_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    aVar3.x(new y(listK, tVar, rp0.l.WINDOW, null, null, null, 1016));
                }
                break;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar2 = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) createMandateScreen.R2();
                Object value2 = ((j2) bVar2.f72449y.f22677a).getValue();
                i iVar2 = value2 instanceof i ? (i) value2 : null;
                if (iVar2 != null) {
                    bVar2.n2(new c84.y(bVar2, iVar2, null, 15), new whi.b(6));
                }
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (createMandateScreen.K.f72438c) {
                    ((com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) createMandateScreen.R2()).C2(we6.m.f296654a);
                } else {
                    createMandateScreen.m2().setResult(3);
                    createMandateScreen.m2().finish();
                }
                break;
        }
        return Unit.f186387a;
    }
}

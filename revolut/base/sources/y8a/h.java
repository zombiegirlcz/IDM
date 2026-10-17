package y8a;

import android.os.Parcelable;
import aqd.o1;
import aw0.o9;
import bw0.l;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$ModalStep;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.core.models.alias.error.AliasBeneficiaryNameChangedException;
import com.revolut.feature.apm.core.models.alias.error.AliasNotFoundException;
import com.revolut.feature.apm.core.models.alias.error.TooManyRequestsException;
import com.revolut.feature.apm.payto.api.R$string;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$State;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$State;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreenContract$InputData;
import com.revolut.feature.referrals.code.data.api.ReferrerDetails;
import com.revolut.feature.referrals.code.data.api.ReferrerDetailsState;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.kompot.common.ModalDestination;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.f3;
import mx0.h3;
import okl.m;
import qua.p;
import skm.p0;
import te0.s;
import ufm.i;
import wsg.j;
import x94.k;
import x94.t;
import y99.x;
import ybh.n;
import ybh.y;
import yed.o;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f311650b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f311649a = i;
        this.f311650b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f311649a;
        int i2 = 17;
        int i3 = 11;
        int i5 = 6;
        int i6 = 1;
        Continuation continuation = null;
        Object obj3 = this.f311650b;
        switch (i) {
            case 0:
                AliasRegistrationContract$State update = (AliasRegistrationContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new AliasRegistrationContract$State((AliasRegistrationType) obj3);
            case 1:
                y94.b bVar = (y94.b) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                k kVar = bVar.i;
                String documentId = bVar.f311750h.f67566b;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                d0 d0VarFirstOrError = kVar.f303553b.U().c(s.f270018a).firstOrError();
                x8i.g gVar = new x8i.g(16, new j(documentId, 21));
                d0VarFirstOrError.getClass();
                pfm.a aVar = new pfm.a(new i(d0VarFirstOrError, gVar, 1), new x8i.g(i2, new x94.j(kVar, documentId, i6)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                pfm.a aVarE = aVar.e(m.w(null, null, null, 7, ((t) bVar.k).f303573a));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 2:
                com.revolut.feature.onboarding.impl.missinginfo.d dVar = (com.revolut.feature.onboarding.impl.missinginfo.d) obj3;
                rbi.c data = (rbi.c) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                dVar.l2(new com.revolut.feature.onboarding.impl.missinginfo.b(dVar, null, data), new yi5.b(26));
                return Unit.f186387a;
            case 3:
                String templateId = (String) obj2;
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                return Boolean.valueOf(Intrinsics.f(templateId, ((InvoiceTemplate) obj3).f86397a));
            case 4:
                fva.e selectedFrequency = (fva.e) obj3;
                y9e.d update2 = (y9e.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                p subscription = update2.f311844a;
                List availableFrequencies = update2.f311846c;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
                Intrinsics.checkNotNullParameter(availableFrequencies, "availableFrequencies");
                return new y9e.d(selectedFrequency, availableFrequencies, subscription);
            case 5:
                ya2.e update3 = (ya2.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ya2.e.a(update3, ((ya2.h) ((ya2.j) obj3)).f311912a, null, false, 2);
            case 6:
                ya2.e update4 = (ya2.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ya2.e.a(update4, null, (ResolveAlias) obj3, false, 5);
            case 7:
                ya2.m mVar = (ya2.m) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if ((error instanceof AliasBeneficiaryNameChangedException) || (error instanceof TooManyRequestsException)) {
                    int i21 = jli.h.f175850a;
                } else if (error instanceof AliasNotFoundException) {
                    mVar.H2(mVar.f311917q, new x(i5));
                }
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                String str = ((ya5.f) obj3).f311934b;
                if (str == null) {
                    str = "";
                }
                return new ya5.i(u.c(new CenteredAmountDelegate.Model("amount-input-loading", null, new bw0.h(str, null, null, true, null, Boolean.TRUE, false, false, null, null, null, null, 32726), new f3(null, null, null, false, h3.LOADING, false), new bw0.m(null, l.LOADING, null, false, null, 29), null, null, true, false, null, null, 1890)), ya5.m.b(), ya5.m.a(false));
            case 9:
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b) obj3;
                hub.b result = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f155599b) {
                    oki.h.t2(bVar2, bVar2.f93798q, com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b.I2(bVar2.o), false, null, false, 12);
                } else {
                    oki.h.D2(bVar2.f93798q);
                }
                return Unit.f186387a;
            case 10:
                com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.screen.a) obj3;
                wva.a it8 = (wva.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aVar2.H2(aVar2.f97593w, new h(it8, i3));
                return Unit.f186387a;
            case 11:
                wva.a aVar3 = (wva.a) obj3;
                yai.k update5 = (yai.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return yai.k.a(update5, null, null, false, new ReferrerDetailsState.Enabled(new ReferrerDetails(aVar3.f300309a, aVar3.f300310b)), null, 47);
            case 12:
                yai.k update6 = (yai.k) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return yai.k.a(update6, null, null, false, (ReferrerDetailsState) obj3, null, 47);
            case 13:
                return yai.k.a((yai.k) obj2, null, (yai.j) obj3, false, null, null, 61);
            case 14:
                yb0.i iVar = (yb0.i) obj3;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                iVar.H2(iVar.f312151x, new nd8.l(throwable, i2));
                return Boolean.TRUE;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                if (((yb2.d) obj3).f312161a.getError() != null) {
                    return iii.c.b(null, null, 6, false);
                }
                PromptMarketingContentDelegate.Model.Footer footer = null;
                Object obj4 = null;
                Parcelable parcelable = null;
                String str2 = null;
                Clause clause = null;
                PromptMarketingContentDelegate.Model.AnimationType animationType = null;
                AnimationRequest animationRequest = null;
                return u.c(new PromptMarketingContentDelegate.Model("LIST_ID_PROMPT", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.topup_linked_account_status_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D158", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, "BUTTON_TAG_GOT_IT", 6), null, 0 == true ? 1 : 0, footer, obj4, parcelable, str2, null, clause, animationType, animationRequest, null, 2096560));
            case 16:
                com.revolut.feature.pix.impl.flow.qr_request.a aVar4 = (com.revolut.feature.pix.impl.flow.qr_request.a) obj3;
                taa.h output = (taa.h) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof taa.f) {
                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar4, ((taa.f) output).f269297a, null, null, 6);
                }
                return Unit.f186387a;
            case 17:
                PixQrRequestScreenContract$InputData pixQrRequestScreenContract$InputData = (PixQrRequestScreenContract$InputData) obj3;
                PixKey pixKey = pixQrRequestScreenContract$InputData.f80726a;
                dj0.d dVar2 = pixQrRequestScreenContract$InputData.f80727b;
                String str3 = pixQrRequestScreenContract$InputData.f80728c;
                ((PixQrRequestContract$State) obj2).getClass();
                return new PixQrRequestContract$State(pixKey, dVar2, str3);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return y.b(((ybh.x) obj3).f312365c);
            case 19:
                return n.a((n) obj2, null, null, null, null, null, null, null, (m1h.h) obj3, null, null, null, false, false, false, null, null, false, 130943);
            case 20:
                com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar3 = (com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b) obj3;
                Throwable th10 = (Throwable) obj2;
                if (th10 != null && !(th10 instanceof CancellationException)) {
                    oki.h.D2(bVar3.z);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) obj3;
                dii.g output2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof dii.e) {
                    aVar5.C2(yc4.t.f312530a);
                } else {
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 22:
                yc7.m mVar2 = (yc7.m) obj3;
                u68.h navigation = (u68.h) obj2;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                if (navigation instanceof u68.f) {
                    return pd.b.n(p0.f264003c, new y83.d(mVar2, navigation, continuation, i3));
                }
                if (navigation instanceof u68.g) {
                    return mVar2.f312561a.a(((u68.g) navigation).f277507a);
                }
                throw new NoWhenBranchMatchedException();
            case 23:
                Data cardData = new Data((yc9.e) obj3, null, false, 6, null);
                ((yc9.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(cardData, "cardData");
                return new yc9.d(cardData);
            case 24:
                yd8.n nVar = (yd8.n) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                Map map = (Map) pair.f186386b;
                if (!zBooleanValue) {
                    return new go.g(new Data(new Pair(f0.f322471a, r0.g()), null, false, 6, null), 2);
                }
                fe8.i iVar2 = (fe8.i) ((fe8.a) nVar.f312653b.f222642b);
                x4l.c cVar = iVar2.i;
                Unit unit = Unit.f186387a;
                return nim.a.v(cVar.c(unit, iVar2.f134473h.a(unit, true)), new o1(map, 24));
            case 25:
                OrdersWidgetContract$Config ordersWidgetContract$Config = (OrdersWidgetContract$Config) obj3;
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : orders) {
                    ExchangeOrder exchangeOrder = (ExchangeOrder) obj5;
                    if (yd9.k.c(exchangeOrder.getF72134a().e, ordersWidgetContract$Config) || yd9.k.c(exchangeOrder.getF72134a().f, ordersWidgetContract$Config)) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : arrayList) {
                    if (obj6 instanceof ExchangeOrder.Active) {
                        arrayList2.add(obj6);
                    }
                }
                List listP0 = zhm.d0.P0(arrayList2, new yd9.i());
                ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
                Iterator it9 = listP0.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(new wd9.a((ExchangeOrder.Active) it9.next()));
                }
                return arrayList3;
            case 26:
                ye1.i update7 = (ye1.i) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return ye1.i.a(update7, null, null, 0L, null, null, ((je1.g) obj3).f173175a.f60669a, null, null, null, null, false, 4031);
            case 27:
                com.revolut.kompot.navigable.vc.modal.a aVar6 = (com.revolut.kompot.navigable.vc.modal.a) obj3;
                dii.g it10 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if ((it10 instanceof dii.d) && Intrinsics.f(((dii.d) it10).f115067a.a(), "CATEGORY_PICKER_ADD_PRODUCT_LIST_ID")) {
                    oki.h.v2(aVar6, ProductDetailsScreenContract$ModalStep.AddCategory.f60819a, ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            case 28:
                o updateState = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                mgd.f fVar = ((bfd.e) obj3).f14963a;
                m70.a.c(t0.f186434a);
                return o.a(updateState, null, null, "", null, false, false, null, fVar, null, null, false, null, false, null, null, null, 1048055);
            default:
                o updateState2 = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return o.a(updateState2, null, ((cgd.l) ((cgd.m) obj3)).f23942a.f86867a, null, null, false, false, null, null, null, null, false, null, false, null, null, null, 1048555);
        }
    }

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f311649a = i;
        this.f311650b = obj3;
    }
}

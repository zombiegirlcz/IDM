package la8;

import android.net.Uri;
import android.os.Parcelable;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.checkout.api.resume.ResumeCheckoutFeatureConfig;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.payments.messaging.data.impl.data.domain.FavoriteReactionsStorageImpl$getStorageTypeToken$1;
import com.revolut.feature.retail.legacy.login.api.TwoFaFeatureConfig;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$Details$Destination;
import com.revolut.feature.subscriptionscommon.impl.R$plurals;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.youTransactor.uCube.connexion.IConnexionManager;
import com.youTransactor.uCube.connexion.UCubeDevice;
import fa1.o;
import ft3.a1;
import ft3.q0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jo0.m;
import kl.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import ma1.x;
import n08.c0;
import n33.f2;
import n33.p;
import n33.r2;
import n33.s2;
import n33.t0;
import n4d.n;
import rp0.t;
import rp0.y;
import sa1.q;
import te0.w;
import tof.i7;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.y0;
import zw7.r0;
import zw7.s;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f193353c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f193351a = i;
        this.f193352b = obj2;
        this.f193353c = obj3;
    }

    @Override // kfm.a
    public final void run() throws IOException {
        o oVar;
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        boolean z = true;
        z = true;
        int i = 0;
        switch (this.f193351a) {
            case 0:
                l lVar = (l) this.f193352b;
                lVar.f193356b.c(new FeatureCommand(new TwoFaFeatureConfig.Sms(lVar.f193355a, (tjg.e) this.f193353c, true, true, 26)));
                return;
            case 1:
                ((edk.e) this.f193352b).f125037b.c(u0.f(edk.e.c((jf0.c) this.f193353c)));
                return;
            case 2:
                ((ldi.k) this.f193352b).f194144b.onNext((lk0.g) this.f193353c);
                return;
            case 3:
                ((ln.c) this.f193352b).b((NaviCommand) this.f193353c);
                return;
            case 4:
                lv9.a aVar = (lv9.a) this.f193352b;
                String str = (String) this.f193353c;
                ue0.c cVar = aVar.f200337a;
                Type type = new FavoriteReactionsStorageImpl$getStorageTypeToken$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "getStorageTypeToken(...)");
                ArrayList arrayListF1 = d0.f1((Collection) cVar.v0(lv9.b.f200338a, "FAVORITE_REACTIONS_STORAGE_KEY", type));
                if (arrayListF1.contains(str)) {
                    arrayListF1.remove(str);
                } else {
                    arrayListF1.remove(v.j(arrayListF1));
                }
                arrayListF1.add(0, str);
                Type type2 = new FavoriteReactionsStorageImpl$getStorageTypeToken$1().getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getStorageTypeToken(...)");
                cVar.G(arrayListF1, "FAVORITE_REACTIONS_STORAGE_KEY", type2);
                return;
            case 5:
                lx0.j jVar = (lx0.j) this.f193352b;
                String str2 = (String) this.f193353c;
                if (m.f176850g) {
                    try {
                        new CacheWriter(new CacheDataSource(jVar.f200515a.f200510a, new DefaultHttpDataSource.Factory().setUserAgent((String) m.i.invoke()).createDataSource()), new DataSpec(Uri.parse(str2)), null, null).cache();
                        return;
                    } catch (HttpDataSource$HttpDataSourceException e) {
                        if (!(e.getCause() instanceof InterruptedIOException)) {
                            throw e;
                        }
                        return;
                    }
                }
                return;
            case 6:
                m08.l lVar2 = (m08.l) this.f193352b;
                r0 policy = (r0) this.f193353c;
                opi.d dVar = lVar2.f201109p;
                g08.e eVar = lVar2.o;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(policy, "policy");
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                LayeredImage layeredImageB = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_call, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                int i2 = R$string.pets_get_help_contact_claim_support_sheet_actions_call_phone_humber;
                z80.b bVar = eVar.f139366a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, u.c(z80.b.b(bVar, policy.f325844j.f325850b, null, null, 6)), null, 12);
                s sVar = policy.f325844j;
                List listK = v.k(new RowDelegate.Model("GET_HELP_INSURER_CONTACTS_PHONE_LIST_ID", layeredImageB, null, null, textLocalisedClause, null, null, null, 0, null, true, false, null, null, null, null, null, sVar, null, 0, 0, 0, 0, 1056960492), new RowDelegate.Model("GET_HELP_INSURER_CONTACTS_EMAIL_LIST_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_mail, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.pets_get_help_contact_claim_support_sheet_actions_contact_by_email, u.c(z80.b.b(bVar, sVar.f325851c, null, null, 6)), null, 12), null, null, null, 0, null, true, false, null, null, null, null, null, policy, null, 0, 0, 0, 0, 1056960492));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                ((opi.b) dVar).Z(new y(listK, new t(new TextLocalisedClause(R$string.pets_get_help_contact_claim_support_sheet_title, null, null, 14), new TextLocalisedClause(R$string.pets_get_help_contact_claim_support_sheet_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                return;
            case 7:
                ((m0k.c) this.f193352b).f201158a.onNext((lk0.g) this.f193353c);
                return;
            case 8:
                ((m9h.b) this.f193352b).A2(new BridgeDestination((FeatureCommand) this.f193353c));
                return;
            case 9:
                ma1.t tVar = (ma1.t) this.f193352b;
                CardReaderDevice device = (CardReaderDevice) this.f193353c;
                q qVar = (q) tVar.f203904a;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(device, "device");
                IConnexionManager iConnexionManagerB = qVar.b();
                Intrinsics.checkNotNullParameter(device, "<this>");
                iConnexionManagerB.setDevice(new UCubeDevice(device.getName(), device.getAddress()));
                return;
            case 10:
                x xVar = (x) this.f193352b;
                fa1.l lVar3 = (fa1.l) ((Ref$ObjectRef) this.f193353c).f186409a;
                if (lVar3 == null || (oVar = lVar3.f133190a) == null) {
                    return;
                }
                nd1.j jVar2 = xVar.f;
                if (!(oVar instanceof o.a) && !(oVar instanceof o.b)) {
                    z = false;
                }
                jVar2.f214295a.k(Boolean.valueOf(z));
                return;
            case 11:
                mc7.h hVar = (mc7.h) this.f193352b;
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) this.f193353c;
                uc7.a aVar2 = hVar.f204304a;
                if (analyticsAccount == null) {
                    analyticsAccount = AnalyticsAccount.Personal.All.f99192a;
                }
                aVar2.b(new fc7.d(new AnalyticsFeatureConfig$Details$Destination(analyticsAccount, yld.d.CASHFLOW)));
                return;
            case 12:
                mei.g gVar = (mei.g) this.f193352b;
                int i3 = 2;
                pfm.h hVar2 = new pfm.h(new mei.a(gVar, y0.b((String) this.f193353c), z ? 1 : 0), i3);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE = hVar2.e(gVar.d.g("TILES", false));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.a aVar3 = new pfm.a(w.g0(aVarE), new b0(new m08.i(new BreadcrumbException(), 26)), i3);
                Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(aVar3.w(new ly7.g(2, mei.f.f204690a), mei.e.f204689a), "subscribe(...)");
                return;
            case 13:
                mif.o oVar2 = (mif.o) this.f193352b;
                ArrayList updates = (ArrayList) this.f193353c;
                oVar2.e();
                Intrinsics.checkNotNullParameter(updates, "updates");
                oVar2.b(new SimpleSQLiteQuery(p.a.p("\n            WITH categories_updates(transactionId, category) AS (VALUES ", d0.k0(updates, null, null, null, 0, new mh4.x(13), 31), ")\n            UPDATE transactions\n            SET category = (SELECT category FROM categories_updates WHERE transactions.group_id = categories_updates.transactionId)\n            WHERE group_id IN (SELECT transactionId FROM categories_updates)\n            ")));
                return;
            case 14:
                ((mif.o) this.f193352b).a((i7) this.f193353c);
                return;
            case 15:
                ((mif.o) this.f193352b).t((List) this.f193353c);
                return;
            case 16:
                ((mm1.c) this.f193352b).d.onNext((lk0.g) this.f193353c);
                return;
            case 17:
                msb.i iVar = (msb.i) this.f193352b;
                Function1 function1 = (Function1) this.f193353c;
                tjg.e eVar2 = tjg.e.SMS;
                iVar.f208654a.c(new FeatureCommand(new TwoFaFeatureConfig.Sms(null, eVar2, true, false, 27)));
                function1.invoke(eVar2);
                return;
            case 18:
                mv9.k kVar = (mv9.k) this.f193352b;
                dv9.m conversation = (dv9.m) this.f193353c;
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                kVar.f209192j.onNext(conversation);
                return;
            case 19:
                ((ae7.i) ((c0) this.f193352b).u).c((zd7.a) this.f193353c);
                return;
            case 20:
                ((k3l.d) ((f2) this.f193352b).f211711m).O(((n33.o) ((p) this.f193353c)).f211771a.f213561b);
                return;
            case 21:
                r2 r2Var = (r2) this.f193352b;
                r2Var.f211802p.onNext(new FeatureCommand(new ResumeCheckoutFeatureConfig(new Checkout.Order((CheckoutOrder) this.f193353c), com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) r2Var.e).w0().get()), ((t0) r2Var.d).c(), 4)));
                return;
            case 22:
                ((r2) this.f193352b).f211802p.onNext(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(new a1(grl.r2.CARD_ORDERING, null, null, null, null, 30), (q0) this.f193353c, null, null, null, null, null, null, null, null, 2044)));
                return;
            case 23:
                ((r2) this.f193352b).f211804r.onNext(new StatusViewConfiguration.Pending("CARD_CHECKOUT_ORDER_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_screen_unprocessed_card_order_item_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_screen_unprocessed_card_order_item_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_screen_unprocessed_card_order_item_positive, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_screen_unprocessed_card_order_item_negative, null, null, 14), (Parcelable) ((od0.i) this.f193353c).c(), false, 3488));
                return;
            case 24:
                ((n3e.c) this.f193352b).f211991b.onNext((lk0.g) this.f193353c);
                return;
            case 25:
                n4d.r0 r0Var = (n4d.r0) this.f193352b;
                List list = (List) this.f193353c;
                n nVar = r0Var.f212396a;
                Intrinsics.h(list);
                nVar.i(list);
                return;
            case 26:
                qa1.h hVar3 = (qa1.h) this.f193352b;
                na1.g gVar2 = (na1.g) this.f193353c;
                int size = hVar3.e.size();
                while (i < size) {
                    gVar2.a();
                    i++;
                }
                ea1.b.a("BLE FW is up-to-date. Updating process has been skipped", fa1.k.INFO);
                return;
            case 27:
                qa1.h hVar4 = (qa1.h) this.f193352b;
                na1.q qVar2 = (na1.q) this.f193353c;
                int size2 = hVar4.e.size();
                while (i < size2) {
                    qVar2.a();
                    i++;
                }
                return;
            case 28:
                nae.q qVar3 = (nae.q) this.f193352b;
                nae.g result = (nae.g) this.f193353c;
                opi.d dVar2 = qVar3.f213882n;
                qVar3.f213887t.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                int i5 = result.f213869a;
                int i6 = result.f213870b;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i5 > 1 ? com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_mark_as_subscription_success_title_many : com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_mark_as_subscription_success_title_one, null, null, 14);
                if (i6 > 0) {
                    textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.subscriptions_mark_as_subscription_success_description, Integer.valueOf(i6), i6 > 1 ? u.c(String.valueOf(i6)) : f0.f322471a, (Style) null, 24);
                } else {
                    textLocalisedQuantityClause = null;
                }
                char c2 = (i6 <= 0 || i5 <= i6) ? (char) 0 : (char) 1;
                rp0.l lVar4 = rp0.l.WINDOW;
                t tVar2 = new t(textLocalisedClause2, textLocalisedQuantityClause, null, 28);
                String str3 = i5 == i6 ? "LIST_ID_GO_TO_MY_SUBSCRIPTIONS_INACTIVE_ONLY" : "LIST_ID_GO_TO_MY_SUBSCRIPTIONS";
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_mark_as_subscription_success_button_title, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i21 = textLocalisedQuantityClause != null ? R$attr.uikit_dp24 : R$attr.uikit_dp16;
                int i22 = c2 != 0 ? R$attr.uikit_dp8 : R$attr.uikit_dp24;
                int i32 = R$attr.uikit_dp16;
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str3, defaultFilledButton, null, textLocalisedClause3, false, null, null, i21, i22, i32, i32, 496);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_mark_as_subscription_success_go_to_inactive, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                int i33 = R$attr.uikit_dp8;
                int i43 = R$attr.uikit_dp24;
                int i59 = R$attr.uikit_dp16;
                LargeActionButtonDelegate.Model[] elements = {model, c2 != 0 ? new LargeActionButtonDelegate.Model("LIST_ID_GO_TO_INACTIVE_SUBSCRIPTIONS", defaultFilledButton2, null, textLocalisedClause4, false, null, null, i33, i43, i59, i59, 496) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((opi.b) dVar2).Z(new y(kotlin.collections.d.L(elements), tVar2, lVar4, null, null, null, "MARK_RECURRING_BOTTOM_DIALOG_DELEGATES_KEY", null, null, null, 3832));
                return;
            default:
                ne0.k kVar2 = (ne0.k) this.f193352b;
                Object obj2 = this.f193353c;
                synchronized (kVar2.f214392c) {
                    kVar2.f214392c.remove(obj2);
                    Unit unit = Unit.f186387a;
                }
                return;
        }
    }
}

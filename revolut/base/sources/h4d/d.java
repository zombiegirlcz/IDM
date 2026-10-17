package h4d;

import akb.s;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.webkit.internal.JavaScriptReplyProxyImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CardPersonalisationDrawingView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.messaging.data.impl.data.domain.FavoriteReactionsStorageImpl$getStorageTypeToken$1;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.shared.signin.api.SigninSharedApi$Toggles$X3SignOutMigration;
import com.revolut.feature.tab.crypto.api.navigation.CryptoSettingsDestination;
import com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAddNewCollectionDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.ImmediateFamilyMemberFeatureConfig;
import e7l.g;
import efm.r;
import ga1.k;
import hde.j;
import hje.i;
import hng.q;
import hwi.j0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import jng.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import mif.b0;
import mm0.n;
import mm0.o;
import ms0.w2;
import ms0.x2;
import ms0.z2;
import o0j.p;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import pfm.m;
import pfm.t;
import rp0.y;
import skm.p0;
import te0.w;
import tof.a3;
import tof.u9;
import tof.v6;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149336b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f149335a = i;
        this.f149336b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        wi0.b bVarC;
        efm.b bVarG0;
        int i = 12;
        int i2 = 14;
        int i3 = 10;
        final int i5 = 2;
        final int i6 = 0;
        final int i21 = 1;
        Object[] objArr = 0;
        switch (this.f149335a) {
            case 0:
                h hVar = (h) this.f149336b;
                List list = (List) hVar.f149340c.get("CONVERTER_CACHE_MEMORY_KEY");
                r rVarDoOnNext = hVar.f149338a.g().map(new h0l.g(new h3d.a(i), 13)).doOnNext(new h0l.g(new gwe.d(hVar, 24), i2));
                return list != null ? r.concat(w.h(list), rVarDoOnNext) : rVarDoOnNext;
            case 1:
                qa1.b bVar = (qa1.b) this.f149336b;
                return new k(bVar.f243930a, new ga1.a(bVar.f243931b, bVar.f243932c));
            case 2:
                ((hde.g) this.f149336b).f151417a.c(u0.f(new SharedHelpDestination(new SharedHelpDestination.InputData(SharedHelpDestination.StartPoint.HelpWithCard.f86149a, (NewTicketContext) null, 6), 2)));
                return Boolean.TRUE;
            case 3:
                ((j) this.f149336b).f151423a.c(u0.f(new SharedHelpDestination(new SharedHelpDestination.InputData(SharedHelpDestination.StartPoint.ViewCardPin.f86151a, (NewTicketContext) null, 6), 2)));
                return Boolean.TRUE;
            case 4:
                i iVar = (i) this.f149336b;
                iVar.f152743b.c(new CompositeCommand(v.k(iVar.e, u0.f(new CryptoSettingsDestination(null)))));
                return Unit.f186387a;
            case 5:
                l lVar = (l) ((q) this.f149336b).f154115b.T2("STORAGE_KEY_USER", q.k);
                if (lVar != null) {
                    return com.bumptech.glide.c.B(lVar);
                }
                return null;
            case 6:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((j0) this.f149336b).f156226a, "KEY_WELCOME_SHOWN", Boolean.TRUE);
                return Unit.f186387a;
            case 7:
                h30.q qVar = (h30.q) this.f149336b;
                fk3.a aVar = (fk3.a) qVar.e;
                z80.b bVar2 = (z80.b) qVar.f148941b;
                if (((ik3.g) ((ik3.c) aVar).f161878a).f161888g.b().d().size() == 1) {
                    String str = (String) d0.b0(((ik3.g) ((ik3.c) aVar).f161878a).f161888g.b().d());
                    wi0.b.Companion.getClass();
                    String strS0 = h30.q.s0(bVar2.j(wi0.a.a(str)));
                    m70.a.c(t0.f186434a);
                    return new p(str, strS0, "");
                }
                wi0.b bVarF = bVar2.f();
                if (bVarF != null) {
                    String str2 = bVarF.f297794a;
                    String strS02 = h30.q.s0(bVar2.j(bVarF));
                    m70.a.c(t0.f186434a);
                    return new p(str2, strS02, "");
                }
                String country = ((s80.b) ((qd0.b) qVar.d)).a().getCountry();
                Intrinsics.h(country);
                String str3 = country.length() > 0 ? country : null;
                if (str3 != null) {
                    bVarC = com.bumptech.glide.d.c(str3);
                } else {
                    wi0.b.Companion.getClass();
                    bVarC = wi0.b.p0;
                }
                String strS03 = h30.q.s0(bVar2.j(bVarC));
                String str4 = bVarC.f297794a;
                m70.a.c(t0.f186434a);
                return new p(str4, strS03, "");
            case 8:
                return (afi.a) this.f149336b;
            case 9:
                ik3.c cVar = (ik3.c) this.f149336b;
                o oVarD = ((cn0.g) cVar.f161879b).d();
                if (!(oVarD instanceof n) && !(oVarD instanceof mm0.p)) {
                    throw new IllegalStateException("Can't load user config, user is not authorized");
                }
                efm.b bVarIgnoreElements = mo3.a.n(((ik3.g) cVar.f161878a).a(g.b.f123407a, true)).ignoreElements();
                ihd.c cVar2 = new ihd.c(i3, new ijj.p(i));
                dfm.c cVar3 = mfm.f.d;
                en.a aVar2 = mfm.f.f205043c;
                bVarIgnoreElements.getClass();
                return new t(bVarIgnoreElements, cVar2, cVar3, aVar2, aVar2, aVar2, aVar2).l(new bji.a(i21));
            case 10:
                ((j3d.c) this.f149336b).f171177a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 2))));
                return Boolean.TRUE;
            case 11:
                a3 a3Var = (a3) this.f149336b;
                xi0.b bVar3 = a3Var.k.f115083b;
                xi0.b.Companion.getClass();
                if (!Intrinsics.f(bVar3, xi0.b.D)) {
                    throw new IllegalArgumentException(j6.a.q("Unsupported currency for conversion type dialog: ", a3Var.k.f115083b.f306286a));
                }
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.transactionUI_fees_breakdown_conversion_type_sheet_title, null, null, 14), new TextLocalisedClause(R$string.transactionUI_fees_breakdown_conversion_type_sheet_description_brl, null, null, 14), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CONVERSION_TYPE_ACTION_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
                return new y(u.c(model), tVar, rp0.l.WINDOW, null, null, null, 1016);
            case 12:
                ((jyk.v) this.f149336b).f179506a.c(new FeatureCommand(ImmediateFamilyMemberFeatureConfig.f104097a));
                return Boolean.TRUE;
            case 13:
                return JavaScriptReplyProxyImpl.lambda$forInvocationHandler$0((JsReplyProxyBoundaryInterface) this.f149336b);
            case 14:
                ((koh.d) this.f149336b).f186367a.c(u0.f(new ScreenerRedesignAddNewCollectionDestination(null)));
                return Boolean.TRUE;
            case 15:
                ((krj.d) this.f149336b).f188881b.h().a();
                return Unit.f186387a;
            case 16:
                ij.e eVarEdit = ((l21.c) this.f149336b).a().edit();
                eVarEdit.a();
                return Boolean.valueOf(eVarEdit.commit());
            case 17:
                return ((efm.k) ((lk0.d) this.f149336b).f196168b.invoke()).p(new lk0.g(f0.f322471a));
            case 18:
                return ((lte.d) this.f149336b).a();
            case 19:
                ue0.c cVar4 = ((lv9.a) this.f149336b).f200337a;
                Type type = new FavoriteReactionsStorageImpl$getStorageTypeToken$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "getStorageTypeToken(...)");
                return (List) cVar4.v0(lv9.b.f200338a, "FAVORITE_REACTIONS_STORAGE_KEY", type);
            case 20:
                return Boolean.valueOf(((jte.d) ((m2j.j0) this.f149336b).d).c(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c));
            case 21:
                return ((sa1.q) ((ma1.d) this.f149336b).f203873a).a();
            case 22:
                mam.a operation = (mam.a) this.f149336b;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                return operation.f204051b.invoke();
            case 23:
                mif.o oVar = (mif.o) this.f149336b;
                mif.d0 d0Var = (mif.d0) oVar.e();
                List listK = v.k(v6.COMPLETED, v6.PENDING, v6.REVERTED, v6.DECLINED, v6.FAILED);
                ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                Iterator it8 = listK.iterator();
                while (it8.hasNext()) {
                    arrayList.add(u1.g((v6) it8.next(), r11.a.m()));
                }
                return oVar.f(new SimpleSQLiteQuery(j6.a.s("\n            SELECT \n                coalesce(recipient_table.transfer_user_code, sender_table.transfer_user_code) AS code,\n                coalesce(recipient_table.transfer_user_phone, sender_table.transfer_user_phone) AS phone,\n                beneficiary_rootId,\n                beneficiary_id,\n                beneficiary_email,\n                beneficiary_phone,\n                alias_beneficiary_id,\n                payment_counterparty_id,\n                apm_contact_id,\n                cardOwnerId,\n                counterparty_details_group,\n                crypto_withdraw_address_id,\n                source_address AS crypto_deposit_source_address,\n                transactions.leg_id as leg_id,\n                MAX(started_date) AS timestamp\n            FROM transactions\n            LEFT OUTER JOIN transfer_users recipient_table ON transactions.recipient_key = recipient_table.transfer_user_key\n            LEFT OUTER JOIN transfer_users sender_table ON transactions.sender_key = sender_table.transfer_user_key\n            LEFT OUTER JOIN hidden ON transactions.leg_id = hidden.leg_id\n            LEFT OUTER JOIN crypto_deposits ON transactions.leg_id = crypto_deposits.crypto_deposit_leg_id\n            WHERE state IN (", d0.k0(arrayList, null, null, null, 0, b0.f, 31), ")\n            AND ", d0Var.i(new u9(false)), "\n            AND (joint_extra_internal IS NULL OR joint_extra_internal == 0)\n            GROUP BY \n                code,\n                phone,\n                beneficiary_rootId,\n                beneficiary_id,\n                beneficiary_email,\n                beneficiary_phone,\n                alias_beneficiary_id,\n                payment_counterparty_id,\n                apm_contact_id,\n                cardOwnerId,\n                counterparty_details_group,\n                crypto_withdraw_address_id,\n                crypto_deposit_source_address\n            ORDER BY timestamp DESC\n        ")));
            case 24:
                return Boolean.valueOf(((jte.d) ((mjf.d) this.f149336b).f205988a).c(CardsCoreApi$Toggles.HuRegulatoryFreeAtmLimits.f65563c));
            case 25:
                return Boolean.valueOf(((ml5.c) this.f149336b).f206641c.i());
            case 26:
                final mli.e eVar = (mli.e) this.f149336b;
                efm.f fVar = m.f235744a;
                if (eVar.e) {
                    return fVar;
                }
                eVar.f.set(true);
                efm.d0 d0VarFirstOrError = eVar.f206967g.firstOrError();
                int i22 = 26;
                mhd.c cVar5 = new mhd.c(new ml3.y(eVar, i5), i22);
                d0VarFirstOrError.getClass();
                pfm.a aVar3 = new pfm.a(d0VarFirstOrError, cVar5, 4);
                if (((cn0.g) eVar.f206966c).d() instanceof n) {
                    ang.f fVar2 = eVar.f206965b;
                    if (((jte.d) fVar2.f).c(SigninSharedApi$Toggles$X3SignOutMigration.f86687c)) {
                        p0 p0Var = p0.f264001a;
                        bVarG0 = pd.b.n(elm.f.f127540b, new s(fVar2, objArr == true ? 1 : 0, 7));
                    } else {
                        bVarG0 = w.g0(((q) fVar2.f7769a).f154114a.signOut());
                    }
                    pfm.l lVar2 = new pfm.l(ue0.e.w(bVarG0, new mk3.c(i22)), new kfm.a() { // from class: mli.a
                        @Override // kfm.a
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    eVar.e = true;
                                    break;
                                case 1:
                                    eVar.f.set(false);
                                    break;
                                default:
                                    ((cn0.g) eVar.f206966c).clear();
                                    break;
                            }
                        }
                    }, i6);
                    Intrinsics.checkNotNullExpressionValue(lVar2, "doFinally(...)");
                    fVar = lVar2;
                } else {
                    Intrinsics.checkNotNullExpressionValue(fVar, "complete(...)");
                }
                return new pfm.l(aVar3.e(fVar).e((efm.b) eVar.f206964a.d.getValue()).l(new kfm.a() { // from class: mli.a
                    @Override // kfm.a
                    public final void run() {
                        switch (i6) {
                            case 0:
                                eVar.e = true;
                                break;
                            case 1:
                                eVar.f.set(false);
                                break;
                            default:
                                ((cn0.g) eVar.f206966c).clear();
                                break;
                        }
                    }
                }), new kfm.a() { // from class: mli.a
                    @Override // kfm.a
                    public final void run() {
                        switch (i21) {
                            case 0:
                                eVar.e = true;
                                break;
                            case 1:
                                eVar.f.set(false);
                                break;
                            default:
                                ((cn0.g) eVar.f206966c).clear();
                                break;
                        }
                    }
                }, i6);
            case 27:
                return new z2(((x2) ((w2) this.f149336b)).f208486a);
            case 28:
                CardPersonalisationDrawingView cardPersonalisationDrawingView = (CardPersonalisationDrawingView) this.f149336b;
                CardPersonalisationDrawingView.Companion aVar4 = CardPersonalisationDrawingView.INSTANCE;
                float width = 2025 / cardPersonalisationDrawingView.getWidth();
                float f = 1.0f / width;
                Bitmap bitmap = Bitmap.createBitmap(2025, 1275, Bitmap.Config.ARGB_8888);
                Canvas canvas = ch.qos.logback.core.util.a.e(bitmap, "createBitmap(...)", bitmap);
                Path path = cardPersonalisationDrawingView.F;
                if (path != null) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(width, width, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    path.transform(matrix);
                    canvas.clipPath(path);
                    matrix.reset();
                    matrix.postScale(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    path.transform(matrix);
                }
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                ArrayList arrayList2 = cardPersonalisationDrawingView.f59070c;
                ArrayList<fr0.d> arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (obj2 instanceof fr0.d) {
                        arrayList3.add(obj2);
                    }
                }
                for (fr0.d dVar : arrayList3) {
                    dVar.i(width);
                    dVar.d(canvas);
                    dVar.i(f);
                }
                ArrayList<fr0.i> arrayList4 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (!(((fr0.i) obj3) instanceof fr0.d)) {
                        arrayList4.add(obj3);
                    }
                }
                for (fr0.i iVar2 : arrayList4) {
                    iVar2.i(width);
                    iVar2.d(canvas);
                    iVar2.i(f);
                }
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                int height = bitmap.getHeight() * bitmap.getWidth();
                int[] iArr = new int[height];
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                while (i6 < height) {
                    if (iArr[i6] != 0) {
                        iArr[i6] = -1;
                    }
                    i6++;
                }
                bitmap.setPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                return bitmap;
            default:
                ((mxa.a) this.f149336b).f210234a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) ReferralsBizFeatureConfig.AllReferralsTroubleshooterNavigationDestination.f81830a, false, (Integer) null, 0, 61)));
                return Boolean.TRUE;
        }
    }
}

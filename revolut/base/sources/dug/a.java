package dug;

import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.widget.TextView;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.e5;
import aw0.o9;
import bjl.j0;
import bjl.k0;
import bjl.l0;
import c1g.v;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.address.models.CountryState;
import com.revolut.feature.credit.core.ui.progress.CreditProgressActivity;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.kyc.api.navigation.ConfirmAddressDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureNegativeBalanceDestination;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData;
import com.revolut.feature_crypto_order_flow.impl.flow.CryptoExchangeFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.models.SignInOrigin;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_document_screen.NationalIdentifierDocumentFragment;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.sso.api.models.UICustomization;
import dv5.n;
import dw.d;
import dw.j;
import dw.k;
import dw.o;
import dw.q;
import dw.s;
import dw.u;
import dwi.x;
import e0a.w;
import efm.d0;
import efm.r;
import hwi.a0;
import ip0.v7;
import ip0.wi;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nii.y0;
import o97.i0;
import org.jmrtd.cbeff.ISO781611;
import svi.k;
import svi.l;
import svi.p0;
import svi.z;
import wxg.m;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117969b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f117968a = i;
        this.f117969b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k kVarA;
        k kVarA2;
        e5 e5Var;
        switch (this.f117968a) {
            case 0:
                c cVar = (c) this.f117969b;
                od0.i optionalAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                TradingAccount tradingAccount = (TradingAccount) optionalAccount.f224257a;
                if (tradingAccount == null) {
                    throw new IllegalStateException("Account onboarded required for account closure deeplink");
                }
                String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return nim.a.w(((aug.d) cVar.f117972b).a(string), new doe.c(tradingAccount, string, 13));
            case 1:
                i iVar = (i) this.f117969b;
                String portfolioId = (String) obj2;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                iVar.f117977a.c(com.revolut.retail.core.navigation.a.c((FeatureCommand) iVar.e.getValue(), gc0.c.f(new KompotOverlayFeatureConfig(new AccountClosureNegativeBalanceDestination(portfolioId), yhi.b.POPUP, (Integer) null, 12))));
                return Boolean.TRUE;
            case 2:
                dw.b bVar = (dw.b) this.f117969b;
                float[] surfaceTransform = (float[]) obj2;
                Intrinsics.checkNotNullParameter(surfaceTransform, "surfaceTransform");
                Matrix.multiplyMM(bVar.f118165c, 0, surfaceTransform, 0, bVar.d, 0);
                if (bVar.f) {
                    float[] fArr = bVar.f118165c;
                    Matrix.multiplyMM(fArr, 0, fArr, 0, bVar.e, 0);
                }
                j jVar = bVar.f118163a;
                float[] transformForEmission = bVar.f118165c;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(surfaceTransform, "surfaceTransform");
                Intrinsics.checkNotNullParameter(transformForEmission, "transformForEmission");
                if (!Intrinsics.f(jVar.f.f118167b, EGL14.EGL_NO_DISPLAY) && (kVarA = jVar.f.a()) != null) {
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glViewport(0, 0, kVarA.f118194b, kVarA.f118195c);
                    GLES20.glScissor(0, 0, kVarA.f118194b, kVarA.f118195c);
                    jVar.e();
                    int i = jVar.f118192m;
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, i);
                    dw.a effect = jVar.e;
                    Intrinsics.checkNotNullParameter(effect, "effect");
                    jVar.e = effect;
                    o oVar = jVar.i;
                    if (oVar != null) {
                        int i2 = effect != dw.a.NONE ? jVar.f118189h : jVar.f118188g;
                        oVar.f118204g = i2;
                        if (i2 == oVar.f118202b) {
                            oVar.f118205h = System.currentTimeMillis();
                        }
                    }
                    GLES20.glClear(16384);
                    o oVar2 = jVar.i;
                    if (oVar2 != null) {
                        oVar2.a(surfaceTransform);
                    }
                    Rect rect = jVar.f118190j;
                    if (jVar.d && rect != null) {
                        GLES20.glBindFramebuffer(36160, jVar.k);
                        GLES20.glViewport(0, 0, rect.width(), rect.height());
                        GLES20.glClear(16384);
                        jVar.e();
                        o oVar3 = jVar.i;
                        if (oVar3 != null) {
                            int i3 = jVar.f118188g;
                            oVar3.f118204g = i3;
                            if (i3 == oVar3.f118202b) {
                                oVar3.f118205h = System.currentTimeMillis();
                            }
                        }
                        o oVar4 = jVar.i;
                        if (oVar4 != null) {
                            oVar4.a(transformForEmission);
                        }
                        int iWidth = rect.width();
                        int iHeight = rect.height();
                        GLES20.glBindTexture(3553, jVar.f118191l);
                        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iWidth * iHeight * 4).order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferOrder.rewind();
                        GLES20.glReadPixels(0, 0, iWidth, iHeight, 6408, 5121, byteBufferOrder);
                        zv.c cVar2 = new zv.c(byteBufferOrder, iWidth, iHeight, new Rect(0, 0, iWidth, iHeight), new a76.c(0, jVar, j.class, "proxyClosedCallback", "proxyClosedCallback()V", 0, 10));
                        jVar.d = false;
                        jVar.f118186b.k(cVar2);
                    }
                    jVar.f.f();
                }
                return Unit.f186387a;
            case 3:
                u uVar = (u) this.f117969b;
                float[] surfaceTransform2 = (float[]) obj2;
                Intrinsics.checkNotNullParameter(surfaceTransform2, "surfaceTransform");
                s sVar = uVar.f118223a;
                dw.c cVar3 = sVar.d;
                Intrinsics.checkNotNullParameter(surfaceTransform2, "surfaceTransform");
                if (!sVar.f118213c && !Intrinsics.f(cVar3.f118167b, EGL14.EGL_NO_DISPLAY) && (kVarA2 = cVar3.a()) != null) {
                    int i5 = kVarA2.f118194b;
                    int i6 = kVarA2.f118195c;
                    if (i5 != sVar.f118218m || i6 != sVar.f118219n) {
                        sVar.f118218m = i5;
                        sVar.f118219n = i6;
                        sVar.d();
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glViewport(0, 0, i5, i6);
                    GLES20.glDisable(3042);
                    GLES20.glUseProgram(sVar.e);
                    GLES20.glUniformMatrix4fv(sVar.f118215h, 1, false, surfaceTransform2, 0);
                    GLES20.glUniform1i(sVar.f118214g, 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, sVar.f118222r);
                    GLES20.glEnableVertexAttribArray(sVar.i);
                    GLES20.glVertexAttribPointer(sVar.i, 2, 5126, false, 0, (Buffer) d.a.f118170a);
                    GLES20.glEnableVertexAttribArray(sVar.f118216j);
                    GLES20.glVertexAttribPointer(sVar.f118216j, 2, 5126, false, 0, (Buffer) d.a.f118171b);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glDisableVertexAttribArray(sVar.i);
                    GLES20.glDisableVertexAttribArray(sVar.f118216j);
                    if (sVar.f118212b) {
                        q qVar = sVar.o;
                        if (qVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        float f = qVar.f118208b.f50749b;
                        GLES20.glUseProgram(sVar.f);
                        GLES20.glUniform1f(sVar.f118217l, f);
                        GLES20.glEnable(3042);
                        GLES20.glBlendFuncSeparate(1, 1, 0, 1);
                        sVar.c(sVar.f118220p, 32774);
                        sVar.c(sVar.f118221q, 32779);
                        GLES20.glBlendEquationSeparate(32774, 32774);
                        GLES20.glDisable(3042);
                    }
                    cVar3.f();
                }
                return Unit.f186387a;
            case 4:
                dw7.h hVar = (dw7.h) this.f117969b;
                f9i.c request = (f9i.c) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                hVar.A1(new dlk.k(hVar, request, null, 24), new yi5.b(25));
                return Unit.f186387a;
            case 5:
                com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar = (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) this.f117969b;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, dii.e.f115068a)) {
                    aVar.C1(new ConfirmAddressDestination(null, 7));
                }
                return Unit.f186387a;
            case 6:
                dwd.a aVar2 = (dwd.a) this.f117969b;
                String transactionId = (String) obj2;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                return (ewd.a) v7.r("UNSTAKING_CACHE_KEY_", transactionId, aVar2.f120367a);
            case 7:
                dwd.c cVar4 = (dwd.c) this.f117969b;
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return (List) v7.r("UNSTAKING_LOCKED_TRANSACTIONS_KEY_", id10, cVar4.f120371b);
            case 8:
                dwi.s sVar2 = (dwi.s) this.f117969b;
                Data membershipData = (Data) obj2;
                Intrinsics.checkNotNullParameter(membershipData, "membershipData");
                if (!(((svi.k) membershipData.getContent()) instanceof k.a)) {
                    r rVarJust = r.just(membershipData);
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                boolean loading = membershipData.getLoading();
                if (loading) {
                    r rVarJust2 = r.just(Data.copy$default(membershipData, null, null, true, 2, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
                    return rVarJust2;
                }
                if (loading) {
                    throw new NoWhenBranchMatchedException();
                }
                d0 d0VarK = ((a0) sVar2.f120458a).f156192h.k(Unit.f186387a);
                n nVar = new n(new dwi.f(4), 12);
                d0VarK.getClass();
                r rVarOnErrorReturn = new sfm.b(d0VarK, nVar, 2).onErrorReturn(new n(new dwi.f(5), 13));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
                return rVarOnErrorReturn;
            case 9:
                return ((Boolean) obj2).booleanValue() ? zi0.c.j(new b39.a(b39.d.LOUNGES)) : pd.b.r(ue0.e.E(rd0.e.c(new ae8.c(bla.b.b(((x) ((v) this.f117969b).f20513b).f120468a, "SCHEME_LOUNGES"), 5), kotlin.coroutines.g.f186406a), new Data(Boolean.FALSE, null, false, 6, null)), new dwi.f(7));
            case 10:
                dwi.d0 d0Var = (dwi.d0) this.f117969b;
                svi.k pass = (svi.k) obj2;
                Intrinsics.checkNotNullParameter(pass, "pass");
                p0 p0VarV = cp5.d.v(pass);
                return p0VarV != null ? d0Var.a(new svi.a0(p0VarV.f265962b)) : pass instanceof l ? d0Var.a(new z.c(((l) pass).f265937c)) : zi0.c.j(z.b.f266018a);
            case 11:
                return ((Boolean) obj2).booleanValue() ? z.a.f266017a : (z) this.f117969b;
            case 12:
                com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow.a aVar3 = (com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow.a) this.f117969b;
                yki.a aVar4 = aVar3.f101731p;
                l0 result2 = (l0) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof j0) {
                    oki.h.D2(aVar4);
                    aVar3.C1(new BridgeDestination(new FeatureCommand(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, false, (UserAuthFeatureConfig.UseCase) new UserAuthFeatureConfig.UseCase.SignIn(new UserAuthFeatureConfig.SignInParams(((j0) result2).f16173a, SignInOrigin.Default.f99273a, new UICustomization(null, 0 == true ? 1 : 0, 31))), 15))));
                } else {
                    if (!(result2 instanceof k0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar4);
                    aVar3.C1(new BridgeDestination(new FeatureCommand(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, false, (UserAuthFeatureConfig.UseCase) new UserAuthFeatureConfig.UseCase.SignIn(0), 15))));
                }
                return Unit.f186387a;
            case 13:
                ((dy1.g) this.f117969b).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM wero_contacts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRequestEnabled");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new dy1.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), dy1.g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow8)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 14:
                dy6.b bVar2 = (dy6.b) this.f117969b;
                FreelancerInvoiceSettings invoiceSettings = (FreelancerInvoiceSettings) obj2;
                Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
                Iterable iterable = invoiceSettings.f73406g;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Set setI1 = zhm.d0.i1(iterable);
                Set setB = invoiceSettings.b();
                bVar2.r2().M0(new dy6.d(setI1));
                return new by6.f(setB, setB, setI1, null, invoiceSettings, 8);
            case 15:
                dy6.g gVar = (dy6.g) this.f117969b;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) rVar.f314201a;
                FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) rVar.f314202b;
                Set set = (Set) rVar.f314203c;
                gVar.r2().M0(new dy6.d(zhm.d0.i1(freelancerInvoice.f73382n)));
                return new by6.f(freelancerInvoiceSettings.b(), set, zhm.d0.i1(freelancerInvoice.f73382n), freelancerInvoice, null, 16);
            case 16:
                dyg.h hVar2 = (dyg.h) this.f117969b;
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                wi wiVar = hVar2.f121112g;
                Object obj3 = (wiVar == null || (e5Var = wiVar.f167034b) == null) ? null : e5Var.f10292g;
                fyg.e eVar = obj3 instanceof fyg.e ? (fyg.e) obj3 : null;
                if (!(eVar instanceof fyg.d)) {
                    if (eVar instanceof fyg.c) {
                        return zhm.d0.V(assets, 11);
                    }
                    if (eVar == null) {
                        return assets;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : assets) {
                    if (Intrinsics.f((m) obj4, ((fyg.d) eVar).f138989a)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 17:
                zw7.v vVar = (zw7.v) this.f117969b;
                List petOverduePaymentDetailsList = (List) obj2;
                Intrinsics.checkNotNullParameter(petOverduePaymentDetailsList, "petOverduePaymentDetailsList");
                return new dz7.c(petOverduePaymentDetailsList, vVar.f325858b);
            case 18:
                com.revolut.feature_crypto_order_flow.impl.flow.a aVar5 = (com.revolut.feature_crypto_order_flow.impl.flow.a) this.f117969b;
                uyh.n it8 = (uyh.n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof uyh.m) {
                    oki.h.t2(aVar5, aVar5.f96773t, new CryptoExchangeFlowContract$Step.OrderSummaryStep(((uyh.m) it8).f284381a), true, null, false, 12);
                } else if (it8 instanceof uyh.l) {
                    uyh.l lVar = (uyh.l) it8;
                    oki.h.t2(aVar5, aVar5.f96773t, new CryptoExchangeFlowContract$Step.CryptoScaPromptStep(lVar.f284378a, lVar.f284379b), true, null, false, 12);
                } else {
                    if (!(it8 instanceof uyh.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uyh.k kVar = (uyh.k) it8;
                    oki.h.t2(aVar5, aVar5.f96773t, new CryptoExchangeFlowContract$Step.CryptoExchangeStep(new CryptoExchangeScreenContract$InputData(kVar.f284373a, kVar.f284374b, wd6.e.BUY, false, wd6.h.MARKET, null)), true, null, false, 12);
                }
                return Unit.f186387a;
            case 19:
                com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a aVar6 = (com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a) this.f117969b;
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                aVar6.X1(new y0(null, aVar6.f104160q.g(it9), false, 5));
                return Boolean.TRUE;
            case 20:
                ((e01.a) this.f117969b).f121375b.onNext(obj2);
                return Unit.f186387a;
            case 21:
                hy4.b bVar3 = (hy4.b) this.f117969b;
                Pair pair = (Pair) obj2;
                Clause title = (Clause) pair.f186385a;
                CreditProgressActivity creditProgressActivity = (CreditProgressActivity) bVar3;
                Intrinsics.checkNotNullParameter(title, "title");
                ty0.c cVarB0 = creditProgressActivity.b0();
                j90.a aVar7 = creditProgressActivity.f69844r0;
                KProperty[] kPropertyArr = CreditProgressActivity.f69843v0;
                ty0.c.b(cVarB0, title, (TextView) aVar7.getValue(creditProgressActivity, kPropertyArr[0]), null, null, 12);
                Clause description = (Clause) pair.f186386b;
                Intrinsics.checkNotNullParameter(description, "description");
                ty0.c.b(creditProgressActivity.b0(), description, (TextView) creditProgressActivity.f69845s0.getValue(creditProgressActivity, kPropertyArr[1]), null, null, 12);
                return Unit.f186387a;
            case 22:
                TransferLinkDetails transferLinkDetails = (TransferLinkDetails) obj2;
                p7k.b bVar4 = ((w) this.f117969b).o;
                Intrinsics.h(transferLinkDetails);
                return bVar4.a(transferLinkDetails);
            case 23:
                e0e.d dVar = (e0e.d) this.f117969b;
                e0e.e update = (e0e.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (dVar == update.d) {
                    dVar = null;
                }
                return e0e.e.a(update, null, null, dVar, 55);
            case 24:
                return e0e.e.a((e0e.e) obj2, (xxd.b) this.f117969b, null, null, 62);
            case 25:
                e0l.d dVar2 = (e0l.d) this.f117969b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                pfm.h hVar3 = new pfm.h(new a08.d((NationalIdentifierDocumentFragment) dVar2, 12), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3;
            case 26:
                return BorderModifierNode.drawWithCacheModifierNode$lambda$0((BorderModifierNode) this.f117969b, (CacheDrawScope) obj2);
            case 27:
                return Float.valueOf(ScrollState.scrollableState$lambda$0((ScrollState) this.f117969b, ((Float) obj2).floatValue()));
            case 28:
                e1g.d dVar3 = (e1g.d) this.f117969b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                dVar3.getClass();
                return new Data(zhm.u.c(i0.f223111a), null, true, 2, null);
            default:
                e23.g gVar2 = (e23.g) this.f117969b;
                List countryStates = (List) obj2;
                Intrinsics.checkNotNullParameter(countryStates, "countryStates");
                gVar2.f122020b.set(countryStates);
                ArrayList<CountryState> arrayList3 = new ArrayList();
                for (Object obj5 : countryStates) {
                    if (((CountryState) obj5).getSupported()) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (CountryState countryState : arrayList3) {
                    arrayList4.add(new RowDelegate.Model(countryState.getCode(), null, new TextClause(countryState.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(null, new TextClause(countryState.getCode(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, ISO781611.SMT_TAG), false, null, false, null, null, null, null, null, null, countryState, null, 0, 0, 0, 0, 532675578));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return arrayList4;
        }
    }
}

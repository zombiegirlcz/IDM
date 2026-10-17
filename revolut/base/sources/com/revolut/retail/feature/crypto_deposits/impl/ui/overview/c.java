package com.revolut.retail.feature.crypto_deposits.impl.ui.overview;

import ba4.x;
import bcj.f;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto_deposits.api.CryptoDepositsApi$Toggles$DirectDeposits;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$ModalStep;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mii.i;
import mra.d;
import oki.h;
import rbj.l;
import vkm.j2;
import vkm.q;
import vkm.v1;
import w9j.e;
import z6e.g;
import zbj.f0;
import zbj.j0;
import zbj.l0;
import zbj.m0;
import zbj.n0;
import zbj.o0;
import zbj.r;
import zbj.s;
import zbj.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements s, r {
    public final f0 A;
    public final e B;
    public final v9j.a C;
    public final vii.b D;
    public final j2 E;
    public final y F;
    public final com.revolut.kompot.navigable.vc.modal.a G;
    public final fcj.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.r f100088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f100089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CryptoDepositsOverviewControllerContract$InputData f100090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f100091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final pn3.a f100092t;
    public final vbj.c u;
    public final dte.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c70.a f100093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tqi.e f100094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final se5.a f100095y;
    public final f z;

    public c(t0 stateMapper, fcj.b itemsMapper, r10.r dialogMapper, r navigationExtension, CryptoDepositsOverviewControllerContract$InputData inputData, l cryptoDepositsOverviewInteractor, pn3.a contactsPermissionsController, vbj.c cryptoDepositStorageInteractor, dte.b appTipsExtension, c70.a clipboard, tqi.e shareExternalDestinationFactory, se5.a cryptoFaqKeysProvider, f cryptoDirectDepositControllerExtensionModel, f0 tooltipExtension, e cryptoDisclaimerInteractor, v9j.a cryptoDisclaimerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoDepositsOverviewInteractor, "cryptoDepositsOverviewInteractor");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(cryptoDepositStorageInteractor, "cryptoDepositStorageInteractor");
        Intrinsics.checkNotNullParameter(appTipsExtension, "appTipsExtension");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(cryptoFaqKeysProvider, "cryptoFaqKeysProvider");
        Intrinsics.checkNotNullParameter(cryptoDirectDepositControllerExtensionModel, "cryptoDirectDepositControllerExtensionModel");
        Intrinsics.checkNotNullParameter(tooltipExtension, "tooltipExtension");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerInteractor, "cryptoDisclaimerInteractor");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerExtension, "cryptoDisclaimerExtension");
        this.o = itemsMapper;
        this.f100088p = dialogMapper;
        this.f100089q = navigationExtension;
        this.f100090r = inputData;
        this.f100091s = cryptoDepositsOverviewInteractor;
        this.f100092t = contactsPermissionsController;
        this.u = cryptoDepositStorageInteractor;
        this.v = appTipsExtension;
        this.f100093w = clipboard;
        this.f100094x = shareExternalDestinationFactory;
        this.f100095y = cryptoFaqKeysProvider;
        this.z = cryptoDirectDepositControllerExtensionModel;
        this.A = tooltipExtension;
        this.B = cryptoDisclaimerInteractor;
        this.C = cryptoDisclaimerExtension;
        this.D = new vii.b();
        this.E = q.c(inputData.e);
        Data data = new Data(null, null, true, 3, null);
        this.F = d.b(this, new zbj.q(data, inputData.f100075a, null, null, null, null, null, null, null, null, 16380), stateMapper, null, false, 12);
        this.G = hx7.e.a(this, new zba.a(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.Q(this.D, new g((Continuation) null, this, 9)), null, null, new n0(this, null), 3);
        if (Intrinsics.f(this.f100090r.f, CryptoDepositsOverviewFlowContract$InputData.Source.CeFi.f100099a)) {
            xi0.b currency = ((zbj.q) ((j2) this.F.f22677a).getValue()).f320926b;
            bcj.l lVar = (bcj.l) this.z;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            lVar.X2(lVar.o, new a94.q(6, currency));
        }
    }

    public final void I2(Function1 function1, boolean z) {
        CryptoDepositAddress address;
        zbj.a aVar = (zbj.a) ((zbj.q) ((j2) this.F.f22677a).getValue()).e.getContent();
        if (aVar == null || (address = aVar.f320892a) == null) {
            return;
        }
        c70.a.b(this.f100093w, null, (CharSequence) function1.invoke(address), false, 5);
        this.f100088p.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(address, "address");
        yji.l.b1(this, X1(z ? new i("clipboard_label_pan", new TextLocalisedClause(R$string.crypto_receive_screen_receive_address_copied_title, null, null, 14), new TextLocalisedClause(R.string.common_action_view, null, null, 14), address, 16) : new i("clipboard_label_pan", new TextLocalisedClause(R$string.crypto_receive_screen_receive_address_action_copy_title, null, null, 14), null, null, 28)), null, new a(this, address, null), 3);
    }

    public final void J2() {
        y yVar = this.F;
        if (((zbj.q) ((j2) yVar.f22677a).getValue()).f320933n) {
            return;
        }
        H2(yVar, new j0(7));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.G;
    }

    public final void K2() {
        y yVar = this.F;
        Object objG = ((zbj.q) ((j2) yVar.f22677a).getValue()).f320928g.g();
        Object content = ((zbj.q) ((j2) yVar.f22677a).getValue()).f.getContent();
        if (objG == null || content == null) {
            return;
        }
        h.v2(this.G, new CryptoDepositsOverviewControllerContract$ModalStep.SelectNetwork((List) content, (wk5.a) objG), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zbj.r
    public final void M() {
        this.f100089q.M();
    }

    @Override // yji.l
    public final void T1(long j2) {
        CryptoDepositsOverviewControllerContract$InputData cryptoDepositsOverviewControllerContract$InputData = this.f100090r;
        CryptoDepositsOverviewFlowContract$InputData.Source source = cryptoDepositsOverviewControllerContract$InputData.f;
        CryptoDepositsOverviewFlowContract$InputData.Source.CeFi ceFi = CryptoDepositsOverviewFlowContract$InputData.Source.CeFi.f100099a;
        Continuation continuation = null;
        if (Intrinsics.f(source, ceFi)) {
            yji.l.b1(this, new vkm.t0(this.F.B(new j0(2)), 1), null, new yy6.f(this, continuation, 26), 3);
            bcj.l lVar = (bcj.l) this.z;
            yji.l.b1(this, lVar.f14462m.a(CryptoDepositsApi$Toggles$DirectDeposits.f100033c) ? new go.g(null, 2) : new x(lVar.o.B(new bbh.a(10)), lVar, 1), null, new o0(this, null), 3);
        }
        n2(new m0(this, continuation, 1), new whi.b(6));
        if (Intrinsics.f(cryptoDepositsOverviewControllerContract$InputData.f, ceFi)) {
            e eVar = this.B;
            eVar.getClass();
            yji.l.b1(this, new v1(new w3k.i(eVar, continuation, 14)), null, new l0(this, null), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.F;
    }

    @Override // zbj.r
    public final void j0(zm3.l contact, xi0.b currency) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f100089q.j0(contact, currency);
    }

    @Override // zbj.r
    public final void m0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f100089q.m0(key);
    }
}

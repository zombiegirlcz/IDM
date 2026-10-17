package j4c;

import cli.y;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.youTransactor.uCube.rpc.Constants;
import kl.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends oki.h implements l {
    public final vii.c A;
    public final vii.c B;
    public final OrderConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dl2.a f171361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n3c.a f171362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kpj.e f171363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f171364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c70.a f171365t;
    public final g1 u;
    public final f3c.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final opj.b f171366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f171367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.c f171368y;
    public final vii.c z;

    public u(x stateMapper, OrderConfirmationScreenContract$InputData inputData, dl2.a merchantRevolutShopFiscalInteractor, n3c.a shopInteractor, kpj.e merchantRevolutShopInteractor, b0 accountsRevolutShopInteractor, c70.a clipboard, g1 shotDialogDisplayer, f3c.a revolutShopCapabilityExtension, opj.b pdfViewerDestinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(merchantRevolutShopFiscalInteractor, "merchantRevolutShopFiscalInteractor");
        Intrinsics.checkNotNullParameter(shopInteractor, "shopInteractor");
        Intrinsics.checkNotNullParameter(merchantRevolutShopInteractor, "merchantRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(accountsRevolutShopInteractor, "accountsRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(revolutShopCapabilityExtension, "revolutShopCapabilityExtension");
        Intrinsics.checkNotNullParameter(pdfViewerDestinationProvider, "pdfViewerDestinationProvider");
        this.o = inputData;
        this.f171361p = merchantRevolutShopFiscalInteractor;
        this.f171362q = shopInteractor;
        this.f171363r = merchantRevolutShopInteractor;
        this.f171364s = accountsRevolutShopInteractor;
        this.f171365t = clipboard;
        this.u = shotDialogDisplayer;
        this.v = revolutShopCapabilityExtension;
        this.f171366w = pdfViewerDestinationProvider;
        this.f171367x = mra.d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f171368y = new vii.c();
        this.z = new vii.c();
        this.A = new vii.c();
        this.B = new vii.c();
    }

    @Override // yji.l
    public final void I1() {
        Unit unit = Unit.f186387a;
        vii.c cVar = this.f171368y;
        w4l.i iVar = w4l.i.f294643c;
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(cVar.a(unit, iVar), new s(0, this, continuation)), null, null, new t(0, this, null), 3);
        yji.l.a1(this, vkm.q.Q(this.z.a(unit, iVar), new s(1, this, continuation)), null, null, new t(1, this, null), 3);
        yji.l.a1(this, vkm.q.Q(this.A.a(unit, w4l.h.f294642c), new s(2, this, continuation)), null, null, new t(2, this, null), 3);
        yji.l.a1(this, nim.a.v(vkm.q.Q(this.B.a(unit, iVar), new s(3, this, continuation)), new j3f.d(4)), null, null, new t(3, this, null), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (obj2 instanceof j) {
            this.f171365t.a(null, ((j) obj2).f171343a, false);
            if (c70.a.g()) {
                return;
            }
            ((k1) this.u).d(ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, "ORDER_NUMBER_COPIED_TO_CLIPBOARD_ID", new TextLocalisedClause(R$string.revolut_shop_common_action_copy_to_clipboard_title, null, null, 14), null, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
            return;
        }
        if (obj2 instanceof m) {
            C1(new ExternalDestination.Browser(((m) obj2).f171345a, null));
            return;
        }
        if (obj2 instanceof h) {
            h hVar = (h) obj2;
            n2(new q(this, new r(this, hVar.f171339a, hVar.f171340b, continuation, 0), null), new whi.b(6));
        } else if (obj2 instanceof i) {
            i iVar = (i) obj2;
            n2(new q(this, new r(this, iVar.f171341a, iVar.f171342b, continuation, 1), null), new whi.b(6));
        } else if (Intrinsics.f(listId, "ERROR_ORDER_LIST_ID")) {
            Unit unit = Unit.f186387a;
            this.f171368y.b(unit);
            this.z.b(unit);
            this.A.b(unit);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f171367x;
    }
}

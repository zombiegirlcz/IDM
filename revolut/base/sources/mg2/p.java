package mg2;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.upi.api.R$string;
import com.revolut.feature.apm.upi.impl.qr.screens.amount.InputAmountScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends oki.h implements e {

    @NotNull
    public static final o Companion = new o();
    public final hg2.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkg.a f205152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f205153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tqi.g f205154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f80.a f205155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jg2.f f205156t;
    public final f01.c u;
    public final y v;

    public p(hg2.h upiQrCodeInteractor, fkg.a qrCodeGenerator, c70.a clipboard, tqi.g shareNaviCommandFactory, f80.a uriHelper, jg2.f upiQrImageProvider, f01.c uiKitResources, m stateMapper) {
        Intrinsics.checkNotNullParameter(upiQrCodeInteractor, "upiQrCodeInteractor");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(upiQrImageProvider, "upiQrImageProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = upiQrCodeInteractor;
        this.f205152p = qrCodeGenerator;
        this.f205153q = clipboard;
        this.f205154r = shareNaviCommandFactory;
        this.f205155s = uriHelper;
        this.f205156t = upiQrImageProvider;
        this.u = uiKitResources;
        this.v = mra.d.b(this, new d(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(hg2.h.c(this.o), new n(this, 0)), null, null, new m75.i(this, null, 23), 3);
    }

    public final k I2(String str) {
        return new k(mif.a.Z(fkg.a.l(this.f205152p, str, new h90.a(33, 33), i80.c.H, i80.b.QR_CODE, null, 36)), ((f80.b) this.f205155s).f(str).getQueryParameter("pa"));
    }

    public final void J2(i event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event.equals(g.f205144a)) {
            n2(new b0(this, continuation, 25), new whi.b(6));
            return;
        }
        boolean z = event instanceof h;
        y yVar = this.v;
        if (!z) {
            if (!event.equals(f.f205143a)) {
                throw new NoWhenBranchMatchedException();
            }
            yji.l.j2(this, new InputAmountScreen(new kg2.e(((d) ((j2) yVar.f22677a).getValue()).f205142b)), null, new n(this, 1), 1);
            return;
        }
        String str2 = ((h) event).f205145a;
        if (!Intrinsics.f(str2, "ID_USERNAME")) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown TextDelegate listId ", str2));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        k kVar = (k) ((d) ((j2) yVar.f22677a).getValue()).f205141a.getContent();
        if (kVar == null || (str = kVar.f205148b) == null) {
            return;
        }
        this.f205153q.a(null, str, false);
        if (c70.a.g()) {
            return;
        }
        X1(new mii.f("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.upi_qrcode_upiid_copied, null, null, 14), null, null, null, null, 124));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}

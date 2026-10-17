package com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2;

import android.view.View;
import aw0.e;
import cii.b;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import dii.m;
import hu.f;
import hu.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lw0.a;
import vkm.z1;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u0002\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/reader/v2/NfcReadingController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lhu/f;", "Lcli/w;", "Lcii/b;", "dii/m", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NfcReadingController extends BaseBottomSheetController<f> implements w {
    public final a N;
    public final e O;
    public final Flow P;
    public final xki.a Q;
    public final m R;
    public final Object S;

    public NfcReadingController(a header, e eVar, z1 readingDoneSignal) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(readingDoneSignal, "readingDoneSignal");
        this.N = header;
        this.O = eVar;
        this.P = readingDoneSignal;
        this.Q = xki.a.f306815a;
        this.R = new m(this);
        this.S = te0.w.y0(new hq1.f(this, 7));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(new cii.a(uiState.f24554b, uiState.f24555c));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, this.P, new g(this, continuation, 0), 3);
        ViewController.P2(this, e3(), new g(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.S.getValue();
    }
}

package dug;

import android.view.View;
import androidx.camera.core.impl.CameraConfig;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowController;
import e6d.k;
import e6d.l;
import e6d.m;
import e8h.h0;
import e8h.t;
import ew2.j;
import ew2.q0;
import ff8.n;
import g1i.b0;
import g8i.d0;
import java.util.List;
import kfm.o;
import kotlin.jvm.internal.Intrinsics;
import xzg.g0;
import xzg.m0;
import zh9.s0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements o, CameraConfig.PostviewFormatSelector, Id3Decoder.FramePredicate, OnFailureListener, PurchasesUpdatedListener, OnApplyWindowInsetsListener, DebugViewProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117975a;

    public /* synthetic */ e(int i) {
        this.f117975a = i;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f117975a) {
            case 0:
                h hVar = h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) hVar.invoke(p0);
            case 1:
            case 5:
            case 11:
            case 19:
            case 21:
            case 25:
            default:
                h35.d dVar = h35.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h35.b) dVar.invoke(p0);
            case 2:
                return zi0.c.O((Throwable) p0);
            case 3:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.FALSE;
            case 4:
                e31.h hVar2 = e31.h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (byte[]) hVar2.invoke(p0);
            case 6:
                l lVar = l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yvh.b) lVar.invoke(p0);
            case 7:
                m mVar = m.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yvh.b) mVar.invoke(p0);
            case 8:
                k kVar = k.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w5d.a) kVar.invoke(p0);
            case 9:
                t tVar = t.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g0) tVar.invoke(p0);
            case 10:
                h0 h0Var = h0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m0) h0Var.invoke(p0);
            case 12:
                ej9.o oVar = ej9.o.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (s0) oVar.invoke(p0);
            case 13:
                Throwable it9 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it9, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 14:
                j jVar = j.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) jVar.invoke(p0);
            case 15:
                return (wi0.b) q0.f.invoke(p0);
            case 16:
                f2h.d dVar2 = f2h.d.f;
                AssetSelectionFlowController.Companion aVar = AssetSelectionFlowController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) dVar2.invoke(p0);
            case 17:
                f7l.h hVar3 = f7l.h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e7l.f) hVar3.invoke(p0);
            case 18:
                f7l.j jVar2 = f7l.j.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e7l.f) jVar2.invoke(p0);
            case 20:
                n nVar = n.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) nVar.invoke(p0);
            case 22:
                fye.a aVar2 = fye.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar2.invoke(p0);
            case 23:
                b0 b0Var = b0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) b0Var.invoke(p0);
            case 24:
                g3k.c cVar = g3k.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) cVar.invoke(p0);
            case 26:
                return (wi0.b) d0.f.invoke(p0);
            case 27:
                return (dj0.d) gca.k.f.invoke(p0);
            case 28:
                guf.g gVar = guf.g.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hrf.a) gVar.invoke(p0);
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i5, int i6) {
        return Id3Decoder.lambda$static$0(i, i2, i3, i5, i6);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(insets, "<this>");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
        if (Intrinsics.f(insets2, insets3)) {
            return insets;
        }
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setInsets(WindowInsetsCompat.Type.ime(), Insets.NONE).build();
        Intrinsics.h(windowInsetsCompatBuild);
        return windowInsetsCompatBuild;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }
}

package com.revolut.feature.crypto.remittance.impl.ui.multichain.info.sheet;

import aii.q;
import ak5.g;
import cli.o;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.sheet.CryptoMultichainInfoSheetController;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import tk5.j;
import uk5.c;
import uk5.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/impl/ui/multichain/info/sheet/CryptoMultichainInfoSheetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Luk5/c;", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoMultichainInfoSheetController extends ViewController<q> implements a {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CryptoMultichainInfoSheetController(j multichainInfoSheet) {
        Intrinsics.checkNotNullParameter(multichainInfoSheet, "multichainInfoSheet");
        this.K = R$layout.screen_recycler_view;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoMultichainInfoSheetController f280686b;

            {
                this.f280686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (d) ((ak5.g) this.f280686b.N.getValue()).f5686c.get();
                    default:
                        CryptoMultichainInfoSheetController cryptoMultichainInfoSheetController = this.f280686b;
                        return dli.f.a(cryptoMultichainInfoSheetController, (d) cryptoMultichainInfoSheetController.L.getValue(), v.k(new CounterTextDelegate(), new ComparisonCellDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoMultichainInfoSheetController f280686b;

            {
                this.f280686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (d) ((ak5.g) this.f280686b.N.getValue()).f5686c.get();
                    default:
                        CryptoMultichainInfoSheetController cryptoMultichainInfoSheetController = this.f280686b;
                        return dli.f.a(cryptoMultichainInfoSheetController, (d) cryptoMultichainInfoSheetController.L.getValue(), v.k(new CounterTextDelegate(), new ComparisonCellDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new uj7.a(this, multichainInfoSheet, 2));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}

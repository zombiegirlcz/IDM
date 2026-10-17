package com.revolut.feature.chooser.external_map.screen;

import aii.q;
import com.revolut.feature.chooser.external_map.screen.BottomChooserExternalMapAppScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yi3.c;
import zki.d;
import zki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/chooser/external_map/screen/BottomChooserExternalMapAppScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lzki/f;", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomChooserExternalMapAppScreen extends ViewController<q> implements f {
    public final yi3.b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BottomChooserExternalMapAppScreen(yi3.b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yi3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BottomChooserExternalMapAppScreen f314226b;

            {
                this.f314226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BottomChooserExternalMapAppScreen bottomChooserExternalMapAppScreen = this.f314226b;
                        phm.a aVar = (phm.a) ue0.e.j(bottomChooserExternalMapAppScreen.m2()).a().get(xi3.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xi3.b.class, " is not found"));
                        }
                        xi3.b bVar = ((xi3.b) aVar2.b()).f306304c;
                        b bVar2 = bottomChooserExternalMapAppScreen.K;
                        bVar2.getClass();
                        return new xi3.a(bVar, bVar2);
                    case 1:
                        return (c) ((xi3.a) this.f314226b.M.getValue()).f306301c.get();
                    default:
                        BottomChooserExternalMapAppScreen bottomChooserExternalMapAppScreen2 = this.f314226b;
                        c model = (c) bottomChooserExternalMapAppScreen2.N.getValue();
                        Intrinsics.checkNotNullParameter(bottomChooserExternalMapAppScreen2, "<this>");
                        Intrinsics.checkNotNullParameter(model, "model");
                        return new zki.e(bottomChooserExternalMapAppScreen2, model);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yi3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BottomChooserExternalMapAppScreen f314226b;

            {
                this.f314226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BottomChooserExternalMapAppScreen bottomChooserExternalMapAppScreen = this.f314226b;
                        phm.a aVar = (phm.a) ue0.e.j(bottomChooserExternalMapAppScreen.m2()).a().get(xi3.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xi3.b.class, " is not found"));
                        }
                        xi3.b bVar = ((xi3.b) aVar2.b()).f306304c;
                        b bVar2 = bottomChooserExternalMapAppScreen.K;
                        bVar2.getClass();
                        return new xi3.a(bVar, bVar2);
                    case 1:
                        return (c) ((xi3.a) this.f314226b.M.getValue()).f306301c.get();
                    default:
                        BottomChooserExternalMapAppScreen bottomChooserExternalMapAppScreen2 = this.f314226b;
                        c model = (c) bottomChooserExternalMapAppScreen2.N.getValue();
                        Intrinsics.checkNotNullParameter(bottomChooserExternalMapAppScreen2, "<this>");
                        Intrinsics.checkNotNullParameter(model, "model");
                        return new zki.e(bottomChooserExternalMapAppScreen2, model);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yi3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BottomChooserExternalMapAppScreen f314226b;

            {
                this.f314226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BottomChooserExternalMapAppScreen bottomChooserExternalMapAppScreen = this.f314226b;
                        phm.a aVar = (phm.a) ue0.e.j(bottomChooserExternalMapAppScreen.m2()).a().get(xi3.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xi3.b.class, " is not found"));
                        }
                        xi3.b bVar = ((xi3.b) aVar2.b()).f306304c;
                        b bVar2 = bottomChooserExternalMapAppScreen.K;
                        bVar2.getClass();
                        return new xi3.a(bVar, bVar2);
                    case 1:
                        return (c) ((xi3.a) this.f314226b.M.getValue()).f306301c.get();
                    default:
                        BottomChooserExternalMapAppScreen bottomChooserExternalMapAppScreen2 = this.f314226b;
                        c model = (c) bottomChooserExternalMapAppScreen2.N.getValue();
                        Intrinsics.checkNotNullParameter(bottomChooserExternalMapAppScreen2, "<this>");
                        Intrinsics.checkNotNullParameter(model, "model");
                        return new zki.e(bottomChooserExternalMapAppScreen2, model);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (xi3.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (d) this.O.getValue();
    }
}

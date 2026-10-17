package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lu7.h;
import lu7.s;
import mv7.b;
import mv7.c;
import mv7.d;
import mv7.e;
import mv7.f;
import mv7.g;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/bottom_sheet/EmbeddedBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lmv7/f;", "Lmv7/e;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmbeddedBottomSheetScreen extends BaseBottomSheetRecyclerController<f, e> {
    public static final /* synthetic */ int W = 0;
    public final EmbeddedBottomSheetScreenContract$InputData Q;
    public final InputChecklistDelegate R;
    public final HighlightTileDelegate S;
    public final List T;
    public final Object U;
    public final Object V;

    public EmbeddedBottomSheetScreen(EmbeddedBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.R = inputChecklistDelegate;
        HighlightTileDelegate highlightTileDelegate = new HighlightTileDelegate();
        this.S = highlightTileDelegate;
        final int i = 0;
        final int i2 = 1;
        this.T = v.k(inputChecklistDelegate, highlightTileDelegate, new RowDelegate(null, null, 7));
        this.U = w.y0(new Function0(this) { // from class: mv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmbeddedBottomSheetScreen f209156b;

            {
                this.f209156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EmbeddedBottomSheetScreen embeddedBottomSheetScreen = this.f209156b;
                switch (i3) {
                    case 0:
                        int i5 = EmbeddedBottomSheetScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(embeddedBottomSheetScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        EmbeddedBottomSheetScreenContract$InputData embeddedBottomSheetScreenContract$InputData = embeddedBottomSheetScreen.Q;
                        embeddedBottomSheetScreenContract$InputData.getClass();
                        return new lu7.h(sVar, embeddedBottomSheetScreenContract$InputData);
                    default:
                        int i6 = EmbeddedBottomSheetScreen.W;
                        return (g) ((lu7.h) embeddedBottomSheetScreen.U.getValue()).f200105c.get();
                }
            }
        });
        this.V = w.y0(new Function0(this) { // from class: mv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmbeddedBottomSheetScreen f209156b;

            {
                this.f209156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EmbeddedBottomSheetScreen embeddedBottomSheetScreen = this.f209156b;
                switch (i3) {
                    case 0:
                        int i5 = EmbeddedBottomSheetScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(embeddedBottomSheetScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        EmbeddedBottomSheetScreenContract$InputData embeddedBottomSheetScreenContract$InputData = embeddedBottomSheetScreen.Q;
                        embeddedBottomSheetScreenContract$InputData.getClass();
                        return new lu7.h(sVar, embeddedBottomSheetScreenContract$InputData);
                    default:
                        int i6 = EmbeddedBottomSheetScreen.W;
                        return (g) ((lu7.h) embeddedBottomSheetScreen.U.getValue()).f200105c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new b(this, null, 0), 3);
        a.g2(this, f3(), null, new b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52518c), new c(this, null), 3);
        a.g2(this, rd0.e.b(this.S.f52437c), null, new d(this, null), 3);
        a.g2(this, h3(), null, new b(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.V.getValue();
    }
}

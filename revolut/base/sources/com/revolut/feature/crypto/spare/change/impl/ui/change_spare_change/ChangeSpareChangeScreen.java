package com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change;

import android.view.View;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change.ChangeSpareChangeScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.List;
import jki.h;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nl5.d;
import sji.b;
import te0.w;
import vd1.a;
import vl5.e;
import vl5.g;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/spare/change/impl/ui/change_spare_change/ChangeSpareChangeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lvl5/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lvl5/e;", "feature_crypto_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangeSpareChangeScreen extends BaseScreen<g, IOData$EmptyInput, e> {
    public final Object M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final TwinHorizontalButtonDelegate R;
    public final List S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSpareChangeScreen(ChangeSpareChangeScreenContract$InputData inputData) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vl5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeSpareChangeScreen f290292b;

            {
                this.f290292b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (j60.a) ((nl5.d) this.f290292b.P.getValue()).d.get();
                    default:
                        return (h) ((nl5.d) this.f290292b.P.getValue()).f217011g.get();
                }
            }
        });
        this.N = R$layout.screen_transparent;
        this.O = true;
        this.P = w.y0(new a(this, inputData, 18));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vl5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeSpareChangeScreen f290292b;

            {
                this.f290292b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (j60.a) ((nl5.d) this.f290292b.P.getValue()).d.get();
                    default:
                        return (h) ((nl5.d) this.f290292b.P.getValue()).f217011g.get();
                }
            }
        });
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = new TwinHorizontalButtonDelegate();
        this.R = twinHorizontalButtonDelegate;
        this.S = u.c(twinHorizontalButtonDelegate);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ?? r3 = this.M;
        if (((j60.a) r3.getValue()).j()) {
            ((j60.a) r3.getValue()).A(uiState.f290296a);
        } else {
            ((j60.a) r3.getValue()).x(uiState.f290296a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (vl5.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((j60.a) this.M.getValue()).E()), null, new vl5.b(this, null, 0), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new vl5.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new vl5.b(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.M.getValue()).d(this.S);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}

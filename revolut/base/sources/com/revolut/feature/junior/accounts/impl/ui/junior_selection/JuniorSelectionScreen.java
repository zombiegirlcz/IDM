package com.revolut.feature.junior.accounts.impl.ui.junior_selection;

import android.view.View;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.feature.junior.accounts.api.navigation.JuniorSelectionInputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import jki.k;
import jki.m;
import jki.o;
import k78.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;
import ur2.a;
import uwe.f;
import v0c.b;
import v78.c;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/accounts/impl/ui/junior_selection/JuniorSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/feature/junior/accounts/api/navigation/JuniorSelectionInputData;", "", "feature_junior_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSelectionScreen extends BaseScreen<k, JuniorSelectionInputData, Object> {
    public static final /* synthetic */ int Q = 0;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorSelectionScreen(JuniorSelectionInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_transparent;
        this.N = w.y0(new b(this, inputData, 19));
        this.O = w.y0(new a(this, 21));
        this.P = w.y0(new v4a.a(4));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(((AccountCellItemDelegate) this.P.getValue()).f51551c.f53218h), null, new v78.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((j60.a) ((h) this.N.getValue()).d.get()).E()), null, new f(this, null, 10), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((h) this.N.getValue()).d.get()).d(u.c((AccountCellItemDelegate) this.P.getValue()));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }
}

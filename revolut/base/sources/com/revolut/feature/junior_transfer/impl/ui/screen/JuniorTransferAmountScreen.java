package com.revolut.feature.junior_transfer.impl.ui.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ImageAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_transfer.impl.R$id;
import com.revolut.feature.junior_transfer.impl.R$layout;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import fb6.j;
import fnk.a;
import fr8.e;
import fr8.f;
import fr8.g;
import fr8.i;
import fr8.k;
import fr8.m;
import fr8.n;
import fr8.o;
import fr8.r;
import j9i.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import qd0.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_transfer/impl/ui/screen/JuniorTransferAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lfr8/o;", "Lcom/revolut/feature/junior_transfer/impl/ui/screen/JuniorTransferAmountScreenContract$InputData;", "Lfr8/n;", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorTransferAmountScreen extends BaseRecyclerViewScreen<o, JuniorTransferAmountScreenContract$InputData, n> {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(JuniorTransferAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/junior_transfer/impl/databinding/ScreenJuniorTransferAmountBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final boolean X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f77450a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public b f77451b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f77452d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f77453e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f77454h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorTransferAmountScreen(JuniorTransferAmountScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_junior_transfer_amount;
        this.V = R$id.juniorTransferScreen_recyclerView;
        this.W = true;
        this.X = true;
        this.Y = s.t(this, e.f);
        this.Z = w.y0(new j(this, inputData, 22));
        final int i = 0;
        this.f77450a0 = w.y0(new Function0(this) { // from class: fr8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTransferAmountScreen f137412b;

            {
                this.f137412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorTransferAmountScreen juniorTransferAmountScreen = this.f137412b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorTransferAmountScreen.i0;
                        return (r) ((oq8.d) juniorTransferAmountScreen.Z.getValue()).f227780q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorTransferAmountScreen.i0;
                        qd0.b bVar = juniorTransferAmountScreen.f77451b0;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorTransferAmountScreen.i0;
                        return new CenteredAmountDelegate(new fgj.g(juniorTransferAmountScreen, 22));
                    default:
                        KProperty[] kPropertyArr4 = JuniorTransferAmountScreen.i0;
                        return v.k((CenteredAmountDelegate) juniorTransferAmountScreen.f77452d0.getValue(), (InputTextDelegate) juniorTransferAmountScreen.f77453e0.getValue(), (ImageAttachmentDelegate) juniorTransferAmountScreen.f0.getValue(), (FullScreenStateDelegate) juniorTransferAmountScreen.g0.getValue());
                }
            }
        });
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: fr8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTransferAmountScreen f137412b;

            {
                this.f137412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorTransferAmountScreen juniorTransferAmountScreen = this.f137412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorTransferAmountScreen.i0;
                        return (r) ((oq8.d) juniorTransferAmountScreen.Z.getValue()).f227780q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorTransferAmountScreen.i0;
                        qd0.b bVar = juniorTransferAmountScreen.f77451b0;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorTransferAmountScreen.i0;
                        return new CenteredAmountDelegate(new fgj.g(juniorTransferAmountScreen, 22));
                    default:
                        KProperty[] kPropertyArr4 = JuniorTransferAmountScreen.i0;
                        return v.k((CenteredAmountDelegate) juniorTransferAmountScreen.f77452d0.getValue(), (InputTextDelegate) juniorTransferAmountScreen.f77453e0.getValue(), (ImageAttachmentDelegate) juniorTransferAmountScreen.f0.getValue(), (FullScreenStateDelegate) juniorTransferAmountScreen.g0.getValue());
                }
            }
        });
        final int i3 = 2;
        this.f77452d0 = w.y0(new Function0(this) { // from class: fr8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTransferAmountScreen f137412b;

            {
                this.f137412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorTransferAmountScreen juniorTransferAmountScreen = this.f137412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorTransferAmountScreen.i0;
                        return (r) ((oq8.d) juniorTransferAmountScreen.Z.getValue()).f227780q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorTransferAmountScreen.i0;
                        qd0.b bVar = juniorTransferAmountScreen.f77451b0;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorTransferAmountScreen.i0;
                        return new CenteredAmountDelegate(new fgj.g(juniorTransferAmountScreen, 22));
                    default:
                        KProperty[] kPropertyArr4 = JuniorTransferAmountScreen.i0;
                        return v.k((CenteredAmountDelegate) juniorTransferAmountScreen.f77452d0.getValue(), (InputTextDelegate) juniorTransferAmountScreen.f77453e0.getValue(), (ImageAttachmentDelegate) juniorTransferAmountScreen.f0.getValue(), (FullScreenStateDelegate) juniorTransferAmountScreen.g0.getValue());
                }
            }
        });
        this.f77453e0 = w.y0(new a(7));
        this.f0 = w.y0(new a(8));
        this.g0 = w.y0(new a(9));
        final int i5 = 3;
        this.f77454h0 = w.y0(new Function0(this) { // from class: fr8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTransferAmountScreen f137412b;

            {
                this.f137412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                JuniorTransferAmountScreen juniorTransferAmountScreen = this.f137412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorTransferAmountScreen.i0;
                        return (r) ((oq8.d) juniorTransferAmountScreen.Z.getValue()).f227780q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorTransferAmountScreen.i0;
                        qd0.b bVar = juniorTransferAmountScreen.f77451b0;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorTransferAmountScreen.i0;
                        return new CenteredAmountDelegate(new fgj.g(juniorTransferAmountScreen, 22));
                    default:
                        KProperty[] kPropertyArr4 = JuniorTransferAmountScreen.i0;
                        return v.k((CenteredAmountDelegate) juniorTransferAmountScreen.f77452d0.getValue(), (InputTextDelegate) juniorTransferAmountScreen.f77453e0.getValue(), (ImageAttachmentDelegate) juniorTransferAmountScreen.f0.getValue(), (FullScreenStateDelegate) juniorTransferAmountScreen.g0.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        d dVar = T2().u;
        if (dVar.d.getState() == zx0.j.HIDDEN) {
            return false;
        }
        dVar.d.G();
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final boolean getZ() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (oq8.d) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f207897c.f59338a), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f207896b.o), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(h3().d.I(), new fo9.a(16))), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.f77452d0.getValue()).d.f121375b), null, new g(this, continuation, 1), 3);
        ?? r56 = this.f77453e0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new fr8.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52577j.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ImageAttachmentDelegate) this.f0.getValue()).f52515c), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.g0.getValue()).f52371h.f121375b), null, new fr8.j(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        b bVarN = ((oq8.d) this.Z.getValue()).f.f227788h.n();
        s.j(bVarN);
        this.f77451b0 = bVarN;
        h3().f207897c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getC0() {
        return (List) this.f77454h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f207896b;
        k kVar = uiState.f137428b;
        largeActionButton.setVisibility(kVar != null ? 0 : 8);
        if (kVar != null) {
            largeActionButton.setText(kVar.f137414a);
            largeActionButton.setEnabled(kVar.f137415b);
        }
        m mVar = uiState.f137429c;
        if (mVar != null) {
            NavBarWithAvatar navBarWithAvatar = h3().f207897c;
            navBarWithAvatar.setToolbarTitle(mVar.f137421a);
            navBarWithAvatar.setToolbarDescription(mVar.f137422b);
            navBarWithAvatar.setAvatarImage(new AvatarModel.Default(mVar.f137423c, null, null, null, new AvatarModel.BadgeModel(new RawImageBadge(mVar.d), com.revolut.core.ui_kit.models.avatar.b.BOTTOM), null, LDSFile.EF_DG14_TAG));
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.U;
    }

    public final mq8.a h3() {
        ViewBinding value = this.Y.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mq8.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final r T2() {
        return (r) this.f77450a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}

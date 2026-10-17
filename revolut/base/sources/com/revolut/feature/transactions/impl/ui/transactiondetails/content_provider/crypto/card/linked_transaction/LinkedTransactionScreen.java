package com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.z0;
import aw0.k;
import bof.b;
import bof.c;
import bof.d;
import bof.g;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreen;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import dli.a;
import efm.r;
import grl.k9;
import java.util.List;
import jii.d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import no.m;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tx0.p2;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/crypto/card/linked_transaction/LinkedTransactionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbof/h;", "Lno/m;", "Lmga/i0;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedTransactionScreen extends ViewController<q> implements a, m, i0 {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(LinkedTransactionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final LinkedTransactionScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final CellDetailsActionDelegate S;
    public final CellDetailsChevronDelegate T;
    public final TwinHorizontalButtonDelegate U;
    public final Object V;

    public LinkedTransactionScreen(LinkedTransactionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbarwithbigtile;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bof.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedTransactionScreen f17406b;

            {
                this.f17406b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedTransactionScreen linkedTransactionScreen = this.f17406b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedTransactionScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(linkedTransactionScreen.m2()).a().get(mlf.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mlf.d.class, " is not found"));
                        }
                        mlf.d dVar = ((mlf.d) aVar2.b()).C1;
                        LinkedTransactionScreenContract$InputData linkedTransactionScreenContract$InputData = linkedTransactionScreen.K;
                        linkedTransactionScreenContract$InputData.getClass();
                        return new mlf.b(dVar, linkedTransactionScreen, linkedTransactionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedTransactionScreen.W;
                        return (g) ((mlf.b) linkedTransactionScreen.O.getValue()).f206720p.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedTransactionScreen.W;
                        LinkedTransactionScreen linkedTransactionScreen2 = this.f17406b;
                        return dli.f.a(linkedTransactionScreen2, linkedTransactionScreen2.d(), v.k(new CellDetailsDelegate(), linkedTransactionScreen2.S, new CellDetailsNoteDelegate(), linkedTransactionScreen2.T, (RowDelegate) linkedTransactionScreen2.Q.getValue(), (HighlightTileDelegate) linkedTransactionScreen2.R.getValue(), new HighlightTileLoadingDelegate()), linkedTransactionScreen2.d3().f174511c.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bof.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedTransactionScreen f17406b;

            {
                this.f17406b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedTransactionScreen linkedTransactionScreen = this.f17406b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedTransactionScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(linkedTransactionScreen.m2()).a().get(mlf.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mlf.d.class, " is not found"));
                        }
                        mlf.d dVar = ((mlf.d) aVar2.b()).C1;
                        LinkedTransactionScreenContract$InputData linkedTransactionScreenContract$InputData = linkedTransactionScreen.K;
                        linkedTransactionScreenContract$InputData.getClass();
                        return new mlf.b(dVar, linkedTransactionScreen, linkedTransactionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedTransactionScreen.W;
                        return (g) ((mlf.b) linkedTransactionScreen.O.getValue()).f206720p.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedTransactionScreen.W;
                        LinkedTransactionScreen linkedTransactionScreen2 = this.f17406b;
                        return dli.f.a(linkedTransactionScreen2, linkedTransactionScreen2.d(), v.k(new CellDetailsDelegate(), linkedTransactionScreen2.S, new CellDetailsNoteDelegate(), linkedTransactionScreen2.T, (RowDelegate) linkedTransactionScreen2.Q.getValue(), (HighlightTileDelegate) linkedTransactionScreen2.R.getValue(), new HighlightTileLoadingDelegate()), linkedTransactionScreen2.d3().f174511c.getId(), null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new bkd.a(16));
        this.R = w.y0(new bkd.a(17));
        this.S = new CellDetailsActionDelegate();
        this.T = new CellDetailsChevronDelegate();
        this.U = new TwinHorizontalButtonDelegate();
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: bof.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedTransactionScreen f17406b;

            {
                this.f17406b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LinkedTransactionScreen linkedTransactionScreen = this.f17406b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedTransactionScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(linkedTransactionScreen.m2()).a().get(mlf.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mlf.d.class, " is not found"));
                        }
                        mlf.d dVar = ((mlf.d) aVar2.b()).C1;
                        LinkedTransactionScreenContract$InputData linkedTransactionScreenContract$InputData = linkedTransactionScreen.K;
                        linkedTransactionScreenContract$InputData.getClass();
                        return new mlf.b(dVar, linkedTransactionScreen, linkedTransactionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedTransactionScreen.W;
                        return (g) ((mlf.b) linkedTransactionScreen.O.getValue()).f206720p.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedTransactionScreen.W;
                        LinkedTransactionScreen linkedTransactionScreen2 = this.f17406b;
                        return dli.f.a(linkedTransactionScreen2, linkedTransactionScreen2.d(), v.k(new CellDetailsDelegate(), linkedTransactionScreen2.S, new CellDetailsNoteDelegate(), linkedTransactionScreen2.T, (RowDelegate) linkedTransactionScreen2.Q.getValue(), (HighlightTileDelegate) linkedTransactionScreen2.R.getValue(), new HighlightTileLoadingDelegate()), linkedTransactionScreen2.d3().f174511c.getId(), null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bof.h uiState = (bof.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        xnf.b bVar = uiState.f17411b;
        TextClause textClause = bVar.f307480b;
        Image image = bVar.d;
        ?? r92 = bVar.f307479a;
        Image image2 = bVar.e;
        navBarWithBigTile.setAvatar(new AvatarModel.Default(image, null, null, null, image2 != null ? new AvatarModel.BadgeModel(new RawImageBadge(image2), com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
        navBarWithBigTile.setTitle(new z0(r92, false));
        navBarWithBigTile.setDescription(bVar.f307481c);
        navBarWithBigTile.setActionStatusLabel(new k(6, textClause, null, false));
        navBarWithBigTile.setToolbarTitleWithSubtitle(r92, textClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        return ((HighlightTileDelegate) this.R.getValue()).f52437c;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mlf.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
        pd.b.p(view, new TextLocalisedClause(R$string.transaction_statistics_list_title_placeholder, null, null, 14));
        ((j60.a) ((mlf.b) this.O.getValue()).f.get()).d(u.c(this.U));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        return ((RowDelegate) this.Q.getValue()).f53218h;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174510b.f59357t), new bf5.a(this, continuation, 22), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f51821c), new d(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.U;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new bof.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new bof.e(this, continuation, 1), 3);
    }

    public final d0 d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.P.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f174509a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}

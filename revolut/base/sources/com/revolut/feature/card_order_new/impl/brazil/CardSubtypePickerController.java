package com.revolut.feature.card_order_new.impl.brazil;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.e0;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerController;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerControllerContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hx7.i;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l13.b;
import l13.c;
import l13.d;
import te0.w;
import vc.s;
import x13.p;
import xki.e;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/brazil/CardSubtypePickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ll13/h;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSubtypePickerController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CardSubtypePickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CardSubtypePickerControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CardSubtypePickerController(CardSubtypePickerControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new kw4.b(11));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: l13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSubtypePickerController f191428b;

            {
                this.f191428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardSubtypePickerController cardSubtypePickerController = this.f191428b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardSubtypePickerController.R;
                        CardSubtypePickerController cardSubtypePickerController2 = this.f191428b;
                        return dli.f.a(cardSubtypePickerController2, (e) cardSubtypePickerController2.Q.getValue(), v.k((RowDelegate) cardSubtypePickerController2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSubtypePickerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardSubtypePickerController.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).T;
                        CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData = cardSubtypePickerController.K;
                        cardSubtypePickerControllerContract$InputData.getClass();
                        return new x13.v(pVar, new agk.c(), cardSubtypePickerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardSubtypePickerController.R;
                        return (e) ((x13.v) ((m13.a) cardSubtypePickerController.P.getValue())).f302208h.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: l13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSubtypePickerController f191428b;

            {
                this.f191428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardSubtypePickerController cardSubtypePickerController = this.f191428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSubtypePickerController.R;
                        CardSubtypePickerController cardSubtypePickerController2 = this.f191428b;
                        return dli.f.a(cardSubtypePickerController2, (e) cardSubtypePickerController2.Q.getValue(), v.k((RowDelegate) cardSubtypePickerController2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSubtypePickerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardSubtypePickerController.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).T;
                        CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData = cardSubtypePickerController.K;
                        cardSubtypePickerControllerContract$InputData.getClass();
                        return new x13.v(pVar, new agk.c(), cardSubtypePickerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardSubtypePickerController.R;
                        return (e) ((x13.v) ((m13.a) cardSubtypePickerController.P.getValue())).f302208h.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: l13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSubtypePickerController f191428b;

            {
                this.f191428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardSubtypePickerController cardSubtypePickerController = this.f191428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSubtypePickerController.R;
                        CardSubtypePickerController cardSubtypePickerController2 = this.f191428b;
                        return dli.f.a(cardSubtypePickerController2, (e) cardSubtypePickerController2.Q.getValue(), v.k((RowDelegate) cardSubtypePickerController2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSubtypePickerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardSubtypePickerController.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).T;
                        CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData = cardSubtypePickerController.K;
                        cardSubtypePickerControllerContract$InputData.getClass();
                        return new x13.v(pVar, new agk.c(), cardSubtypePickerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardSubtypePickerController.R;
                        return (e) ((x13.v) ((m13.a) cardSubtypePickerController.P.getValue())).f302208h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((l13.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m13.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (l13.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        i.z(navBarWithToolbar, new hx4.a(new TextLocalisedClause(R$string.card_subtype_picker_header_title, null, null, 14), new TextLocalisedClause(R$string.card_subtype_picker_header_subtitle, null, null, 14), null, f0.f322471a));
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.CAPTION);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}

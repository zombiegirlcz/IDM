package com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer_friend;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer_friend.NewTransferFriendScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p0l.d;
import p4a.e;
import p4a.f;
import s3a.r;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/transfer/new_transfer_friend/NewTransferFriendScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lp4a/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewTransferFriendScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(NewTransferFriendScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f80122a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f80123b0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public NewTransferFriendScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        this.X = true;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: p4a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferFriendScreen f232866b;

            {
                this.f232866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                NewTransferFriendScreen newTransferFriendScreen = this.f232866b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferFriendScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(newTransferFriendScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        s3a.b bVar = new s3a.b();
                        bVar.f259484a = e4m.b.b(new ryc.d(kVar, bVar, i3, i6));
                        bVar.f259485b = e4m.b.b(new ryc.d(kVar, bVar, i5, i6));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = NewTransferFriendScreen.c0;
                        return (e) ((s3a.b) newTransferFriendScreen.Y.getValue()).f259485b.get();
                    default:
                        KProperty[] kPropertyArr3 = NewTransferFriendScreen.c0;
                        return v.k((RowDelegate) newTransferFriendScreen.f80122a0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: p4a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferFriendScreen f232866b;

            {
                this.f232866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                NewTransferFriendScreen newTransferFriendScreen = this.f232866b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferFriendScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(newTransferFriendScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        s3a.b bVar = new s3a.b();
                        bVar.f259484a = e4m.b.b(new ryc.d(kVar, bVar, i3, i6));
                        bVar.f259485b = e4m.b.b(new ryc.d(kVar, bVar, i5, i6));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = NewTransferFriendScreen.c0;
                        return (e) ((s3a.b) newTransferFriendScreen.Y.getValue()).f259485b.get();
                    default:
                        KProperty[] kPropertyArr3 = NewTransferFriendScreen.c0;
                        return v.k((RowDelegate) newTransferFriendScreen.f80122a0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        this.f80122a0 = w.y0(new p0l.a(7));
        final int i3 = 2;
        this.f80123b0 = w.y0(new Function0(this) { // from class: p4a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferFriendScreen f232866b;

            {
                this.f232866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                int i5 = 0;
                int i6 = 2;
                NewTransferFriendScreen newTransferFriendScreen = this.f232866b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferFriendScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(newTransferFriendScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        s3a.b bVar = new s3a.b();
                        bVar.f259484a = e4m.b.b(new ryc.d(kVar, bVar, i32, i6));
                        bVar.f259485b = e4m.b.b(new ryc.d(kVar, bVar, i5, i6));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = NewTransferFriendScreen.c0;
                        return (e) ((s3a.b) newTransferFriendScreen.Y.getValue()).f259485b.get();
                    default:
                        KProperty[] kPropertyArr3 = NewTransferFriendScreen.c0;
                        return v.k((RowDelegate) newTransferFriendScreen.f80122a0.getValue(), new RowLoadingDelegate());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final void J() {
        m2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (s3a.b) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new d(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.f80122a0.getValue()).f53218h), null, new p4a.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void W() {
        m2();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.add_friend_header_title_facelifted, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.add_friend_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
        navBarWithToolbar.setSearchButtonActive(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF69100d0() {
        return (List) this.f80123b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}

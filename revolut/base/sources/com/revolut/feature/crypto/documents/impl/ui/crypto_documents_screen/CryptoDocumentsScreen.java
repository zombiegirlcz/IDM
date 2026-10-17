package com.revolut.feature.crypto.documents.impl.ui.crypto_documents_screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.documents.api.R$string;
import com.revolut.feature.crypto.documents.impl.ui.crypto_documents_screen.CryptoDocumentsScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
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
import oe5.d;
import qe5.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/documents/impl/ui/crypto_documents_screen/CryptoDocumentsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqe5/e;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_crypto_documents_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoDocumentsScreen extends BaseRecyclerViewScreen<e, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70785b0 = {o0.f186429a.j(new h0(CryptoDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f70786a0;

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

    public CryptoDocumentsScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 1;
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, a.f);
        final int i2 = 0;
        this.X = w.y0(new Function0(this) { // from class: qe5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDocumentsScreen f245073b;

            {
                this.f245073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CryptoDocumentsScreen cryptoDocumentsScreen = this.f245073b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoDocumentsScreen.f70785b0;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDocumentsScreen.m2()).a().get(oe5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oe5.c.class, " is not found"));
                        }
                        oe5.c cVar = ((oe5.c) aVar2.b()).f224541h;
                        oe5.d dVar = new oe5.d();
                        int i5 = 22;
                        dVar.f224543a = e4m.b.b(new o41.b(cVar, dVar, 0, i5));
                        dVar.f224544b = e4m.b.b(new o41.b(cVar, dVar, 2, i5));
                        dVar.f224545c = e4m.b.b(new o41.b(cVar, dVar, 1, i5));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr2 = CryptoDocumentsScreen.f70785b0;
                        return (d) ((oe5.d) cryptoDocumentsScreen.X.getValue()).f224545c.get();
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: qe5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDocumentsScreen f245073b;

            {
                this.f245073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CryptoDocumentsScreen cryptoDocumentsScreen = this.f245073b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoDocumentsScreen.f70785b0;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDocumentsScreen.m2()).a().get(oe5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oe5.c.class, " is not found"));
                        }
                        oe5.c cVar = ((oe5.c) aVar2.b()).f224541h;
                        oe5.d dVar = new oe5.d();
                        int i5 = 22;
                        dVar.f224543a = e4m.b.b(new o41.b(cVar, dVar, 0, i5));
                        dVar.f224544b = e4m.b.b(new o41.b(cVar, dVar, 2, i5));
                        dVar.f224545c = e4m.b.b(new o41.b(cVar, dVar, 1, i5));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr2 = CryptoDocumentsScreen.f70785b0;
                        return (d) ((oe5.d) cryptoDocumentsScreen.X.getValue()).f224545c.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        this.f70786a0 = v.k(rowDelegate, new ListSubheaderDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (qe5.d) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f70785b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new q43.m(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f53218h), null, new qe5.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f70785b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_actions_documents, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF70786a0() {
        return this.f70786a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}

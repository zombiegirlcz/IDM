package com.revolut.feature.apm.payid.impl.screen.send.contacts;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.payid.api.R$string;
import com.revolut.feature.apm.payid.impl.screen.send.contacts.ContactsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.v7;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import u7k.f0;
import u9a.b;
import ua2.c;
import ua2.e;
import ua2.g;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/send/contacts/ContactsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lua2/e;", "Ldli/a;", "Lua2/o;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactsScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ContactsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object P;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object N = w.y0(new b(4));
    public final Object O = w.y0(new b(5));

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public ContactsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ua2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsScreen f278517b;

            {
                this.f278517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ContactsScreen contactsScreen = this.f278517b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ContactsScreen.R;
                        return (g) ((ea2.e) contactsScreen.P.getValue()).f124064b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ContactsScreen.R;
                        qji.b bVarU2 = contactsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.send.contacts.di.ContactsScreenInjector");
                        ea2.h hVar = ((ea2.j) bVarU2).f124088b;
                        ea2.e eVar = new ea2.e();
                        int i6 = 24;
                        eVar.f124063a = e4m.b.b(new v7(hVar, eVar, i3, i6));
                        eVar.f124064b = e4m.b.b(new v7(hVar, eVar, i5, i6));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = ContactsScreen.R;
                        ContactsScreen contactsScreen2 = this.f278517b;
                        return dli.f.a(contactsScreen2, contactsScreen2.R2(), v.k((FullScreenStateDelegate) contactsScreen2.N.getValue(), (RowDelegate) contactsScreen2.O.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ua2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsScreen f278517b;

            {
                this.f278517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ContactsScreen contactsScreen = this.f278517b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContactsScreen.R;
                        return (g) ((ea2.e) contactsScreen.P.getValue()).f124064b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ContactsScreen.R;
                        qji.b bVarU2 = contactsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.send.contacts.di.ContactsScreenInjector");
                        ea2.h hVar = ((ea2.j) bVarU2).f124088b;
                        ea2.e eVar = new ea2.e();
                        int i6 = 24;
                        eVar.f124063a = e4m.b.b(new v7(hVar, eVar, i3, i6));
                        eVar.f124064b = e4m.b.b(new v7(hVar, eVar, i5, i6));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = ContactsScreen.R;
                        ContactsScreen contactsScreen2 = this.f278517b;
                        return dli.f.a(contactsScreen2, contactsScreen2.R2(), v.k((FullScreenStateDelegate) contactsScreen2.N.getValue(), (RowDelegate) contactsScreen2.O.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ua2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsScreen f278517b;

            {
                this.f278517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ContactsScreen contactsScreen = this.f278517b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContactsScreen.R;
                        return (g) ((ea2.e) contactsScreen.P.getValue()).f124064b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ContactsScreen.R;
                        qji.b bVarU2 = contactsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.send.contacts.di.ContactsScreenInjector");
                        ea2.h hVar = ((ea2.j) bVarU2).f124088b;
                        ea2.e eVar = new ea2.e();
                        int i6 = 24;
                        eVar.f124063a = e4m.b.b(new v7(hVar, eVar, i32, i6));
                        eVar.f124064b = e4m.b.b(new v7(hVar, eVar, i5, i6));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = ContactsScreen.R;
                        ContactsScreen contactsScreen2 = this.f278517b;
                        return dli.f.a(contactsScreen2, contactsScreen2.R2(), v.k((FullScreenStateDelegate) contactsScreen2.N.getValue(), (RowDelegate) contactsScreen2.O.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((ua2.o) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ea2.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.contact_selector_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.contact_selector_search_bar_placeholder, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new u07.b(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new f0(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), new ua2.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}

package com.revolut.feature.contacts.impl.ui_kompot.add_contact;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts.impl.R$id;
import com.revolut.feature.contacts.impl.R$layout;
import com.revolut.feature.contacts.impl.R$string;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import el3.c;
import h30.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le8.d;
import lkf.f0;
import lm3.b;
import lm3.e;
import lm3.f;
import lm3.i;
import te0.w;
import vc.s;
import vl3.g;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lel3/c;", "Ldli/a;", "Llm3/c;", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddContactScreen extends ViewController<c> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AddContactScreen.class, "binding", "getBinding()Lcom/revolut/feature/contacts/impl/databinding/ScreenContactAddBinding;", 0))};
    public final AddContactInputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public AddContactScreen(AddContactInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_contact_add;
        this.M = s.t(this, e.f);
        this.N = w.y0(new f0(3));
        this.O = w.y0(new f0(4));
        this.P = w.y0(new f0(5));
        this.Q = w.y0(new f0(6));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: lm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddContactScreen f196871b;

            {
                this.f196871b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddContactScreen addContactScreen = this.f196871b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddContactScreen.U;
                        AddContactScreen addContactScreen2 = this.f196871b;
                        return dli.f.a(addContactScreen2, addContactScreen2.R2(), v.k((FixedTabsDelegate) addContactScreen2.N.getValue(), (RowDelegate) addContactScreen2.O.getValue(), (InputTextDelegate) addContactScreen2.P.getValue(), (PhoneEditorDelegate) addContactScreen2.Q.getValue()), R$id.addContact_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AddContactScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(addContactScreen.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        AddContactInputData addContactInputData = addContactScreen.K;
                        addContactInputData.getClass();
                        return new vl3.g(kVar, addContactInputData);
                    default:
                        KProperty[] kPropertyArr3 = AddContactScreen.U;
                        return (b) ((vl3.g) addContactScreen.S.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: lm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddContactScreen f196871b;

            {
                this.f196871b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddContactScreen addContactScreen = this.f196871b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddContactScreen.U;
                        AddContactScreen addContactScreen2 = this.f196871b;
                        return dli.f.a(addContactScreen2, addContactScreen2.R2(), v.k((FixedTabsDelegate) addContactScreen2.N.getValue(), (RowDelegate) addContactScreen2.O.getValue(), (InputTextDelegate) addContactScreen2.P.getValue(), (PhoneEditorDelegate) addContactScreen2.Q.getValue()), R$id.addContact_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AddContactScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(addContactScreen.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        AddContactInputData addContactInputData = addContactScreen.K;
                        addContactInputData.getClass();
                        return new vl3.g(kVar, addContactInputData);
                    default:
                        KProperty[] kPropertyArr3 = AddContactScreen.U;
                        return (b) ((vl3.g) addContactScreen.S.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: lm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddContactScreen f196871b;

            {
                this.f196871b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddContactScreen addContactScreen = this.f196871b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddContactScreen.U;
                        AddContactScreen addContactScreen2 = this.f196871b;
                        return dli.f.a(addContactScreen2, addContactScreen2.R2(), v.k((FixedTabsDelegate) addContactScreen2.N.getValue(), (RowDelegate) addContactScreen2.O.getValue(), (InputTextDelegate) addContactScreen2.P.getValue(), (PhoneEditorDelegate) addContactScreen2.Q.getValue()), R$id.addContact_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AddContactScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(addContactScreen.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        AddContactInputData addContactInputData = addContactScreen.K;
                        addContactInputData.getClass();
                        return new vl3.g(kVar, addContactInputData);
                    default:
                        KProperty[] kPropertyArr3 = AddContactScreen.U;
                        return (b) ((vl3.g) addContactScreen.S.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        lm3.c uiState = (lm3.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f271998b.setEnabled(uiState.f196868a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f271999c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(this.K.f65974c));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.contacts_add_contact_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.contacts_add_contact_title, null, null, 14), null);
        LargeActionButton largeActionButton = d3().f271998b;
        l.A(R.string.common_action_add, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("ADD_CONTACT_PROCEED_CTA_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f271999c.f59410q), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f271998b.o), new f(this, continuation, 1), 3);
        ?? r56 = this.O;
        ViewController.P2(this, l.y(((RowDelegate) r56.getValue()).f53218h, ((RowDelegate) r56.getValue()).f53225r, "merge(...)"), new lm3.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FixedTabsDelegate) this.N.getValue()).f52339c.f121375b), new d(this, (Continuation) null, 23), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.P.getValue()).e.f121375b), new lm3.h(this, null), 3);
        ?? r59 = this.Q;
        ViewController.P2(this, rd0.e.b(((PhoneEditorDelegate) r59.getValue()).e.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PhoneEditorDelegate) r59.getValue()).f52894c.f121375b), new f(this, continuation, 2), 3);
    }

    public final tl3.a d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tl3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b R2() {
        return (b) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}

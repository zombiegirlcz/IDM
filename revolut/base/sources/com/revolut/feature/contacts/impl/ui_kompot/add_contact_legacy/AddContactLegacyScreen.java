package com.revolut.feature.contacts.impl.ui_kompot.add_contact_legacy;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts.impl.R$id;
import com.revolut.feature.contacts.impl.R$layout;
import com.revolut.feature.contacts.impl.R$string;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact_legacy.AddContactLegacyScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import el3.c;
import h30.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import wm3.e;
import wm3.f;
import wm3.g;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact_legacy/AddContactLegacyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lel3/c;", "Ldli/a;", "Lwm3/c;", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddContactLegacyScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AddContactLegacyScreen.class, "binding", "getBinding()Lcom/revolut/feature/contacts/impl/databinding/ScreenContactAddBinding;", 0))};
    public final AddContactInputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AddContactLegacyScreen(AddContactInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_contact_add;
        this.M = true;
        this.N = s.t(this, e.f);
        this.O = w.y0(new wf5.a(19));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: wm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddContactLegacyScreen f298604b;

            {
                this.f298604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddContactLegacyScreen addContactLegacyScreen = this.f298604b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddContactLegacyScreen.S;
                        AddContactLegacyScreen addContactLegacyScreen2 = this.f298604b;
                        return dli.f.a(addContactLegacyScreen2, (b) addContactLegacyScreen2.R.getValue(), u.c((InputTextDelegate) addContactLegacyScreen2.O.getValue()), R$id.addContact_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AddContactLegacyScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(addContactLegacyScreen.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        AddContactInputData addContactInputData = addContactLegacyScreen.K;
                        addContactInputData.getClass();
                        return new vl3.h(kVar, addContactInputData);
                    default:
                        KProperty[] kPropertyArr3 = AddContactLegacyScreen.S;
                        return (b) ((vl3.h) addContactLegacyScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddContactLegacyScreen f298604b;

            {
                this.f298604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddContactLegacyScreen addContactLegacyScreen = this.f298604b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddContactLegacyScreen.S;
                        AddContactLegacyScreen addContactLegacyScreen2 = this.f298604b;
                        return dli.f.a(addContactLegacyScreen2, (b) addContactLegacyScreen2.R.getValue(), u.c((InputTextDelegate) addContactLegacyScreen2.O.getValue()), R$id.addContact_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AddContactLegacyScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(addContactLegacyScreen.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        AddContactInputData addContactInputData = addContactLegacyScreen.K;
                        addContactInputData.getClass();
                        return new vl3.h(kVar, addContactInputData);
                    default:
                        KProperty[] kPropertyArr3 = AddContactLegacyScreen.S;
                        return (b) ((vl3.h) addContactLegacyScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddContactLegacyScreen f298604b;

            {
                this.f298604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddContactLegacyScreen addContactLegacyScreen = this.f298604b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddContactLegacyScreen.S;
                        AddContactLegacyScreen addContactLegacyScreen2 = this.f298604b;
                        return dli.f.a(addContactLegacyScreen2, (b) addContactLegacyScreen2.R.getValue(), u.c((InputTextDelegate) addContactLegacyScreen2.O.getValue()), R$id.addContact_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AddContactLegacyScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(addContactLegacyScreen.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        AddContactInputData addContactInputData = addContactLegacyScreen.K;
                        addContactInputData.getClass();
                        return new vl3.h(kVar, addContactInputData);
                    default:
                        KProperty[] kPropertyArr3 = AddContactLegacyScreen.S;
                        return (b) ((vl3.h) addContactLegacyScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        wm3.c uiState = (wm3.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f271998b.setEnabled(uiState.f298602b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vl3.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (wm3.b) this.R.getValue();
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

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f271999c.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f271998b.o), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.O.getValue()).e.f121375b), null, new g(this, null), 3);
    }

    public final tl3.a d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tl3.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}

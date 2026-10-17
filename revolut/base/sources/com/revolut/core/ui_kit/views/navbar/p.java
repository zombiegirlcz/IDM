package com.revolut.core.ui_kit.views.navbar;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import kotlin.jvm.internal.Intrinsics;
import tx0.o1;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends iv0.q {
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ifm.b f59543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(NavBarWithToolbar rootView) {
        super(rootView, R$id.navBarWithToolbar_switcherButton_stub);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f = v0.a.d("create(...)");
        this.f59543g = new ifm.b();
    }

    @Override // iv0.q
    public final void b(View view) {
        SwitcherButtonView view2 = (SwitcherButtonView) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        te0.w.j0(this.f59543g, te0.w.a0(view2.e, new bt9.t(12)).subscribe(new o1(new su0.c(1, this.f, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 29), 12)));
    }

    @Override // iv0.q
    public final void c(View view) {
        SwitcherButtonView view2 = (SwitcherButtonView) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        this.f59543g.d();
    }
}

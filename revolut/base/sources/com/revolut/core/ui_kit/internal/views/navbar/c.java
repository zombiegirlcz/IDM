package com.revolut.core.ui_kit.internal.views.navbar;

import android.view.View;
import au0.n3;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import h30.l;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f57399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ py0.d f57400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n3 f57401c;
    public final /* synthetic */ NavBarMenuImpl$NavBarTextMenuItemDelegate d;
    public final /* synthetic */ TextNavBarMenuItem e;

    public c(TextNavBarMenuItem textNavBarMenuItem, py0.c cVar, n3 n3Var, NavBarMenuImpl$NavBarTextMenuItemDelegate navBarMenuImpl$NavBarTextMenuItemDelegate, TextNavBarMenuItem textNavBarMenuItem2) {
        this.f57399a = textNavBarMenuItem;
        this.f57400b = cVar;
        this.f57401c = n3Var;
        this.d = navBarMenuImpl$NavBarTextMenuItemDelegate;
        this.e = textNavBarMenuItem2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l.w(view, view).a(view, this.f57399a, this.f57400b);
        this.f57401c.f9284h.b0();
        this.d.f57320c.invoke(this.e.f59488a);
    }
}

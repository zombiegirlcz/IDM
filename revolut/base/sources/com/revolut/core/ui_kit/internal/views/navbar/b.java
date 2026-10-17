package com.revolut.core.ui_kit.internal.views.navbar;

import android.view.View;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.AvatarModelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.AvatarNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import h30.l;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f57397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f57398c;
    public final /* synthetic */ BaseRecyclerViewDelegate d;
    public final /* synthetic */ NavBarMenuItem e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(NavBarMenuItem navBarMenuItem, py0.d dVar, BaseRecyclerViewDelegate baseRecyclerViewDelegate, NavBarMenuItem navBarMenuItem2, int i) {
        this.f57396a = i;
        this.f57397b = (TrackableItem) navBarMenuItem;
        this.f57398c = dVar;
        this.d = baseRecyclerViewDelegate;
        this.e = navBarMenuItem2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f57396a) {
            case 0:
                l.w(view, view).a(view, this.f57397b, this.f57398c);
                ((NavBarMenuImpl$NavBarActionMenuItemDelegate) this.d).f57313c.invoke(((ActionNavBarMenuItem) this.e).f59198a);
                break;
            case 1:
                l.w(view, view).a(view, this.f57397b, this.f57398c);
                ((NavBarMenuImpl$NavBarAvatarMenuItemDelegate) this.d).f57314c.invoke(((AvatarNavBarMenuItem) this.e).f59204a);
                break;
            case 2:
                l.w(view, view).a(view, this.f57397b, (py0.c) this.f57398c);
                ((NavBarMenuImpl$NavBarAvatarModelMenuItemDelegate) this.d).f57315c.invoke(((AvatarModelNavBarMenuItem) this.e).f59201a);
                break;
            case 3:
                l.w(view, view).a(view, this.f57397b, this.f57398c);
                ((NavBarMenuImpl$NavBarIconMenuItemDelegate) this.d).f57316c.invoke(((IconNavBarMenuItem) this.e).f59236a);
                break;
            default:
                l.w(view, view).a(view, this.f57397b, this.f57398c);
                ((NavBarMenuImpl$NavBarPlusActionMenuItemDelegate) this.d).d.invoke(((PlusActionNavBarMenuItem) this.e).f59449a);
                break;
        }
    }
}

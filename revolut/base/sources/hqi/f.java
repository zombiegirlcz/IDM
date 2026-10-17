package hqi;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuKt;
import com.revolut.uicomponent.toolbar.app_bar.BaseToolbar;
import com.revolut.uicomponent.toolbar.app_bar.ProgressViewRevolutToolbar;
import com.revolut.uicomponent.toolbar.app_bar.SearchViewRevolutToolbar;
import efm.r;
import hqi.k;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends fsi.c implements l {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final fsi.b f154708p = new fsi.b("TOOLBAR_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f154709h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f154710j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f154711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.b f154712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.b f154713n;
    public BaseToolbar o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i toolbarConfiguration, Activity activity) {
        super(f154708p);
        Intrinsics.checkNotNullParameter(toolbarConfiguration, "toolbarConfiguration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f154709h = toolbarConfiguration;
        this.i = activity;
        this.f154710j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f154711l = v0.a.d("create(...)");
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f154712m = bVarE;
        ihm.b bVarE2 = ihm.b.e("");
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.f154713n = bVarE2;
    }

    @Override // hqi.l
    public final void A(int i, int i2) {
        BaseToolbar baseToolbar = this.o;
        if (baseToolbar instanceof ProgressViewRevolutToolbar) {
            ProgressViewRevolutToolbar progressToolbar = (ProgressViewRevolutToolbar) baseToolbar;
            Intrinsics.checkNotNullParameter(progressToolbar, "progressToolbar");
            progressToolbar.setProgress(i, i2);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // hqi.l
    public final void F(int i) {
        if (i <= 0) {
            BaseToolbar baseToolbar = this.o;
            if (baseToolbar != null) {
                baseToolbar.setNavigationIcon((Drawable) null);
                return;
            }
            return;
        }
        BaseToolbar baseToolbar2 = this.o;
        if (baseToolbar2 != null) {
            baseToolbar2.setNavigationIcon(i);
        }
    }

    @Override // fsi.a
    public final void I() {
        SearchView searchView;
        i iVar = this.f154709h;
        Integer num = iVar.f154715a;
        if (num == null) {
            return;
        }
        BaseToolbar baseToolbar = (BaseToolbar) this.i.findViewById(num.intValue());
        this.o = baseToolbar;
        if (baseToolbar != null) {
            baseToolbar.setNavigationOnClickListener(new c(this, 0));
        }
        BaseToolbar baseToolbar2 = this.o;
        if (baseToolbar2 instanceof SearchViewRevolutToolbar) {
            SearchViewRevolutToolbar searchToolbar = (SearchViewRevolutToolbar) baseToolbar2;
            Intrinsics.checkNotNullParameter(searchToolbar, "searchToolbar");
            searchToolbar.setSearchViewListener(new fn2.c(this, 10));
            SearchView searchView2 = searchToolbar.getSearchView();
            if (searchView2 != null) {
                searchView2.setOnQueryTextListener(new e(this));
            }
            k kVar = iVar.f154716b;
            if ((kVar instanceof k.b) && ((k.b) kVar).a() && (searchView = searchToolbar.getSearchView()) != null) {
                searchView.setIconified(false);
            }
            Unit unit = Unit.f186387a;
        }
    }

    @Override // hqi.l
    public final r b() {
        r rVarHide = this.f154710j.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // hqi.l
    public final void h(boolean z) {
        BaseToolbar baseToolbar = this.o;
        if (baseToolbar instanceof ProgressViewRevolutToolbar) {
            ProgressViewRevolutToolbar progressToolbar = (ProgressViewRevolutToolbar) baseToolbar;
            Intrinsics.checkNotNullParameter(progressToolbar, "progressToolbar");
            progressToolbar.setProgressVisibility(z);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // hqi.l
    public final r i() {
        r rVarHide = this.k.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // hqi.l
    public final r j() {
        r rVarHide = this.f154713n.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // hqi.l
    public final void k(int i) {
        BaseToolbar baseToolbar = this.o;
        if (baseToolbar != null) {
            baseToolbar.getMenu().clear();
            if (i == -1) {
                return;
            }
            if (i > 0) {
                baseToolbar.inflateMenu(i);
            }
            Menu menu = baseToolbar.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
            Iterator<MenuItem> it8 = MenuKt.iterator(menu);
            while (it8.hasNext()) {
                final MenuItem next = it8.next();
                View actionView = next.getActionView();
                if (actionView != null) {
                    actionView.setOnClickListener(new ap0.f(this, next, 13));
                }
                next.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: hqi.b
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem it9) {
                        Intrinsics.checkNotNullParameter(it9, "it");
                        this.f154703a.f154710j.onNext(Integer.valueOf(next.getItemId()));
                        return true;
                    }
                });
            }
        }
    }

    @Override // hqi.l
    public final void l(String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        BaseToolbar baseToolbar = this.o;
        if (baseToolbar instanceof SearchViewRevolutToolbar) {
            SearchViewRevolutToolbar searchToolbar = (SearchViewRevolutToolbar) baseToolbar;
            Intrinsics.checkNotNullParameter(searchToolbar, "searchToolbar");
            SearchView searchView = searchToolbar.getSearchView();
            if (searchView != null) {
                searchView.setQueryHint(hint);
            }
            Unit unit = Unit.f186387a;
        }
    }

    @Override // hqi.l
    public final void n(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        BaseToolbar baseToolbar = this.o;
        if (baseToolbar != null) {
            baseToolbar.setTitle(title);
        }
    }

    @Override // hqi.l
    public final void q(boolean z) {
        BaseToolbar baseToolbar = this.o;
        if (baseToolbar != null) {
            w01.k.e(baseToolbar, z);
        }
    }
}

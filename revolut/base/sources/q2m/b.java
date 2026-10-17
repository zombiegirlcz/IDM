package q2m;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.trustdockekyc.core.backend.presentation.CoreEkycCommonErrorFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x2m.f;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements MenuProvider, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f241743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f241744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f241745c;

    public b(AppCompatActivity activity, f settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f241743a = settings;
        this.f241744b = new WeakReference(activity);
    }

    @Override // androidx.core.view.MenuProvider
    public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(R.menu.tdcoreekyc__default, menu);
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.f241744b.get();
        if (appCompatActivity != null) {
            List menuItemResIds = u.c(Integer.valueOf(R.id.close));
            Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
            f settings = this.f241743a;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(menuItemResIds, "menuItemResIds");
            new t2m.a(appCompatActivity, menuItemResIds, settings, 1);
        }
    }

    @Override // androidx.core.view.MenuProvider
    public final boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        a aVar = this.f241745c;
        if (aVar == null) {
            return true;
        }
        aVar.a();
        return true;
    }

    @Override // androidx.core.view.MenuProvider
    public final void onPrepareMenu(Menu menu) {
        boolean z;
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.close);
        if (menuItemFindItem == null) {
            return;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.f241744b.get();
        Fragment fragmentFindFragmentById = (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentById(-2029912057);
        if (fragmentFindFragmentById instanceof CoreEkycCommonErrorFragment) {
            ((CoreEkycCommonErrorFragment) fragmentFindFragmentById).getClass();
            z = false;
        } else {
            z = true;
        }
        menuItemFindItem.setVisible(z);
    }
}

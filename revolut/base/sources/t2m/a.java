package t2m;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.k;
import x2m.f;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f267597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatActivity f267598c;
    public final int d;
    public final List e;
    public final k f;

    public a(AppCompatActivity activity, List menuItemResIds, f settings, int i) {
        this.f267597b = i;
        switch (i) {
            case 1:
                k uiColorChanger = new k(10);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(menuItemResIds, "menuItemResIds");
                Intrinsics.checkNotNullParameter(settings, "settings");
                Intrinsics.checkNotNullParameter(uiColorChanger, "uiColorChanger");
                super(settings);
                this.f267598c = activity;
                this.d = -2029912017;
                this.e = menuItemResIds;
                this.f = uiColorChanger;
                activity.getLifecycle().addObserver(this);
                break;
            default:
                k uiColorChanger2 = new k(10);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(menuItemResIds, "menuItemResIds");
                Intrinsics.checkNotNullParameter(settings, "settings");
                Intrinsics.checkNotNullParameter(uiColorChanger2, "uiColorChanger");
                super(settings);
                this.f267598c = activity;
                this.d = -2029912017;
                this.e = menuItemResIds;
                this.f = uiColorChanger2;
                activity.getLifecycle().addObserver(this);
                break;
        }
    }

    @Override // t2m.c
    public final void a(f settings) throws PackageManager.NameNotFoundException {
        Drawable navigationIcon;
        ActionBar supportActionBar;
        switch (this.f267597b) {
            case 0:
                Intrinsics.checkNotNullParameter(settings, "settings");
                this.f.getClass();
                Intrinsics.checkNotNullParameter(settings, "settings");
                AppCompatActivity activity = this.f267598c;
                Intrinsics.checkNotNullParameter(activity, "activity");
                List menuItemResIds = this.e;
                Intrinsics.checkNotNullParameter(menuItemResIds, "menuItemResIds");
                Intrinsics.checkNotNullParameter(activity, "<this>");
                if (activity != null && (supportActionBar = activity.getSupportActionBar()) != null) {
                    supportActionBar.setBackgroundDrawable(AppCompatResources.getDrawable(activity, u0.y(activity) ? R.color.tdcoreekyc__app_bar_background_dark_mode : R.color.tdcoreekyc__app_bar_background_light_mode));
                }
                Intrinsics.checkNotNullParameter(activity, "<this>");
                int i = this.d;
                Toolbar toolbar = (Toolbar) activity.findViewById(i);
                if (toolbar != null && (navigationIcon = toolbar.getNavigationIcon()) != null) {
                    navigationIcon.setTint(activity.getColor(u0.y(activity) ? R.color.tdcoreekyc__app_bar_back_arrow_dark_mode : R.color.tdcoreekyc__app_bar_back_arrow_light_mode));
                }
                Intrinsics.checkNotNullParameter(activity, "<this>");
                Toolbar toolbar2 = (Toolbar) activity.findViewById(i);
                if (toolbar2 != null) {
                    toolbar2.setTitleTextColor(activity.getColor(u0.y(activity) ? R.color.tdcoreekyc__app_bar_title_dark_mode : R.color.tdcoreekyc__app_bar_title_light_mode));
                }
                u0.F(activity, i, menuItemResIds);
                k.c(settings, activity);
                break;
            default:
                Intrinsics.checkNotNullParameter(settings, "settings");
                this.f.getClass();
                AppCompatActivity activity2 = this.f267598c;
                Intrinsics.checkNotNullParameter(activity2, "activity");
                List menuItemResIds2 = this.e;
                Intrinsics.checkNotNullParameter(menuItemResIds2, "menuItemResIds");
                u0.F(activity2, this.d, menuItemResIds2);
                break;
        }
    }

    @Override // t2m.c
    public final void b() {
        switch (this.f267597b) {
            case 0:
                this.f267598c.getLifecycle().removeObserver(this);
                break;
            default:
                this.f267598c.getLifecycle().removeObserver(this);
                break;
        }
    }
}

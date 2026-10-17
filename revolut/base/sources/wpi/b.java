package wpi;

import android.app.Activity;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends fsi.c implements e {

    @NotNull
    public static final a Companion = new a();
    public static final fsi.b k = new fsi.b("NAV_BAR_WITH_BIG_TITLE_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f299340h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NavBarWithBigTile f299341j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(k);
        d configuration = d.f299342b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f299340h = configuration;
        this.i = activity;
    }

    @Override // fsi.a
    public final void I() {
        NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) this.i.findViewById(this.f299340h.f299343a);
        if (navBarWithBigTile != null) {
            this.f299341j = navBarWithBigTile;
        }
    }
}

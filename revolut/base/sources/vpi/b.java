package vpi;

import android.app.Activity;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends fsi.c implements e {

    @NotNull
    public static final a Companion = new a();
    public static final fsi.b k = new fsi.b("NAVBAR_WITH_AVATAR_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f291219h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NavBarWithAvatar f291220j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(k);
        d configuration = d.f291221b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f291219h = configuration;
        this.i = activity;
    }

    @Override // fsi.a
    public final void I() {
        NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) this.i.findViewById(this.f291219h.f291222a);
        if (navBarWithAvatar != null) {
            this.f291220j = navBarWithAvatar;
        }
    }
}

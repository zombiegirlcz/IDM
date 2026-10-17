package zpi;

import android.app.Activity;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sv0.d;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends fsi.c implements c {

    @NotNull
    public static final a Companion = new a();
    public static final fsi.b i = new fsi.b("OVERLAY_ANIMATION_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f324313h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(i);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f324313h = j.b(new d(activity, 1));
    }
}

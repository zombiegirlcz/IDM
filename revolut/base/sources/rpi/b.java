package rpi;

import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends fsi.c implements c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fsi.b f256386j = new fsi.b("KEYBOARD_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f256387h;
    public final ihm.b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(f256386j);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f256387h = activity;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.i = bVarE;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.h(decorView);
        u.b(decorView, true, new f2(this, 13));
    }

    public final void N(boolean z) {
        Activity activity = this.f256387h;
        if (!z) {
            e0m.e.c(activity);
        } else {
            if (activity == null) {
                return;
            }
            e0m.e.e(activity.getCurrentFocus());
        }
    }
}

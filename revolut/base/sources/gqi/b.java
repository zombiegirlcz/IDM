package gqi;

import android.app.Activity;
import fsi.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fsi.b f145745h = new fsi.b("TOAST_DELEGATE_ID_OLD");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(f145745h);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}

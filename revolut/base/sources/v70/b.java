package v70;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0.d f286523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f286524b;

    public b(Context context, ui0.d appVersion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.f286523a = appVersion;
        this.f286524b = context.getSharedPreferences("MIGRATION_PREFS", 0);
    }
}

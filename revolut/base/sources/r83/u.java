package r83;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ui0.b f252349c = new ui0.b("com.google.android.apps.walletnfcrel", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f252350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cpi.g f252351b;

    public u(Context context, cpi.g storeIntentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        this.f252350a = context;
        this.f252351b = storeIntentProvider;
    }
}

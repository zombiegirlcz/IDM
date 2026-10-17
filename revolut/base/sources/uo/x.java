package uo;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f281516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281517b;

    public x(Context context) {
        int i = Build.VERSION.SDK_INT;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f281516a = context;
        this.f281517b = i;
    }
}

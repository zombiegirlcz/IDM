package z39;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f319223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f319224b;

    public d(Context context, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.f319223a = context;
        this.f319224b = permissionProvider;
    }
}

package aqi;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends fsi.c implements a {

    @NotNull
    public static final c Companion = new c();
    public static final fsi.b k = new fsi.b("REQUEST_PERMISSION_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f8464h;
    public final y80.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f8465j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity context, y80.b permissionRequestResolver) {
        super(k);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionRequestResolver, "permissionRequestResolver");
        this.f8464h = context;
        this.i = permissionRequestResolver;
        this.f8465j = v0.a.d("create(...)");
    }

    @Override // fsi.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.o(i, permissions, grantResults);
        this.f8465j.onNext(new g(i, this.i.a(this.f8464h, permissions, grantResults)));
    }
}

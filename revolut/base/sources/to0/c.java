package to0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f272489a;

    public c() {
        this.f272489a = Build.VERSION.SDK_INT >= 31 ? new h() : new i();
    }

    @Override // to0.a
    public final Bitmap a(Context context, Bitmap bitmap, ro0.h style, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(style, "style");
        return this.f272489a.a(context, bitmap, style, f);
    }
}

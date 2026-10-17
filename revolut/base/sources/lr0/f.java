package lr0;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private f() {
    }

    public static e a(Context context, mr0.a geometry, kr0.c glowStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(glowStyle, "glowStyle");
        int i = glowStyle.f188627a;
        boolean z = glowStyle.f188628b;
        kr0.b bVar = new kr0.b(context, i, Paint.Style.FILL, Paint.Cap.BUTT);
        bVar.c(1.0f);
        return Build.VERSION.SDK_INT >= 33 ? new c(context, geometry.d(), bVar, z) : new d(bVar, z);
    }
}

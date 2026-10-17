package lr0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr0.b f199363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f199365c;

    public d(kr0.b renderer, boolean z) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f199363a = renderer;
        this.f199364b = z;
        this.f199365c = z;
    }

    @Override // lr0.e
    public final float a() {
        return this.f199363a.d;
    }

    @Override // lr0.e
    public final boolean b() {
        return this.f199365c;
    }

    @Override // lr0.e
    public final float c() {
        return this.f199363a.e;
    }

    @Override // lr0.e
    public final void d(Canvas canvas, mr0.a geometry, float f, LinearGradient linearGradient) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        kr0.b bVar = this.f199363a;
        bVar.b(linearGradient);
        bVar.a(canvas, geometry.e(), geometry.b(), geometry.a(), this.f199364b, f);
    }
}

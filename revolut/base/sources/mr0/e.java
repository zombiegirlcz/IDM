package mr0;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements a {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f208035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f208036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f208037c;
    public float d;
    public float e;
    public float f;

    public e(Path corePath, Path innerGlowPath, Path outerBloomPath) {
        Intrinsics.checkNotNullParameter(corePath, "corePath");
        Intrinsics.checkNotNullParameter(innerGlowPath, "innerGlowPath");
        Intrinsics.checkNotNullParameter(outerBloomPath, "outerBloomPath");
        this.f208035a = corePath;
        this.f208036b = innerGlowPath;
        this.f208037c = outerBloomPath;
    }

    @Override // mr0.a
    public final Path a() {
        return this.f208037c;
    }

    @Override // mr0.a
    public final Path b() {
        return this.f208036b;
    }

    @Override // mr0.a
    public final void c(RectF outBounds, float f) {
        Intrinsics.checkNotNullParameter(outBounds, "outBounds");
        float f4 = this.f + f;
        float f5 = this.d;
        float f6 = this.e;
        outBounds.set(f5 - f4, f6 - f4, f5 + f4, f6 + f4);
    }

    @Override // mr0.a
    public final String d() {
        return "\n            uniform vec2 ringCenter;\n            uniform float ringRadius;\n    \n            vec2 resolveGlowGeometry(vec2 fragCoord) {\n                float distanceFromRing = abs(distance(fragCoord, ringCenter) - ringRadius);\n                return vec2(distanceFromRing, 1.0);\n            }\n        ";
    }

    @Override // mr0.a
    public final Path e() {
        return this.f208035a;
    }

    @Override // mr0.a
    public final void f(RuntimeShader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        shader.setFloatUniform("ringCenter", this.d, this.e);
        shader.setFloatUniform("ringRadius", this.f);
    }
}

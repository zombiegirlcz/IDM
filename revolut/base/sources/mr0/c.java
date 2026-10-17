package mr0;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f208031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f208032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f208033c;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f208034g;

    public c(Path corePath, Path innerGlowPath, Path outerBloomPath) {
        Intrinsics.checkNotNullParameter(corePath, "corePath");
        Intrinsics.checkNotNullParameter(innerGlowPath, "innerGlowPath");
        Intrinsics.checkNotNullParameter(outerBloomPath, "outerBloomPath");
        this.f208031a = corePath;
        this.f208032b = innerGlowPath;
        this.f208033c = outerBloomPath;
    }

    @Override // mr0.a
    public final Path a() {
        return this.f208033c;
    }

    @Override // mr0.a
    public final Path b() {
        return this.f208032b;
    }

    @Override // mr0.a
    public final void c(RectF outBounds, float f) {
        Intrinsics.checkNotNullParameter(outBounds, "outBounds");
        outBounds.set(Math.min(this.d, this.f) - f, Math.min(this.e, this.f208034g) - f, Math.max(this.d, this.f) + f, Math.max(this.e, this.f208034g) + f);
    }

    @Override // mr0.a
    public final String d() {
        return "\n            uniform vec2 lineStart;\n            uniform vec2 lineEnd;\n            \n            vec2 resolveGlowGeometry(vec2 fragCoord) {\n                vec2 pa = fragCoord - lineStart;\n                vec2 ba = lineEnd - lineStart;\n                float h = clamp(dot(pa, ba) / max(dot(ba, ba), 0.00001), 0.0, 1.0);\n                return vec2(length(pa - ba * h), 1.0 - h);\n            }\n        ";
    }

    @Override // mr0.a
    public final Path e() {
        return this.f208031a;
    }

    @Override // mr0.a
    public final void f(RuntimeShader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        shader.setFloatUniform("lineStart", this.d, this.e);
        shader.setFloatUniform("lineEnd", this.f, this.f208034g);
    }
}

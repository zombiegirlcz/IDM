package ro0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements o {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f255750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f255751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f255752c;

    public /* synthetic */ k(j jVar) {
        this(jVar, 30.0f, 100.0f);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f255750a == kVar.f255750a && Float.compare(this.f255751b, kVar.f255751b) == 0 && Float.compare(this.f255752c, kVar.f255752c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f255752c) + m72.b.b(this.f255751b, this.f255750a.hashCode() * 31, 31);
    }

    public k(j direction, float f, float f4) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f255750a = direction;
        this.f255751b = f;
        this.f255752c = f4;
    }
}

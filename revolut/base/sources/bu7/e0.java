package bu7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f18709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18710b;

    public e0(c0 key, List paragraphs) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(paragraphs, "paragraphs");
        this.f18709a = key;
        this.f18710b = paragraphs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f18709a == e0Var.f18709a && Intrinsics.f(this.f18710b, e0Var.f18710b);
    }

    @Override // bu7.g0
    public final c0 getKey() {
        return this.f18709a;
    }

    public final int hashCode() {
        return this.f18710b.hashCode() + (this.f18709a.hashCode() * 31);
    }
}

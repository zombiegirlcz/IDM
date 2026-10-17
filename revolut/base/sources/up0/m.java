package up0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f281746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f281747b;

    public m(a0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f281746a = content;
        this.f281747b = content;
    }

    @Override // up0.n
    public final a0 a() {
        return this.f281747b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f281746a, ((m) obj2).f281746a);
    }

    public final int hashCode() {
        return this.f281746a.hashCode();
    }
}

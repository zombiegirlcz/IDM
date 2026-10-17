package zh9;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f322303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f322304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f322305c;

    public m(boolean z, boolean z3, boolean z4) {
        this.f322303a = z;
        this.f322304b = z3;
        this.f322305c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f322303a == mVar.f322303a && this.f322304b == mVar.f322304b && this.f322305c == mVar.f322305c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322305c) + j6.a.c(Boolean.hashCode(this.f322303a) * 31, 31, this.f322304b);
    }
}

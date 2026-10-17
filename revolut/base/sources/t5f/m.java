package t5f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f268091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f268092c;

    public m(String title, double d, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f268090a = title;
        this.f268091b = d;
        this.f268092c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f268090a, mVar.f268090a) && Double.compare(this.f268091b, mVar.f268091b) == 0 && this.f268092c == mVar.f268092c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268092c) + m72.b.c(this.f268090a.hashCode() * 31, this.f268091b, 31);
    }

    public /* synthetic */ m(String str, boolean z, int i, double d) {
        if (7 != (i & 7)) {
            j1.f(k.f268089a.getDescriptor(), i, 7);
            throw null;
        }
        this.f268090a = str;
        this.f268091b = d;
        this.f268092c = z;
    }
}

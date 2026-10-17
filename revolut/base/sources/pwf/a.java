package pwf;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f240437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f240438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f240439c;
    public final Clause d;
    public final Clause e;

    public a(long j2, long j3, Clause headerTitle, Clause headerDescription, Clause buttonText) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(headerDescription, "headerDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f240437a = j2;
        this.f240438b = j3;
        this.f240439c = headerTitle;
        this.d = headerDescription;
        this.e = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f240437a == aVar.f240437a && this.f240438b == aVar.f240438b && Intrinsics.f(this.f240439c, aVar.f240439c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.a(p.a.a(a0.d.c(Long.hashCode(this.f240437a) * 31, 31, this.f240438b), 31, this.f240439c), 31, this.d);
    }
}

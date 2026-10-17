package k16;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180128c;
    public final String d;
    public final Instant e;
    public final Instant f;

    public /* synthetic */ s(int i, String str, String str2, String str3, String str4, Instant instant, Instant instant2) {
        if (63 != (i & 63)) {
            j1.f(q.f180125a.getDescriptor(), i, 63);
            throw null;
        }
        this.f180126a = str;
        this.f180127b = str2;
        this.f180128c = str3;
        this.d = str4;
        this.e = instant;
        this.f = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f180126a, sVar.f180126a) && Intrinsics.f(this.f180127b, sVar.f180127b) && Intrinsics.f(this.f180128c, sVar.f180128c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f180126a.hashCode() * 31, 31, this.f180127b), 31, this.f180128c);
        String str = this.d;
        return this.f.hashCode() + r6.b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}

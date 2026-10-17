package f1a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131218c;
    public final long d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f131219g;

    public /* synthetic */ o(int i, String str, String str2, String str3, long j2, long j3, String str4, jo3.b bVar) {
        if (63 != (i & 63)) {
            j1.f(m.f131215a.getDescriptor(), i, 63);
            throw null;
        }
        this.f131216a = str;
        this.f131217b = str2;
        this.f131218c = str3;
        this.d = j2;
        this.e = j3;
        this.f = str4;
        if ((i & 64) == 0) {
            this.f131219g = null;
        } else {
            this.f131219g = bVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f131216a, oVar.f131216a) && Intrinsics.f(this.f131217b, oVar.f131217b) && Intrinsics.f(this.f131218c, oVar.f131218c) && this.d == oVar.d && this.e == oVar.e && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f131219g, oVar.f131219g);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(a0.d.c(p.a.c(p.a.c(this.f131216a.hashCode() * 31, 31, this.f131217b), 31, this.f131218c), 31, this.d), 31, this.e), 31, this.f);
        jo3.b bVar = this.f131219g;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    public o(String id10, String link, String transactionId, long j2, long j3, String state, jo3.b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f131216a = id10;
        this.f131217b = link;
        this.f131218c = transactionId;
        this.d = j2;
        this.e = j3;
        this.f = state;
        this.f131219g = bVar;
    }
}

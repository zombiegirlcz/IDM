package fla;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f135931c;
    public final String d;

    public /* synthetic */ j(int i, String str, String str2, m mVar, String str3) {
        if (15 != (i & 15)) {
            j1.f(h.f135928a.getDescriptor(), i, 15);
            throw null;
        }
        this.f135929a = str;
        this.f135930b = str2;
        this.f135931c = mVar;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f135929a, jVar.f135929a) && Intrinsics.f(this.f135930b, jVar.f135930b) && Intrinsics.f(this.f135931c, jVar.f135931c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f135929a.hashCode() * 31, 31, this.f135930b);
        m mVar = this.f135931c;
        int iHashCode = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}

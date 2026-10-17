package bqc;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new bkd.a(26)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f17814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17815c;

    public /* synthetic */ n(int i, String str, k kVar, long j2) {
        if (7 != (i & 7)) {
            j1.f(l.f17812a.getDescriptor(), i, 7);
            throw null;
        }
        this.f17813a = str;
        this.f17814b = kVar;
        this.f17815c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f17813a, nVar.f17813a) && this.f17814b == nVar.f17814b && this.f17815c == nVar.f17815c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17815c) + ((this.f17814b.hashCode() + (this.f17813a.hashCode() * 31)) * 31);
    }
}

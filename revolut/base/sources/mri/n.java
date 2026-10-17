package mri;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class n implements s {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f208140c = {null, yhm.j.c(yhm.k.PUBLICATION, new mq4.b(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f208142b;

    public /* synthetic */ n(int i, String str, j jVar) {
        if (3 != (i & 3)) {
            j1.f(l.f208139a.getDescriptor(), i, 3);
            throw null;
        }
        this.f208141a = str;
        this.f208142b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f208141a, nVar.f208141a) && this.f208142b == nVar.f208142b;
    }

    public final int hashCode() {
        String str = this.f208141a;
        return this.f208142b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public n(String str, j accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f208141a = str;
        this.f208142b = accountType;
    }
}

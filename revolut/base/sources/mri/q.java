package mri;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class q implements s {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f208144b = {yhm.j.c(yhm.k.PUBLICATION, new mq4.b(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f208145a;

    public /* synthetic */ q(int i, j jVar) {
        if (1 == (i & 1)) {
            this.f208145a = jVar;
        } else {
            j1.f(o.f208143a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f208145a == ((q) obj2).f208145a;
    }

    public final int hashCode() {
        return this.f208145a.hashCode();
    }

    public q(j accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f208145a = accountType;
    }
}

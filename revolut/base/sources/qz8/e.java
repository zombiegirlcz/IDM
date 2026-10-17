package qz8;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f250380b = {yhm.j.c(yhm.k.PUBLICATION, new qu1.d(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f250381a;

    public /* synthetic */ e(int i, d dVar) {
        if (1 == (i & 1)) {
            this.f250381a = dVar;
        } else {
            j1.f(a.f250379a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f250381a == ((e) obj2).f250381a;
    }

    public final int hashCode() {
        return this.f250381a.hashCode();
    }
}

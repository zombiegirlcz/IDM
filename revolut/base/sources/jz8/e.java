package jz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f179609b = {yhm.j.c(yhm.k.PUBLICATION, new jxi.a(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f179610a;

    public /* synthetic */ e(int i, d dVar) {
        if (1 == (i & 1)) {
            this.f179610a = dVar;
        } else {
            j1.f(a.f179604a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f179610a == ((e) obj2).f179610a;
    }

    public final int hashCode() {
        return this.f179610a.hashCode();
    }

    public e(d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f179610a = type;
    }
}

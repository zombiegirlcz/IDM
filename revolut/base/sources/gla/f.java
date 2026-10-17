package gla;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f144587b = {yhm.j.c(yhm.k.PUBLICATION, new gaa.b(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f144588a;

    public /* synthetic */ f(int i, Map map) {
        if (1 == (i & 1)) {
            this.f144588a = map;
        } else {
            j1.f(d.f144586a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f144588a, ((f) obj2).f144588a);
    }

    public final int hashCode() {
        return this.f144588a.hashCode();
    }
}

package iyd;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f169660c = {null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f169661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f169662b;

    public /* synthetic */ f(int i, i iVar, Set set) {
        if (3 != (i & 3)) {
            j1.f(d.f169656a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169661a = iVar;
        this.f169662b = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f169661a, fVar.f169661a) && Intrinsics.f(this.f169662b, fVar.f169662b);
    }

    public final int hashCode() {
        return this.f169662b.hashCode() + (this.f169661a.hashCode() * 31);
    }

    public f(i period, LinkedHashSet settings) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f169661a = period;
        this.f169662b = settings;
    }
}

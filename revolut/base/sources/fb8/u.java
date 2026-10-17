package fb8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f133526b = {yhm.j.c(yhm.k.PUBLICATION, new f2i.b(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb8.j f133527a;

    public /* synthetic */ u(int i, eb8.j jVar) {
        if (1 == (i & 1)) {
            this.f133527a = jVar;
        } else {
            j1.f(s.f133525a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f133527a == ((u) obj2).f133527a;
    }

    public final int hashCode() {
        return this.f133527a.hashCode();
    }

    public u(eb8.j migrateAssetsPermission) {
        Intrinsics.checkNotNullParameter(migrateAssetsPermission, "migrateAssetsPermission");
        this.f133527a = migrateAssetsPermission;
    }
}

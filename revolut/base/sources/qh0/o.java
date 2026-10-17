package qh0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f246405c = {null, yhm.j.c(yhm.k.PUBLICATION, new d(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f246407b;

    public /* synthetic */ o(int i, String str, j0 j0Var) {
        if (3 != (i & 3)) {
            j1.f(m.f246404a.getDescriptor(), i, 3);
            throw null;
        }
        this.f246406a = str;
        this.f246407b = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f246406a, oVar.f246406a) && this.f246407b == oVar.f246407b;
    }

    public final int hashCode() {
        return this.f246407b.hashCode() + (this.f246406a.hashCode() * 31);
    }

    public o(String id10, j0 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f246406a = id10;
        this.f246407b = type;
    }
}

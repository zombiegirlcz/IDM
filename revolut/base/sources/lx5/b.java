package lx5;

import iw5.i;
import iw5.j;
import org.jetbrains.annotations.NotNull;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.t1;
import vkm.u1;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f200527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f200528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f200529c;
    public final u1 d;
    public final t1 e;
    public final t1 f;

    public static final class a {
        private a() {
        }
    }

    public b() {
        j2 j2VarC = q.c(new i(0));
        this.f200527a = j2VarC;
        f fVar = f.DROP_OLDEST;
        z1 z1VarB = q.b(1, 1, fVar);
        this.f200528b = z1VarB;
        z1 z1VarB2 = q.b(1, 1, fVar);
        this.f200529c = z1VarB2;
        this.d = q.h(j2VarC);
        this.e = q.g(z1VarB);
        this.f = q.g(z1VarB2);
    }
}

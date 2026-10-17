package pd;

import ce.t;
import ce.v;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ce.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f235015b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f235016c = new c(1);
    public static final c d = new c(2);
    public static final c e = new c(3);
    public static final c f = new c(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235017a;

    public /* synthetic */ c(int i) {
        this.f235017a = i;
    }

    @Override // ce.f
    public Object m(v vVar) {
        switch (this.f235017a) {
            case 1:
                Object objD = vVar.d(new t(vd.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD);
            case 2:
                Object objD2 = vVar.d(new t(vd.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD2);
            case 3:
                Object objD3 = vVar.d(new t(vd.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD3);
            default:
                Object objD4 = vVar.d(new t(vd.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD4);
        }
    }
}

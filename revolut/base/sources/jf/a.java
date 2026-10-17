package jf;

import ce.f;
import ce.t;
import ce.v;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import vd.b;
import vd.c;
import vd.d;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f173622b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f173623c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173624a;

    public /* synthetic */ a(int i) {
        this.f173624a = i;
    }

    @Override // ce.f
    public final Object m(v vVar) {
        switch (this.f173624a) {
            case 0:
                Object objD = vVar.d(new t(vd.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD);
            case 1:
                Object objD2 = vVar.d(new t(c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD2);
            case 2:
                Object objD3 = vVar.d(new t(b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD3);
            default:
                Object objD4 = vVar.d(new t(d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return e0.r((Executor) objD4);
        }
    }
}

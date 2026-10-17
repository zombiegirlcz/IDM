package te8;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f270080a;

    public r(z juniorProductsInteractor) {
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        this.f270080a = juniorProductsInteractor;
    }

    public static Object a(r rVar, String str, gim.i iVar) {
        return vkm.q.x(mo3.a.e(rVar.b(str, null, w4l.h.f294642c), new f28.b0(str, 21), new tc6.b(10)), iVar);
    }

    public final akg.n b(String juniorId, String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(c(zhm.u.c(juniorId), loadingStrategy, str), new a(juniorId, 1));
    }

    public final akg.n c(Collection juniorIds, w4l.k loadingStrategy, String str) {
        Intrinsics.checkNotNullParameter(juniorIds, "juniorIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = 7;
        return nim.a.v(nim.a.v(rd0.e.b(this.f270080a.a(str, loadingStrategy instanceof w4l.i)), new td1.f(this, i)), new b2.a(juniorIds, i));
    }
}

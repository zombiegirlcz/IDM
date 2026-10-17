package te8;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f270083a;

    public v(z juniorProductsInteractor) {
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        this.f270083a = juniorProductsInteractor;
    }

    public final akg.n a(Collection juniorIds, w4l.k loadingStrategy, String str) {
        Intrinsics.checkNotNullParameter(juniorIds, "juniorIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = 8;
        return nim.a.v(rd0.e.b(nim.a.w(this.f270083a.a(str, loadingStrategy instanceof w4l.i), new td1.f(this, i))), new b2.a(juniorIds, i));
    }

    public final vkm.y b(String juniorId, String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.e(nim.a.v(a(zhm.u.c(juniorId), loadingStrategy, str), new a(juniorId, 2)), h0.f322473a, new pc2.d(3, 22, null));
    }
}

package amf;

import elf.s1;
import klf.h0;
import klf.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f6385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f6386c;

    public l(h0 commonDataSource, m1 juniorDataSource, s1 receiptsClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(receiptsClickHandler, "receiptsClickHandler");
        this.f6384a = commonDataSource;
        this.f6385b = juniorDataSource;
        this.f6386c = receiptsClickHandler;
    }

    public final cmf.k a(Function1 additionalFilter) {
        Intrinsics.checkNotNullParameter(additionalFilter, "additionalFilter");
        return new cmf.k(new a3i.i(q.q(new t38.e(this.f6384a.d(), 24, this.f6385b.a(), new k(this, additionalFilter, null, 0))), this, 20), u.c(this.f6386c), "UploadReceipt");
    }
}

package hje;

import au.c0;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f152723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f152724c;
    public final /* synthetic */ jf0.c d;

    public /* synthetic */ a(c cVar, boolean z, jf0.c cVar2, int i) {
        this.f152722a = i;
        this.f152723b = cVar;
        this.f152724c = z;
        this.d = cVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f152722a) {
            case 0:
                Boolean deeplinkHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkHandled, "deeplinkHandled");
                if (deeplinkHandled.booleanValue()) {
                    return d0.m(Boolean.TRUE);
                }
                c cVar = this.f152723b;
                d0 d0VarFirstOrError = cVar.f152729c.a().firstOrError();
                hae.k kVar = new hae.k(new a(cVar, this.f152724c, this.d, 1), 27);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, kVar, 0);
            default:
                ed5.c availability = (ed5.c) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                availability.getClass();
                if (!(availability instanceof ed5.a)) {
                    return d0.m(Boolean.TRUE);
                }
                return new ufm.i(w.o0(p0.f264003c, new c0(this.f152723b, this.d, this.f152724c, null, 7)), new hae.k(new hhd.n(8), 28), 1);
        }
    }
}

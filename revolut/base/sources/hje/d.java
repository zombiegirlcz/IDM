package hje;

import au.c0;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f152731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f152732c;
    public final /* synthetic */ jf0.c d;

    public /* synthetic */ d(g gVar, boolean z, jf0.c cVar, int i) {
        this.f152730a = i;
        this.f152731b = gVar;
        this.f152732c = z;
        this.d = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f152730a) {
            case 0:
                Boolean deeplinkHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkHandled, "deeplinkHandled");
                if (deeplinkHandled.booleanValue()) {
                    return d0.m(Boolean.TRUE);
                }
                g gVar = this.f152731b;
                d0 d0VarFirstOrError = gVar.f152739c.a().firstOrError();
                e eVar = new e(new d(gVar, this.f152732c, this.d, 1), 0);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, eVar, 0);
            default:
                ed5.c availability = (ed5.c) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                availability.getClass();
                if (!(availability instanceof ed5.a)) {
                    return d0.m(Boolean.TRUE);
                }
                return new ufm.i(w.o0(p0.f264003c, new c0(this.f152731b, this.d, this.f152732c, null, 8)), new e(new hhd.n(9), 1), 1);
        }
    }
}

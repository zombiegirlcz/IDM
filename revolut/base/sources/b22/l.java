package b22;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e60.m f11866b;

    public /* synthetic */ l(e60.m mVar, int i) {
        this.f11865a = i;
        this.f11866b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f11865a) {
            case 0:
                List files = d0.U(d0.E0(this.f11866b.f122862a, ((e) obj2).f11857a));
                Intrinsics.checkNotNullParameter(files, "files");
                return new e(files);
            default:
                return uyc.j.a((uyc.j) obj2, null, u.c(this.f11866b.b()), 23);
        }
    }
}

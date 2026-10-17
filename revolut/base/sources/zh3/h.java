package zh3;

import di3.l;
import di3.m;
import di3.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import zc0.b0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f322227b;

    public /* synthetic */ h(j jVar, int i) {
        this.f322226a = i;
        this.f322227b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f322226a) {
            case 0:
                n result = (n) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof m;
                j jVar = this.f322227b;
                if (z) {
                    return jVar.d.a(((m) result).f114893a);
                }
                if (result instanceof l) {
                    return jVar.f322231c.c0(((l) result).f114892a);
                }
                throw new NoWhenBranchMatchedException();
            default:
                rh3.a action = (rh3.a) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                kotlinx.coroutines.d dVar = p0.f264003c;
                j jVar2 = this.f322227b;
                pfm.a aVar = new pfm.a(w.o0(dVar, new zah.f(jVar2, action, null, 8)), new b0(new h(jVar2, 0), 27), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
        }
    }
}

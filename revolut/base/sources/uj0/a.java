package uj0;

import efm.i;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b80.c f280461b;

    public /* synthetic */ a(b80.c cVar, int i) {
        this.f280460a = i;
        this.f280461b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f280460a) {
            case 0:
                r it8 = (r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.switchMap(new uhl.b(new a(this.f280461b, 1), 12));
            case 1:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                b80.c cVar = this.f280461b;
                return w.W(error, cVar) ? w.c0(cVar).firstOrError().x() : r.error(error);
            default:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                b80.c cVar2 = this.f280461b;
                return w.W(error2, cVar2) ? w.c0(cVar2).firstOrError().v() : i.c(error2);
        }
    }
}

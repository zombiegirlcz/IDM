package usk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vrk.f f282985b;

    public /* synthetic */ f(vrk.f fVar, int i) {
        this.f282984a = i;
        this.f282985b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f282984a) {
            case 0:
                tsk.d update = (tsk.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return tsk.d.a(update, null, tsk.h.a(update.f274147b, null, this.f282985b, null, 5), 1);
            default:
                xsk.c update2 = (xsk.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xsk.c.a(update2, null, xsk.g.a(update2.f308555b, null, this.f282985b, null, 5), 1);
        }
    }
}

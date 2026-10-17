package usk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vrk.c f282983b;

    public /* synthetic */ e(vrk.c cVar, int i) {
        this.f282982a = i;
        this.f282983b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f282982a) {
            case 0:
                tsk.d update = (tsk.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return tsk.d.a(update, null, tsk.h.a(update.f274147b, null, null, this.f282983b, 3), 1);
            case 1:
                tsk.d update2 = (tsk.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return tsk.d.a(update2, null, tsk.h.a(update2.f274147b, null, null, this.f282983b, 3), 1);
            default:
                xsk.c update3 = (xsk.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xsk.c.a(update3, null, xsk.g.a(update3.f308555b, null, null, this.f282983b, 3), 1);
        }
    }
}

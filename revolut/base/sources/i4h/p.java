package i4h;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eel.c f158467b;

    public /* synthetic */ p(eel.c cVar, int i) {
        this.f158466a = i;
        this.f158467b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158466a) {
            case 0:
                e3h.c update = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e3h.c.a(update, null, null, null, null, null, null, this.f158467b, null, null, null, null, null, null, 4194239);
            case 1:
                return e3h.c.a((e3h.c) obj2, null, null, null, null, null, null, this.f158467b, null, null, null, null, null, null, 4194239);
            case 2:
                j4h.e updateState = (j4h.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j4h.e.a(updateState, null, null, this.f158467b, null, 47);
            default:
                q87.j jVar = (q87.j) obj2;
                eel.c cVar = this.f158467b;
                if (cVar == null) {
                    cVar = jVar.f;
                }
                return q87.j.a(jVar, null, null, null, null, null, cVar, null, null, null, 479);
        }
    }
}

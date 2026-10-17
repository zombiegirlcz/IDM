package doc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pdh.c f116516b;

    public /* synthetic */ r(pdh.c cVar, int i) {
        this.f116515a = i;
        this.f116516b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f116515a) {
            case 0:
                return j.a((j) obj2, null, null, null, this.f116516b, null, 23);
            case 1:
                g6f.b update = (g6f.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g6f.b.a(update, this.f116516b, null, null, 6);
            case 2:
                o6f.a update2 = (o6f.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return o6f.a.a(update2, this.f116516b, null, null, false, false, 62);
            default:
                v7f.a update3 = (v7f.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return v7f.a.a(update3, null, null, null, this.f116516b, false, 23);
        }
    }
}

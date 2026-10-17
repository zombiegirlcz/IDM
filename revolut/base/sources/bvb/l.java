package bvb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f18994b;

    public /* synthetic */ l(r rVar, int i) {
        this.f18993a = i;
        this.f18994b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18993a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, null, null, y.u(this.f18994b.o, "toString(...)"), false, false, null, 59);
            default:
                e update2 = (e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return e.a(update2, null, null, y.u(this.f18994b.o, "toString(...)"), false, false, null, 59);
        }
    }
}

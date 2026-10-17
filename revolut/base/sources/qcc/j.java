package qcc;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f244700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lk0.g f244701c;

    public /* synthetic */ j(String str, lk0.g gVar, int i) {
        this.f244699a = i;
        this.f244700b = str;
        this.f244701c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f244699a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, null, r0.q(update.f244691b, new Pair(this.f244700b, this.f244701c)), null, false, 13);
            default:
                scc.d update2 = (scc.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return scc.d.a(update2, r0.q(update2.f261701a, new Pair(this.f244700b, this.f244701c)), null, 6);
        }
    }
}

package yf1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qf1.c f313136b;

    public /* synthetic */ t(qf1.c cVar, int i) {
        this.f313135a = i;
        this.f313136b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f313135a) {
            case 0:
                m update = (m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                qf1.c cVar = this.f313136b;
                return m.a(update, null, null, null, cVar, cVar, null, 39);
            default:
                m update2 = (m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return m.a(update2, null, null, null, this.f313136b, null, null, 55);
        }
    }
}

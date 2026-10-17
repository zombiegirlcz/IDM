package oc3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ co3.a f224088b;

    public /* synthetic */ y(co3.a aVar, int i) {
        this.f224087a = i;
        this.f224088b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f224087a) {
            case 0:
                return h.a((h) obj2, false, null, null, null, false, false, null, this.f224088b, false, 383);
            default:
                wk2.k update = (wk2.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wk2.k.a(update, false, this.f224088b, false, false, false, 0, 0, 0, false, null, null, null, null, null, 16369);
        }
    }
}

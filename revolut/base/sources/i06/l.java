package i06;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f157300b;

    public /* synthetic */ l(i iVar, int i) {
        this.f157299a = i;
        this.f157300b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157299a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, false, null, false, this.f157300b, false, 23);
            default:
                g update2 = (g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g.a(update2, false, null, false, this.f157300b, false, 23);
        }
    }
}

package x03;

import ha3.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f301464b;

    public /* synthetic */ g(h hVar, int i) {
        this.f301463a = i;
        this.f301464b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String it8 = (String) obj2;
        switch (this.f301463a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((x) this.f301464b.f301466c).v(it8);
            default:
                Intrinsics.checkNotNullParameter(it8, "cardId");
                return this.f301464b.d.a(it8, false);
        }
    }
}

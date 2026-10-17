package d3g;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3g.b f111132b;

    public /* synthetic */ q(h3g.b bVar, int i) {
        this.f111131a = i;
        this.f111132b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zF;
        h3g.a it8 = (h3g.a) obj2;
        switch (this.f111131a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                zF = Intrinsics.f(this.f111132b.f149117a, it8.f149114a.b());
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                zF = Intrinsics.f(this.f111132b.f149117a, it8.f149114a.b());
                break;
        }
        return Boolean.valueOf(zF);
    }
}

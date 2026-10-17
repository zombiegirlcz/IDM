package oe1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd1.a f224518b;

    public /* synthetic */ k(dd1.a aVar, int i) {
        this.f224517a = i;
        this.f224518b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f224517a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, 0L, null, ((dd1.b) this.f224518b).f113084a, 0, null, LDSFile.EF_DG15_TAG);
            default:
                ye1.i update2 = (ye1.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ye1.i.a(update2, null, null, 0L, null, null, null, null, null, null, ((dd1.b) this.f224518b).f113084a.f60694a, false, 3071);
        }
    }
}

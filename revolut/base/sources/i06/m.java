package i06;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f157302b;

    public /* synthetic */ m(q qVar, int i) {
        this.f157301a = i;
        this.f157302b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157301a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, false, q.I2(((g) ((j2) this.f157302b.f157307r.f22677a).getValue()).f157291b), false, null, false, 29);
            default:
                g update2 = (g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ?? F1 = ((g) ((j2) this.f157302b.f157307r.f22677a).getValue()).f157291b;
                int size = 3 - F1.size();
                if (size > 0) {
                    F1 = d0.f1((Collection) F1);
                    for (int i = 0; i < size; i++) {
                        F1.add(0);
                    }
                }
                return g.a(update2, false, F1, true, null, false, 25);
        }
    }
}

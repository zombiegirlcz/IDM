package bk2;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f16230b;

    public /* synthetic */ f(j jVar, int i) {
        this.f16229a = i;
        this.f16230b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16229a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return yoj.b.p(this.f16230b.f.f((d) pair.f186385a, ((Boolean) pair.f186386b).booleanValue()));
            case 1:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "it");
                return (List) this.f16230b.f16238c.get("ATMS_KEY");
            default:
                d it8 = (d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f16230b.d.get("ATMS_NEARBY_KEY");
        }
    }
}

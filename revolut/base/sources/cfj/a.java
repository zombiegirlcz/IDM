package cfj;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w4l.i;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f23716b;

    public /* synthetic */ a(b bVar, int i) {
        this.f23715a = i;
        this.f23716b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f23715a) {
            case 0:
                if (!((Boolean) obj2).booleanValue()) {
                    return hb9.b.j(f0.f322471a);
                }
                b bVar = this.f23716b;
                return boh.f.e(u0.m(((efj.c) bVar.f23719c).b(), ((efj.d) bVar.d).b()), new a(bVar, 1));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                if (!zBooleanValue && !zBooleanValue2) {
                    return hb9.b.j(f0.f322471a);
                }
                g gVar = this.f23716b.f23717a;
                return rd0.e.n(boh.f.e(gVar.f23723a.b(i.f294643c), new ce9.a(gVar, 5)), h0.f322473a);
        }
    }
}

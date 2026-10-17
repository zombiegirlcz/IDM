package j2g;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3g.g f170884b;

    public /* synthetic */ q(o3g.g gVar, int i) {
        this.f170883a = i;
        this.f170884b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f170883a) {
            case 0:
                return h.a((h) obj2, this.f170884b.f221810a, null, null, null, null, null, null, 510);
            case 1:
                m3g.n updateState = (m3g.n) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return m3g.n.a(updateState, null, this.f170884b.f221810a, null, null, null, m3g.s.COLLAPSED, null, null, null, false, 989);
            default:
                s2g.j updateState2 = (s2g.j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return s2g.j.a(updateState2, f0.f322471a, null, new pyf.c(this.f170884b.f221810a), null, null, false, 56);
        }
    }
}

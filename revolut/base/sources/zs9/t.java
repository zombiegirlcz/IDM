package zs9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f324844b;

    public /* synthetic */ t(z zVar, int i) {
        this.f324843a = i;
        this.f324844b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        st9.b bVar;
        switch (this.f324843a) {
            case 0:
                p updateState = (p) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                int i = v.f324845a[((p) this.f324844b.t2()).f.ordinal()];
                if (i == 1) {
                    bVar = st9.b.SMART;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = st9.b.DUMB;
                }
                return p.a(updateState, null, null, null, null, bVar, false, 95);
            default:
                h1j.b bVar2 = (h1j.b) obj2;
                if (bVar2 instanceof h1j.c) {
                    this.f324844b.x2(new e77.j(bVar2, 4));
                }
                return Unit.f186387a;
        }
    }
}

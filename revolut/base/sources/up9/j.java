package up9;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f281931b;

    public /* synthetic */ j(l lVar, int i) {
        this.f281930a = i;
        this.f281931b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f281930a) {
            case 0:
                b updateState = (b) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return b.a(updateState, null, 0L, null, ((b) this.f281931b.t2()).f + 1, 95);
            case 1:
                b updateState2 = (b) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return b.a(updateState2, null, 0L, null, ((b) this.f281931b.t2()).f + 1, 95);
            case 2:
                h1j.b bVar = (h1j.b) obj2;
                l lVar = this.f281931b;
                lVar.x2(new j(lVar, 3));
                if (bVar instanceof h1j.c) {
                    lVar.x2(new e77.j(bVar, 3));
                }
                return Unit.f186387a;
            default:
                return b.a((b) obj2, null, 0L, null, ((b) this.f281931b.t2()).f + 1, 95);
        }
    }
}

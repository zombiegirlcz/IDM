package jt1;

import jsl.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f178294b;

    public /* synthetic */ q(z zVar, int i) {
        this.f178293a = i;
        this.f178294b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f178293a) {
            case 0:
                a updateState = (a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return a.a(updateState, null, null, ((a) this.f178294b.t2()).e + 1, 15);
            default:
                h1j.b output = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                jpl.e eVar = new jpl.e(26);
                z zVar = this.f178294b;
                zVar.x2(eVar);
                if (output instanceof h1j.d) {
                    zVar.l2(new t0(zVar, (h1j.d) output, null, 2), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}

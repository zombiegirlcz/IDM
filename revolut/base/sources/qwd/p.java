package qwd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.staking.impl.stake.v2.b f249874b;

    public /* synthetic */ p(com.revolut.feature.staking.impl.stake.v2.b bVar, int i) {
        this.f249873a = i;
        this.f249874b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f249873a) {
            case 0:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return vo9.a.a(this.f249874b.I, pocket, null, 6);
            default:
                g1j.b result = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = result.f139686a.f170617a;
                com.revolut.feature.staking.impl.stake.v2.b bVar = this.f249874b;
                Continuation continuation = null;
                int i = 6;
                bVar.n2(new qd8.e(bVar, str, (dj0.d) bVar.J.f(), continuation, 14), new whi.b(i));
                bVar.n2(new qd8.e(bVar, result, ((m) ((j2) bVar.K.f22677a).getValue()).f.f249861b.d, continuation, 12), new whi.b(i));
                return Unit.f186387a;
        }
    }
}

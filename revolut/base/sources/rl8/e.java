package rl8;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import r83.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        em8.a p0 = (em8.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b bVar = (com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b) this.receiver;
        bVar.getClass();
        if (p0 == null) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.l2(new g(bVar, p0, null, 24), new yi5.b(26));
        return Unit.f186387a;
    }
}

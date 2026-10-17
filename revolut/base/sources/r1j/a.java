package r1j;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import n1j.m;
import n1j.n;
import n1j.r;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static n a(m domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = domainState.d;
        r rVar = domainState.f211391c;
        return new n(clause, rVar != null ? rVar.f211399b : false);
    }
}

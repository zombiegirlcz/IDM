package f6f;

import cli.j;
import cli.n;
import cli.o;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        koi.j[] jVarArr = (koi.j[]) domainState.f132421a.f140919a.toArray(new koi.j[0]);
        return new c(v.k(Arrays.copyOf(jVarArr, jVarArr.length)));
    }
}

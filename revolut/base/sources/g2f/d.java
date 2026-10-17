package g2f;

import com.google.crypto.tink.shaded.protobuf.t1;
import e2f.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public final y a(e2f.n domainState, Function0 createLoadingState, Function2 createAgentDetailsContent) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(createLoadingState, "createLoadingState");
        Intrinsics.checkNotNullParameter(createAgentDetailsContent, "createAgentDetailsContent");
        return (y) iii.c.f(t1.t(domainState.f122075a, domainState.d), new b(createLoadingState), new g0c.h(21), new fyg.b(createAgentDetailsContent, domainState, this));
    }
}

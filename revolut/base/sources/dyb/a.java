package dyb;

import cu8.r0;
import dlk.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yi5.b;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0 f121090l;

    public a(r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f121090l = kycRequiredActionTransformer;
    }

    public final void Z2(Function1 onPassed) {
        Intrinsics.checkNotNullParameter(onPassed, "onPassed");
        V2(new k(this, onPassed, (Continuation) null), new b(29));
    }
}

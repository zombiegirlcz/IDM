package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.q implements Function1 {
    public static final p f = new p();

    public p() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        MatchResult p0 = (MatchResult) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.next();
    }
}

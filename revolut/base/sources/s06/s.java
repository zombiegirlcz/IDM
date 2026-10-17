package s06;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function1 {
    public static final s f = new s();

    public s() {
        super(1, t1.class, "regexTransferToSubaccountReplacement", "regexTransferToSubaccountReplacement(Lkotlin/text/MatchResult;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        MatchResult matchResult = (MatchResult) obj2;
        return a0.d.s("revolut://app/", (String) a10.b.n(matchResult, "p0", 2), "/pocket/", (String) matchResult.c().get(3));
    }
}

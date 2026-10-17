package s06;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.q implements Function1 {
    public static final t f = new t();

    public t() {
        super(1, t1.class, "regexSplitBillLinkReplacement", "regexSplitBillLinkReplacement(Lkotlin/text/MatchResult;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return j6.a.q("revolut://app/splitbill/", (String) a10.b.n((MatchResult) obj2, "p0", 2));
    }
}

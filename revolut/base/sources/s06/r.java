package s06;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.q implements Function1 {
    public static final r f = new r();

    public r() {
        super(1, t1.class, "regexPaymentGroupJoinUrlReplacement", "regexPaymentGroupJoinUrlReplacement(Lkotlin/text/MatchResult;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return p.a.p("revolut://app/groups/", (String) a10.b.n((MatchResult) obj2, "p0", 2), "/join");
    }
}

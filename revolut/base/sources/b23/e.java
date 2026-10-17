package b23;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import n33.o;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, o.class, "<init>", "<init>(Lcom/revolut/feature/cards_core/api/model/IssueVirtualCardResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        n93.h p0 = (n93.h) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new o(p0);
    }
}

package wf0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.q implements Function1 {
    public static final v f = new v();

    public v() {
        super(1, bg0.a.class, "toDomain", "toDomain(Lcom/revolut/core/faq/data/db/model/FaqDbEntry;)Lcom/revolut/core/model/faq/FaqEntry;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        zf0.b p0 = (zf0.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return bg0.a.a(p0);
    }
}

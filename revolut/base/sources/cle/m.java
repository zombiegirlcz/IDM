package cle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m extends q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, b.class, "<init>", "<init>(Lcom/revolut/feature/tab/invest/impl/domain/model/TradingBannerItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        vke.c p0 = (vke.c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new b(p0);
    }
}

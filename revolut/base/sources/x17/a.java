package x17;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a extends q implements Function2 {
    public static final a f = new a();

    public a() {
        super(2, dj0.d.class, "isLessOrEqualThan", "isLessOrEqualThan(Lcom/revolut/core/model/money/Money;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        dj0.d p0 = (dj0.d) obj2;
        dj0.d p17 = (dj0.d) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return Boolean.valueOf(p0.h(p17));
    }
}

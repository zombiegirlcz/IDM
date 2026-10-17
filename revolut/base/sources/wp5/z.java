package wp5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f299163a = new z();

    public z() {
        super(1, zi0.c.class, "toData", "toData(Ljava/lang/Object;ZLjava/lang/Throwable;)Lcom/revolut/data/model/Data;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b p0 = (xi0.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return zi0.c.P(p0, false, null, 3);
    }
}

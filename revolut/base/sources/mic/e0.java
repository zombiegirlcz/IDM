package mic;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f205656a = new e0();

    public e0() {
        super(1, zi0.c.class, "toData", "toData(Ljava/lang/Object;ZLjava/lang/Throwable;)Lcom/revolut/data/model/Data;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i p0 = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return zi0.c.P(p0, false, null, 3);
    }
}

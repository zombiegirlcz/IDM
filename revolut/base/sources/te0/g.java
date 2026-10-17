package te0;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.q implements Function3 {
    public static final g f = new g();

    public g() {
        super(3, m70.a.class, "put", "put(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Bundle p0 = (Bundle) obj2;
        String p17 = (String) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        m70.a.r(p0, p17, obj4);
        return Unit.f186387a;
    }
}

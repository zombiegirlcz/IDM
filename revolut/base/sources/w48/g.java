package w48;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u38.m;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f294526a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List pockets = (List) obj2;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        if (pockets.size() == 1) {
            return ((io3.d) d0.b0(pockets)).f163145a;
        }
        m.Companion.getClass();
        return m.e;
    }
}

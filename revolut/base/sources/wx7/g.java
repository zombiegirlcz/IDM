package wx7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f300776a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p it8 = (p) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8.getF53016n() instanceof c0);
    }
}

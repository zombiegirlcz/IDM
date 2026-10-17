package xnb;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f307360a = new o();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
    }
}

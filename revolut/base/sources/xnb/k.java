package xnb;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f307356a = new k();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 loadingItems = (Function0) obj2;
        Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
        return (List) loadingItems.invoke();
    }
}

package o25;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f221492a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 getDefaultLoadingItems = (Function0) obj2;
        Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
        return new zfe.c((List) getDefaultLoadingItems.invoke(), null);
    }
}

package k25;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f180335a = new k();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return new d((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)));
    }
}

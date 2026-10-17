package df5;

import com.revolut.data.model.Data;
import go.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f113791a = new d();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return new g(new Data(null, (Throwable) obj2, false, 5, null), 2);
    }
}

package df5;

import com.revolut.data.model.Data;
import go.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f113790a = new c();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
        return new g(new Data(null, null, true, 3, null), 2);
    }
}

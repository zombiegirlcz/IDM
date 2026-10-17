package d2i;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f110857a;

    public h(ImmutableMap exchangeProcessors) {
        Intrinsics.checkNotNullParameter(exchangeProcessors, "exchangeProcessors");
        this.f110857a = exchangeProcessors;
    }

    public final f a(String str) {
        Object obj2 = this.f110857a.get(str);
        if (obj2 != null) {
            return (f) obj2;
        }
        throw new IllegalArgumentException(p.a.p("No exchange processor for key ", str, " "));
    }
}

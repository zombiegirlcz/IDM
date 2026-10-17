package cd7;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand p0 = (NaviCommand) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((ln.a) this.receiver).a(p0);
    }
}

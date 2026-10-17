package plh;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l extends q implements Function1 {
    public static final l f = new l();

    public l() {
        super(1, of1.e.class, "<init>", "<init>(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand p0 = (NaviCommand) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new of1.e(p0);
    }
}

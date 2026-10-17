package zk9;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function2 {
    public static final a f = new a();

    public a() {
        super(2, com.revolut.retail.core.navigation.a.class, "plus", "plus(Lcom/revolut/retail/core/navigation/NaviCommand;Lcom/revolut/retail/core/navigation/NaviCommand;)Lcom/revolut/retail/core/navigation/NaviCommand;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        NaviCommand p0 = (NaviCommand) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return com.revolut.retail.core.navigation.a.c(p0, (NaviCommand) obj3);
    }
}

package vv1;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import wp4.j0;
import wug.k;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data aliasesData = (Data) obj2;
        Intrinsics.checkNotNullParameter(aliasesData, "p0");
        wv1.b bVar = (wv1.b) this.receiver;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(aliasesData, "aliasesData");
        return (List) iii.c.f(aliasesData, new wuk.c(8), new k(4), new j0(bVar, 7));
    }
}

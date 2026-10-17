package vv1;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import wp4.j0;
import wug.k;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data = (Data) obj2;
        Intrinsics.checkNotNullParameter(data, "p0");
        wv1.f fVar = (wv1.f) this.receiver;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return (List) iii.c.f(data, new wpj.b(fVar, 20), new k(6), new j0(fVar, 9));
    }
}

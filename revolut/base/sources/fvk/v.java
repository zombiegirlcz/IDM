package fvk;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qdf.c f138468b;

    public /* synthetic */ v(qdf.c cVar, int i) {
        this.f138467a = i;
        this.f138468b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f138467a) {
            case 0:
                return m.f((m) obj2, null, null, null, null, null, null, null, null, null, null, this.f138468b, null, null, null, null, null, null, null, null, null, 1047551);
            case 1:
                return mwk.i.f((mwk.i) obj2, null, this.f138468b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554429);
            default:
                qdf.c cVar = (qdf.c) obj2;
                if (cVar == null) {
                    return this.f138468b;
                }
                Data freeTradesLimit = cVar.f244952a;
                Intrinsics.checkNotNullParameter(freeTradesLimit, "freeTradesLimit");
                return new qdf.c(freeTradesLimit);
        }
    }
}

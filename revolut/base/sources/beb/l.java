package beb;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xdb.y f14743b;

    public /* synthetic */ l(xdb.y yVar, int i) {
        this.f14742a = i;
        this.f14743b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14742a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, new Data(this.f14743b, null, true, 2, null), null, null, false, 29);
            default:
                h update2 = (h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return h.a(update2, null, new Data(this.f14743b, null, true, 2, null), null, null, false, 29);
        }
    }
}

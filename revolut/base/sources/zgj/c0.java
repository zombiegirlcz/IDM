package zgj;

import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EsimUserPocket f322148b;

    public /* synthetic */ c0(EsimUserPocket esimUserPocket, int i) {
        this.f322147a = i;
        this.f322148b = esimUserPocket;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r update = (r) obj2;
        switch (this.f322147a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return r.a(update, null, zi0.c.P(this.f322148b, false, null, 3), null, null, null, null, null, null, null, null, null, null, null, null, null, 32765);
    }
}

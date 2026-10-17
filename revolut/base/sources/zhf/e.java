package zhf;

import com.revolut.data.model.Data;
import k71.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yrb.n;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f322408b;

    public /* synthetic */ e(g gVar, int i) {
        this.f322407a = i;
        this.f322408b = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f322407a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new h(this.f322408b.c3().f310974a);
            default:
                Data transactionData = (Data) obj2;
                q extraData = (q) obj3;
                Intrinsics.checkNotNullParameter(transactionData, "transactionData");
                Intrinsics.checkNotNullParameter(extraData, "extraData");
                g gVar = this.f322408b;
                return (k) iii.c.f(transactionData, new n(gVar, 3), new e(gVar, 0), new kg7.e(gVar, extraData, 3));
        }
    }
}

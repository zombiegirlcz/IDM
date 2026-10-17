package g06;

import i06.q;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139359a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wz5.a f139360b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139359a) {
            case 0:
                List rates = this.f139360b.f301368b;
                dj0.d cartAmount = ((e) obj2).f139353b;
                Intrinsics.checkNotNullParameter(rates, "rates");
                Intrinsics.checkNotNullParameter(cartAmount, "cartAmount");
                return new e(rates, cartAmount);
            default:
                i06.g gVar = (i06.g) obj2;
                wz5.a aVar = this.f139360b;
                return i06.g.a(gVar, aVar.f301367a, q.I2(aVar.f301368b), false, null, false, 28);
        }
    }

    public /* synthetic */ j(wz5.a aVar, q qVar) {
        this.f139360b = aVar;
    }
}

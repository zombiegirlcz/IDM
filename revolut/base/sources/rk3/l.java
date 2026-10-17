package rk3;

import cli.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.confirmation_code.ui.otp.a f254740b;

    public /* synthetic */ l(com.revolut.feature.confirmation_code.ui.otp.a aVar, int i) {
        this.f254739a = i;
        this.f254740b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f254739a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.confirmation_code.ui.otp.a aVar = this.f254740b;
                y yVar = aVar.v;
                nk3.a aVar2 = aVar.o.e.f65963c;
                int i = aVar2 == null ? -1 : m.f254741a[aVar2.ordinal()];
                boolean z = true;
                boolean z3 = false;
                if ((i == 1 || i == 2) && !((e) ((j2) yVar.f22677a).getValue()).f254732g) {
                    aVar.H2(yVar, new l(aVar, 1));
                    aVar.l2(new mt8.b(aVar, z3, null, 8), new yi5.b(26));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, null, 0L, false, null, this.f254740b.o.e.f65963c, 31);
        }
    }
}

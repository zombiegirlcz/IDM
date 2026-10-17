package xec;

import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b f304606b;

    public /* synthetic */ x(com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar, int i) {
        this.f304605a = i;
        this.f304606b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f304605a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = this.f304606b;
                bVar.f84755p.getClass();
                yji.l.a1(bVar, bVar.X1(rec.a.a()), null, null, new x64.b(bVar, null, 18), 3);
                return Boolean.TRUE;
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar2 = this.f304606b;
                bVar2.f84755p.getClass();
                bVar2.X1(rec.a.a());
                return Boolean.TRUE;
            default:
                return e.a((e) obj2, null, ((e) ((j2) this.f304606b.f84758s.f22677a).getValue()).f304582c, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
    }
}

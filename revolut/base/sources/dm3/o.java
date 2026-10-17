package dm3;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.contacts.impl.ui.contact.screen.details.a f115846b;

    public /* synthetic */ o(com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar, int i) {
        this.f115845a = i;
        this.f115846b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f115845a;
        com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar = this.f115846b;
        switch (i) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, null, null, null, null, null, false, null, false, !((e) ((j2) aVar.G.f22677a).getValue()).k, null, 3071);
            case 1:
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, eii.g.f126653a)) {
                    com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar2 = this.f115846b;
                    aVar2.l2(new cq6.k(aVar2, null, 23), new dkm.a(1, aVar2, com.revolut.feature.contacts.impl.ui.contact.screen.details.a.class, "handleContactSettingsError", "handleContactSettingsError(Ljava/lang/Throwable;)Z", 0, 2));
                }
                return Unit.f186387a;
            default:
                im3.d dVar = aVar.f66013x;
                el3.j output2 = (el3.j) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, el3.f.f127238a)) {
                    dVar.getClass();
                    aVar.X1(im3.d.a(true));
                } else if (Intrinsics.f(output2, el3.i.f127241a)) {
                    dVar.getClass();
                    aVar.X1(im3.d.a(false));
                } else if (output2 instanceof el3.h) {
                    aVar.I2(((el3.h) output2).f127240a);
                } else {
                    if (!Intrinsics.f(output2, el3.g.f127239a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
        }
    }
}

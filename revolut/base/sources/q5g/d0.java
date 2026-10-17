package q5g;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.checkout.b f242363b;

    public /* synthetic */ d0(com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar, int i) {
        this.f242362a = i;
        this.f242363b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f242362a) {
            case 0:
                this.f242363b.C2(w.f242395a);
                break;
            case 1:
                com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = this.f242363b;
                bVar.A = true;
                bVar.f93317y = null;
                Data bookingPreview = new Data(null, null, true, 3, null);
                h hVar = bVar.o;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(bookingPreview, "bookingPreview");
                hVar.f242373b.setValue(bookingPreview);
                hVar.e.a();
                j2 j2Var = hVar.d;
                od0.i.Companion.getClass();
                j2Var.getClass();
                j2Var.g(null, od0.i.f224256b);
                bVar.H2(bVar.B, new pvk.b(bookingPreview, 22));
                bVar.f93316x.a();
                break;
            default:
                this.f242363b.C2(w.f242395a);
                break;
        }
        return Unit.f186387a;
    }
}

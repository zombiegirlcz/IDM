package h0i;

import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.e;
import j0i.o;
import kotlin.jvm.internal.Intrinsics;
import mw5.l;
import nw5.j;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f148409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f148410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148411c;

    public b(a aVar, c cVar, int i) {
        this.f148409a = aVar;
        this.f148410b = cVar;
        this.f148411c = i;
    }

    @Override // phm.a
    public final Object get() {
        a aVar = this.f148409a;
        l lVar = aVar.f148406a;
        c cVar = this.f148410b;
        int i = this.f148411c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ViewController screen = cVar.f148413b;
            k0i.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new f01.c(screen.m2());
        }
        o oVar = new o(new ny5.e(), cVar.f148412a);
        CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData = cVar.f148412a;
        j jVarD = lVar.d();
        s.j(jVarD);
        tv5.b bVarC = aVar.f148407b.c();
        s.j(bVarC);
        f01.a aVar2 = (f01.a) cVar.f148414c.get();
        nw5.a aVarC = lVar.c();
        s.j(aVarC);
        sh5.d dVarF = aVar.f148408c.f();
        s.j(dVarF);
        return new com.revolut.feature_crypto_picker.impl.ui.picker.a(oVar, cryptoPickerInputData, jVarD, bVarC, aVar2, aVarC, dVarF);
    }
}

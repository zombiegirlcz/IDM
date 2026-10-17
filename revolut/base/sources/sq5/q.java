package sq5;

import cli.y;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends oki.h implements d {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoAddressHostingPickerContract$InputData f265014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sd5.c f265015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f265016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f265017s;

    public q(g mapper, CryptoAddressHostingPickerContract$InputData inputData, sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.o = mapper;
        this.f265014p = inputData;
        this.f265015q = cryptoConfigInteractor;
        this.f265016r = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        this.f265017s = mra.d.b(this, new c(0), mapper, null, false, 12);
    }

    public static final ArrayList I2(q qVar, List list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (d0.J(((a) obj2).f264996b, str, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // yji.l
    public final void T1(long j2) {
        efm.r rVarFilter = this.f265015q.a(false).filter(new sp5.h(10, new soi.a(11)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.b(m70.a.g(rVarFilter, null, null, 3)), null, new p(this, continuation, 1), 3);
        yji.l.b1(this, vkm.q.q(new qij.s(this.f265016r, 12)), null, new p(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f265017s;
    }
}

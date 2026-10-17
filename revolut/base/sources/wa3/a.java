package wa3;

import b93.k;
import efm.r;
import ha3.x;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import v0f.p;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ie.a f295795b;

    public /* synthetic */ a(int i, ie.a aVar) {
        this.f295794a = i;
        this.f295795b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f295794a) {
            case 0:
                List walletIdsOptional = (List) obj2;
                Intrinsics.checkNotNullParameter(walletIdsOptional, "walletIdsOptional");
                return ((x) ((l93.f) this.f295795b.f160499a)).w(d0.F0(null, walletIdsOptional), b93.d.ALL, false, k.VIRTUAL_FIRST);
            default:
                Boolean juniorFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (juniorFeatureEnabled.booleanValue()) {
                    return rd0.e.c(new p(new d73.i(((zf8.k) this.f295795b.e).c(null, w4l.h.f294642c), 1), 12), p0.f264003c);
                }
                r rVarJust = r.just(f0.f322471a);
                Intrinsics.h(rVarJust);
                return rVarJust;
        }
    }
}

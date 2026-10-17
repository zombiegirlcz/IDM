package bzg;

import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DisclaimerParams f20016b;

    public /* synthetic */ r(DisclaimerParams disclaimerParams, int i) {
        this.f20015a = i;
        this.f20016b = disclaimerParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20015a) {
            case 0:
                return k.a((k) obj2, null, null, null, null, this.f20016b, null, null, null, false, null, null, false, null, null, null, null, null, 2097023);
            case 1:
                return dyg.h.a((dyg.h) obj2, this.f20016b, null, null, null, null, 507);
            case 2:
                return gzg.n.a((gzg.n) obj2, null, this.f20016b, null, null, false, null, null, null, 8175);
            case 3:
                return iyg.a.a((iyg.a) obj2, null, null, null, false, this.f20016b, null, null, null, null, null, null, null, null, null, 16367);
            case 4:
                return nje.f.a((nje.f) obj2, null, null, null, this.f20016b, null, null, null, LDSFile.EF_SOD_TAG);
            case 5:
                return wyg.a.a((wyg.a) obj2, null, this.f20016b, null, null, null, null, null, null, null, 32751);
            default:
                zbj.q qVar = (zbj.q) obj2;
                DisclaimerParams disclaimerParams = this.f20016b;
                wi0.b bVar = disclaimerParams.f100020b;
                wi0.b.Companion.getClass();
                if (!Intrinsics.f(bVar, wi0.b.p0)) {
                    disclaimerParams = null;
                }
                return zbj.q.a(qVar, null, null, null, null, null, null, null, null, null, disclaimerParams, null, null, 15359);
        }
    }
}

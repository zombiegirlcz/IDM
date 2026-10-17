package ahf;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k71.q f5099b;

    public /* synthetic */ v(k71.q qVar, int i) {
        this.f5098a = i;
        this.f5099b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f5098a) {
            case 0:
                k71.q qVar = this.f5099b;
                Intrinsics.h(qVar);
                return l.a((l) obj2, null, null, null, false, null, null, null, 0, 0, qVar, 1023);
            case 1:
                k71.q qVar2 = this.f5099b;
                Intrinsics.h(qVar2);
                return dm3.e.a((dm3.e) obj2, null, null, null, null, null, false, null, false, false, qVar2, 2047);
            case 2:
                k71.q qVar3 = this.f5099b;
                Intrinsics.h(qVar3);
                return e8e.m.a((e8e.m) obj2, null, null, null, qVar3, 31);
            case 3:
                k71.q qVar4 = this.f5099b;
                Intrinsics.h(qVar4);
                return gs2.i.a((gs2.i) obj2, null, null, null, null, null, null, false, qVar4, CertificateBody.profileType);
            case 4:
                k71.q qVar5 = this.f5099b;
                Intrinsics.h(qVar5);
                return o7e.f.a((o7e.f) obj2, null, qVar5, 1);
            case 5:
                k71.q qVar6 = this.f5099b;
                Intrinsics.h(qVar6);
                return o83.f.a((o83.f) obj2, null, qVar6, 1);
            case 6:
                Set delistedVisiblePockets = (Set) obj2;
                Intrinsics.checkNotNullParameter(delistedVisiblePockets, "delistedVisiblePockets");
                return new Data(new Pair(this.f5099b, delistedVisiblePockets), null, false, 6, null);
            case 7:
                k71.q qVar7 = this.f5099b;
                Intrinsics.h(qVar7);
                return wp9.v.a((wp9.v) obj2, null, null, null, null, null, null, qVar7, CertificateBody.profileType);
            default:
                k71.q qVar8 = this.f5099b;
                Intrinsics.h(qVar8);
                return ygf.d.a((ygf.d) obj2, null, qVar8, 1);
        }
    }
}

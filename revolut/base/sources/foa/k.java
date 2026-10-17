package foa;

import com.revolut.domain.models.user.UserCompanyRegion;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l71.d f136873b;

    public /* synthetic */ k(l71.d dVar, int i) {
        this.f136872a = i;
        this.f136873b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f136872a) {
            case 0:
                return a.a((a) obj2, null, null, this.f136873b, 27);
            case 1:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, this.f136873b, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -2049, 63);
            default:
                tn6.f fVar = (tn6.f) obj2;
                l71.d dVar = this.f136873b;
                UserCompanyRegion userCompanyRegionA = dVar != null ? dVar.a() : null;
                fVar.getClass();
                return new tn6.f(userCompanyRegionA);
        }
    }
}

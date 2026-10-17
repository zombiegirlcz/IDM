package rz4;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import efm.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rsl.p;
import ryd.j;
import uz4.c;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cx3.a f258508b;

    public /* synthetic */ a(cx3.a aVar, int i) {
        this.f258507a = i;
        this.f258508b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258507a) {
            case 0:
                BackendFlow backendFlow = (BackendFlow) obj2;
                Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
                cx3.a aVar = this.f258508b;
                b bVar = (b) aVar.f109893c;
                String facilityId = (String) ((wp0.b) aVar.d).invoke();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                c cVar = bVar.f258509a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return cVar.e.g(facilityId, false).D(backendFlow);
            default:
                i it8 = (i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.p(new j(new p(it8, this.f258508b, 18), 10));
        }
    }
}

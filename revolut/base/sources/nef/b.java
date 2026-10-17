package nef;

import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lef.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f214504b;

    public /* synthetic */ b(d dVar, int i) {
        this.f214503a = i;
        this.f214504b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214503a) {
            case 0:
                pef.a params = (pef.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (gef.b) this.f214504b.f214506b.get(d.c(params));
            case 1:
                pef.a params2 = (pef.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                d dVar = this.f214504b;
                lef.c cVar = (lef.c) dVar.f214507c.T2(d.c(params2), lef.c.class);
                if (cVar != null) {
                    return dVar.d.l(cVar);
                }
                return null;
            case 2:
                lef.c dto = (lef.c) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return this.f214504b.d.l(dto);
            case 3:
                lef.a dto2 = (lef.a) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return this.f214504b.e.l(dto2);
            case 4:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return (gef.a) this.f214504b.f214506b.get(d.a(id10));
            case 5:
                String id11 = (String) obj2;
                Intrinsics.checkNotNullParameter(id11, "id");
                d dVar2 = this.f214504b;
                lef.a aVar = (lef.a) dVar2.f214507c.T2(d.a(id11), lef.a.class);
                if (aVar != null) {
                    return dVar2.e.l(aVar);
                }
                return null;
            case 6:
                String id12 = (String) obj2;
                Intrinsics.checkNotNullParameter(id12, "id");
                return (TransactionRecogniserDetails) this.f214504b.f214506b.get(d.b(id12));
            default:
                String id13 = (String) obj2;
                Intrinsics.checkNotNullParameter(id13, "id");
                f fVar = (f) this.f214504b.f214507c.T2(d.b(id13), f.class);
                if (fVar != null) {
                    return oef.b.a(fVar);
                }
                return null;
        }
    }
}

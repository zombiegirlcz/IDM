package d6l;

import efm.d0;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import qe0.s;
import ufm.i;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f111625b;

    public /* synthetic */ a(h hVar, int i) {
        this.f111624a = i;
        this.f111625b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f111624a) {
            case 0:
                ((Boolean) obj2).getClass();
                d0<List<z5l.e>> cardRequests = this.f111625b.f111637b.getCardRequests();
                d2i.a aVar = new d2i.a(new d6j.b(1), 18);
                cardRequests.getClass();
                return new i(cardRequests, aVar, 1);
            case 1:
                d params = (d) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                h hVar = this.f111625b;
                List list = (List) hVar.d.get(h.c(params));
                if (list != null) {
                    return hVar.e(list);
                }
                return null;
            case 2:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(null, "<this>");
                throw null;
            case 3:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 4:
                String cardRequestId = (String) obj2;
                Intrinsics.checkNotNullParameter(cardRequestId, "cardRequestId");
                z zVarD = ((e6l.a) this.f111625b.f.getValue()).deleteCardRequest(cardRequestId).D(Unit.f186387a);
                Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                return zVarD;
            case 5:
                c cVar = (c) obj2;
                Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                return this.f111625b.f111638c.approveRequest(cVar.f111628a, new z5l.a(cVar.f111629b));
            case 6:
                String requestId = (String) obj2;
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                return this.f111625b.f111638c.declineRequest(requestId);
            case 7:
                ((Boolean) obj2).getClass();
                h hVar2 = this.f111625b;
                List list2 = (List) hVar2.d.get("CACHE_KEY_REQUESTS");
                if (list2 != null) {
                    return hVar2.e(list2);
                }
                return null;
            case 8:
                s sVar = this.f111625b.f111640h;
                Unit unit = Unit.f186387a;
                sVar.f(unit);
                return unit;
            default:
                ((Boolean) obj2).getClass();
                ue0.c cVar2 = this.f111625b.e;
                Type CARD_REQUEST_TYPE = h.f111635m;
                Intrinsics.checkNotNullExpressionValue(CARD_REQUEST_TYPE, "CARD_REQUEST_TYPE");
                List list3 = (List) cVar2.T2("CACHE_KEY_REQUESTS", CARD_REQUEST_TYPE);
                if (list3 != null) {
                    return g4i.a.E(list3);
                }
                return null;
        }
    }
}

package zr8;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;
import ufm.i;
import w38.w;
import zr2.o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f324662b;

    public /* synthetic */ c(h hVar, int i) {
        this.f324661a = i;
        this.f324662b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f324661a) {
            case 0:
                a it8 = (a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f324662b.f324668c.get("JUNIOR_TRANSFER_REQUESTS_KEY");
            case 1:
                a param = (a) obj2;
                Intrinsics.checkNotNullParameter(param, "params");
                pr8.a aVar = this.f324662b.f324667b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(param, "param");
                ufm.c cVar = new ufm.c(new t(aVar, param, 28), 0);
                Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
                i iVar = new i(new i(cVar, new zmg.c(new o(1), 17), 1), new w(11, g.f324665a), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 2:
                String requestId = (String) obj2;
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                return this.f324662b.f324666a.approveTransferRequest(requestId);
            case 3:
                String requestId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(requestId2, "requestId");
                return this.f324662b.f324666a.rejectTransferRequest(requestId2);
            default:
                List list = (List) obj2;
                w4l.f fVar = this.f324662b.e;
                a aVar2 = new a();
                Intrinsics.h(list);
                fVar.j(aVar2, list);
                return Unit.f186387a;
        }
    }
}

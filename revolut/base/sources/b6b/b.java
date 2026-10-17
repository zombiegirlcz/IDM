package b6b;

import bjk.b2;
import bjk.c2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlinx.serialization.json.Json;
import w5b.p5;
import w5b.q5;
import w5b.r5;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Json f12566b;

    public /* synthetic */ b(Json json, int i) {
        this.f12565a = i;
        this.f12566b = json;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        rlm.f Json = (rlm.f) obj2;
        switch (this.f12565a) {
            case 0:
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.f fVar = new tlm.f();
                tlm.e module = this.f12566b.f187949b;
                Intrinsics.checkNotNullParameter(module, "module");
                module.a(fVar);
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                p0 p0Var = o0.f186429a;
                jt0.b bVar = new jt0.b(p0Var.b(r5.class));
                bVar.G0(p0Var.b(q5.class), q5.INSTANCE.serializer());
                bVar.G0(p0Var.b(p5.class), p5.INSTANCE.serializer());
                bVar.b0(new w29.a(27));
                bVar.O(fVar);
                tlm.d dVarA = fVar.a();
                Json.getClass();
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.getClass();
                Intrinsics.checkNotNullParameter("type", "<set-?>");
                Json.f = "type";
                Json.f255101c = true;
                tlm.f fVar2 = new tlm.f();
                tlm.e module2 = this.f12566b.f187949b;
                Intrinsics.checkNotNullParameter(module2, "module");
                module2.a(fVar2);
                Intrinsics.checkNotNullParameter(fVar2, "<this>");
                p0 p0Var2 = o0.f186429a;
                jt0.b bVar2 = new jt0.b(p0Var2.b(xga.a0.class));
                bVar2.G0(p0Var2.b(xga.z.class), xga.z.INSTANCE.serializer());
                bVar2.G0(p0Var2.b(xga.y.class), xga.y.INSTANCE.serializer());
                bVar2.b0(new xd2.n(18));
                bVar2.O(fVar2);
                tlm.d dVarA2 = fVar2.a();
                Intrinsics.checkNotNullParameter(dVarA2, "<set-?>");
                Json.f255103h = dVarA2;
                break;
            default:
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.f fVar3 = new tlm.f();
                tlm.e module3 = this.f12566b.f187949b;
                Intrinsics.checkNotNullParameter(module3, "module");
                module3.a(fVar3);
                fVar3.f(o0.f186429a.b(b2.class), c2.f15705a);
                tlm.d dVarA3 = fVar3.a();
                Json.getClass();
                Intrinsics.checkNotNullParameter(dVarA3, "<set-?>");
                Json.f255103h = dVarA3;
                break;
        }
        return Unit.f186387a;
    }
}

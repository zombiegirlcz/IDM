package gcc;

import efm.r;
import ehe.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import w4l.h;
import w4l.i;
import w4l.k;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f142396b;

    public /* synthetic */ b(g gVar, int i) {
        this.f142395a = i;
        this.f142396b = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f142395a) {
            case 0:
                String id10 = (String) obj2;
                List instructions = (List) obj3;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(instructions, "instructions");
                n.z("PROMOTED_MERCHANTS_CLAIM_INSTRUCTIONS_KEY_", id10, this.f142396b.f142402b, instructions);
                return Unit.f186387a;
            case 1:
                ((Boolean) obj2).booleanValue();
                List merchants = (List) obj3;
                Intrinsics.checkNotNullParameter(merchants, "merchants");
                this.f142396b.f142402b.f("PROMOTED_MERCHANTS_CATEGORIES_KEY", merchants);
                return Unit.f186387a;
            case 2:
                ucc.g params = (ucc.g) obj2;
                List merchants2 = (List) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(merchants2, "merchants");
                this.f142396b.f142403c.d(params, merchants2);
                return Unit.f186387a;
            default:
                ucc.g params2 = (ucc.g) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(params2, "params");
                k loadingStrategy = zBooleanValue ? i.f294643c : h.f294642c;
                g gVar = this.f142396b;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                r rVarC = rd0.e.c(gVar.f.b(params2, loadingStrategy), kotlin.coroutines.g.f186406a);
                k9h.d mapData = new k9h.d(26);
                Intrinsics.checkNotNullParameter(rVarC, "<this>");
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(mapData, "mapData");
                r map = nim.a.w(rVarC, new laj.b(mapData, 29)).map(new v(14, new lk0.b(params2, 1)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
        }
    }
}

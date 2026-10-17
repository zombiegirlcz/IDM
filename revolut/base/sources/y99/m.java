package y99;

import eo3.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f311787b;

    public /* synthetic */ m(o oVar, int i) {
        this.f311786a = i;
        this.f311787b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object hVar;
        String str;
        switch (this.f311786a) {
            case 0:
                Integer currentPosition = (Integer) obj2;
                Intrinsics.checkNotNullParameter(currentPosition, "currentPosition");
                return currentPosition.intValue() != 0 ? ((g0) this.f311787b.f).w0().b(Integer.valueOf(currentPosition.intValue() - 1)).ignoreElements() : pfm.m.f235744a;
            case 1:
                String email = (String) obj2;
                Intrinsics.checkNotNullParameter(email, "email");
                o oVar = this.f311787b;
                pfm.z zVarD = ylg.b.c(oVar.f311791g, zhm.u.c(new a.b(null, email, LDSFile.EF_DG15_TAG))).h(sjg.a.b(oVar.i)).D(Unit.f186387a);
                Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                return zVarD;
            case 2:
                m89.a it8 = (m89.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i = n.f311788a[it8.ordinal()];
                o oVar2 = this.f311787b;
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                        hVar = new pfm.h(new l(oVar2, 0), 2);
                        break;
                    case 4:
                        String str2 = (String) te0.w.O(((g0) oVar2.f).A0());
                        str = str2 != null ? str2 : "";
                        wi0.b.Companion.getClass();
                        return oVar2.m3(str, wi0.b.f297770q3);
                    case 5:
                        String str3 = (String) te0.w.O(((g0) oVar2.f).y0());
                        str = str3 != null ? str3 : "";
                        wi0.b.Companion.getClass();
                        return oVar2.m3(str, wi0.b.f297781v1);
                    case 6:
                        String str4 = (String) te0.w.O(((g0) oVar2.f).x0());
                        if (str4 != null) {
                            return oVar2.k.c(str4);
                        }
                        hVar = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(hVar, "complete(...)");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return hVar;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                int iIntValue = ((Number) pair.f186385a).intValue();
                return iIntValue != zhm.v.j((List) pair.f186386b) ? ((g0) this.f311787b.f).w0().b(Integer.valueOf(iIntValue + 1)).ignoreElements() : pfm.m.f235744a;
        }
    }
}

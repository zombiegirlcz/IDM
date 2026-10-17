package o4a;

import aqd.o1;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentData;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocuments;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import neg.q;
import nvg.b0;
import nzj.n;
import o55.a0;
import o55.d0;
import o55.t;
import p35.e0;
import q35.z;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f222183b;

    public /* synthetic */ e(int i, Function1 function1) {
        this.f222182a = i;
        this.f222183b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f222182a) {
            case 2:
                ((b0) this.f222183b).invoke(obj2);
                break;
            default:
                ((t) this.f222183b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f222182a) {
            case 0:
                o3k.a aVar = (o3k.a) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar.invoke(p0);
            case 1:
                o1 o1Var = (o1) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) o1Var.invoke(p0);
            case 2:
            case 14:
            default:
                a0 a0Var = (a0) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) a0Var.invoke(p0);
            case 3:
                o2g.f fVar = (o2g.f) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) fVar.invoke(p0);
            case 4:
                o2g.f fVar2 = (o2g.f) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) fVar2.invoke(p0);
            case 5:
                o54.a aVar2 = (o54.a) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar2.invoke(p0);
            case 6:
                o5.b bVar = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar.invoke(p0);
            case 7:
                o3k.a aVar3 = (o3k.a) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (AutoPayRepaymentData) aVar3.invoke(p0);
            case 8:
                n nVar = (n) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (z) nVar.invoke(p0);
            case 9:
                o5.b bVar2 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar2.invoke(p0);
            case 10:
                o5.b bVar3 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LoanRepaymentTerms) bVar3.invoke(p0);
            case 11:
                o5.b bVar4 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar4.invoke(p0);
            case 12:
                o5.b bVar5 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar5.invoke(p0);
            case 13:
                t tVar = (t) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) tVar.invoke(p0);
            case 15:
                o5.b bVar6 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar6.invoke(p0);
            case 16:
                o5.b bVar7 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar7.invoke(p0);
            case 17:
                q qVar = (q) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) qVar.invoke(p0);
            case 18:
                o54.a aVar4 = (o54.a) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LoanDocuments) aVar4.invoke(p0);
            case 19:
                o54.a aVar5 = (o54.a) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ux4.b) aVar5.invoke(p0);
            case 20:
                o54.a aVar6 = (o54.a) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ux4.b) aVar6.invoke(p0);
            case 21:
                o54.a aVar7 = (o54.a) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (bk4.b) aVar7.invoke(p0);
            case 22:
                o5.b bVar8 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LoanRepaymentDayChangeTerms) bVar8.invoke(p0);
            case 23:
                o55.b0 b0Var = (o55.b0) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e0) b0Var.invoke(p0);
            case 24:
                o55.b0 b0Var2 = (o55.b0) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) b0Var2.invoke(p0);
            case 25:
                o5.b bVar9 = (o5.b) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar9.invoke(p0);
            case 26:
                a0 a0Var2 = (a0) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) a0Var2.invoke(p0);
            case 27:
                d0 d0Var = (d0) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) d0Var.invoke(p0);
            case 28:
                d0 d0Var2 = (d0) this.f222183b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) d0Var2.invoke(p0);
        }
    }
}

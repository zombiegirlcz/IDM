package vdl;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class s implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f288041b;

    public /* synthetic */ s(int i, Function1 function1) {
        this.f288040a = i;
        this.f288041b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f288040a) {
            case 4:
                ((v73.c) this.f288041b).invoke(obj2);
                break;
            case 11:
                ((u0) this.f288041b).invoke(obj2);
                break;
            default:
                ((a) this.f288041b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f288040a) {
            case 0:
                vch.h0 h0Var = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) h0Var.invoke(p0);
            case 1:
                vch.h0 h0Var2 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) h0Var2.invoke(p0);
            case 2:
                vch.h0 h0Var3 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) h0Var3.invoke(p0);
            case 3:
                a aVar = (a) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (nel.n) aVar.invoke(p0);
            case 4:
            case 11:
            default:
                vea.n nVar = (vea.n) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) nVar.invoke(p0);
            case 5:
                vch.h0 h0Var4 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) h0Var4.invoke(p0);
            case 6:
                vch.h0 h0Var5 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efl.d) h0Var5.invoke(p0);
            case 7:
                a aVar2 = (a) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kel.g) aVar2.invoke(p0);
            case 8:
                vch.h0 h0Var6 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wel.e) h0Var6.invoke(p0);
            case 9:
                vch.h0 h0Var7 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (StockBuyBlock) h0Var7.invoke(p0);
            case 10:
                v73.c cVar = (v73.c) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) cVar.invoke(p0);
            case 12:
                vch.h0 h0Var8 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) h0Var8.invoke(p0);
            case 13:
                vch.h0 h0Var9 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) h0Var9.invoke(p0);
            case 14:
                vch.h0 h0Var10 = (vch.h0) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) h0Var10.invoke(p0);
            case 15:
                a aVar3 = (a) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) aVar3.invoke(p0);
            case 16:
                c18.c cVar2 = (c18.c) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar2.invoke(p0);
            case 17:
                sc7.b bVar = (sc7.b) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) bVar.invoke(p0);
            case 18:
                vea.c cVar3 = (vea.c) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) cVar3.invoke(p0);
            case 19:
                vea.c cVar4 = (vea.c) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) cVar4.invoke(p0);
            case 20:
                atg.q qVar = (atg.q) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (o97.x) qVar.invoke(p0);
            case 21:
                uyh.w wVar = (uyh.w) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) wVar.invoke(p0);
            case 22:
                vea.c cVar5 = (vea.c) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) cVar5.invoke(p0);
            case 23:
                atg.q qVar2 = (atg.q) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (o97.x) qVar2.invoke(p0);
            case 24:
                b6.a aVar4 = (b6.a) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar4.invoke(p0);
            case 25:
                eye.d dVar = (eye.d) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ProductAccountDescriptor$Value.Main) dVar.invoke(p0);
            case 26:
                vea.p pVar = (vea.p) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) pVar.invoke(p0);
            case 27:
                vea.n nVar2 = (vea.n) this.f288041b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) nVar2.invoke(p0);
        }
    }
}

package bjg;

import beg.k;
import ble.z;
import blh.c0;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements o, g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f15665b;

    public /* synthetic */ d(int i, Function1 function1) {
        this.f15664a = i;
        this.f15665b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f15664a) {
            case 1:
                ((c) this.f15665b).invoke(obj2);
                break;
            case 2:
                ((c) this.f15665b).invoke(obj2);
                break;
            default:
                ((c) this.f15665b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f15664a) {
            case 0:
                c cVar = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TrustedMerchant) cVar.invoke(p0);
            case 1:
            case 2:
            case 3:
            case 15:
            case 16:
            default:
                beb.p pVar = (beb.p) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) pVar.invoke(p0);
            case 4:
                c cVar2 = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar2.invoke(p0);
            case 5:
                c cVar3 = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar3.invoke(p0);
            case 6:
                bk2.f fVar = (bk2.f) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar.invoke(p0);
            case 7:
                bk3.a aVar = (bk3.a) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 8:
                bk3.a aVar2 = (bk3.a) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                aVar2.invoke(p0);
                return Boolean.TRUE;
            case 9:
                c cVar4 = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar4.invoke(p0);
            case 10:
                c cVar5 = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar5.invoke(p0);
            case 11:
                c cVar6 = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar6.invoke(p0);
            case 12:
                bke.b bVar = (bke.b) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar.invoke(p0);
            case 13:
                c cVar7 = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar7.invoke(p0);
            case 14:
                c cVar8 = (c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar8.invoke(p0);
            case 17:
                z zVar = (z) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) zVar.invoke(p0);
            case 18:
                z zVar2 = (z) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) zVar2.invoke(p0);
            case 19:
                k kVar = (k) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar.invoke(p0);
            case 20:
                z zVar3 = (z) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) zVar3.invoke(p0);
            case 21:
                blh.k kVar2 = (blh.k) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar2.invoke(p0);
            case 22:
                b4d.c cVar9 = (b4d.c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar9.invoke(p0);
            case 23:
                z zVar4 = (z) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) zVar4.invoke(p0);
            case 24:
                k kVar3 = (k) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar3.invoke(p0);
            case 25:
                bhl.g gVar = (bhl.g) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) gVar.invoke(p0);
            case 26:
                z zVar5 = (z) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) zVar5.invoke(p0);
            case 27:
                b4d.c cVar10 = (b4d.c) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar10.invoke(p0);
            case 28:
                c0 c0Var = (c0) this.f15665b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) c0Var.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f15664a;
        c cVar = (c) this.f15665b;
        switch (i) {
            case 15:
                KProperty[] kPropertyArr = TabInvestController.l0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                cVar.invoke(p0);
                break;
            default:
                KProperty[] kPropertyArr2 = TabInvestController.l0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                cVar.invoke(p0);
                break;
        }
        return Boolean.TRUE.booleanValue();
    }
}

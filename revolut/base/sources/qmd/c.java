package qmd;

import aqd.n1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.n;
import java.util.List;
import java.util.Map;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qp5.k;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f247806b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f247805a = i;
        this.f247806b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f247805a) {
            case 23:
                ((qpb.i) this.f247806b).invoke(obj2);
                break;
            case 24:
            case 25:
            default:
                ((qri.a) this.f247806b).invoke(obj2);
                break;
            case 26:
                ((qri.a) this.f247806b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f247805a) {
            case 0:
                q2k.b bVar = (q2k.b) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar.invoke(p0);
            case 1:
                qce.a aVar = (qce.a) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) aVar.invoke(p0);
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 11:
            case 23:
            case 26:
            default:
                qri.a aVar2 = (qri.a) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar2.invoke(p0);
            case 6:
                k kVar = (k) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) kVar.invoke(p0);
            case 7:
                qgf.o oVar = (qgf.o) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Clause) oVar.invoke(p0);
            case 8:
                k kVar2 = (k) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) kVar2.invoke(p0);
            case 10:
                qnd.c cVar = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar.invoke(p0);
            case 12:
                k kVar3 = (k) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) kVar3.invoke(p0);
            case 13:
                qnd.c cVar2 = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar2.invoke(p0);
            case 14:
                k kVar4 = (k) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar4.invoke(p0);
            case 15:
                qnd.c cVar3 = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar3.invoke(p0);
            case 16:
                qpf.a aVar3 = (qpf.a) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar3.invoke(p0);
            case 17:
                qpf.a aVar4 = (qpf.a) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar4.invoke(p0);
            case 18:
                qpb.i iVar = (qpb.i) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                iVar.invoke(p0);
                return Boolean.TRUE;
            case 19:
                qpb.i iVar2 = (qpb.i) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a3) iVar2.invoke(p0);
            case 20:
                qpb.a aVar5 = (qpb.a) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar5.invoke(p0);
            case 21:
                qpb.i iVar3 = (qpb.i) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                iVar3.invoke(p0);
                return Boolean.TRUE;
            case 22:
                qpf.i iVar4 = (qpf.i) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                iVar4.invoke(p0);
                return Boolean.TRUE;
            case 24:
                n1 n1Var = (n1) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) n1Var.invoke(p0);
            case 25:
                qri.a aVar6 = (qri.a) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) aVar6.invoke(p0);
            case 27:
                qri.a aVar7 = (qri.a) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) aVar7.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f247805a) {
            case 2:
                qnd.c cVar = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar.invoke(p0)).booleanValue();
            case 3:
                qnd.c cVar2 = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar2.invoke(p0)).booleanValue();
            case 4:
                qnd.c cVar3 = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar3.invoke(p0)).booleanValue();
            case 5:
                qnd.c cVar4 = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar4.invoke(p0)).booleanValue();
            case 6:
            case 7:
            case 8:
            default:
                qnd.c cVar5 = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar5.invoke(p0)).booleanValue();
            case 9:
                qnd.c cVar6 = (qnd.c) this.f247806b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar6.invoke(p0)).booleanValue();
        }
    }
}

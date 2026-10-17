package eii;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f126663a;

    public q(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f126663a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.o model;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        c cVar = this.f126663a;
        lw0.m mVar = cVar.f126647a;
        aw0.i iVar = cVar.f126648b;
        List list = cVar.f126649c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        boolean z = false;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            m mVar2 = (m) obj2;
            String strN = a0.d.n("ROW_ACTION_LIST_ID_", i);
            if (mVar2 instanceof a) {
                model = AccountCellItemDelegate.Model.e(((a) mVar2).f126645a, strN, null, null, 4194302);
            } else if (mVar2 instanceof b) {
                model = CellDetailsDelegate.Model.e(((b) mVar2).f126646a, strN, null, z, 67108862);
            } else {
                if (!(mVar2 instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                l lVar = (l) mVar2;
                model = new RowDelegate.Model(strN, lVar.f126659c, lVar.f126657a, null, 0, lVar.f126658b, null, null, lVar.d, lVar.f126660g, lVar.e, null, lVar.f, lVar.f126661h, null, null, null, null, null, lVar.i, null, 0, 0, 0, 0, 532648664);
            }
            arrayList.add(model);
            i = i2;
            z = false;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(iVar, arrayList, mVar);
    }
}

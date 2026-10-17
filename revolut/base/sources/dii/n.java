package dii;

import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.ck0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f115074a;

    public n(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f115074a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listA;
        List list;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a aVar = this.f115074a;
        lw0.a aVar2 = aVar.f115062a;
        aw0.i iVar = aVar.f115063b;
        j jVar2 = aVar.e;
        if (jVar2 == null) {
            list = f0.f322471a;
        } else {
            int i = 0;
            if (jVar2 instanceof i) {
                listA = u.c(new TextDelegate.Model("LIST_ID_TEXT", ((i) jVar2).f115071a, false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
            } else {
                if (!(jVar2 instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                CellDetailsStandaloneNoteDelegate.Model.Companion companion = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
                ArrayList arrayList = ((h) jVar2).f115070a;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList2.add(CellDetailsStandaloneNoteDelegate.Model.Companion.b(CellDetailsStandaloneNoteDelegate.Model.INSTANCE, "ID_BULLET_ITEM_" + i, (Clause) obj2));
                    i = i2;
                }
                companion.getClass();
                listA = CellDetailsStandaloneNoteDelegate.Model.Companion.a(arrayList2);
            }
            List list2 = listA;
            yp0.b.k(list2, 0, 0, 0, 0, 31);
            list = list2;
        }
        return new cii.b(iVar, list, aVar2);
    }
}

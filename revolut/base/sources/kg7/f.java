package kg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import hy1.b0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf7.i1;
import jf7.j1;
import jf7.l1;
import ke7.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import thf.g;
import tof.s9;
import vkm.y;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements xf7.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f183929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f183930b;

    public f(whf.b transactionsListContentProvider, xf7.a commonMapper, g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f183929a = transactionsListContentProvider;
        this.f183930b = transactionsItemMapper;
    }

    public static final ArrayList b(f fVar, j1 j1Var) {
        String str = j1Var.f173685a;
        ListSubheaderDelegate.Model modelA = xf7.a.a(j6.a.q("TRANSACTIONS_LOADING_TITLE_LIST_ID_", str), new TextClause(j1Var.f173685a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null);
        IntRange intRange = new IntRange(0, 2, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0("TRANSACTIONS_LOADING_ITEM_LIST_ID_" + str + it8.nextInt()));
        }
        return yp0.b.g(arrayList, modelA, null, 0, 0, 126);
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        j1 block = (j1) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        List list = block.f173686b;
        if (list.isEmpty()) {
            return new go.g(f0.f322471a, 2);
        }
        List listV0 = d0.V0(list, 3);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((i1) it8.next()).f173682a);
        }
        return new y(new k0g.b(this, block, (Continuation) null, 21), new b0(rd0.e.b(nim.a.w(whf.b.a(this.f183929a, te0.w.h(new s9(d0.i1(arrayList))), null, null, null, 14), new v(block, 3))), this, block, 11));
    }
}

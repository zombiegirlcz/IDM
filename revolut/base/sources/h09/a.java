package h09;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C0855a Companion = new C0855a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextClause f148330a = new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextClause f148331b = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: h09.a$a, reason: collision with other inner class name */
    public static final class C0855a {
        private C0855a() {
        }
    }

    public static Clause a(u09.e item, int i) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (i > 5) {
            return f148331b;
        }
        if (item instanceof u09.b) {
            u09.b bVar = (u09.b) item;
            ArrayList arrayList = bVar.f276100a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(a((u09.e) it8.next(), i + 1));
            }
            return new CompositeClause(arrayList2, null, new Click(28, (Integer) null, (Object) item, bVar.f276101b, false), null, 10);
        }
        if (!(item instanceof u09.c)) {
            if (item instanceof u09.d) {
                return new TextClause(((u09.d) item).f276105a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = ((u09.c) item).f276104a;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        int i2 = 0;
        for (Object obj2 : arrayList3) {
            int i3 = i2 + 1;
            TextClause textClause = null;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            u09.e eVar = (u09.e) obj2;
            Clause clauseA = a(eVar, i + 1);
            TextClause textClause2 = eVar instanceof u09.c ? f148330a : null;
            if (i2 < v.j(arrayList3)) {
                textClause = textClause2;
            }
            Clause[] elements = {clauseA, textClause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            arrayList4.add(kotlin.collections.d.L(elements));
            i2 = i3;
        }
        return new CompositeClause(w.u(arrayList4), null, null, null, 14);
    }
}

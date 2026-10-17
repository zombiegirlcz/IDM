package to7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends c {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f272546a;

    public s(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f272546a = dateProvider;
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new t(Integer.parseInt((String) zhm.d0.a0(ids)));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        IntRange intRange = new IntRange(((Integer) obj2).intValue(), c.f(this.f272546a), 1);
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        List listP0 = zhm.d0.P0(intRange, cim.b.h());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add(c.g(String.valueOf(((Number) it8.next()).intValue())));
        }
        return zi0.c.j(arrayList);
    }
}

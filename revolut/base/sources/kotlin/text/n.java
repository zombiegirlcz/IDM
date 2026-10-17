package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends zhm.a implements Collection, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f187918a;

    public n(o oVar) {
        this.f187918a = oVar;
    }

    public final MatchGroup a(int i) {
        o oVar = this.f187918a;
        Matcher matcher = oVar.f187919a;
        IntRange intRangeO = kotlin.ranges.f.o(matcher.start(i), matcher.end(i));
        if (intRangeO.f186448a < 0) {
            return null;
        }
        String strGroup = oVar.f187919a.group(i);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeO);
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj2) {
        if (obj2 == null ? true : obj2 instanceof MatchGroup) {
            return super.contains((MatchGroup) obj2);
        }
        return false;
    }

    @Override // zhm.a
    public final int getSize() {
        return this.f187918a.f187919a.groupCount() + 1;
    }

    @Override // zhm.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nkm.c0(nkm.y.x(zhm.d0.Q(zhm.v.i(this)), new kog.k(this, 3)));
    }
}

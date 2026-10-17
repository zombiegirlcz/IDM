package dv5;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import qua.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        DateTime dateTimeNow = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
        Boolean boolValueOf = Boolean.valueOf(u.i((qua.p) obj3, dateTimeNow));
        DateTime dateTimeNow2 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(dateTimeNow2, "now(...)");
        return cim.b.b(boolValueOf, Boolean.valueOf(u.i((qua.p) obj2, dateTimeNow2)));
    }
}

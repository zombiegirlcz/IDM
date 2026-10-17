package fbm;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import uam.g;
import uam.i;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends u implements Function1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f133561h;
    public static final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f133562j;
    public static final b k;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        f133561h = new b(i2, 0);
        i = new b(i2, 1);
        f133562j = new b(i2, 2);
        k = new b(i2, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f) {
            case 0:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.f278696b == it8.f278695a);
            case 1:
                g it9 = (g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!(it9.f278696b == it9.f278695a));
            case 2:
                Iterable iterable = (Iterable) obj2;
                Intrinsics.checkNotNullParameter(iterable, "$this$null");
                return (g) d0.t0(iterable, gbm.a.f142274a);
            default:
                Iterable iterable2 = (Iterable) obj2;
                Intrinsics.checkNotNullParameter(iterable2, "$this$null");
                Iterator it10 = iterable2.iterator();
                if (it10.hasNext()) {
                    next = it10.next();
                    if (it10.hasNext()) {
                        int iA = ((i) next).a();
                        do {
                            Object next2 = it10.next();
                            int iA2 = ((i) next2).a();
                            if (iA < iA2) {
                                next = next2;
                                iA = iA2;
                            }
                        } while (it10.hasNext());
                    }
                } else {
                    next = null;
                }
                return (i) next;
        }
    }
}

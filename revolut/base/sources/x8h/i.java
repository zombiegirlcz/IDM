package x8h;

import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements Comparator {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f303348a;

    public static final class a {
        private a() {
        }
    }

    static {
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.i;
        aVar.getClass();
        xi0.b bVar2 = xi0.b.f306272g;
        aVar.getClass();
        f303348a = zhm.v.k(bVar, bVar2, xi0.b.f306273h);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        xi0.b firstCurrency = (xi0.b) obj2;
        xi0.b secondCurrency = (xi0.b) obj3;
        Intrinsics.checkNotNullParameter(firstCurrency, "firstCurrency");
        Intrinsics.checkNotNullParameter(secondCurrency, "secondCurrency");
        List list = f303348a;
        int iIndexOf = list.indexOf(firstCurrency);
        int iIndexOf2 = list.indexOf(secondCurrency);
        if (list.contains(firstCurrency) && list.contains(secondCurrency)) {
            return Intrinsics.k(iIndexOf, iIndexOf2);
        }
        if (list.contains(firstCurrency)) {
            return 1;
        }
        if (list.contains(secondCurrency)) {
            return -1;
        }
        return firstCurrency.f306286a.compareTo(secondCurrency.f306286a);
    }
}

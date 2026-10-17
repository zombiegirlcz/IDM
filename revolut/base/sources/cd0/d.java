package cd0;

import c1g.o;
import efm.r;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static boolean b(h0 h0Var) {
        Object next;
        Iterator it8 = h0Var.getF63597h().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof xl2.d) {
                break;
            }
        }
        return next != null;
    }

    public final r a(r screenChangesObservable, Function2 onUpdate, Function3 validate) {
        Intrinsics.checkNotNullParameter(screenChangesObservable, "screenChangesObservable");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(validate, "validate");
        r map = screenChangesObservable.concatMap(new c64.a(new ccg.c(this, 1), 29)).groupBy(new c(new ccg.c(4), 0)).flatMap(new c(new o(this, onUpdate, validate), 1)).doOnNext(new c(new cd0.a(1, onUpdate), 2)).map(new c(new ccg.c(5), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}

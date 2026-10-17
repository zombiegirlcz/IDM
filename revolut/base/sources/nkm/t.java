package nkm;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public class t extends q {
    public static a c(Iterator it8) {
        Intrinsics.checkNotNullParameter(it8, "<this>");
        r rVar = new r(it8, 0);
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return new a(rVar);
    }

    public static Sequence d() {
        return f.f216837a;
    }

    public static j e(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return f(sequence, new njf.d(18));
    }

    public static final j f(Sequence sequence, Function1 iterator) {
        if (!(sequence instanceof d0)) {
            return new j(sequence, new njf.d(19), iterator);
        }
        d0 d0Var = (d0) sequence;
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new j(d0Var.f216835a, d0Var.f216836b, iterator);
    }

    public static Sequence g(Object obj2, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj2 == null ? f.f216837a : new l(new cji.c(obj2, 1), nextFunction);
    }

    public static a h(Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        l lVar = new l(nextFunction, new ac1.b(14, nextFunction));
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return new a(lVar);
    }
}

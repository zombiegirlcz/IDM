package gom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends d {
    public static List b() {
        List listUnmodifiableList;
        ArrayList arrayList = e.f145195b;
        synchronized (arrayList) {
            listUnmodifiableList = Collections.unmodifiableList(d0.d1(arrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(trees.toList())");
        }
        return listUnmodifiableList;
    }

    public static void g(d tree) {
        Intrinsics.checkNotNullParameter(tree, "tree");
        ArrayList arrayList = e.f145195b;
        synchronized (arrayList) {
            if (!arrayList.remove(tree)) {
                throw new IllegalArgumentException(Intrinsics.o(tree, "Cannot uproot tree which is not planted: ").toString());
            }
            Object[] array = arrayList.toArray(new d[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            e.f145196c = (d[]) array;
            Unit unit = Unit.f186387a;
        }
    }

    public final void c(d tree) {
        Intrinsics.checkNotNullParameter(tree, "tree");
        if (!(tree != this)) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        ArrayList arrayList = e.f145195b;
        synchronized (arrayList) {
            arrayList.add(tree);
            Object[] array = arrayList.toArray(new d[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            e.f145196c = (d[]) array;
            Unit unit = Unit.f186387a;
        }
    }

    @Override // gom.d
    public final void d(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.d(str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void e(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.e(str, Arrays.copyOf(args, args.length));
        }
    }

    public final void f(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        d[] dVarArr = e.f145196c;
        int length = dVarArr.length;
        int i = 0;
        while (i < length) {
            d dVar = dVarArr[i];
            i++;
            dVar.getExplicitTag$timber_release().set(tag2);
        }
    }

    @Override // gom.d
    public final void i(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.i(str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void log(int i, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.log(i, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void v(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.v(str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void w(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.w(str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void wtf(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.wtf(str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void d(Throwable th10) {
        for (d dVar : e.f145196c) {
            dVar.d(th10);
        }
    }

    @Override // gom.d
    public final void e(Throwable th10) {
        for (d dVar : e.f145196c) {
            dVar.e(th10);
        }
    }

    @Override // gom.d
    public final void i(Throwable th10) {
        for (d dVar : e.f145196c) {
            dVar.i(th10);
        }
    }

    @Override // gom.d
    public final void log(int i, Throwable th10) {
        for (d dVar : e.f145196c) {
            dVar.log(i, th10);
        }
    }

    @Override // gom.d
    public final void v(Throwable th10) {
        for (d dVar : e.f145196c) {
            dVar.v(th10);
        }
    }

    @Override // gom.d
    public final void w(Throwable th10) {
        for (d dVar : e.f145196c) {
            dVar.w(th10);
        }
    }

    @Override // gom.d
    public final void wtf(Throwable th10) {
        for (d dVar : e.f145196c) {
            dVar.wtf(th10);
        }
    }

    @Override // gom.d
    public final void d(Throwable th10, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.d(th10, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void e(Throwable th10, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.e(th10, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void i(Throwable th10, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.i(th10, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void log(int i, Throwable th10, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.log(i, th10, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void v(Throwable th10, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.v(th10, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void w(Throwable th10, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.w(th10, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void wtf(Throwable th10, String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (d dVar : e.f145196c) {
            dVar.wtf(th10, str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // gom.d
    public final void log(int i, String str, String message, Throwable th10) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new AssertionError();
    }
}

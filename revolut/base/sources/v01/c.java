package v01;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f284712a;

    static {
        ArrayList arrayList = new ArrayList();
        f284712a = arrayList;
        arrayList.add(new e());
    }

    private c() {
    }

    public static final void a(Context context, a delegate, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Iterator it8 = f284712a.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            Object next = it8.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ((d) next).a(context, delegate, attributeSet);
        }
    }
}

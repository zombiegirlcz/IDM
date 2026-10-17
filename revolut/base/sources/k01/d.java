package k01;

import android.content.Context;
import android.widget.RemoteViews;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179899a;

    public d(Context context, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        o01.c cVar = new o01.c(context, intentProvider);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        o01.a aVar = new o01.a(context, intentProvider, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f179899a = v.k(cVar, aVar, new o01.a(context, intentProvider, 1));
    }

    public final RemoteViews a(n model, b9.e widgetSpec) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(widgetSpec, "widgetSpec");
        Iterator it8 = this.f179899a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).b(model)) {
                break;
            }
        }
        a aVar = next instanceof a ? (a) next : null;
        if (aVar != null) {
            return aVar.a(model, widgetSpec);
        }
        throw new IllegalStateException(("No delegate found for object " + model).toString());
    }
}

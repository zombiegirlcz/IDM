package e80;

import android.content.Context;
import bp0.s;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123552a;

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f123552a = context;
    }

    public static com.revolut.core.android.spannable.a d(i iVar, boolean z, Function2 function2, e eVar, List list, int i) {
        if ((i & 4) != 0) {
            eVar = new e(null, null, 7);
        }
        if ((i & 8) != 0) {
            list = f0.f322471a;
        }
        return iVar.b(z, function2, eVar, list);
    }

    public final com.revolut.core.android.spannable.a a(int i, boolean z, s sVar) {
        return b(z, sVar, new e(null, Integer.valueOf(i), 3), f0.f322471a);
    }

    public final com.revolut.core.android.spannable.a b(boolean z, Function2 function2, e linkifyParams, List swapSpanDataList) {
        Intrinsics.checkNotNullParameter(linkifyParams, "linkifyParams");
        Intrinsics.checkNotNullParameter(swapSpanDataList, "swapSpanDataList");
        return new com.revolut.core.android.spannable.a(this, z, function2, linkifyParams, swapSpanDataList);
    }

    public final com.revolut.core.android.spannable.a c() {
        return b(true, null, new e(null, null, 7), f0.f322471a);
    }
}

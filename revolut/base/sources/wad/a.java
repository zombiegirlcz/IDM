package wad;

import aii.p;
import aii.u;
import android.content.Context;
import com.revolut.feature.shared.order_initiation.impl.data.database.OrderInitiationPageDatabase;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p {
    @Override // nhi.h
    public final void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OrderInitiationPageDatabase.INSTANCE.getClass();
        OrderInitiationPageDatabase.Companion.a(context);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}

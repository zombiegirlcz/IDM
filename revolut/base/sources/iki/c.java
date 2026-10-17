package iki;

import android.content.Context;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161977a;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f161977a = context;
    }

    public final boolean a(ExternalDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Context context = this.f161977a;
        return context.getPackageManager().resolveActivity(com.revolut.kompot.common.a.a(destination, context), 65536) != null;
    }
}

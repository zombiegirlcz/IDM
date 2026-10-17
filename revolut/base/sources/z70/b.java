package z70;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f319850a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f319850a = context;
    }

    @Override // z70.a
    public final Context getContext() {
        return this.f319850a;
    }
}

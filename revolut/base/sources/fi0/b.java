package fi0;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f135282a;

    public b(Context context, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f135282a = j.b(new lu0.a(context, 18));
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f135282a = j.b(new b0.b(context, 12));
                break;
        }
    }
}

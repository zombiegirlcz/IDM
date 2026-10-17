package okhttp3.internal.platform;

import android.content.Context;
import androidx.startup.Initializer;
import emm.f;
import emm.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Landroidx/startup/Initializer;", "Lemm/h;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformInitializer implements Initializer<h> {
    @Override // androidx.startup.Initializer
    public final h create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        h.Companion.getClass();
        Object obj2 = h.f127697a;
        f fVar = obj2 != null ? (f) obj2 : null;
        if (fVar != null) {
            fVar.b(context);
        }
        return h.f127697a;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return f0.f322471a;
    }
}

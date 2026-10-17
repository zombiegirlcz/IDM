package nhi;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface h {
    void b();

    default void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

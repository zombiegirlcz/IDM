package sxl;

import android.widget.FrameLayout;
import dok.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f266529a = new ArrayList();

    public static final class a {
        private a() {
        }
    }

    public final void a(FrameLayout handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        sx8.a aVar = new sx8.a(handler, 3);
        ArrayList arrayList = this.f266529a;
        a0.E(arrayList, aVar);
        arrayList.add(0, new WeakReference(handler));
        if (handler.isAttachedToWindow()) {
            handler.addOnAttachStateChangeListener(new k(handler, this, handler, 3));
        } else {
            a0.E(arrayList, new sx8.a(handler, 3));
        }
    }
}

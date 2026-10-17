package f5l;

import android.app.Activity;
import android.view.View;
import com.revolut.screen_capturing.R$id;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {
    public static final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.getWindow().clearFlags(8192);
        View viewFindViewById = activity.findViewById(R$id.screen_capturing_debug_overlay);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
        activity.getWindow().getDecorView().setFilterTouchesWhenObscured(false);
        j5l.a aVar = j5l.a.f171648a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        j5l.a.f171649b.remove(activity);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "Screen capturing protection", "Disabled for ".concat(activity.getClass().getSimpleName()), null, null, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.app.Activity r7) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5l.d.b(android.app.Activity):void");
    }
}

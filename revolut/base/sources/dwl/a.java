package dwl;

import android.content.Context;
import com.revolut.RevolutApplication;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.i(applicationContext, "null cannot be cast to non-null type com.revolut.RevolutApplication");
        } catch (NullPointerException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, "Activity extensions", "smth tries to receive base context before it attached", e, h0Var);
            RevolutApplication.INSTANCE.getClass();
            if (RevolutApplication.A != null) {
                return;
            }
            Intrinsics.r("sInstance");
            throw null;
        }
    }
}

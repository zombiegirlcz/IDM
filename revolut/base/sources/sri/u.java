package sri;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile com.revolut.retail.core.navigation.c f265243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f265244b = new Object();

    private u() {
    }

    public static com.revolut.retail.core.navigation.c a(Context context, f fVar) {
        com.revolut.retail.core.navigation.c cVar = f265243a;
        if (cVar != null) {
            return cVar;
        }
        synchronized (f265244b) {
            com.revolut.retail.core.navigation.c cVar2 = f265243a;
            if (cVar2 != null) {
                return cVar2;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            com.revolut.retail.core.navigation.c cVar3 = new com.revolut.retail.core.navigation.c(context, fVar);
            f265243a = cVar3;
            String str = "Created shared SampleAppNavigator; navigator=" + System.identityHashCode(cVar3);
            return cVar3;
        }
    }

    public static com.revolut.retail.core.navigation.c b(Context context, f fragmentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        com.revolut.retail.core.navigation.c cVarA = a(context, fragmentProvider);
        String str = "Using shared SampleAppNavigator via context; navigator=" + System.identityHashCode(cVarA) + " context=" + context.getClass().getSimpleName();
        return cVarA;
    }

    public static com.revolut.retail.core.navigation.c c(Fragment fragment, cpi.g fragmentProvider) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.revolut.retail.core.navigation.c cVarA = a(contextRequireContext, fragmentProvider);
        String str = "Using shared SampleAppNavigator via fragment; navigator=" + System.identityHashCode(cVarA) + " fragment=" + fragment.getClass().getSimpleName();
        return cVarA;
    }
}

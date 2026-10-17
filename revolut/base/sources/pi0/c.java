package pi0;

import com.google.firebase.analytics.FirebaseAnalytics;
import e0m.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oh0.c f236364a;

    public c(oh0.c msAnalytics) {
        Intrinsics.checkNotNullParameter(msAnalytics, "msAnalytics");
        this.f236364a = msAnalytics;
    }

    @Override // e0m.d
    public final void init() {
        od0.a aVar = od0.a.f224253a;
        int i = b.f236363a[od0.a.b().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            String strName = od0.a.b().name();
            Pair property = new Pair("AppEnvironment", strName);
            Intrinsics.checkNotNullParameter(property, "property");
            FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) this.f236364a.f225269a.f225268a.getValue();
            firebaseAnalytics.f49440a.zzP(null, f0.U0(24, "AppEnvironment"), f0.U0(36, strName), false);
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String simpleName = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, simpleName, "AppEnvironmentValue is UNDEFINED", null, h0Var);
    }
}

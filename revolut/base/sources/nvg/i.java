package nvg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i {
    public abstract void a(List list, eel.c cVar, iwg.c cVar2, boolean z, String str);

    public abstract void b(ArrayList arrayList);

    public void c(ArrayList contributors, List analyticsProductTypes, eel.c timeSpan, iwg.c method, boolean z, String currency) {
        Intrinsics.checkNotNullParameter(contributors, "contributors");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currency, "currency");
        a(analyticsProductTypes, timeSpan, method, z, currency);
        b(contributors);
    }

    public abstract List d(List list, eel.c cVar, iwg.c cVar2, boolean z, String str);
}

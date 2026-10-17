package nvg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class s {
    public abstract void a(String str, eel.c cVar, String str2);

    public abstract void b(ArrayList arrayList);

    public void c(ArrayList realisedItems, String requestedProductTypes, eel.c timeSpan, String currency) {
        Intrinsics.checkNotNullParameter(realisedItems, "realisedItems");
        Intrinsics.checkNotNullParameter(requestedProductTypes, "requestedProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        a(requestedProductTypes, timeSpan, currency);
        b(realisedItems);
    }

    public abstract List d(String str, eel.c cVar, String str2);
}

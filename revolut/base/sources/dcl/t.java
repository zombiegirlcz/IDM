package dcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class t {
    public abstract List a(String str, String str2, eel.i iVar);

    public abstract void b(String str, String str2, eel.i iVar);

    public void c(String ref2, String period, eel.i valueType, ArrayList points) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(points, "points");
        b(ref2, period, valueType);
        d(points);
    }

    public abstract void d(ArrayList arrayList);
}

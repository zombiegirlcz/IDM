package dcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class o {
    public abstract void a(String str, String str2);

    public abstract void b(ArrayList arrayList);

    public abstract List c(String str, String str2);

    public void d(String ref2, String period, ArrayList sticks) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(sticks, "sticks");
        a(ref2, period);
        b(sticks);
    }
}

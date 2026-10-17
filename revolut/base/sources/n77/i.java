package n77;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {
    public abstract List a();

    public abstract void b();

    public void c(ArrayList marketAssets) {
        Intrinsics.checkNotNullParameter(marketAssets, "marketAssets");
        b();
        d(marketAssets);
    }

    public abstract void d(ArrayList arrayList);
}

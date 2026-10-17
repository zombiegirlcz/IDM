package jud;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public abstract List a();

    public abstract void b(ArrayList arrayList);

    public void c(ArrayList stakingPockets) {
        Intrinsics.checkNotNullParameter(stakingPockets, "stakingPockets");
        d();
        b(stakingPockets);
    }

    public abstract void d();
}

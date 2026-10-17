package m91;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class m {
    public abstract List a();

    public abstract void b(ArrayList arrayList);

    public abstract void c();

    public void d(ArrayList bankDetailsList) {
        Intrinsics.checkNotNullParameter(bankDetailsList, "bankDetailsList");
        c();
        b(bankDetailsList);
    }
}

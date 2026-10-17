package tx1;

import efm.d0;
import efm.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public abstract void a();

    public abstract Object b(ArrayList arrayList, c cVar);

    public abstract efm.k c(String str);

    public abstract d0 d(String str);

    public abstract Object e(c cVar);

    public abstract efm.b f(ArrayList arrayList);

    public abstract void g(ArrayList arrayList);

    public abstract r h(String str);

    public abstract r i();

    public void j(ArrayList contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        a();
        g(contacts);
    }
}

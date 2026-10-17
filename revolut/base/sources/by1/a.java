package by1;

import efm.d0;
import efm.k;
import efm.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public abstract void a();

    public abstract k b(String str);

    public abstract d0 c(String str);

    public abstract efm.b d(ArrayList arrayList);

    public abstract void e(ArrayList arrayList);

    public abstract r f(String str);

    public abstract r g();

    public void h(ArrayList contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        a();
        e(contacts);
    }
}

package xf0;

import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public abstract void a(String str);

    public abstract int b();

    public abstract efm.k c(String str, String str2);

    public abstract d0 d(String str);

    public abstract d0 e(String str);

    public abstract void f(ArrayList arrayList);

    public final void g(String lang, List entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(lang, "lang");
        a(lang);
        List<zf0.b> list = entries;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (zf0.b bVar : list) {
            bVar.p(lang);
            arrayList.add(bVar);
        }
        f(arrayList);
    }
}

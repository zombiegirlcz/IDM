package wnf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.d0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f298838a = v.k("cgst", "igst", "sgst");

    public static final boolean a(String str) {
        if (str == null) {
            return false;
        }
        List list = f298838a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (d0.J(str, (String) it8.next(), true)) {
                return true;
            }
        }
        return false;
    }
}

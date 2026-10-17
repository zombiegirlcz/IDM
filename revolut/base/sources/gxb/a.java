package gxb;

import hxb.i;
import m1c.a0;
import m1c.b0;
import vxb.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final b0 a(i.a aVar) {
        String title = aVar.getTitle();
        String deeplink = aVar.getDeeplink();
        String style = aVar.getStyle();
        a0 a0Var = null;
        if (style != null) {
            a0[] a0VarArrValues = a0.values();
            int length = a0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                a0 a0Var2 = a0VarArrValues[i];
                if (kotlin.text.a0.z(a0Var2.name(), style, true)) {
                    a0Var = a0Var2;
                    break;
                }
                i++;
            }
        }
        return new b0(title, deeplink, a0Var);
    }

    public static final b0 b(h.a aVar) {
        String title = aVar.getTitle();
        String deeplink = aVar.getDeeplink();
        String style = aVar.getStyle();
        a0 a0Var = null;
        if (style != null) {
            a0[] a0VarArrValues = a0.values();
            int length = a0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                a0 a0Var2 = a0VarArrValues[i];
                if (kotlin.text.a0.z(a0Var2.name(), style, true)) {
                    a0Var = a0Var2;
                    break;
                }
                i++;
            }
        }
        return new b0(title, deeplink, a0Var);
    }

    public static final h.a c(b0 b0Var) {
        String str = b0Var.f201338a;
        String str2 = b0Var.f201339b;
        a0 a0Var = b0Var.f201340c;
        return new h.a(str, str2, a0Var != null ? a0Var.name() : null);
    }
}

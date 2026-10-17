package dmi;

import ami.r;
import hx7.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import xli.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f116132a;

    public a(b unifiedDeeplinkConfigProvider) {
        Intrinsics.checkNotNullParameter(unifiedDeeplinkConfigProvider, "unifiedDeeplinkConfigProvider");
        this.f116132a = unifiedDeeplinkConfigProvider;
    }

    public static boolean b(xli.a aVar, zli.b bVar) {
        List<String> list = aVar.f307016a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String template : list) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                Intrinsics.checkNotNullParameter(template, "template");
                if (l.s(bVar, template) != null) {
                    return true;
                }
            }
        }
        List list2 = aVar.f307017b;
        String str = bVar.f323278a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (a0.H(str, (String) it8.next(), false)) {
                    return true;
                }
            }
        }
        return aVar.f307018c.contains(bVar.f323278a);
    }

    public final boolean a(zli.b deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        r rVar = (r) this.f116132a;
        if (((xli.a) rVar.f6465c.getValue()) != null) {
            return !b(r1, deeplink);
        }
        xli.a aVar = (xli.a) rVar.f6464b.getValue();
        if (aVar == null) {
            return false;
        }
        return b(aVar, deeplink);
    }
}

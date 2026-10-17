package lka;

import e84.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f196344a;

    public d(e provider, a disclaimerDtoMapper) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(disclaimerDtoMapper, "disclaimerDtoMapper");
        this.f196344a = provider;
    }

    public final ArrayList a(List list) {
        List<nka.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (nka.c dto : list2) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            String str = dto.f216776a;
            String str2 = dto.f216777b;
            arrayList.add(new aka.b(str, Intrinsics.f(str2, "highlighted") ? aka.c.HIGHLIGHTED : Intrinsics.f(str2, "medium") ? aka.c.MEDIUM : aka.c.DEFAULT));
        }
        return arrayList;
    }

    public final ArrayList b(ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            aka.b domain = (aka.b) it8.next();
            Intrinsics.checkNotNullParameter(domain, "domain");
            String str2 = domain.f5747a;
            int i = b.f196343a[domain.f5748b.ordinal()];
            if (i == 1) {
                str = "default";
            } else if (i == 2) {
                str = "highlighted";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "medium";
            }
            arrayList2.add(new nka.c(str2, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aka.a c(nka.o r14) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lka.d.c(nka.o):aka.a");
    }
}

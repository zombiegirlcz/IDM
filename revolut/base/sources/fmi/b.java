package fmi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import lg0.c;
import lg0.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdj.b f136459a;

    public b(vdj.b preprocessor) {
        Intrinsics.checkNotNullParameter(preprocessor, "preprocessor");
        this.f136459a = preprocessor;
    }

    @Override // lg0.c
    public final e a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter("support/incident/{id}/notify", "template");
        zli.b bVarB = b(url2);
        if (bVarB == null) {
            return null;
        }
        List list = bVarB.f323280c;
        List listM0 = d0.m0(d0.G0(d0.A0('?', "support/incident/{id}/notify"), '/'), new char[]{'/'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM0) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() != list.size()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : zhm.d0.l1(arrayList, list)) {
            String str = (String) pair.f186385a;
            String str2 = (String) pair.f186386b;
            if (a0.H(str, "{", false) && a0.y(str, "}", false)) {
                linkedHashMap.put(d0.i0(str, "{", "}"), str2);
            } else if (!str.equals(str2)) {
                return null;
            }
        }
        LinkedHashMap params = bVarB.d;
        Intrinsics.checkNotNullParameter(params, "params");
        return new e(url2, linkedHashMap, params, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zli.b b(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fmi.b.b(java.lang.String):zli.b");
    }
}

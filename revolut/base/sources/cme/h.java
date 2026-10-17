package cme;

import dkk.m;
import j19.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k19.i;
import k19.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25218a;

    public h(c productLogoMapper) {
        Intrinsics.checkNotNullParameter(productLogoMapper, "productLogoMapper");
        this.f25218a = productLogoMapper;
    }

    public static int a(s0 s0Var) {
        int length;
        j jVar = s0Var.i;
        if (jVar == null) {
            return s0Var.f170251c.length();
        }
        Regex regex = dme.f.f116114a;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Regex regex2 = dme.f.f116114a;
        String str = jVar.f180157a;
        List listJ = y.J(Regex.c(regex2, str));
        ArrayList<String> arrayList = new ArrayList();
        Iterator it8 = listJ.iterator();
        while (it8.hasNext()) {
            String str2 = (String) d0.e0(2, ((MatchResult) it8.next()).c());
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        int length2 = arrayList.isEmpty() ? str.length() : regex2.h(str, new m(28)).length();
        ArrayList<i> arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            Map map = jVar.f180158b;
            i iVar = map != null ? (i) map.get(str3) : null;
            if (iVar != null) {
                arrayList2.add(iVar);
            }
        }
        int i = 0;
        for (i iVar2 : arrayList2) {
            int i2 = dme.e.f116113a[iVar2.f180153a.ordinal()];
            if (i2 == 1) {
                length = iVar2.f180154b.length() + 3;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                length = iVar2.f180155c.length();
            }
            i += length;
        }
        return length2 + i;
    }
}

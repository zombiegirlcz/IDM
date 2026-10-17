package yjl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final String a(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return d0.k0(set, "+", null, null, 0, new h0() { // from class: yjl.c
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((jkl.i) obj2).getValue();
            }
        }, 30);
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            jkl.i iVar = (jkl.i) obj2;
            if (iVar != null && iVar != jkl.i.UNKNOWN) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final boolean c(jkl.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        int i = b.f314540a[iVar.ordinal()];
        return i == 2 || i == 5;
    }

    public static final jkl.i d(mni.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = b.f314541b[bVar.ordinal()];
        if (i == 1) {
            return jkl.i.EMAIL;
        }
        if (i == 2) {
            return jkl.i.RCS;
        }
        if (i == 3) {
            return jkl.i.SMS;
        }
        if (i == 4) {
            return jkl.i.TELEPHONE;
        }
        if (i == 5) {
            return jkl.i.WHATSAPP;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final mni.b e(jkl.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        int i = b.f314540a[iVar.ordinal()];
        if (i == 1) {
            return mni.b.EMAIL;
        }
        if (i == 2) {
            return mni.b.RCS;
        }
        if (i == 3) {
            return mni.b.SMS;
        }
        if (i == 4) {
            return mni.b.TELEPHONE;
        }
        if (i != 5) {
            return null;
        }
        return mni.b.WHATSAPP;
    }

    public static final ArrayList f(ArrayList arrayList) {
        ArrayList arrayListS = t61.a.s("<this>", arrayList);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            mni.b bVarE = e((jkl.i) it8.next());
            if (bVarE != null) {
                arrayListS.add(bVarE);
            }
        }
        return arrayListS;
    }
}

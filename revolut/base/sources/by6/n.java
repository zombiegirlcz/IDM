package by6;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f19759a = r0.k(new Pair(sr6.i.OPEN_BANKING, sr6.i.BANK_TRANSFER), new Pair(sr6.i.CLICK_TO_PAY, sr6.i.CARD));

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static final Set a(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            sr6.i iVar = (sr6.i) obj2;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            if (!(((sr6.i) f19759a.get(iVar)) != null ? !set.contains(r4) : false)) {
                arrayList.add(obj2);
            }
        }
        return d0.i1(arrayList);
    }
}

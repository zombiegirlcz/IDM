package e2h;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import vkm.u1;
import y1h.c;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f122096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f122097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f122098c;
    public final u1 d;

    public b() {
        h0 h0Var = h0.f322473a;
        j2 j2VarC = q.c(h0Var);
        this.f122096a = j2VarC;
        j2 j2VarC2 = q.c(h0Var);
        this.f122097b = j2VarC2;
        this.f122098c = q.h(j2VarC);
        this.d = q.h(j2VarC2);
    }

    public final void a(Set assets) {
        j2 j2Var;
        Object value;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Intrinsics.checkNotNullParameter(assets, "assets");
        do {
            j2Var = this.f122096a;
            value = j2Var.getValue();
            Set set = (Set) value;
            Set set2 = assets;
            int iB = q0.b(w.t(set2, 10));
            if (iB < 16) {
                iB = 16;
            }
            linkedHashMap = new LinkedHashMap(iB);
            for (Object obj2 : set2) {
                linkedHashMap.put(((c) obj2).getId(), obj2);
            }
            Set set3 = set;
            int iB2 = q0.b(w.t(set3, 10));
            linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
            for (Object obj3 : set3) {
                linkedHashMap2.put(((c) obj3).getId(), obj3);
            }
        } while (!j2Var.h(value, d0.i1(r0.p(linkedHashMap2, linkedHashMap).values())));
    }

    public final void b(Set selectedIds) {
        j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        do {
            j2Var = this.f122097b;
            value = j2Var.getValue();
        } while (!j2Var.h(value, selectedIds));
    }

    public final void c(String assetId, boolean z) {
        j2 j2Var;
        Object value;
        Set set;
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        do {
            j2Var = this.f122097b;
            value = j2Var.getValue();
            set = (Set) value;
        } while (!j2Var.h(value, z ? a1.m(set, assetId) : a1.j(set, assetId)));
    }
}

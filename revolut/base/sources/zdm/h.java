package zdm;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import kem.r;
import kotlin.jvm.internal.Intrinsics;
import ulm.u0;

/* JADX INFO: loaded from: classes23.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f321616a;

    public h(u0 u0Var) {
        this.f321616a = u0Var;
    }

    @Override // oem.m
    public final boolean a() {
        return true;
    }

    @Override // oem.m
    public final List b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        List listR = ue8.c.r(this.f321616a, name);
        if (listR.isEmpty()) {
            return null;
        }
        return listR;
    }

    @Override // oem.m
    public final Set entries() {
        return ((TreeMap) this.f321616a.b()).entrySet();
    }
}

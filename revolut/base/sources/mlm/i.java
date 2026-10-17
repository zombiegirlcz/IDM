package mlm;

import jid.z;
import kotlin.jvm.internal.Intrinsics;
import qlm.f1;
import qlm.n;
import qlm.r1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f207097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r1 f207098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f207099c;
    public static final f1 d;

    static {
        jli.f factory = new jli.f(11);
        boolean z = n.f247679a;
        Intrinsics.checkNotNullParameter(factory, "factory");
        boolean z3 = n.f247679a;
        f207097a = z3 ? new ao.h(25, factory) : new z(factory);
        jli.f factory2 = new jli.f(12);
        Intrinsics.checkNotNullParameter(factory2, "factory");
        f207098b = z3 ? new ao.h(25, factory2) : new z(factory2);
        akg.d factory3 = new akg.d(26);
        Intrinsics.checkNotNullParameter(factory3, "factory");
        f207099c = z3 ? new cpi.g(factory3) : new kgm.i(factory3);
        akg.d factory4 = new akg.d(27);
        Intrinsics.checkNotNullParameter(factory4, "factory");
        d = z3 ? new cpi.g(factory4) : new kgm.i(factory4);
    }
}

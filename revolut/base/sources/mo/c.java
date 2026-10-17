package mo;

import elm.f;
import gim.i;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lhk.a0;
import maa.r;
import skm.e0;
import skm.p0;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko.a f207531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f207532b;

    public c(ko.a registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f207531a = registry;
        this.f207532b = j.b(new r(this, 15));
    }

    public final Object a(Class cls, String str, i iVar) {
        a0 a0Var = new a0(cls, this, str, null, 14);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, a0Var, iVar);
    }
}

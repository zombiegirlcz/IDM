package qh0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qh0.h0;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class k0<R extends h0> implements l0 {

    @NotNull
    public static final a0 Companion = new a0();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new d(7)), null, null};
    public static final PluginGeneratedSerialDescriptor f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f246402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246403c;
    public final h0 d;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.mobile_services.impl.auth.models.GmsCredential.PublicKey", null, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("rawId", false);
        pluginGeneratedSerialDescriptor.j("response", false);
        f = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ k0(int i, String str, j0 j0Var, String str2, h0 h0Var) {
        if (15 != (i & 15)) {
            j1.f(f, i, 15);
            throw null;
        }
        this.f246401a = str;
        this.f246402b = j0Var;
        this.f246403c = str2;
        this.d = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f246401a, k0Var.f246401a) && this.f246402b == k0Var.f246402b && Intrinsics.f(this.f246403c, k0Var.f246403c) && Intrinsics.f(this.d, k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f246402b.hashCode() + (this.f246401a.hashCode() * 31)) * 31, 31, this.f246403c);
    }
}

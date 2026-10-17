package ckl;

import chc.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f24878c = {null, yhm.j.c(yhm.k.PUBLICATION, new c0(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f24879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24880b;

    public /* synthetic */ h(int i, d dVar, List list) {
        if (3 != (i & 3)) {
            j1.f(f.f24877a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24879a = dVar;
        this.f24880b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f24879a, hVar.f24879a) && Intrinsics.f(this.f24880b, hVar.f24880b);
    }

    public final int hashCode() {
        return this.f24880b.hashCode() + (this.f24879a.hashCode() * 31);
    }

    public h(d client, ArrayList connections) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connections, "connections");
        this.f24879a = client;
        this.f24880b = connections;
    }
}

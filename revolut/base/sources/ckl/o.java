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
public final class o {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f24888b = {yhm.j.c(yhm.k.PUBLICATION, new c0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24889a;

    public /* synthetic */ o(int i, List list) {
        if (1 == (i & 1)) {
            this.f24889a = list;
        } else {
            j1.f(a.f24872a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f24889a, ((o) obj2).f24889a);
    }

    public final int hashCode() {
        return this.f24889a.hashCode();
    }

    public o(ArrayList connectedClients) {
        Intrinsics.checkNotNullParameter(connectedClients, "connectedClients");
        this.f24889a = connectedClients;
    }
}

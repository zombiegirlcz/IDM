package cxk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f110004c = {null, j.c(k.PUBLICATION, new cpi.b(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110006b;

    public /* synthetic */ h(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(f.f110003a.getDescriptor(), i, 3);
            throw null;
        }
        this.f110005a = str;
        this.f110006b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f110005a, hVar.f110005a) && Intrinsics.f(this.f110006b, hVar.f110006b);
    }

    public final int hashCode() {
        return this.f110006b.hashCode() + (this.f110005a.hashCode() * 31);
    }

    public h(String key, ArrayList sessions) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        this.f110005a = key;
        this.f110006b = sessions;
    }
}

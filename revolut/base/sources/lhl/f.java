package lhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes12.dex */
@g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f195396c = {null, j.c(k.PUBLICATION, new lh9.b(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f195398b;

    public /* synthetic */ f(int i, String str, List list) {
        if (1 != (i & 1)) {
            j1.f(a.f195391a.getDescriptor(), i, 1);
            throw null;
        }
        this.f195397a = str;
        if ((i & 2) == 0) {
            this.f195398b = null;
        } else {
            this.f195398b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f195397a, fVar.f195397a) && Intrinsics.f(this.f195398b, fVar.f195398b);
    }

    public final int hashCode() {
        int iHashCode = this.f195397a.hashCode() * 31;
        List list = this.f195398b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public f(String key, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f195397a = key;
        this.f195398b = arrayList;
    }
}

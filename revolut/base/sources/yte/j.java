package yte;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f316714c = {yhm.j.c(yhm.k.PUBLICATION, new j1(23)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f316715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f316716b;

    public /* synthetic */ j(int i, dj0.d dVar, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(h.f316713a.getDescriptor(), i, 3);
            throw null;
        }
        this.f316715a = list;
        this.f316716b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f316715a, jVar.f316715a) && Intrinsics.f(this.f316716b, jVar.f316716b);
    }

    public final int hashCode() {
        return this.f316716b.hashCode() + (this.f316715a.hashCode() * 31);
    }
}

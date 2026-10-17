package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f153178c = {null, yhm.j.c(yhm.k.PUBLICATION, new hf7.d(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153180b;

    public /* synthetic */ l(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(j.f153154a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153179a = str;
        this.f153180b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f153179a, lVar.f153179a) && Intrinsics.f(this.f153180b, lVar.f153180b);
    }

    public final int hashCode() {
        return this.f153180b.hashCode() + (this.f153179a.hashCode() * 31);
    }
}

package pka;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f236987c = {null, yhm.j.c(yhm.k.PUBLICATION, new c(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f236989b;

    public /* synthetic */ s(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(q.f236985a.getDescriptor(), i, 3);
            throw null;
        }
        this.f236988a = str;
        this.f236989b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f236988a, sVar.f236988a) && Intrinsics.f(this.f236989b, sVar.f236989b);
    }

    public final int hashCode() {
        return this.f236989b.hashCode() + (this.f236988a.hashCode() * 31);
    }

    public s(String text, ArrayList args) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f236988a = text;
        this.f236989b = args;
    }
}

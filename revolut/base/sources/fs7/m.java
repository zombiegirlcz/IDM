package fs7;

import fs7.j;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f137633c = {null, yhm.j.c(yhm.k.PUBLICATION, new fnk.a(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f137635b;

    public /* synthetic */ m(int i, String str, j jVar) {
        if (3 != (i & 3)) {
            j1.f(i.f137629a.getDescriptor(), i, 3);
            throw null;
        }
        this.f137634a = str;
        this.f137635b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f137634a, mVar.f137634a) && Intrinsics.f(this.f137635b, mVar.f137635b);
    }

    public final int hashCode() {
        int iHashCode = this.f137634a.hashCode() * 31;
        j jVar = this.f137635b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public m(String text, j.b bVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f137634a = text;
        this.f137635b = bVar;
    }
}

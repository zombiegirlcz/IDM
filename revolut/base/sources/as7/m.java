package as7;

import as7.j;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ar0.b(11)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f8855c;
    public final s d;

    public /* synthetic */ m(int i, String str, String str2, j jVar, s sVar) {
        if (15 != (i & 15)) {
            j1.f(i.f8844a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8853a = str;
        this.f8854b = str2;
        this.f8855c = jVar;
        this.d = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f8853a, mVar.f8853a) && Intrinsics.f(this.f8854b, mVar.f8854b) && Intrinsics.f(this.f8855c, mVar.f8855c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8853a.hashCode() * 31;
        String str = this.f8854b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f8855c;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        s sVar = this.d;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public m(String title, String str, j.b bVar, s sVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f8853a = title;
        this.f8854b = str;
        this.f8855c = bVar;
        this.d = sVar;
    }
}

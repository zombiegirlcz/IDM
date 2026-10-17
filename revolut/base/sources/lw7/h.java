package lw7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] d = {null, null, yhm.j.c(k.PUBLICATION, new lv4.b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f200424c;

    public /* synthetic */ h(int i, String str, String str2, f fVar) {
        if (3 != (i & 3)) {
            j1.f(e.f200421a.getDescriptor(), i, 3);
            throw null;
        }
        this.f200422a = str;
        this.f200423b = str2;
        if ((i & 4) == 0) {
            this.f200424c = null;
        } else {
            this.f200424c = fVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f200422a, hVar.f200422a) && Intrinsics.f(this.f200423b, hVar.f200423b) && this.f200424c == hVar.f200424c;
    }

    public final int hashCode() {
        int iHashCode = this.f200422a.hashCode() * 31;
        String str = this.f200423b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.f200424c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }
}

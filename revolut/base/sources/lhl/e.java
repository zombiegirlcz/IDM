package lhl;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f195394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195395c;

    public /* synthetic */ e(int i, String str, xi0.b bVar, String str2) {
        if (5 != (i & 5)) {
            j1.f(c.f195392a.getDescriptor(), i, 5);
            throw null;
        }
        this.f195393a = str;
        if ((i & 2) == 0) {
            this.f195394b = null;
        } else {
            this.f195394b = bVar;
        }
        this.f195395c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f195393a, eVar.f195393a) && Intrinsics.f(this.f195394b, eVar.f195394b) && Intrinsics.f(this.f195395c, eVar.f195395c);
    }

    public final int hashCode() {
        int iHashCode = this.f195393a.hashCode() * 31;
        xi0.b bVar = this.f195394b;
        return this.f195395c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public e(String ref2, String assetType, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f195393a = ref2;
        this.f195394b = bVar;
        this.f195395c = assetType;
    }
}

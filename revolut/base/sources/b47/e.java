package b47;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f12188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f12189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12190c;

    public e() {
        this(false, 7);
    }

    public static e a(e eVar, Data taxProfileData, Boolean bool, int i) {
        if ((i & 1) != 0) {
            taxProfileData = eVar.f12188a;
        }
        boolean z = eVar.f12190c;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(taxProfileData, "taxProfileData");
        return new e(taxProfileData, bool, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f12188a, eVar.f12188a) && Intrinsics.f(this.f12189b, eVar.f12189b) && this.f12190c == eVar.f12190c;
    }

    public final int hashCode() {
        int iHashCode = this.f12188a.hashCode() * 31;
        Boolean bool = this.f12189b;
        return Boolean.hashCode(this.f12190c) + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public e(Data taxProfileData, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(taxProfileData, "taxProfileData");
        this.f12188a = taxProfileData;
        this.f12189b = bool;
        this.f12190c = z;
    }

    public /* synthetic */ e(boolean z, int i) {
        this(new Data(null, null, true, 3, null), null, (i & 4) != 0 ? false : z);
    }
}

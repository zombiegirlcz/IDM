package abf;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f2952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2953b;

    public i(Data instruments, Map assetDrafts) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(assetDrafts, "assetDrafts");
        this.f2952a = instruments;
        this.f2953b = assetDrafts;
    }

    public static i a(i iVar, Data instruments, Map assetDrafts, int i) {
        if ((i & 1) != 0) {
            instruments = iVar.f2952a;
        }
        if ((i & 2) != 0) {
            assetDrafts = iVar.f2953b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(assetDrafts, "assetDrafts");
        return new i(instruments, assetDrafts);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f2952a, iVar.f2952a) && Intrinsics.f(this.f2953b, iVar.f2953b);
    }

    public final int hashCode() {
        return this.f2953b.hashCode() + (this.f2952a.hashCode() * 31);
    }
}

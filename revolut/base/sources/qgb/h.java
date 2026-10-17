package qgb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f245740b;

    public /* synthetic */ h(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(f.f245732a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245739a = str;
        this.f245740b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f245739a, hVar.f245739a) && Intrinsics.f(this.f245740b, hVar.f245740b);
    }

    public final int hashCode() {
        return this.f245740b.hashCode() + (this.f245739a.hashCode() * 31);
    }

    public h(jo3.a prizeAmount, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f245739a = deeplink;
        this.f245740b = prizeAmount;
    }
}

package qgb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245763b;

    public /* synthetic */ q(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(o.f245761a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245762a = str;
        this.f245763b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f245762a, qVar.f245762a) && Intrinsics.f(this.f245763b, qVar.f245763b);
    }

    public final int hashCode() {
        return this.f245763b.hashCode() + (this.f245762a.hashCode() * 31);
    }

    public q(String text, String deeplink) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f245762a = text;
        this.f245763b = deeplink;
    }
}

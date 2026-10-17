package qgb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245754b;

    public /* synthetic */ m(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(k.f245749a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245753a = str;
        this.f245754b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f245753a, mVar.f245753a) && Intrinsics.f(this.f245754b, mVar.f245754b);
    }

    public final int hashCode() {
        return this.f245754b.hashCode() + (this.f245753a.hashCode() * 31);
    }

    public m(String text, String link) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f245753a = text;
        this.f245754b = link;
    }
}

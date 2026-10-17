package vwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292739c;

    public /* synthetic */ i(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(g.f292736a.getDescriptor(), i, 7);
            throw null;
        }
        this.f292737a = str;
        this.f292738b = str2;
        this.f292739c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f292737a, iVar.f292737a) && Intrinsics.f(this.f292738b, iVar.f292738b) && Intrinsics.f(this.f292739c, iVar.f292739c);
    }

    public final int hashCode() {
        return this.f292739c.hashCode() + p.a.c(this.f292737a.hashCode() * 31, 31, this.f292738b);
    }

    public i(String title, String subtitle, String iconResKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconResKey, "iconResKey");
        this.f292737a = title;
        this.f292738b = subtitle;
        this.f292739c = iconResKey;
    }
}

package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260168c;

    public e(String str, String label, String deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f260166a = str;
        this.f260167b = label;
        this.f260168c = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f260166a, eVar.f260166a) && Intrinsics.f(this.f260167b, eVar.f260167b) && Intrinsics.f(this.f260168c, eVar.f260168c);
    }

    public final int hashCode() {
        String str = this.f260166a;
        return this.f260168c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f260167b);
    }
}

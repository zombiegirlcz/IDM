package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3430b;

    public /* synthetic */ s(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(q.f3425a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3429a = str;
        this.f3430b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f3429a, sVar.f3429a) && Intrinsics.f(this.f3430b, sVar.f3430b);
    }

    public final int hashCode() {
        return this.f3430b.hashCode() + (this.f3429a.hashCode() * 31);
    }

    public s(String icon, String title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f3429a = icon;
        this.f3430b = title;
    }
}

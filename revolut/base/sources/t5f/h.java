package t5f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268086c;

    public /* synthetic */ h(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(f.f268083a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268084a = str;
        this.f268085b = str2;
        if ((i & 4) == 0) {
            this.f268086c = null;
        } else {
            this.f268086c = str3;
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
        return Intrinsics.f(this.f268084a, hVar.f268084a) && Intrinsics.f(this.f268085b, hVar.f268085b) && Intrinsics.f(this.f268086c, hVar.f268086c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f268084a.hashCode() * 31, 31, this.f268085b);
        String str = this.f268086c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public h(String title, String iconName, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.f268084a = title;
        this.f268085b = iconName;
        this.f268086c = str;
    }
}

package nka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216777b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(a.f216775a.getDescriptor(), i, 1);
            throw null;
        }
        this.f216776a = str;
        if ((i & 2) == 0) {
            this.f216777b = null;
        } else {
            this.f216777b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f216776a, cVar.f216776a) && Intrinsics.f(this.f216777b, cVar.f216777b);
    }

    public final int hashCode() {
        int iHashCode = this.f216776a.hashCode() * 31;
        String str = this.f216777b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public c(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f216776a = text;
        this.f216777b = str;
    }
}

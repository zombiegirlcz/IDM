package qgb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245771c;

    public /* synthetic */ w(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(u.f245768a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245769a = str;
        this.f245770b = str2;
        if ((i & 4) == 0) {
            this.f245771c = null;
        } else {
            this.f245771c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f245769a, wVar.f245769a) && Intrinsics.f(this.f245770b, wVar.f245770b) && Intrinsics.f(this.f245771c, wVar.f245771c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f245769a.hashCode() * 31, 31, this.f245770b);
        String str = this.f245771c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public w(String imageUrl, String title, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f245769a = imageUrl;
        this.f245770b = title;
        this.f245771c = str;
    }
}

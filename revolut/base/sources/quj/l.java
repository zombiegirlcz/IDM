package quj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] i = {null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new qu1.d(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249479c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f249480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f249481h;

    public /* synthetic */ l(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        if (191 != (i2 & 191)) {
            j1.f(d.f249465a.getDescriptor(), i2, 191);
            throw null;
        }
        this.f249477a = str;
        this.f249478b = str2;
        this.f249479c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i2 & 64) == 0) {
            this.f249480g = null;
        } else {
            this.f249480g = str7;
        }
        this.f249481h = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f249477a, lVar.f249477a) && Intrinsics.f(this.f249478b, lVar.f249478b) && Intrinsics.f(this.f249479c, lVar.f249479c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f249480g, lVar.f249480g) && Intrinsics.f(this.f249481h, lVar.f249481h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f249477a.hashCode() * 31, 31, this.f249478b), 31, this.f249479c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f249480g;
        return this.f249481h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}

package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class p3 {

    @NotNull
    public static final o3 Companion = new o3();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(19)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294977c;
    public final List d;
    public final String e;

    public /* synthetic */ p3(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            qlm.j1.f(n3.f294935a.getDescriptor(), i, 31);
            throw null;
        }
        this.f294975a = str;
        this.f294976b = str2;
        this.f294977c = str3;
        this.d = list;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f294975a, p3Var.f294975a) && Intrinsics.f(this.f294976b, p3Var.f294976b) && Intrinsics.f(this.f294977c, p3Var.f294977c) && Intrinsics.f(this.d, p3Var.d) && Intrinsics.f(this.e, p3Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f294975a.hashCode() * 31, 31, this.f294976b);
        String str = this.f294977c;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public p3(String style, String title, String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294975a = style;
        this.f294976b = title;
        this.f294977c = str;
        this.d = items;
        this.e = str2;
    }
}

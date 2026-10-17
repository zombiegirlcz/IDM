package adk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f3375g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new a92.d(18)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3378c;
    public final List d;
    public final String e;
    public final String f;

    public /* synthetic */ e1(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if (31 != (i & 31)) {
            qlm.j1.f(c1.f3372a.getDescriptor(), i, 31);
            throw null;
        }
        this.f3376a = str;
        this.f3377b = str2;
        this.f3378c = str3;
        this.d = list;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f3376a, e1Var.f3376a) && Intrinsics.f(this.f3377b, e1Var.f3377b) && Intrinsics.f(this.f3378c, e1Var.f3378c) && Intrinsics.f(this.d, e1Var.d) && Intrinsics.f(this.e, e1Var.e) && Intrinsics.f(this.f, e1Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.c(p.a.c(this.f3376a.hashCode() * 31, 31, this.f3377b), 31, this.f3378c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public e1(String title, String subtitle, String icon, String buttonText, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f3376a = title;
        this.f3377b = subtitle;
        this.f3378c = icon;
        this.d = items;
        this.e = buttonText;
        this.f = str;
    }
}

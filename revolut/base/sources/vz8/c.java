package vz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, j.c(k.PUBLICATION, new vo8.b(20)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f293411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f293412c;
    public final String d;

    public /* synthetic */ c(int i, String str, String str2, String str3, List list) {
        if (6 != (i & 6)) {
            j1.f(a.f293409a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f293410a = null;
        } else {
            this.f293410a = str;
        }
        this.f293411b = list;
        this.f293412c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
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
        return Intrinsics.f(this.f293410a, cVar.f293410a) && Intrinsics.f(this.f293411b, cVar.f293411b) && Intrinsics.f(this.f293412c, cVar.f293412c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        String str = this.f293410a;
        int iC = p.a.c(p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f293411b), 31, this.f293412c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}

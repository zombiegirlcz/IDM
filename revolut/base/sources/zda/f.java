package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f321376c;
    public final List d;

    public /* synthetic */ f(int i, String str, String str2, c cVar, List list) {
        if (15 != (i & 15)) {
            j1.f(d.f321367a.getDescriptor(), i, 15);
            throw null;
        }
        this.f321374a = str;
        this.f321375b = str2;
        this.f321376c = cVar;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f321374a, fVar.f321374a) && Intrinsics.f(this.f321375b, fVar.f321375b) && Intrinsics.f(this.f321376c, fVar.f321376c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f321374a.hashCode() * 31, 31, this.f321375b);
        c cVar = this.f321376c;
        return this.d.hashCode() + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public f(String title, String description, c cVar, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f321374a = title;
        this.f321375b = description;
        this.f321376c = cVar;
        this.d = highlights;
    }
}

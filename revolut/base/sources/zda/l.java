package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f321395c = {null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321397b;

    public /* synthetic */ l(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(j.f321390a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321396a = str;
        this.f321397b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f321396a, lVar.f321396a) && Intrinsics.f(this.f321397b, lVar.f321397b);
    }

    public final int hashCode() {
        return this.f321397b.hashCode() + (this.f321396a.hashCode() * 31);
    }

    public l(String title, ArrayList content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f321396a = title;
        this.f321397b = content;
    }
}

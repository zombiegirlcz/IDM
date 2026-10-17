package oti;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class c2 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f229622c = {null, yhm.j.c(yhm.k.PUBLICATION, new oqj.d(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229624b;

    public /* synthetic */ c2(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(a2.f229600a.getDescriptor(), i, 3);
            throw null;
        }
        this.f229623a = str;
        this.f229624b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f229623a, c2Var.f229623a) && Intrinsics.f(this.f229624b, c2Var.f229624b);
    }

    public final int hashCode() {
        return this.f229624b.hashCode() + (this.f229623a.hashCode() * 31);
    }

    public c2(String text, ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        this.f229623a = text;
        this.f229624b = descriptors;
    }
}

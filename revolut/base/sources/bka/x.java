package bka;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f16343c = {null, yhm.j.c(yhm.k.PUBLICATION, new bi2.g(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16345b;

    public /* synthetic */ x(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(v.f16341a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16344a = str;
        this.f16345b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f16344a, xVar.f16344a) && Intrinsics.f(this.f16345b, xVar.f16345b);
    }

    public final int hashCode() {
        return this.f16345b.hashCode() + (this.f16344a.hashCode() * 31);
    }

    public x(String text, ArrayList args) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f16344a = text;
        this.f16345b = args;
    }
}

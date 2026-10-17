package yoj;

import hx7.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f315685b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f315686a;

    static {
        c[] cVarArrValues = c.values();
        ArrayList arrayList = new ArrayList(cVarArrValues.length);
        for (c cVar : cVarArrValues) {
            arrayList.add(l.x(cVar, d.DISABLED));
        }
        f315685b = new f(arrayList);
    }

    public f(ArrayList features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f315686a = features;
    }

    public final List a() {
        return this.f315686a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f315686a.equals(((f) obj2).f315686a);
    }

    public final int hashCode() {
        return this.f315686a.hashCode();
    }
}

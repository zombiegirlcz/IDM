package ruj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f257571c = {null, yhm.j.c(yhm.k.PUBLICATION, new rr4.a(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257573b;

    public /* synthetic */ f(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(d.f257570a.getDescriptor(), i, 3);
            throw null;
        }
        this.f257572a = str;
        this.f257573b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f257572a, fVar.f257572a) && Intrinsics.f(this.f257573b, fVar.f257573b);
    }

    public final int hashCode() {
        return this.f257573b.hashCode() + (this.f257572a.hashCode() * 31);
    }

    public f(String date, ArrayList items) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f257572a = date;
        this.f257573b = items;
    }
}

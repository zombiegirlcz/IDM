package quj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249484b;

    public /* synthetic */ o(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(m.f249482a.getDescriptor(), i, 3);
            throw null;
        }
        this.f249483a = str;
        this.f249484b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f249483a, oVar.f249483a) && Intrinsics.f(this.f249484b, oVar.f249484b);
    }

    public final int hashCode() {
        return this.f249484b.hashCode() + (this.f249483a.hashCode() * 31);
    }

    public o(String startDate, String endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f249483a = startDate;
        this.f249484b = endDate;
    }
}

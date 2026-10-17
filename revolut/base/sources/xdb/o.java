package xdb;

import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f304400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f304401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalTime f304402c;
    public final String d;

    public o(int i, LocalDate date, LocalTime time, String str) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.f304400a = i;
        this.f304401b = date;
        this.f304402c = time;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f304400a == oVar.f304400a && Intrinsics.f(this.f304401b, oVar.f304401b) && Intrinsics.f(this.f304402c, oVar.f304402c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f304402c.hashCode() + wp5.y.a(Integer.hashCode(this.f304400a) * 31, 31, this.f304401b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

package rsj;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f257099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257100c;
    public final String d;

    public /* synthetic */ e(int i, long j2, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(c.f257097a.getDescriptor(), i, 7);
            throw null;
        }
        this.f257098a = str;
        this.f257099b = j2;
        this.f257100c = str2;
        if ((i & 8) == 0) {
            this.d = "USER";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f257098a, eVar.f257098a) && this.f257099b == eVar.f257099b && Intrinsics.f(this.f257100c, eVar.f257100c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(a0.d.c(this.f257098a.hashCode() * 31, 31, this.f257099b), 31, this.f257100c);
    }

    public e(String date, long j2, String currency, String source) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f257098a = date;
        this.f257099b = j2;
        this.f257100c = currency;
        this.d = source;
    }
}

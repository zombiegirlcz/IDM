package cqb;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f108066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108067c;
    public final String d;
    public final String e;

    public /* synthetic */ c(int i, long j2, Long l2, String str, String str2, String str3) {
        if (29 != (i & 29)) {
            j1.f(a.f108064a.getDescriptor(), i, 29);
            throw null;
        }
        this.f108065a = j2;
        if ((i & 2) == 0) {
            this.f108066b = null;
        } else {
            this.f108066b = l2;
        }
        this.f108067c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f108065a == cVar.f108065a && Intrinsics.f(this.f108066b, cVar.f108066b) && Intrinsics.f(this.f108067c, cVar.f108067c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f108065a) * 31;
        Long l2 = this.f108066b;
        return this.e.hashCode() + p.a.c(p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f108067c), 31, this.d);
    }

    public c(long j2, Long l2, String title, String deeplink, String type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f108065a = j2;
        this.f108066b = l2;
        this.f108067c = title;
        this.d = deeplink;
        this.e = type;
    }
}

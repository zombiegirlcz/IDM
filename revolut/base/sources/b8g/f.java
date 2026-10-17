package b8g;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] e = {j.c(k.PUBLICATION, new a(1)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13263c;
    public final String d;

    public f(c contactReason, String bookingId, String returnDeeplinkUrl) {
        Intrinsics.checkNotNullParameter(contactReason, "contactReason");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(returnDeeplinkUrl, "returnDeeplinkUrl");
        this.f13261a = contactReason;
        this.f13262b = bookingId;
        this.f13263c = returnDeeplinkUrl;
        this.d = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f13261a == fVar.f13261a && Intrinsics.f(this.f13262b, fVar.f13262b) && Intrinsics.f(this.f13263c, fVar.f13263c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f13261a.hashCode() * 31, 31, this.f13262b), 31, this.f13263c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ f(int i, c cVar, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(d.f13260a.getDescriptor(), i, 7);
            throw null;
        }
        this.f13261a = cVar;
        this.f13262b = str;
        this.f13263c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }
}

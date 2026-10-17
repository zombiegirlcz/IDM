package cxk;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();
    public static final Lazy[] d = {j.c(k.PUBLICATION, new cpi.b(22)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f110000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f110001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f110002c;

    public /* synthetic */ e(int i, b bVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        if (6 != (i & 6)) {
            j1.f(c.f109999a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f110000a = b.UNKNOWN;
        } else {
            this.f110000a = bVar;
        }
        this.f110001b = zonedDateTime;
        this.f110002c = zonedDateTime2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f110000a == eVar.f110000a && Intrinsics.f(this.f110001b, eVar.f110001b) && Intrinsics.f(this.f110002c, eVar.f110002c);
    }

    public final int hashCode() {
        return this.f110002c.hashCode() + l.h(this.f110001b, this.f110000a.hashCode() * 31, 31);
    }

    public e(b type, ZonedDateTime start, ZonedDateTime end2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f110000a = type;
        this.f110001b = start;
        this.f110002c = end2;
    }
}

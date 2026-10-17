package ao7;

import java.time.ZonedDateTime;
import kl7.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f7906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f7908c;
    public final ZonedDateTime d;

    public f(a1 mtaType, boolean z, ZonedDateTime startDateTime, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        this.f7906a = mtaType;
        this.f7907b = z;
        this.f7908c = startDateTime;
        this.d = zonedDateTime;
    }

    public static f a(f fVar, ZonedDateTime startDateTime, ZonedDateTime zonedDateTime, int i) {
        a1 mtaType = fVar.f7906a;
        boolean z = fVar.f7907b;
        if ((i & 4) != 0) {
            startDateTime = fVar.f7908c;
        }
        if ((i & 8) != 0) {
            zonedDateTime = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        return new f(mtaType, z, startDateTime, zonedDateTime);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f7906a == fVar.f7906a && this.f7907b == fVar.f7907b && Intrinsics.f(this.f7908c, fVar.f7908c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iH = h30.l.h(this.f7908c, j6.a.c(this.f7906a.hashCode() * 31, 31, this.f7907b), 31);
        ZonedDateTime zonedDateTime = this.d;
        return iH + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }
}

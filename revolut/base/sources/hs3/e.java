package hs3;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f154879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f154880c;
    public final h d;

    public e(String eventTitle, ZonedDateTime eventStartDateTime, ZonedDateTime eventEndDateTime, h hVar) {
        Intrinsics.checkNotNullParameter(eventTitle, "eventTitle");
        Intrinsics.checkNotNullParameter(eventStartDateTime, "eventStartDateTime");
        Intrinsics.checkNotNullParameter(eventEndDateTime, "eventEndDateTime");
        this.f154878a = eventTitle;
        this.f154879b = eventStartDateTime;
        this.f154880c = eventEndDateTime;
        this.d = hVar;
    }

    @Override // hs3.k
    public final h O() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154878a, eVar.f154878a) && Intrinsics.f(this.f154879b, eVar.f154879b) && Intrinsics.f(this.f154880c, eVar.f154880c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iH = h30.l.h(this.f154880c, h30.l.h(this.f154879b, this.f154878a.hashCode() * 31, 31), 31);
        h hVar = this.d;
        return iH + (hVar == null ? 0 : hVar.hashCode());
    }
}

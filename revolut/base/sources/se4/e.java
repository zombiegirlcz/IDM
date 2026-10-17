package se4;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import yy3.x;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f262102c;
    public final LocalDateTime d;
    public final x e;
    public final LocalDateTime f;

    public e(String processId, String oneTimePassword, LocalDateTime expirationDateTime, LocalDateTime currentDateTime, x state, LocalDateTime startDateTime) {
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(oneTimePassword, "oneTimePassword");
        Intrinsics.checkNotNullParameter(expirationDateTime, "expirationDateTime");
        Intrinsics.checkNotNullParameter(currentDateTime, "currentDateTime");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        this.f262100a = processId;
        this.f262101b = oneTimePassword;
        this.f262102c = expirationDateTime;
        this.d = currentDateTime;
        this.e = state;
        this.f = startDateTime;
    }

    public static e a(e eVar, String str, String str2, LocalDateTime localDateTime, LocalDateTime localDateTime2, x xVar, LocalDateTime localDateTime3, int i) {
        if ((i & 1) != 0) {
            str = eVar.f262100a;
        }
        String processId = str;
        if ((i & 2) != 0) {
            str2 = eVar.f262101b;
        }
        String oneTimePassword = str2;
        if ((i & 4) != 0) {
            localDateTime = eVar.f262102c;
        }
        LocalDateTime expirationDateTime = localDateTime;
        if ((i & 8) != 0) {
            localDateTime2 = eVar.d;
        }
        LocalDateTime currentDateTime = localDateTime2;
        if ((i & 16) != 0) {
            xVar = eVar.e;
        }
        x state = xVar;
        if ((i & 32) != 0) {
            localDateTime3 = eVar.f;
        }
        LocalDateTime startDateTime = localDateTime3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(oneTimePassword, "oneTimePassword");
        Intrinsics.checkNotNullParameter(expirationDateTime, "expirationDateTime");
        Intrinsics.checkNotNullParameter(currentDateTime, "currentDateTime");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        return new e(processId, oneTimePassword, expirationDateTime, currentDateTime, state, startDateTime);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f262100a, eVar.f262100a) && Intrinsics.f(this.f262101b, eVar.f262101b) && Intrinsics.f(this.f262102c, eVar.f262102c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + v7.i(this.d, v7.i(this.f262102c, p.a.c(this.f262100a.hashCode() * 31, 31, this.f262101b), 31), 31)) * 31);
    }
}

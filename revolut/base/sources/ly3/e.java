package ly3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f200666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f200667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f200668c;

    public e(l0 intro, d schedule, f successPopup) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(successPopup, "successPopup");
        this.f200666a = intro;
        this.f200667b = schedule;
        this.f200668c = successPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f200666a, eVar.f200666a) && Intrinsics.f(this.f200667b, eVar.f200667b) && Intrinsics.f(this.f200668c, eVar.f200668c);
    }

    public final int hashCode() {
        return this.f200668c.hashCode() + ((this.f200667b.hashCode() + (this.f200666a.hashCode() * 31)) * 31);
    }
}

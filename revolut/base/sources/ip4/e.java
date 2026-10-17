package ip4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final el4.f f167649c;
    public final List d;

    public e(String userName, String cardholderId, el4.f settings, List cards) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f167647a = userName;
        this.f167648b = cardholderId;
        this.f167649c = settings;
        this.d = cards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f167647a, eVar.f167647a) && Intrinsics.f(this.f167648b, eVar.f167648b) && Intrinsics.f(this.f167649c, eVar.f167649c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f167649c.hashCode() + p.a.c(this.f167647a.hashCode() * 31, 31, this.f167648b)) * 31);
    }
}

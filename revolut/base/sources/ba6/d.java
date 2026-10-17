package ba6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b93.b f13926c;
    public final b d;
    public final ArrayList e;

    public d(String code, c type, b93.b cardCode, b status, ArrayList minDonationsToUnlock) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(minDonationsToUnlock, "minDonationsToUnlock");
        this.f13924a = code;
        this.f13925b = type;
        this.f13926c = cardCode;
        this.d = status;
        this.e = minDonationsToUnlock;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f13924a, dVar.f13924a) && this.f13925b == dVar.f13925b && this.f13926c.equals(dVar.f13926c) && this.d == dVar.d && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f13926c.hashCode() + ((this.f13925b.hashCode() + (this.f13924a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}

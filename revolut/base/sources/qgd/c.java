package qgd;

import cli.j;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f245779b;

    public c(UUID idempotencyKey, String newWatchlistNameInput) {
        Intrinsics.checkNotNullParameter(newWatchlistNameInput, "newWatchlistNameInput");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f245778a = newWatchlistNameInput;
        this.f245779b = idempotencyKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f245778a, cVar.f245778a) && Intrinsics.f(this.f245779b, cVar.f245779b);
    }

    public final int hashCode() {
        return this.f245779b.hashCode() + (this.f245778a.hashCode() * 31);
    }
}

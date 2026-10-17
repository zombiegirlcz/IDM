package t6l;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import u6l.g;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm0.a f268382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Json f268383b;

    public b(xm0.a cardDetailsKeyValueController, Json json) {
        Intrinsics.checkNotNullParameter(cardDetailsKeyValueController, "cardDetailsKeyValueController");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f268382a = cardDetailsKeyValueController;
        this.f268383b = json;
    }

    public final g a(String cardId, boolean z) {
        Object objA;
        String strA;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        try {
            m.Companion companion = m.INSTANCE;
            xm0.a aVar = this.f268382a;
            if (z) {
                strA = aVar.a("previous_pin_" + cardId);
            } else {
                strA = aVar.a("pin_" + cardId);
            }
            objA = strA != null ? (g) this.f268383b.b(g.Companion.serializer(), strA) : null;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return (g) (objA instanceof n ? null : objA);
    }

    public final void b(String cardId, String pin, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(pin, "pin");
        g gVar = new g(pin, j2);
        String strC = this.f268383b.c(g.Companion.serializer(), gVar);
        xm0.a aVar = this.f268382a;
        if (z) {
            aVar.b(j6.a.q("previous_pin_", cardId), strC);
        } else {
            aVar.b(j6.a.q("pin_", cardId), strC);
        }
    }
}

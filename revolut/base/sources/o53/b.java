package o53;

import com.revolut.data.database.models.openbanking.d;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;
import z9h.n;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f222307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f222308b;

    public b(j memoryCache, c personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f222307a = personalisationStorage;
        this.f222308b = memoryCache;
    }

    public final void a(String str) {
        c cVar = this.f222307a;
        n.l(String.class, cVar, "CARD_PERSONALISATION_KEY", str);
        d.D(Boolean.TYPE, cVar, "CARD_PERSONALISATION_ADDED_KEY", Boolean.TRUE);
    }
}

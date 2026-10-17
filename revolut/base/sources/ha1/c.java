package ha1;

import com.revolut.feature.acquiring.card_reader.data.impl.data.network.CardReaderService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderService f150349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa1.c f150350b;

    public c(CardReaderService cardReaderService, oa1.c logEventsCache) {
        Intrinsics.checkNotNullParameter(cardReaderService, "cardReaderService");
        Intrinsics.checkNotNullParameter(logEventsCache, "logEventsCache");
        this.f150349a = cardReaderService;
        this.f150350b = logEventsCache;
    }
}

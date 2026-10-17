package ahe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f5024a;

    static {
        Intrinsics.checkNotNullParameter("HOME_TOTAL_WEALTH_HIDDEN_PLACEHOLDERS", "id");
    }

    public q(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f5024a = personalisationStorage;
    }
}

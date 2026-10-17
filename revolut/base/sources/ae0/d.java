package ae0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f3475a;

    public d(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f3475a = languageProvider;
    }

    public final String a() {
        StringBuilder sb6 = new StringBuilder();
        qd0.b bVar = this.f3475a;
        sb6.append(((s80.b) bVar).b().getLanguage());
        sb6.append("_");
        sb6.append(((s80.b) bVar).b().getCountry());
        return sb6.toString();
    }
}

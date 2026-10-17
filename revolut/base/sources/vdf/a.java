package vdf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f287918a = new a();

    private a() {
    }

    public static d a(w80.b moneyFormatter, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(moneyFormatter, "moneyFormatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return new d(moneyFormatter, new ow4.a(languageProvider, 1));
    }
}

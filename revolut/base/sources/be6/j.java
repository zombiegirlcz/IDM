package be6;

import a08.l;
import com.revolut.feature.extension_auth.impl.data.ExtensionAuthService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.r;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtensionAuthService f14687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final akl.c f14688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f14689c;
    public final o d;

    public j(ExtensionAuthService service, akl.c appConsentRepository, ue0.c prefsStorage, o gson) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(appConsentRepository, "appConsentRepository");
        Intrinsics.checkNotNullParameter(prefsStorage, "prefsStorage");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f14687a = service;
        this.f14688b = appConsentRepository;
        this.f14689c = prefsStorage;
        this.d = gson;
    }

    public final r a(String str) {
        pfm.h hVar = new pfm.h(new l(this, str, 8), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }
}

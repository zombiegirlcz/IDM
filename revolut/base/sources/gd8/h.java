package gd8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentPromptService;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements d {

    @NotNull
    public static final f Companion = new f();
    public static final Type d = new TypeToken<Map<String, ? extends ed8.b>>() { // from class: com.revolut.feature.junior_consent.impl.data.repository.JuniorConsentPromptRepositoryImpl$Companion$JUNIOR_CONSENT_PROMPT_STATES_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorConsentPromptService f143085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f143086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao.h f143087c;

    public h(JuniorConsentPromptService juniorConsentPromptService, l80.e dateProvider, ue0.c storage) {
        Intrinsics.checkNotNullParameter(juniorConsentPromptService, "juniorConsentPromptService");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f143085a = juniorConsentPromptService;
        this.f143086b = storage;
        this.f143087c = new ao.h(20, new gd3.i(this, 2));
    }
}

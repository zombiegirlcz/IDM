package e8h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f123679c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f123680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f123681b;

    static {
        Type type = new TypeToken<Boolean>() { // from class: com.revolut.feature.wealth.impl.data.repositories.DisplayCurrencyRepository$Companion$TOOLTIP_SWITCH_CURRENCY_DISMISSED_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f123679c = type;
        Intrinsics.checkNotNullParameter("INVEST_DISPLAY_CURRENCY", "id");
        d = "INVEST_DISPLAY_CURRENCY";
    }

    public e(ue0.c storage, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f123680a = storage;
        this.f123681b = personalisationStorage;
    }
}

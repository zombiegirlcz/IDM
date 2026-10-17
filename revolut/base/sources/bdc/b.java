package bdc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f14543b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14544a;

    static {
        Type type = new TypeToken<List<? extends vcc.a>>() { // from class: com.revolut.feature.revolutpay.shared.domain.repository.CollapsedPocketsRepository$Companion$POCKET_GROUP_IDENTIFIER_SET_DATA_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f14543b = type;
    }

    public b(c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f14544a = storage;
    }
}

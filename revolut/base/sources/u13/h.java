package u13;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type f276346a;

    static {
        Type type = new TypeToken<v13.c>() { // from class: com.revolut.feature.card_order_new.impl.delivery.api.repository.DeliveryRepositoryImplKt$DELIVERY_METHODS_STORAGE_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f276346a = type;
    }

    public static final Type a() {
        return f276346a;
    }
}

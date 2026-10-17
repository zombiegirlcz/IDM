package com.revolut.feature.shared.order_initiation.impl.data.database;

import android.content.Context;
import ce0.a;
import com.revolut.core.data.db.RevolutDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/order_initiation/impl/data/database/OrderInitiationPageDatabase;", "Lcom/revolut/core/data/db/RevolutDatabase;", "<init>", "()V", "Companion", "a", "feature_shared_order_initiation_page_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OrderInitiationPageDatabase extends RevolutDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static OrderInitiationPageDatabase f;

    /* JADX INFO: renamed from: com.revolut.feature.shared.order_initiation.impl.data.database.OrderInitiationPageDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            OrderInitiationPageDatabase orderInitiationPageDatabase = OrderInitiationPageDatabase.f;
            if (orderInitiationPageDatabase != null) {
                OrderInitiationPageDatabase.INSTANCE.getClass();
                a.a(context, "order_initiation_pages.sh", orderInitiationPageDatabase);
            }
            OrderInitiationPageDatabase.f = null;
        }
    }

    public abstract xad.a g();
}

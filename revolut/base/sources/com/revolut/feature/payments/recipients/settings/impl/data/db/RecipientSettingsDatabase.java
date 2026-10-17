package com.revolut.feature.payments.recipients.settings.impl.data.db;

import androidx.room.RoomDatabase;
import cy9.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/recipients/settings/impl/data/db/RecipientSettingsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_payments_recipients_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecipientSettingsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingsDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public abstract b g();
}

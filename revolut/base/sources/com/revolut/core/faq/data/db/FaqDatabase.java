package com.revolut.core.faq.data.db;

import androidx.room.RoomDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xf0.a;
import xf0.e;
import xf0.g;
import xf0.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/faq/data/db/FaqDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FaqDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static FaqDatabase f;

    /* JADX INFO: renamed from: com.revolut.core.faq.data.db.FaqDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public abstract a g();

    public abstract e h();

    public abstract g i();

    public abstract k j();
}

package com.revolut.feature.credit.post_termination_plan.impl.database;

import androidx.room.RoomDatabase;
import ce0.c;
import kotlin.Metadata;
import la5.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/impl/database/PostTerminationPlanDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_credit_post_termination_plan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PostTerminationPlanDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.credit.post_termination_plan.impl.database.PostTerminationPlanDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("credit_post_termination_plan_db", PostTerminationPlanDatabase.class);
        }
    }

    public abstract a g();
}

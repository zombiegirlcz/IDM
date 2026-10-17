package com.revolut.retail.operation_status.step;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/operation_status/step/OperationStatusStepContract$Configuration", "Landroid/os/Parcelable;", "Companion", "a", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OperationStatusStepContract$Configuration extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f104424a;

    /* JADX INFO: renamed from: com.revolut.retail.operation_status.step.OperationStatusStepContract$Configuration$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f104424a = new Companion();

        private Companion() {
        }
    }

    AnalyticsProduct i6();
}

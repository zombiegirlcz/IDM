package com.revolut.core.ui_kit_core.actionshandler;

import android.os.Parcelable;
import android.view.View;
import koi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "Companion", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrackableItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f59776a;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.actionshandler.TrackableItem$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f59776a = new Companion();

        private Companion() {
        }

        public static CustomTrackableComponent a(View view, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new CustomTrackableComponent(parcelable, view.getClass());
        }

        public static CustomTrackableComponent b(k delegate, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new CustomTrackableComponent(parcelable, delegate.getClass());
        }
    }

    /* JADX INFO: renamed from: getAnalyticsContext */
    Parcelable getF59774a();

    void setAnalyticsContext(Parcelable parcelable);
}

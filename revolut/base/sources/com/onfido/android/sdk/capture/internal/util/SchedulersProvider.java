package com.onfido.android.sdk.capture.internal.util;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "", "computation", "Lio/reactivex/rxjava3/core/Scheduler;", "getComputation", "()Lio/reactivex/rxjava3/core/Scheduler;", "io", "getIo", "single", "getSingle", "timer", "getTimer", "ui", "getUi", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SchedulersProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider$Companion;", "", "()V", "getDefault", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SchedulersProvider getDefault() {
            return DefaultSchedulersProvider.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Scheduler getTimer(@NotNull SchedulersProvider schedulersProvider) {
            return schedulersProvider.getComputation();
        }
    }

    @NotNull
    static SchedulersProvider getDefault() {
        return INSTANCE.getDefault();
    }

    @NotNull
    Scheduler getComputation();

    @NotNull
    Scheduler getIo();

    @NotNull
    Scheduler getSingle();

    @NotNull
    Scheduler getTimer();

    @NotNull
    Scheduler getUi();
}

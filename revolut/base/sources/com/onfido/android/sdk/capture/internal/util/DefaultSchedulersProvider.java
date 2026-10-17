package com.onfido.android.sdk.capture.internal.util;

import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import egm.b;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vgm.e;
import vgm.j;
import vgm.t;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/DefaultSchedulersProvider;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "()V", "computation", "Lio/reactivex/rxjava3/core/Scheduler;", "getComputation", "()Lio/reactivex/rxjava3/core/Scheduler;", "io", "getIo", "single", "getSingle", "ui", "getUi", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultSchedulersProvider implements SchedulersProvider {

    @NotNull
    public static final DefaultSchedulersProvider INSTANCE = new DefaultSchedulersProvider();

    private DefaultSchedulersProvider() {
    }

    @Override // com.onfido.android.sdk.capture.internal.util.SchedulersProvider
    @NotNull
    public Scheduler getComputation() {
        e eVar = ehm.e.f126319b;
        Intrinsics.checkNotNullExpressionValue(eVar, "computation(...)");
        return eVar;
    }

    @Override // com.onfido.android.sdk.capture.internal.util.SchedulersProvider
    @NotNull
    public Scheduler getIo() {
        j jVar = ehm.e.f126320c;
        Intrinsics.checkNotNullExpressionValue(jVar, "io(...)");
        return jVar;
    }

    @Override // com.onfido.android.sdk.capture.internal.util.SchedulersProvider
    @NotNull
    public Scheduler getSingle() {
        t tVar = ehm.e.f126318a;
        Intrinsics.checkNotNullExpressionValue(tVar, "single(...)");
        return tVar;
    }

    @Override // com.onfido.android.sdk.capture.internal.util.SchedulersProvider
    @NotNull
    public Scheduler getTimer() {
        return SchedulersProvider.DefaultImpls.getTimer(this);
    }

    @Override // com.onfido.android.sdk.capture.internal.util.SchedulersProvider
    @NotNull
    public Scheduler getUi() {
        Scheduler schedulerA = b.a();
        Intrinsics.checkNotNullExpressionValue(schedulerA, "mainThread(...)");
        return schedulerA;
    }
}

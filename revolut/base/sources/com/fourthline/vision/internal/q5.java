package com.fourthline.vision.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableState f36728a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f36729b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f36730c = new LinkedHashMap();

    public final void addMrzResult(@NotNull rf step, @NotNull d5 result) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f36730c.put(step, result);
    }

    public final void addStepResult(@NotNull rf step, @NotNull c6 result) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f36729b.put(step, result);
    }

    public final void clearResults() {
        this.f36729b.clear();
        this.f36730c.clear();
    }

    @NotNull
    public final Map<rf, d5> getMrzResults() {
        return this.f36730c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fa getRecognizedBounds() {
        return (fa) this.f36728a.getValue();
    }

    @NotNull
    public final Map<rf, c6> getStepResults() {
        return this.f36729b;
    }

    public final void removeResult(@NotNull rf step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f36729b.remove(step);
        this.f36730c.remove(step);
    }

    public final void setRecognizedBounds(fa faVar) {
        this.f36728a.setValue(faVar);
    }
}

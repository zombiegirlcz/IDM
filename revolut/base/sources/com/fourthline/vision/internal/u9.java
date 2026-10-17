package com.fourthline.vision.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class u9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f36982c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u9 f36980a = new u9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36981b = new Object();
    public static final int d = 8;

    private u9() {
    }

    public final void clear() {
        synchronized (f36981b) {
            f36982c = null;
            Unit unit = Unit.f186387a;
        }
    }

    public final void flushToScannerIfPresent() {
        ib.b bVarB;
        ib.h hVar = hb.a.f150532a;
        if (hVar == null || (bVarB = hVar.b(ib.b.Scanner)) == null) {
            return;
        }
        synchronized (f36981b) {
            Map map = f36982c;
            if (map == null) {
                return;
            }
            f36982c = null;
            for (Map.Entry entry : map.entrySet()) {
                bVarB.set((String) entry.getKey(), entry.getValue());
            }
            map.size();
        }
    }

    public final void remember(@NotNull Map<String, ? extends Object> cameraSpecs, @NotNull Map<String, ? extends Object> gpuSpecs) {
        Intrinsics.checkNotNullParameter(cameraSpecs, "cameraSpecs");
        Intrinsics.checkNotNullParameter(gpuSpecs, "gpuSpecs");
        synchronized (f36981b) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(cameraSpecs.size() + gpuSpecs.size());
            linkedHashMap.putAll(cameraSpecs);
            linkedHashMap.putAll(gpuSpecs);
            f36982c = linkedHashMap;
            Unit unit = Unit.f186387a;
        }
    }
}

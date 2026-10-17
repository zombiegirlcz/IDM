package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import uo.q0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f49547c;
    public final Object d;
    public final Object e;

    public u(l7.a aVar, l7.b bVar, l7.b bVar2, l7.b bVar3, l7.b bVar4) {
        this.f49545a = aVar;
        this.f49546b = bVar;
        this.f49547c = bVar2;
        this.d = bVar3;
        this.e = bVar4;
    }

    public static u a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        u uVar = new u(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) uVar.d)) {
            try {
                ((ArrayDeque) uVar.d).clear();
                String string = ((SharedPreferences) uVar.f49545a).getString((String) uVar.f49546b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) uVar.f49547c)) {
                    String[] strArrSplit = string.split((String) uVar.f49547c, -1);
                    if (strArrSplit.length == 0) {
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) uVar.d).add(str);
                        }
                    }
                    return uVar;
                }
                return uVar;
            } finally {
            }
        }
    }

    public u(d4m.a tracker, gpk.c coroutineScopeProvider, uo.b activeScreenHolder, uo.l productMapper, q0 screenNameFinder) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f49545a = tracker;
        this.f49546b = activeScreenHolder;
        this.f49547c = screenNameFinder;
        this.d = productMapper;
        this.e = coroutineScopeProvider;
    }

    public u(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = new ArrayDeque();
        this.f49545a = sharedPreferences;
        this.f49546b = "topic_operation_queue";
        this.f49547c = ",";
        this.e = scheduledThreadPoolExecutor;
    }
}

package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qf.a f49609a = qf.a.d();

    public static void a(Trace trace, rf.c cVar) {
        int i = cVar.f253665a;
        int i2 = cVar.f253667c;
        int i3 = cVar.f253666b;
        if (i > 0) {
            trace.putMetric(a.FRAMES_TOTAL.toString(), i);
        }
        if (i3 > 0) {
            trace.putMetric(a.FRAMES_SLOW.toString(), i3);
        }
        if (i2 > 0) {
            trace.putMetric(a.FRAMES_FROZEN.toString(), i2);
        }
        f49609a.a("Screen trace: " + trace.d + " _fr_tot:" + i + " _fr_slo:" + i3 + " _fr_fzn:" + i2);
    }
}

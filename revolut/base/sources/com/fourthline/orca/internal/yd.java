package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class yd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f35264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35266c;

    private yd(xd xdVar, e4m.e eVar, e4m.e eVar2) {
        this.f35264a = xdVar;
        this.f35265b = eVar;
        this.f35266c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AndroidDataCollectorHelper get() {
        return a(this.f35264a, (Context) this.f35265b.get(), (CoroutineScope) this.f35266c.get());
    }

    public static yd a(xd xdVar, e4m.e eVar, e4m.e eVar2) {
        return new yd(xdVar, eVar, eVar2);
    }

    public static AndroidDataCollectorHelper a(xd xdVar, Context context, CoroutineScope coroutineScope) {
        AndroidDataCollectorHelper androidDataCollectorHelperA = xdVar.a(context, coroutineScope);
        vc.s.k(androidDataCollectorHelperA);
        return androidDataCollectorHelperA;
    }
}

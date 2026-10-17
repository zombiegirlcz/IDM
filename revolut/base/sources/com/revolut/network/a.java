package com.revolut.network;

import a0.d;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f98467b;

    public /* synthetic */ a(Context context, int i) {
        this.f98466a = i;
        this.f98467b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f98466a) {
            case 0:
                return NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$8(this.f98467b, (Long) obj2);
            default:
                hyl.a color = (hyl.a) obj2;
                Intrinsics.checkNotNullParameter(color, "color");
                return d.v(new Object[]{Integer.valueOf(kli.a.s(color.a(), this.f98467b) & 16777215)}, 1, "#%06X", "format(...)");
        }
    }
}

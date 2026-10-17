package com.fourthline.orca.internal;

import android.location.LocationManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class tl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManager f33800b;

    public /* synthetic */ tl1(LocationManager locationManager, int i) {
        this.f33799a = i;
        this.f33800b = locationManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f33799a) {
            case 0:
                return f00.a(this.f33800b, (String) obj2);
            default:
                return jw.a(this.f33800b, (String) obj2);
        }
    }
}

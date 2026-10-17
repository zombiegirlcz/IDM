package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.c21;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ro1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f32791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c21.a.C0175a f32792c;

    public /* synthetic */ ro1(Function1 function1, c21.a.C0175a c0175a, int i) {
        this.f32790a = i;
        this.f32791b = function1;
        this.f32792c = c0175a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f32790a) {
            case 0:
                return k21.a(this.f32791b, this.f32792c, (Bitmap) obj2);
            default:
                return q7.a(this.f32791b, this.f32792c, (Bitmap) obj2);
        }
    }
}

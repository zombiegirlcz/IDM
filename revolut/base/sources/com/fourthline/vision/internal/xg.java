package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.util.Size;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class xg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i8 f37121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Size f37122c;

    public /* synthetic */ xg(i8 i8Var, Size size, int i) {
        this.f37120a = i;
        this.f37121b = i8Var;
        this.f37122c = size;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f37120a) {
            case 0:
                return i8.reconfigureIfError$lambda$0(this.f37121b, this.f37122c, (Throwable) obj2);
            case 1:
                return i8.configureAndCreateSurface$lambda$0(this.f37121b, this.f37122c, (MediaCodec) obj2);
            default:
                return i8.handleReset$lambda$0$0(this.f37121b, this.f37122c, (MediaCodec) obj2);
        }
    }
}

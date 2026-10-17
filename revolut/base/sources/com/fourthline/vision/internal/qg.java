package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf f36740b;

    public /* synthetic */ qg(gf gfVar, int i) {
        this.f36739a = i;
        this.f36740b = gfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36739a) {
            case 0:
                return gf.setup$lambda$0$0$0(this.f36740b, (ud) obj2);
            case 1:
                return gf.setup$lambda$0$0(this.f36740b, (Try) obj2);
            default:
                return gf.setup$lambda$0$1(this.f36740b, (sd) obj2);
        }
    }
}

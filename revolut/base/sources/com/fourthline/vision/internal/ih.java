package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ih implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rc f36383b;

    public /* synthetic */ ih(rc rcVar, int i) {
        this.f36382a = i;
        this.f36383b = rcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36382a) {
            case 0:
                return rc.onFacesDetection$lambda$0(this.f36383b, (HeadMetadata) obj2);
            case 1:
                return rc.onFacesDetection$lambda$1(this.f36383b, ((Integer) obj2).intValue());
            case 2:
                return rc.onFacesDetection$lambda$2(this.f36383b, ((Integer) obj2).intValue());
            default:
                return rc.videoRecorderManager$lambda$1(this.f36383b, (me) obj2);
        }
    }
}

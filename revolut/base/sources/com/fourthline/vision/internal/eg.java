package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.internal.p0;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class eg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36149b;

    public /* synthetic */ eg(Object obj2, int i) {
        this.f36148a = i;
        this.f36149b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36148a) {
            case 0:
                return b.detect$lambda$0((b) this.f36149b, (List) obj2);
            case 1:
                return cd.switchStepsIfTimeout$lambda$0((cd) this.f36149b, (Throwable) obj2);
            case 2:
                return e.stop$lambda$0((e) this.f36149b, (List) obj2);
            case 3:
                return f5.mrzDetectionHandler$lambda$0((f5) this.f36149b, (DocumentScannerEvent) obj2);
            case 4:
                return k7.start$lambda$0$0$0((Image) this.f36149b, (Throwable) obj2);
            case 5:
                return m5.videoRecorderManager$lambda$1((m5) this.f36149b, (me) obj2);
            case 6:
                return p0.recordVideo$lambda$1((p0.d) this.f36149b, (r0) obj2);
            case 7:
                return p8.start$lambda$1((p8) this.f36149b, (Throwable) obj2);
            case 8:
                return q6.detect$lambda$0((q6) this.f36149b, (List) obj2);
            case 9:
                return sc.videoRecorderManager$lambda$1((sc) this.f36149b, (me) obj2);
            default:
                return yd.setupInterpreter$lambda$0((yd) this.f36149b, (Void) obj2);
        }
    }
}

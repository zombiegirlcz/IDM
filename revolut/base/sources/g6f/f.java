package g6f;

import androidx.camera.video.internal.config.AudioConfigUtil;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f140924b;

    public /* synthetic */ f(int i, int i2) {
        this.f140923a = i2;
        this.f140924b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f140923a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return j.a(this.f140924b);
            case 1:
                return Integer.valueOf(AudioConfigUtil.selectSampleRateOrNearestSupported$lambda$0(this.f140924b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Integer.valueOf(this.f140924b);
        }
    }

    public /* synthetic */ f(j jVar, int i) {
        this.f140923a = 0;
        this.f140924b = i;
    }
}

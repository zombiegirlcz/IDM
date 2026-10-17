package s86;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements g {
    public final DeviceManagementDestination.Config.DeviceDetails o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kdh.b f260912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dj3.a f260913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f260914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f260915s;

    public l(DeviceManagementDestination.Config.DeviceDetails input, q mapper, kdh.b deviceManagementInteractor, dj3.a chooserScreenCommandsFactory) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(chooserScreenCommandsFactory, "chooserScreenCommandsFactory");
        this.o = input;
        this.f260912p = deviceManagementInteractor;
        this.f260913q = chooserScreenCommandsFactory;
        this.f260914r = new vii.b();
        this.f260915s = mra.d.b(this, new f(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f260914r, new r3k.c(continuation, this, 28)), null, new s56.i(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f260915s;
    }
}

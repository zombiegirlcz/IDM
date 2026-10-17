package s86;

import ajd.t;
import com.revolut.data.model.Data;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import kotlin.jvm.internal.Intrinsics;
import r7i.r;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceManagementDestination.Config.DeviceDetails f260921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r86.d f260922b;

    public q(DeviceManagementDestination.Config.DeviceDetails input, r86.d deviceManagementMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(deviceManagementMapper, "deviceManagementMapper");
        this.f260921a = input;
        this.f260922b = deviceManagementMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data selectedDevice = domainState.f260905a;
        boolean z = this.f260921a.f71933b;
        Intrinsics.checkNotNullParameter(selectedDevice, "selectedDevice");
        return (i) iii.c.f(selectedDevice, new r(2), new r6d.h(12), new t(this.f260922b, z, 16));
    }
}

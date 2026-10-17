package ha1;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f150359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f150360c;

    public /* synthetic */ h(n nVar, String str, int i) {
        this.f150358a = i;
        this.f150359b = nVar;
        this.f150360c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150358a) {
            case 0:
                ga1.m requestDto = (ga1.m) obj2;
                Intrinsics.checkNotNullParameter(requestDto, "requestDto");
                d0<ga1.n> contactParamsUpdate = this.f150359b.f150372a.getContactParamsUpdate(this.f150360c, requestDto);
                j jVar = new j(5, new k(0));
                contactParamsUpdate.getClass();
                ufm.i iVar = new ufm.i(contactParamsUpdate, jVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return w.i0(ea1.b.d(iVar, "POST: Getting contact params update"));
            case 1:
                ga1.m requestDto2 = (ga1.m) obj2;
                Intrinsics.checkNotNullParameter(requestDto2, "requestDto");
                d0<ga1.n> contactlessParamsUpdate = this.f150359b.f150372a.getContactlessParamsUpdate(this.f150360c, requestDto2);
                j jVar2 = new j(6, new k(1));
                contactlessParamsUpdate.getClass();
                ufm.i iVar2 = new ufm.i(contactlessParamsUpdate, jVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return w.i0(ea1.b.d(iVar2, "POST: Getting contactless params update"));
            case 2:
                ga1.m requestDto3 = (ga1.m) obj2;
                Intrinsics.checkNotNullParameter(requestDto3, "requestDto");
                d0<ga1.n> terminalParams = this.f150359b.f150372a.getTerminalParams(this.f150360c, requestDto3);
                j jVar3 = new j(7, new k(2));
                terminalParams.getClass();
                ufm.i iVar3 = new ufm.i(terminalParams, jVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return w.i0(ea1.b.d(iVar3, "POST: Getting terminals params update"));
            case 3:
                ga1.f requestDto4 = (ga1.f) obj2;
                Intrinsics.checkNotNullParameter(requestDto4, "requestDto");
                n nVar = this.f150359b;
                d0<ga1.d> svppFirmwareUpdate = nVar.f150372a.getSvppFirmwareUpdate(this.f150360c, requestDto4);
                j jVar4 = new j(3, new i(nVar, 1));
                svppFirmwareUpdate.getClass();
                ufm.f fVar = new ufm.f(new ufm.i(svppFirmwareUpdate, jVar4, 1), new j(4, new h8b.l(29)), 3);
                Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                return ea1.b.d(fVar, "POST: Getting SVPP firmware update");
            default:
                ga1.f requestDto5 = (ga1.f) obj2;
                Intrinsics.checkNotNullParameter(requestDto5, "requestDto");
                n nVar2 = this.f150359b;
                d0<ga1.d> bluetoothFirmwareUpdate = nVar2.f150372a.getBluetoothFirmwareUpdate(this.f150360c, requestDto5);
                j jVar5 = new j(1, new i(nVar2, 0));
                bluetoothFirmwareUpdate.getClass();
                ufm.f fVar2 = new ufm.f(new ufm.i(bluetoothFirmwareUpdate, jVar5, 1), new j(2, new h8b.l(28)), 3);
                Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                return ea1.b.d(fVar2, "POST: Getting Bluetooth firmware update");
        }
    }
}

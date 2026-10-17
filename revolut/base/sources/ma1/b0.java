package ma1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha1.v f203866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na1.h f203867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na1.h f203868c;
    public final na1.h d;
    public final na1.h e;
    public final na1.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final na1.h f203869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final na1.h f203870h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ifm.c f203871j;

    public b0(ha1.v rpcCommandsDataSource, na1.h firmwareUpdater, na1.h bluetoothFirmwareUpdater, na1.h dataEncryptionKeyUpdater, na1.h pinEncryptionKeyUpdater, na1.h contactParamsUpdater, na1.h contactlessParamsUpdater, na1.h terminalParamsUpdater) {
        Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
        Intrinsics.checkNotNullParameter(firmwareUpdater, "firmwareUpdater");
        Intrinsics.checkNotNullParameter(bluetoothFirmwareUpdater, "bluetoothFirmwareUpdater");
        Intrinsics.checkNotNullParameter(dataEncryptionKeyUpdater, "dataEncryptionKeyUpdater");
        Intrinsics.checkNotNullParameter(pinEncryptionKeyUpdater, "pinEncryptionKeyUpdater");
        Intrinsics.checkNotNullParameter(contactParamsUpdater, "contactParamsUpdater");
        Intrinsics.checkNotNullParameter(contactlessParamsUpdater, "contactlessParamsUpdater");
        Intrinsics.checkNotNullParameter(terminalParamsUpdater, "terminalParamsUpdater");
        this.f203866a = rpcCommandsDataSource;
        this.f203867b = firmwareUpdater;
        this.f203868c = bluetoothFirmwareUpdater;
        this.d = dataEncryptionKeyUpdater;
        this.e = pinEncryptionKeyUpdater;
        this.f = contactParamsUpdater;
        this.f203869g = contactlessParamsUpdater;
        this.f203870h = terminalParamsUpdater;
        this.i = v0.a.d("create(...)");
    }
}

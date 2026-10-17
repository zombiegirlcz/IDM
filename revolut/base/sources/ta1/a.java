package ta1;

import com.youTransactor.uCube.rpc.RPCCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends RPCCommand {
    public final byte[] H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(byte[] keyPayload) {
        super((short) 20785);
        Intrinsics.checkNotNullParameter(keyPayload, "keyPayload");
        this.H = keyPayload;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public final byte[] createPayload() {
        return this.H;
    }
}

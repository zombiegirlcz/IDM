package ta1;

import com.youTransactor.uCube.rpc.command.InstallForLoadKeyCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends InstallForLoadKeyCommand {

    @NotNull
    public static final a Companion = new a();
    public byte[] H;
    public byte[] I;

    public static final class a {
        private a() {
        }
    }

    @Override // com.youTransactor.uCube.rpc.command.InstallForLoadKeyCommand, com.youTransactor.uCube.rpc.RPCCommand
    public final boolean parseResponse() {
        if (!super.parseResponse()) {
            return false;
        }
        int length = getFullData().length;
        byte[] fullData = getFullData();
        Intrinsics.checkNotNullExpressionValue(fullData, "getFullData(...)");
        byte[] bArrM = p.m(fullData, length - 20, length - 10);
        Intrinsics.checkNotNullParameter(bArrM, "<set-?>");
        this.H = bArrM;
        byte[] fullData2 = getFullData();
        Intrinsics.checkNotNullExpressionValue(fullData2, "getFullData(...)");
        byte[] bArrM2 = p.m(fullData2, length - 10, length);
        Intrinsics.checkNotNullParameter(bArrM2, "<set-?>");
        this.I = bArrM2;
        return true;
    }
}

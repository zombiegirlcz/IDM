package defpackage;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class f1 extends p {
    public static final int[] K = {194, 195, Constants.TAG_FIRMWARE_VERSION, Constants.TAG_EMV_ICC_CONFIG_VERSION, Constants.TAG_MPOS_MODULE_STATE};
    public static final int[] L = {194, 195, Constants.TAG_FIRMWARE_VERSION, 211, Constants.TAG_EMV_ICC_CONFIG_VERSION, Constants.TAG_EMV_NFC_CONFIG_VERSION, Constants.TAG_BLE_FIRMWARE_VERSION, Constants.TAG_RESOURCE_FILE_VERSION};
    public int J;

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        v1.a("Retrieve device model");
        new GetInfosCommand(Constants.TAG_FIRMWARE_VERSION).execute(new d1(this, 0));
    }
}

package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.EMVApplicationDescriptor;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes17.dex */
public class BuildCandidateListCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f107659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f107660n;
    public final int o;

    public BuildCandidateListCommand(boolean z, int i) {
        super(Constants.BUILD_CANDIDATE_LIST, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
        this.f107660n = z;
        this.o = i;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        return this.f107660n ? new byte[]{ISO7816.INS_ENVELOPE, 2, 0, (byte) this.o} : super.createPayload();
    }

    public List<EMVApplicationDescriptor> getCandidateList() {
        return this.f107659m;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        if (this.response.getStatus() != 0) {
            return super.parseResponse();
        }
        boolean z = this.f107660n && this.o == 1;
        byte[] data = this.response.getData();
        this.f107659m = new ArrayList();
        Map<Integer, byte[]> map = TLV.parse(data);
        int i = map.get(194) != null ? 4 : 0;
        if (map.get(195) != null) {
            i += 2;
        }
        int applicationBufferLen = i + 1;
        byte b4 = data[i];
        for (int i2 = b4; i2 > 0; i2--) {
            if (z) {
                EMVApplicationDescriptor tlv = EMVApplicationDescriptor.parseTLV(data, applicationBufferLen);
                if (tlv == null) {
                    return this.f107659m.size() == b4;
                }
                this.f107659m.add(tlv);
                applicationBufferLen = tlv.getApplicationBufferLen() + applicationBufferLen;
            } else {
                EMVApplicationDescriptor legacy = EMVApplicationDescriptor.parseLegacy(data, applicationBufferLen);
                if (legacy == null) {
                    return this.f107659m.size() == b4;
                }
                this.f107659m.add(legacy);
                applicationBufferLen += 64;
            }
        }
        return true;
    }
}

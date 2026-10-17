package com.github.devnied.emvnfccard.parser.impl;

import com.github.devnied.emvnfccard.enums.CommandEnum;
import com.github.devnied.emvnfccard.enums.SwEnum;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.parser.IProvider;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;

/* JADX INFO: loaded from: classes16.dex */
public class ProviderWrapper implements IProvider {
    private IProvider provider;

    public ProviderWrapper(IProvider iProvider) {
        this.provider = iProvider;
    }

    @Override // com.github.devnied.emvnfccard.parser.IProvider
    public byte[] getAt() {
        return this.provider.getAt();
    }

    @Override // com.github.devnied.emvnfccard.parser.IProvider
    public byte[] transceive(byte[] bArr) throws CommunicationException {
        byte[] bArrTransceive = this.provider.transceive(bArr);
        if (!ResponseUtils.isEquals(bArrTransceive, SwEnum.SW_6C)) {
            return ResponseUtils.isEquals(bArrTransceive, SwEnum.SW_61) ? this.provider.transceive(new CommandApdu(CommandEnum.GET_RESPONSE, (byte[]) null, bArrTransceive[bArrTransceive.length - 1]).toBytes()) : bArrTransceive;
        }
        bArr[bArr.length - 1] = bArrTransceive[bArrTransceive.length - 1];
        return this.provider.transceive(bArr);
    }
}

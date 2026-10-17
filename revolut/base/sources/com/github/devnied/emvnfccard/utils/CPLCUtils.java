package com.github.devnied.emvnfccard.utils;

import com.github.devnied.emvnfccard.enums.TagValueTypeEnum;
import com.github.devnied.emvnfccard.iso7816emv.ITag;
import com.github.devnied.emvnfccard.iso7816emv.impl.TagImpl;
import com.github.devnied.emvnfccard.model.CPLC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class CPLCUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) CPLCUtils.class);
    private static final ITag CPLC_TAG = new TagImpl("9f7f", TagValueTypeEnum.BINARY, "Card Production Life Cycle Data", "");

    private CPLCUtils() {
    }

    public static CPLC parse(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 44) {
                if (bArr.length == 47) {
                    bArr = TlvUtil.getValue(bArr, CPLC_TAG);
                } else {
                    LOGGER.error("CPLC data not valid");
                }
            }
            CPLC cplc = new CPLC();
            cplc.parse(bArr, null);
            return cplc;
        }
        return null;
    }
}

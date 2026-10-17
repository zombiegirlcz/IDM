package com.github.devnied.emvnfccard.parser.apdu;

import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
public interface IFile {
    void parse(byte[] bArr, Collection<TagAndLength> collection);
}

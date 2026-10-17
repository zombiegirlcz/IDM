package com.github.devnied.emvnfccard.parser;

import com.github.devnied.emvnfccard.exception.CommunicationException;

/* JADX INFO: loaded from: classes16.dex */
public interface IProvider {
    byte[] getAt();

    byte[] transceive(byte[] bArr) throws CommunicationException;
}

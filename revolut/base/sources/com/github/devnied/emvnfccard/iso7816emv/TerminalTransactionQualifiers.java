package com.github.devnied.emvnfccard.iso7816emv;

import fr.devnied.bitlib.BytesUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class TerminalTransactionQualifiers {
    private byte[] data = new byte[4];

    public boolean consumerDeviceCVMsupported() {
        return BytesUtils.matchBitByBitIndex(this.data[2], 6);
    }

    public boolean contactChipOfflinePINsupported() {
        return BytesUtils.matchBitByBitIndex(this.data[1], 5);
    }

    public boolean contactEMVsupported() {
        return BytesUtils.matchBitByBitIndex(this.data[0], 4);
    }

    public boolean contactlessEMVmodeSupported() {
        return BytesUtils.matchBitByBitIndex(this.data[0], 5);
    }

    public boolean contactlessMagneticStripeSupported() {
        return BytesUtils.matchBitByBitIndex(this.data[0], 7);
    }

    public boolean contactlessVSDCsupported() {
        return BytesUtils.matchBitByBitIndex(this.data[0], 6);
    }

    public boolean cvmRequired() {
        return BytesUtils.matchBitByBitIndex(this.data[1], 6);
    }

    public byte[] getBytes() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public boolean issuerUpdateProcessingSupported() {
        return BytesUtils.matchBitByBitIndex(this.data[2], 7);
    }

    public boolean onlineCryptogramRequired() {
        return BytesUtils.matchBitByBitIndex(this.data[1], 7);
    }

    public boolean onlinePINsupported() {
        return BytesUtils.matchBitByBitIndex(this.data[0], 2);
    }

    public boolean readerIsOfflineOnly() {
        return BytesUtils.matchBitByBitIndex(this.data[0], 3);
    }

    public void setConsumerDeviceCVMsupported(boolean z) {
        byte[] bArr = this.data;
        bArr[2] = BytesUtils.setBit(bArr[2], 6, z);
    }

    public void setContactChipOfflinePINsupported(boolean z) {
        byte[] bArr = this.data;
        bArr[1] = BytesUtils.setBit(bArr[1], 5, z);
    }

    public void setContactEMVsupported(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = BytesUtils.setBit(bArr[0], 4, z);
    }

    public void setContactlessEMVmodeSupported(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = BytesUtils.setBit(bArr[0], 5, z);
    }

    public void setContactlessVSDCsupported(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = BytesUtils.setBit(bArr[0], 6, z);
        if (z) {
            setContactlessEMVmodeSupported(false);
        }
    }

    public void setCvmRequired(boolean z) {
        byte[] bArr = this.data;
        bArr[1] = BytesUtils.setBit(bArr[1], 6, z);
    }

    public void setIssuerUpdateProcessingSupported(boolean z) {
        byte[] bArr = this.data;
        bArr[2] = BytesUtils.setBit(bArr[2], 7, z);
    }

    public void setMagneticStripeSupported(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = BytesUtils.setBit(bArr[0], 7, z);
    }

    public void setOnlineCryptogramRequired(boolean z) {
        byte[] bArr = this.data;
        bArr[1] = BytesUtils.setBit(bArr[1], 7, z);
    }

    public void setOnlinePINsupported(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = BytesUtils.setBit(bArr[0], 2, z);
    }

    public void setReaderIsOfflineOnly(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = BytesUtils.setBit(bArr[0], 3, z);
    }

    public void setSignatureSupported(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = BytesUtils.setBit(bArr[0], 1, z);
    }

    public boolean signatureSupported() {
        return BytesUtils.matchBitByBitIndex(this.data[0], 1);
    }
}

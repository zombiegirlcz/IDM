package com.onfido.android.sdk.capture.internal.nfc.data;

import kotlin.Metadata;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/data/IncorrectPinException;", "Lnet/sf/scuba/smartcards/CardServiceException;", "attemptsLeft", "", "sw", "(II)V", "getAttemptsLeft", "()I", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IncorrectPinException extends CardServiceException {
    private final int attemptsLeft;

    public IncorrectPinException(int i, int i2) {
        super("Incorrect PIN", i2);
        this.attemptsLeft = i;
    }

    public final int getAttemptsLeft() {
        return this.attemptsLeft;
    }
}

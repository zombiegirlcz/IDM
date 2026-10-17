package com.ironz.binaryprefs.exception;

/* JADX INFO: loaded from: classes17.dex */
public final class TransactionInvalidatedException extends RuntimeException {
    public TransactionInvalidatedException() {
        super("Transaction should be applied or committed only once!");
    }
}

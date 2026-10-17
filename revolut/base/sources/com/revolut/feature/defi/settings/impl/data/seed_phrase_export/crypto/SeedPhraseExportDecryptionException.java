package com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "InvalidResponse", "DecryptionFailed", "InvalidMnemonic", "InvalidWalletSet", "AddressMismatch", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$AddressMismatch;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$DecryptionFailed;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$InvalidMnemonic;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$InvalidResponse;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$InvalidWalletSet;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SeedPhraseExportDecryptionException extends RuntimeException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$AddressMismatch;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException;", "<init>", "()V", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressMismatch extends SeedPhraseExportDecryptionException {
        public AddressMismatch() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$DecryptionFailed;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException;", "<init>", "()V", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DecryptionFailed extends SeedPhraseExportDecryptionException {
        public DecryptionFailed() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$InvalidMnemonic;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException;", "<init>", "()V", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidMnemonic extends SeedPhraseExportDecryptionException {
        public InvalidMnemonic() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$InvalidResponse;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException;", "<init>", "()V", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidResponse extends SeedPhraseExportDecryptionException {
        public InvalidResponse() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException$InvalidWalletSet;", "Lcom/revolut/feature/defi/settings/impl/data/seed_phrase_export/crypto/SeedPhraseExportDecryptionException;", "<init>", "()V", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidWalletSet extends SeedPhraseExportDecryptionException {
        public InvalidWalletSet() {
            super(0);
        }
    }

    public /* synthetic */ SeedPhraseExportDecryptionException(int i) {
        this();
    }

    private SeedPhraseExportDecryptionException() {
    }
}

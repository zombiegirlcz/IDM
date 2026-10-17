package com.revolut.feature.defi.settings.impl.domain.seed_phrase_export;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/domain/seed_phrase_export/SeedPhraseExportException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "PendingOperation", "RecipientKeyReused", "Lcom/revolut/feature/defi/settings/impl/domain/seed_phrase_export/SeedPhraseExportException$PendingOperation;", "Lcom/revolut/feature/defi/settings/impl/domain/seed_phrase_export/SeedPhraseExportException$RecipientKeyReused;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SeedPhraseExportException extends RuntimeException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/domain/seed_phrase_export/SeedPhraseExportException$PendingOperation;", "Lcom/revolut/feature/defi/settings/impl/domain/seed_phrase_export/SeedPhraseExportException;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingOperation extends SeedPhraseExportException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/domain/seed_phrase_export/SeedPhraseExportException$RecipientKeyReused;", "Lcom/revolut/feature/defi/settings/impl/domain/seed_phrase_export/SeedPhraseExportException;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientKeyReused extends SeedPhraseExportException {
    }
}

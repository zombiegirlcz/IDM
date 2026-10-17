package com.trustdockekyc.core.backend.presentation;

import com.trustdockekyc.core.backend.domain.model.AppError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/trustdockekyc/core/backend/presentation/SubmissionProcessResultListener;", "", "onResult", "", "e", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "completed", "", "error", "showError", "message", "", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SubmissionProcessResultListener {
    void onResult(@NotNull AppError e);

    void onResult(boolean completed, AppError error);

    void showError(@NotNull AppError e, String message);
}

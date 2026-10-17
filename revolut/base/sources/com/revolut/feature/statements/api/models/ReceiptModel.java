package com.revolut.feature.statements.api.models;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/revolut/feature/statements/api/models/ReceiptModel;", "", "receiptTitle", "", "receiptImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReceiptTitle", "()Ljava/lang/String;", "getReceiptImage", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReceiptModel {

    @NotNull
    private final String receiptImage;

    @NotNull
    private final String receiptTitle;

    public ReceiptModel(@NotNull String receiptTitle, @NotNull String receiptImage) {
        Intrinsics.checkNotNullParameter(receiptTitle, "receiptTitle");
        Intrinsics.checkNotNullParameter(receiptImage, "receiptImage");
        this.receiptTitle = receiptTitle;
        this.receiptImage = a.q("data:image/png;base64,", receiptImage);
    }

    @NotNull
    public final String getReceiptImage() {
        return this.receiptImage;
    }

    @NotNull
    public final String getReceiptTitle() {
        return this.receiptTitle;
    }
}

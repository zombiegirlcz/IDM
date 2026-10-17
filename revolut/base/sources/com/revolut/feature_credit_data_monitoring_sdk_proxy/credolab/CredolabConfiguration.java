package com.revolut.feature_credit_data_monitoring_sdk_proxy.credolab;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/credolab/CredolabConfiguration;", "", "context", "Landroid/content/Context;", "uploadToken", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getUploadToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CredolabConfiguration {

    @NotNull
    private final Context context;

    @NotNull
    private final String uploadToken;

    public CredolabConfiguration(@NotNull Context context, @NotNull String uploadToken) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        this.context = context;
        this.uploadToken = uploadToken;
    }

    public static /* synthetic */ CredolabConfiguration copy$default(CredolabConfiguration credolabConfiguration, Context context, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            context = credolabConfiguration.context;
        }
        if ((i & 2) != 0) {
            str = credolabConfiguration.uploadToken;
        }
        return credolabConfiguration.copy(context, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUploadToken() {
        return this.uploadToken;
    }

    @NotNull
    public final CredolabConfiguration copy(@NotNull Context context, @NotNull String uploadToken) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        return new CredolabConfiguration(context, uploadToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CredolabConfiguration)) {
            return false;
        }
        CredolabConfiguration credolabConfiguration = (CredolabConfiguration) other;
        return Intrinsics.f(this.context, credolabConfiguration.context) && Intrinsics.f(this.uploadToken, credolabConfiguration.uploadToken);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getUploadToken() {
        return this.uploadToken;
    }

    public int hashCode() {
        return this.uploadToken.hashCode() + (this.context.hashCode() * 31);
    }
}

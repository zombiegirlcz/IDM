package com.revolut.network.error;

import com.revolut.core.error.data.model.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/network/error/AbstractErrorHandler;", "Lsri/m;", "navigator", "<init>", "(Lsri/m;)V", "Lcom/revolut/core/error/data/model/ServerError;", "serverError", "", "tryHandleError", "(Lcom/revolut/core/error/data/model/ServerError;)Z", "isApplicable", "", "apply", "(Lcom/revolut/core/error/data/model/ServerError;)V", "Lsri/m;", "getNavigator", "()Lsri/m;", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractErrorHandler {
    private final m navigator;

    public AbstractErrorHandler(m mVar) {
        this.navigator = mVar;
    }

    public void apply(@NotNull ServerError serverError) {
        Intrinsics.checkNotNullParameter(serverError, "serverError");
    }

    public final m getNavigator() {
        return this.navigator;
    }

    public boolean isApplicable(@NotNull ServerError serverError) {
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        return false;
    }

    public boolean tryHandleError(@NotNull ServerError serverError) {
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        if (!isApplicable(serverError)) {
            return false;
        }
        apply(serverError);
        return true;
    }
}

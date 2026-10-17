package com.revolut.feature.payments.messaging.data.impl.encryption;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import cv9.a;
import efm.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import pv9.d;
import ue0.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/impl/encryption/PeerToPeerChatPublicKeyPropagationWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcv9/a;", "encryptionInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcv9/a;)V", "Companion", "pv9/l", "a", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerChatPublicKeyPropagationWorker extends RxWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f79586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerToPeerChatPublicKeyPropagationWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a encryptionInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        this.f79586a = encryptionInteractor;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        if (getRunAttemptCount() >= 3) {
            return d0.m(ListenableWorker.Result.failure());
        }
        z zVarD = ((d) this.f79586a).k().D(ListenableWorker.Result.success());
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, ListenableWorker.Result.retry());
    }
}

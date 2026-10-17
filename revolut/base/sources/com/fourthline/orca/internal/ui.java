package com.fourthline.orca.internal;

import com.fourthline.orca.internal.si;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ui implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ww f34098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ww f34099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ww f34100c;

    public ui(ww permissionErrorPopupClicksHandler, ww postProcessingErrorPopupClicksHandler, ww scannerErrorPopupClicksHandler) {
        Intrinsics.checkNotNullParameter(permissionErrorPopupClicksHandler, "permissionErrorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(postProcessingErrorPopupClicksHandler, "postProcessingErrorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(scannerErrorPopupClicksHandler, "scannerErrorPopupClicksHandler");
        this.f34098a = permissionErrorPopupClicksHandler;
        this.f34099b = postProcessingErrorPopupClicksHandler;
        this.f34100c = scannerErrorPopupClicksHandler;
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(kd1 intent, si error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if (error instanceof si.d) {
            this.f34098a.onPrimaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof si.e) {
            this.f34099b.onPrimaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof si.f) {
            this.f34100c.onPrimaryClicked(intent, error, source, retryBlock);
            return;
        }
        if ((error instanceof si.a) || (error instanceof si.b)) {
            throw new IllegalStateException((error + " is not handled by this object.").toString());
        }
        if (!(error instanceof si.c) && !(error instanceof si.g)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException((error + " state should not have a clickable primary button").toString());
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(kd1 intent, si error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if (error instanceof si.d) {
            this.f34098a.onSecondaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof si.e) {
            this.f34099b.onSecondaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof si.f) {
            this.f34100c.onSecondaryClicked(intent, error, source, retryBlock);
            return;
        }
        if ((error instanceof si.a) || (error instanceof si.b)) {
            throw new IllegalStateException((error + " is not handled by this object.").toString());
        }
        if (!(error instanceof si.c) && !(error instanceof si.g)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException((error + " state should not have a clickable secondary button").toString());
    }
}

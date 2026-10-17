package com.fourthline.orca.internal;

import com.fourthline.orca.internal.si;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vi implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yw f34364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yw f34365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yw f34366c;

    public vi(yw permissionErrorPopupStateBuilder, yw postProcessingErrorPopupStateBuilder, yw scannerErrorPopupStateBuilder) {
        Intrinsics.checkNotNullParameter(permissionErrorPopupStateBuilder, "permissionErrorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(postProcessingErrorPopupStateBuilder, "postProcessingErrorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(scannerErrorPopupStateBuilder, "scannerErrorPopupStateBuilder");
        this.f34364a = permissionErrorPopupStateBuilder;
        this.f34365b = postProcessingErrorPopupStateBuilder;
        this.f34366c = scannerErrorPopupStateBuilder;
    }

    @Override // com.fourthline.orca.internal.yw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zp0 buildStateFor(si error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof si.d) {
            return this.f34364a.buildStateFor(error);
        }
        if (error instanceof si.e) {
            return this.f34365b.buildStateFor(error);
        }
        if (error instanceof si.f) {
            return this.f34366c.buildStateFor(error);
        }
        if ((error instanceof si.a) || (error instanceof si.b)) {
            throw new IllegalStateException((error + " is not handled by this object.").toString());
        }
        if (!(error instanceof si.c) && !(error instanceof si.g)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Document product doesn't have state for " + error).toString());
    }
}

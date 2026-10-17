package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.vision.internal.ra;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class d implements ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ne f36086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f36088c;

    public d(@NotNull ne analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f36086a = analytics;
        this.f36087b = true;
    }

    public final Object getCurrentStep() {
        return this.f36088c;
    }

    @Override // com.fourthline.vision.internal.ka
    public boolean getScannerLevelCallbacksAllowed() {
        return this.f36087b;
    }

    @Override // com.fourthline.vision.internal.ka
    public void onMoveToNextStep() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        this.f36086a.onMoveToNextStep();
    }

    @Override // com.fourthline.vision.internal.ka
    public void onResetCurrentStep(Object obj2) {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(obj2);
        this.f36086a.onResetCurrentStep(obj2);
    }

    @Override // com.fourthline.vision.internal.ka
    public void onScannerResult(@NotNull Try<ua> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(result);
        Object obj2 = this.f36088c;
        if (obj2 != null) {
            if (result instanceof Try.Failure) {
                Throwable exception = ((Try.Failure) result).getException();
                if (exception instanceof ra.a) {
                    this.f36086a.onFail(obj2, ((ra.a) exception).getError(), exception);
                    return;
                }
                return;
            }
            if (!(result instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f36086a.onSuccess((ua) ((Try.Success) result).getValue());
        }
    }

    @Override // com.fourthline.vision.internal.ka
    public void onStart() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        this.f36086a.onStart();
    }

    @Override // com.fourthline.vision.internal.ka
    public void onStepResult(@NotNull Try<? extends ud> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(result);
        Object obj2 = this.f36088c;
        if (obj2 != null) {
            if (result instanceof Try.Failure) {
                Throwable exception = ((Try.Failure) result).getException();
                if (exception instanceof ra.a) {
                    this.f36086a.onFail(obj2, ((ra.a) exception).getError(), exception);
                    return;
                }
                return;
            }
            if (!(result instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f36086a.onStepSuccess(obj2, (ud) ((Try.Success) result).getValue());
        }
    }

    @Override // com.fourthline.vision.internal.ka
    public void onStepUpdate(Object obj2) {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(obj2);
        this.f36088c = obj2;
        this.f36086a.onStepUpdate(obj2);
    }

    @Override // com.fourthline.vision.internal.ka
    public void onStepsSizeUpdate(int i) {
    }

    @Override // com.fourthline.vision.internal.ka
    public void onTakeSnapshot() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Object obj2 = this.f36088c;
        if (obj2 != null) {
            this.f36086a.onTakeSnapshot(obj2);
        }
    }

    @Override // com.fourthline.vision.internal.ka
    public void reset() {
        this.f36086a.onReset();
        setScannerLevelCallbacksAllowed(true);
        this.f36088c = null;
    }

    public final void setCurrentStep(Object obj2) {
        this.f36088c = obj2;
    }

    public void setScannerLevelCallbacksAllowed(boolean z) {
        this.f36087b = z;
    }
}

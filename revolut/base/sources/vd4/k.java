package vd4;

import android.content.Context;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreenContract$InputData;
import hw3.p;
import hw3.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements dli.b {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f287790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f287791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PasswordInputScreenContract$InputData f287792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f287793s;

    public k(p documentUnlockInteractor, s documentValidationInteractor, Context context, PasswordInputScreenContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(documentUnlockInteractor, "documentUnlockInteractor");
        Intrinsics.checkNotNullParameter(documentValidationInteractor, "documentValidationInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = documentUnlockInteractor;
        this.f287790p = documentValidationInteractor;
        this.f287791q = context;
        this.f287792r = inputData;
        this.f287793s = mra.d.b(this, new e(inputData.f67963a, inputData.f67964b, null, null, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f287793s;
    }
}

package yk6;

import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oz1.j f314576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PseVerificationCodeScreenContract$InputData f314577b;

    public a(oz1.j authorisationInteractor, PseVerificationCodeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(authorisationInteractor, "authorisationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f314576a = authorisationInteractor;
        this.f314577b = inputData;
    }
}

package com.revolut.feature.onboarding.impl.onboarding.passcode;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeCollectionScreenContract$PasscodeScreenMode;
import jb9.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements n {
    @Override // cli.n
    public final o c(j jVar) {
        jb9.a domainState = (jb9.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PasscodeCollectionScreenContract$PasscodeScreenMode passcodeCollectionScreenContract$PasscodeScreenMode = domainState.f172610a;
        boolean z = domainState.f172611b;
        if (passcodeCollectionScreenContract$PasscodeScreenMode instanceof PasscodeCollectionScreenContract$PasscodeScreenMode.Creation) {
            return new f(new TextLocalisedClause(R$string.signup_create_passcode_title, null, null, 14), z, passcodeCollectionScreenContract$PasscodeScreenMode instanceof PasscodeCollectionScreenContract$PasscodeScreenMode.Confirmation ? true : ((PasscodeCollectionScreenContract$PasscodeScreenMode.Creation) passcodeCollectionScreenContract$PasscodeScreenMode).f78463b.b());
        }
        if (passcodeCollectionScreenContract$PasscodeScreenMode instanceof PasscodeCollectionScreenContract$PasscodeScreenMode.Confirmation) {
            return new f(new TextLocalisedClause(R$string.signup_confirm_passcode_title, null, null, 14), z, true);
        }
        throw new NoWhenBranchMatchedException();
    }
}

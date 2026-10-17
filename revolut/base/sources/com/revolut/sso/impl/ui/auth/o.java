package com.revolut.sso.impl.ui.auth;

import bjl.p0;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class o {
    public static final String a(AuthenticationFlowContract$State authenticationFlowContract$State, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(authenticationFlowContract$State, "<this>");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
            return ((rqk.k) revolutSsoDependenciesProvider).f256593p;
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) {
            return ((AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) authenticationFlowContract$State).f106297c;
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
            return ((AuthenticationFlowContract$State.ExternalClientAuthentication) authenticationFlowContract$State).f106263c;
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
            String str = ((AuthenticationFlowContract$State.OperationBoundAuthentication) authenticationFlowContract$State).i;
            return str == null ? ((rqk.k) revolutSsoDependenciesProvider).f256593p : str;
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn) {
            return ((rqk.k) revolutSsoDependenciesProvider).f256593p;
        }
        throw new NoWhenBranchMatchedException();
    }
}

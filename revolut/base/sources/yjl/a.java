package yjl;

import bjl.p0;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final String a(AuthAction authAction) {
        List list;
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if ((authAction instanceof AuthAction.AccessRecovery) || (authAction instanceof AuthAction.SignInWithRevolutId)) {
            list = null;
        } else if (authAction instanceof AuthAction.AuthoriseExternalClient) {
            list = ((AuthAction.AuthoriseExternalClient) authAction).d;
        } else if (authAction instanceof AuthAction.OperationBoundAuthentication) {
            list = ((AuthAction.OperationBoundAuthentication) authAction).d;
        } else {
            if (!(authAction instanceof AuthAction.SignIn)) {
                throw new NoWhenBranchMatchedException();
            }
            list = ((AuthAction.SignIn) authAction).f106058m;
        }
        if (list != null) {
            return d0.k0(list, " ", null, null, 0, null, 62);
        }
        return null;
    }

    public static final String b(AuthAction authAction) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if ((authAction instanceof AuthAction.AccessRecovery) || (authAction instanceof AuthAction.AuthoriseExternalClient)) {
            return null;
        }
        if (authAction instanceof AuthAction.OperationBoundAuthentication) {
            return ((AuthAction.OperationBoundAuthentication) authAction).f106048l;
        }
        if ((authAction instanceof AuthAction.SignInWithRevolutId) || (authAction instanceof AuthAction.SignIn)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Integer c(AuthAction authAction) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if ((authAction instanceof AuthAction.AccessRecovery) || (authAction instanceof AuthAction.AuthoriseExternalClient) || (authAction instanceof AuthAction.SignInWithRevolutId) || (authAction instanceof AuthAction.OperationBoundAuthentication)) {
            return null;
        }
        if (authAction instanceof AuthAction.SignIn) {
            return ((AuthAction.SignIn) authAction).f106056j;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Claim d(AuthAction authAction) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if (authAction instanceof AuthAction.AccessRecovery) {
            return ((AuthAction.AccessRecovery) authAction).f;
        }
        if ((authAction instanceof AuthAction.AuthoriseExternalClient) || (authAction instanceof AuthAction.SignInWithRevolutId) || (authAction instanceof AuthAction.OperationBoundAuthentication)) {
            return null;
        }
        if (authAction instanceof AuthAction.SignIn) {
            return ((AuthAction.SignIn) authAction).f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(AuthAction authAction, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        if (authAction instanceof AuthAction.AccessRecovery) {
            return ((rqk.k) revolutSsoDependenciesProvider).f256593p;
        }
        if (authAction instanceof AuthAction.AuthoriseExternalClient) {
            return ((AuthAction.AuthoriseExternalClient) authAction).f106039c;
        }
        if (authAction instanceof AuthAction.SignInWithRevolutId) {
            return ((AuthAction.SignInWithRevolutId) authAction).f106062c;
        }
        if (authAction instanceof AuthAction.OperationBoundAuthentication) {
            String str = ((AuthAction.OperationBoundAuthentication) authAction).f106047j;
            return str == null ? ((rqk.k) revolutSsoDependenciesProvider).f256593p : str;
        }
        if (authAction instanceof AuthAction.SignIn) {
            return ((rqk.k) revolutSsoDependenciesProvider).f256593p;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final InitialAuthenticationCredential f(AuthAction authAction) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if (authAction instanceof AuthAction.AccessRecovery) {
            return ((AuthAction.AccessRecovery) authAction).f106033b;
        }
        if (authAction instanceof AuthAction.SignInWithRevolutId) {
            return ((AuthAction.SignInWithRevolutId) authAction).f106061b;
        }
        if (authAction instanceof AuthAction.AuthoriseExternalClient) {
            return ((AuthAction.AuthoriseExternalClient) authAction).f106038b;
        }
        if (authAction instanceof AuthAction.OperationBoundAuthentication) {
            return ((AuthAction.OperationBoundAuthentication) authAction).f106044c;
        }
        if (authAction instanceof AuthAction.SignIn) {
            return ((AuthAction.SignIn) authAction).f106052b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final cjl.s g(AuthAction authAction) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if ((authAction instanceof AuthAction.AccessRecovery) || (authAction instanceof AuthAction.AuthoriseExternalClient) || (authAction instanceof AuthAction.SignIn) || (authAction instanceof AuthAction.SignInWithRevolutId)) {
            return cjl.s.GLOBAL;
        }
        if (authAction instanceof AuthAction.OperationBoundAuthentication) {
            return ((AuthAction.OperationBoundAuthentication) authAction).f106042a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Boolean h(AuthAction authAction) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if ((authAction instanceof AuthAction.AccessRecovery) || (authAction instanceof AuthAction.SignInWithRevolutId) || (authAction instanceof AuthAction.AuthoriseExternalClient) || (authAction instanceof AuthAction.OperationBoundAuthentication)) {
            return null;
        }
        if (authAction instanceof AuthAction.SignIn) {
            return ((AuthAction.SignIn) authAction).f106057l;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String i(AuthAction authAction) {
        Intrinsics.checkNotNullParameter(authAction, "<this>");
        if (authAction instanceof AuthAction.AccessRecovery) {
            return null;
        }
        if (authAction instanceof AuthAction.SignInWithRevolutId) {
            return ((AuthAction.SignInWithRevolutId) authAction).f;
        }
        if (authAction instanceof AuthAction.AuthoriseExternalClient) {
            return ((AuthAction.AuthoriseExternalClient) authAction).e;
        }
        if (authAction instanceof AuthAction.OperationBoundAuthentication) {
            return ((AuthAction.OperationBoundAuthentication) authAction).e;
        }
        if (authAction instanceof AuthAction.SignIn) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

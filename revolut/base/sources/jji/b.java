package jji;

import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final AccountCreationTransitionAnimation a(TransitionAnimation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new AccountCreationTransitionAnimation(false);
    }

    public static final AccountCreationTransitionAnimation b(TransitionAnimation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new AccountCreationTransitionAnimation(true);
    }
}

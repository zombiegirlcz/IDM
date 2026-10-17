package gya;

import jxa.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f147841a;

    public c(l sharedTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(sharedTransactionsInteractor, "sharedTransactionsInteractor");
        this.f147841a = sharedTransactionsInteractor;
    }
}

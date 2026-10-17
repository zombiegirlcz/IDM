package b96;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();
    public static final xi0.b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z71.a f13671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f13672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1k.a f13673c;
    public final zxd.c d;

    static {
        xi0.b.Companion.getClass();
        e = xi0.b.i;
    }

    public e(z71.a revolutBankAccountsRepository, ang.f userInteractor, y1k.a bankTransferInteractor, zxd.c statementInteractor) {
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(statementInteractor, "statementInteractor");
        this.f13671a = revolutBankAccountsRepository;
        this.f13672b = userInteractor;
        this.f13673c = bankTransferInteractor;
        this.d = statementInteractor;
    }

    public final r a(boolean z) {
        return m70.a.g(nim.a.w(z71.a.b(this.f13671a, z, null, null, 6), new a(1)), null, new b6d.a(20), 1);
    }
}

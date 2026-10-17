package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanToggleBackupCardScreenContract$InputData f277188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277190c;
    public final e4m.e d;

    public o0(h hVar, LoanToggleBackupCardScreenContract$InputData loanToggleBackupCardScreenContract$InputData) {
        this.f277189b = hVar;
        this.f277188a = loanToggleBackupCardScreenContract$InputData;
        this.f277190c = e4m.b.b(new e(hVar, this, 1, 22));
        this.d = e4m.b.b(new e(hVar, this, 0, 22));
    }

    @Override // sji.b
    public final Set f() {
        s85.c extension = new s85.c((l35.b) this.f277189b.L.get());
        t85.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        return ImmutableSet.of(extension);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

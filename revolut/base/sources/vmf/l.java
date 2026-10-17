package vmf;

import cli.n;
import cli.y;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements dli.b {

    @NotNull
    public static final i Companion = new i();
    public final EditNoteScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f290572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f290573q;

    public l(n stateMapper, g saveStateDelegate, EditNoteScreenContract$InputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.o = inputData;
        this.f290572p = transactionsInteractor;
        String str = inputData.f92061b;
        this.f290573q = mra.d.b(this, new f(str, str), stateMapper, saveStateDelegate, false, 8);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290573q;
    }
}

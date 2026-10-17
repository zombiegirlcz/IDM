package j8i;

import cli.y;
import com.revolut.feature_move_money.impl.review.edit_note.MoveMoneyEditNoteScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends oki.h implements dli.b {
    public final y o;

    public i(j stateMapper, MoveMoneyEditNoteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        String str = inputData.f97412a;
        this.o = mra.d.b(this, new e(str == null ? "" : str), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}

package ee1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f125066p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddNoteScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f125066p = new d(inputData.f60770b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f125066p;
    }
}

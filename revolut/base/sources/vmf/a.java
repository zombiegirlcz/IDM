package vmf;

import android.os.Parcelable;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        f currentState = (f) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new EditNoteScreenContract$RetainedState(currentState.f290566a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        f initialState = (f) obj2;
        EditNoteScreenContract$RetainedState retainedState = (EditNoteScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return f.a(initialState, retainedState.f92062a);
    }
}

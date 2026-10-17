package jef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddNoteScreenContract$InputData f173360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f173361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173362c;

    public a(e eVar, g gVar, AddNoteScreenContract$InputData addNoteScreenContract$InputData) {
        this.f173360a = addNoteScreenContract$InputData;
        int i = 2;
        this.f173361b = e4m.b.b(new jdi.i(gVar, this, 1, i));
        this.f173362c = e4m.b.b(new jdi.i(gVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}

package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreenContract$InputData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddNoteScreenContract$InputData f193923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f193924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193925c;
    public final e4m.e d;

    public b(l lVar, m mVar, AddNoteScreenContract$InputData addNoteScreenContract$InputData) {
        this.f193924b = mVar;
        this.f193923a = addNoteScreenContract$InputData;
        int i = 15;
        this.f193925c = e4m.b.b(new kyk.n(this, 1, i));
        this.d = e4m.b.b(new kyk.n(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        ArrayList arrayList = new ArrayList(2);
        m mVar = this.f193924b;
        kii.e.w(mVar.k, "Set contributions cannot be null", arrayList);
        return kii.e.C(mVar.f193977n, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }
}

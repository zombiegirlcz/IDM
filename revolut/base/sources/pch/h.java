package pch;

import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreenContract$Input;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import pb2.v;
import rbh.n;
import rbh.r;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f234915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PocketPickerScreenContract$Input f234916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f234917r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g mapper, r pocketPickerProvider, PocketPickerScreenContract$Input input) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pocketPickerProvider, "pocketPickerProvider");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f234915p = pocketPickerProvider;
        this.f234916q = input;
        this.f234917r = new c(null);
    }

    @Override // yji.l
    public final void I1() {
        r rVar = this.f234915p;
        l.a1(this, nim.a.v(nim.a.v(rVar.f253092a.e(w4l.h.f294642c), new n(rVar, 0)), new v(this, 5)), null, null, new ox5.r(this, null, 23), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f234917r;
    }
}

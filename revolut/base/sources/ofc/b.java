package ofc;

import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreenContract$InputData;
import e4m.e;
import java.util.Collections;
import java.util.Set;
import oai.s;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VatInputScreenContract$InputData f224799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f224800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f224801c;

    public b(VatInputScreenContract$InputData vatInputScreenContract$InputData) {
        this.f224799a = vatInputScreenContract$InputData;
        int i = 3;
        this.f224800b = e4m.b.b(new s(this, 1, i));
        this.f224801c = e4m.b.b(new s(this, 0, i));
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

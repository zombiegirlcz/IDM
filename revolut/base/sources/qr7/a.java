package qr7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData;
import e4m.e;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentListScreenContract$InputData f248657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f248658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f248659c;

    public a(b bVar, DocumentListScreenContract$InputData documentListScreenContract$InputData) {
        this.f248657a = documentListScreenContract$InputData;
        int i = 4;
        this.f248658b = e4m.b.b(new v1(bVar, this, 1, i));
        this.f248659c = e4m.b.b(new v1(bVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

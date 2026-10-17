package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.UploadDocumentsListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploadDocumentsListScreenContract$InputData f247376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247378c;

    public l1(k0 k0Var, k1 k1Var, UploadDocumentsListScreenContract$InputData uploadDocumentsListScreenContract$InputData) {
        this.f247376a = uploadDocumentsListScreenContract$InputData;
        int i = 25;
        this.f247377b = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247378c = e4m.b.b(new l(k0Var, this, 0, i));
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

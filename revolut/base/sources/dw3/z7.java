package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z7 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120317a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationDocumentsScreenContract$InputData f120318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f120319c;
    public final e4m.e d;

    public z7(qz4.a aVar, qz4.b bVar, CreditApplicationDocumentsScreenContract$InputData creditApplicationDocumentsScreenContract$InputData) {
        this.f120318b = creditApplicationDocumentsScreenContract$InputData;
        this.f120319c = e4m.b.b(new qy7.f(aVar, bVar, this, 1));
        this.d = e4m.b.b(new qy7.f(aVar, bVar, this, 0));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f120317a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f120317a) {
        }
        return ImmutableSet.of();
    }

    public z7(c1 c1Var, h4 h4Var, CreditApplicationDocumentsScreenContract$InputData creditApplicationDocumentsScreenContract$InputData) {
        this.f120318b = creditApplicationDocumentsScreenContract$InputData;
        int i = 5;
        this.f120319c = e4m.b.b(new v7(c1Var, h4Var, this, 1, i));
        this.d = e4m.b.b(new v7(c1Var, h4Var, this, 0, i));
    }

    public z7(c1 c1Var, t tVar, CreditApplicationDocumentsScreenContract$InputData creditApplicationDocumentsScreenContract$InputData) {
        this.f120318b = creditApplicationDocumentsScreenContract$InputData;
        int i = 4;
        this.f120319c = e4m.b.b(new v7(c1Var, tVar, this, 1, i));
        this.d = e4m.b.b(new v7(c1Var, tVar, this, 0, i));
    }
}

package jef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserDetailsScreenContract$InputData f173376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f173377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173378c;

    public f(e eVar, g gVar, TransactionRecogniserDetailsScreenContract$InputData transactionRecogniserDetailsScreenContract$InputData) {
        this.f173376a = transactionRecogniserDetailsScreenContract$InputData;
        this.f173377b = e4m.b.b(new il8.d(eVar, gVar, this, 1, 3));
        this.f173378c = e4m.b.b(new il8.d(eVar, gVar, this, 0, 3));
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

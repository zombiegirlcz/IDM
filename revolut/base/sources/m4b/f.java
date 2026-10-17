package m4b;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f202688a;

    public f(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f202688a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        cii.b bVar;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f202685a;
        return (data == null || (bVar = (cii.b) iii.c.f(data, new m30.c(22), new lp2.c(this, 24), new lk7.n(this, 20))) == null) ? new cii.b(null, f0.f322471a, null) : bVar;
    }
}

package gna;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreenContract$InputData;
import ina.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements f {
    public final DocumentSelectorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f144945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f144946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f144947r;

    public h(j mapper, DocumentSelectorScreenContract$InputData inputData, k extension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.o = inputData;
        this.f144945p = extension;
        this.f144946q = q.b(0, 6, null);
        this.f144947r = mra.d.b(this, new e(null, new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(new vkm.y(new g2d.c(2, 8, continuation), this.f144946q), new g6f.l(continuation, this, 10)), null, null, new gii.b(this, continuation, 12), 3);
        l2(new ge7.f(this, continuation, 19), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144947r;
    }
}

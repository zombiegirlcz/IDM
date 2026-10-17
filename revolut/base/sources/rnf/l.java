package rnf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.io.File;
import java.util.List;
import klf.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mle.x;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.y;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements g {

    @NotNull
    public static final h Companion = new h();
    public static final int d;
    public static final ResourceImage e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f255663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final enf.c f255664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f255665c;

    static {
        int i = R$drawable.uikit_icn_64_file_pdf;
        d = i;
        e = new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public l(zk0.b fileSystemRepository, l80.e dateProvider, enf.c pdfThumbnailProvider) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pdfThumbnailProvider, "pdfThumbnailProvider");
        this.f255663a = fileSystemRepository;
        this.f255664b = pdfThumbnailProvider;
        z1 z1VarA = ta6.a.a(1);
        z1VarA.k(Unit.f186387a);
        this.f255665c = z1VarA;
    }

    public final Object a(File file, gim.i iVar) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new rm6.c(this, file, null, 5), iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final Flow b(String txnLegId) {
        Intrinsics.checkNotNullParameter(txnLegId, "txnLegId");
        Continuation continuation = null;
        y yVar = new y(new w1(2, 19, continuation), rd0.e.e(nim.a.v(new x(this.f255665c, this, txnLegId, 22), new rnd.k(11)), h0.f322473a, new pc2.d(3, 12, continuation)));
        p0 p0Var = p0.f264001a;
        return vkm.q.C(yVar, elm.f.f127540b);
    }
}

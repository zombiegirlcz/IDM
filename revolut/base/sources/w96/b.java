package w96;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.util.FileSize;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.document_view.impl.ui.DocumentViewActivity;
import com.revolut.feature.document_view.impl.ui.DocumentViewContract$Configuration;
import efm.r;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.io.File;
import jh.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o80.c;
import sri.m;
import te0.w;
import vfg.p;
import w3c.n;
import xpi.g;
import yy0.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DocumentViewContract$Configuration f295691j;
    public final o80.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f295692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f295693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f295694n;

    public b(DocumentViewContract$Configuration configuration, o80.b imageUtils, g navBarWithToolbar, m navigator) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "navBarWithToolbar");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f295691j = configuration;
        this.k = imageUtils;
        this.f295692l = navBarWithToolbar;
        this.f295693m = navigator;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        String fileSize;
        a view = (a) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = this.f295694n;
        g gVar = this.f295692l;
        if (!z) {
            DocumentViewContract$Configuration documentViewContract$Configuration = this.f295691j;
            String str = documentViewContract$Configuration.f71962a;
            File file = new File(str);
            if (file.exists()) {
                this.k.getClass();
                if (o80.b.a(str)) {
                    FileImage image = new FileImage(file, (FileImage.Placeholder) null, new ImageTransformations((CircleTransformation) null, false, false, (Integer) null, (Integer) null, (Integer) null, 503), 10);
                    DocumentViewActivity documentViewActivity = (DocumentViewActivity) view;
                    documentViewActivity.getClass();
                    j90.a aVar2 = documentViewActivity.f71957r0;
                    Intrinsics.checkNotNullParameter(image, "image");
                    KProperty[] kPropertyArr = DocumentViewActivity.f71956x0;
                    ((ImageViewTouch) aVar2.getValue(documentViewActivity, kPropertyArr[0])).setVisibility(0);
                    ((View) documentViewActivity.f71958s0.getValue(documentViewActivity, kPropertyArr[1])).setVisibility(8);
                    f.e(d.f(documentViewActivity).Q(), image, (ImageViewTouch) aVar2.getValue(documentViewActivity, kPropertyArr[0]), null, null, 12);
                } else {
                    String fileName = file.getName();
                    Intrinsics.checkNotNullExpressionValue(fileName, "getName(...)");
                    long length = file.length();
                    if (length >= FileSize.MB_COEFFICIENT) {
                        long j2 = 1024;
                        fileSize = ch.qos.logback.core.util.a.p((length / j2) * j2, " Mb");
                    } else {
                        fileSize = length >= FileSize.KB_COEFFICIENT ? ch.qos.logback.core.util.a.p(length / ((long) 1024), " Kb") : ch.qos.logback.core.util.a.p(length, " b");
                    }
                    String fileExt = c.b(file);
                    DocumentViewActivity documentViewActivity2 = (DocumentViewActivity) view;
                    documentViewActivity2.getClass();
                    Intrinsics.checkNotNullParameter(fileName, "fileName");
                    Intrinsics.checkNotNullParameter(fileSize, "fileSize");
                    Intrinsics.checkNotNullParameter(fileExt, "fileExt");
                    j90.a aVar3 = documentViewActivity2.f71957r0;
                    KProperty[] kPropertyArr2 = DocumentViewActivity.f71956x0;
                    ((ImageViewTouch) aVar3.getValue(documentViewActivity2, kPropertyArr2[0])).setVisibility(8);
                    ((View) documentViewActivity2.f71958s0.getValue(documentViewActivity2, kPropertyArr2[1])).setVisibility(0);
                    ((AppCompatTextView) documentViewActivity2.f71959t0.getValue(documentViewActivity2, kPropertyArr2[2])).setText(fileExt);
                    ((AppCompatTextView) documentViewActivity2.u0.getValue(documentViewActivity2, kPropertyArr2[3])).setText(fileName);
                    ((AppCompatTextView) documentViewActivity2.f71960v0.getValue(documentViewActivity2, kPropertyArr2[4])).setText(fileSize);
                }
            }
            Clause clause = documentViewContract$Configuration.f71963b;
            xpi.c cVar = (xpi.c) gVar;
            cVar.p0(clause);
            cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
            this.f295694n = true;
        }
        r rVarQ = ((xpi.c) gVar).Q();
        n nVar = new n(this, 15);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarQ.onErrorResumeNext(new p(new vx5.r(new BreadcrumbException(), 20), (byte) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new m3l.d(29, nVar), new m3l.d(29, this.i), new t1i.n(13, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}

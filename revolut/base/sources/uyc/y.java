package uyc;

import android.text.format.Formatter;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentPage;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    @NotNull
    private static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p80.a f284158a;

    public y(p80.a fileFormatter) {
        Intrinsics.checkNotNullParameter(fileFormatter, "fileFormatter");
        this.f284158a = fileFormatter;
    }

    public static RowDelegate.Model a() {
        RowDelegate.Model model = new RowDelegate.Model("ADD_FILE_MODEL_ID", new ResourceImage(R$drawable.uikit_icn_32_add_new, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.sot_document_list_upload_document, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, "ADD_FILE", null, 0, 0, 0, 0, 1056964588);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final RowDelegate.Model b(File file, EvidenceDocumentPage evidenceDocumentPage) {
        String strQ = j6.a.q("FILE_MODEL_ID ", file.getName());
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new RowDelegate.Model(strQ, new FileImage(file, R$drawable.uikit_icn_40_document_shape, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505)), null, null, new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(Formatter.formatFileSize(this.f284158a.f233816a, file.length()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new tf(4, new ResourceImage(evidenceDocumentPage == null ? R$drawable.uikit_icn_24_delete : R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, evidenceDocumentPage != null ? evidenceDocumentPage : file, null, 0, 0, 0, 0, 1056962412);
    }
}

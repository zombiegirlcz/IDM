package luh;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends iuh.j {

    @NotNull
    public static final j Companion = new j();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // iuh.j
    public final List a(iuh.e domainState) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList2 = new ArrayList();
        Answer.Documents documents = (Answer.Documents) domainState.f168607b;
        Integer numValueOf = documents != null ? Integer.valueOf(documents.f96518b.size()) : null;
        Integer num = ((Question.Documents) domainState.f168606a).f;
        RowDelegate.Model model = (numValueOf == null || num == null || numValueOf.intValue() < num.intValue()) ? new RowDelegate.Model("add_file_id", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.chooseDocuments_uploadDocuments, null, null, 14), null, 0, new TextLocalisedClause(R$string.chooseDocuments_uploadDocuments_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null;
        if (model != null) {
            arrayList2.add(model);
        }
        Answer.Documents documents2 = (Answer.Documents) domainState.f168607b;
        if (documents2 != null) {
            ?? r06 = documents2.f96518b;
            arrayList = new ArrayList(r06.size());
            for (Map.Entry entry : r06.entrySet()) {
                File file = (File) entry.getKey();
                UploadState uploadState = (UploadState) entry.getValue();
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                boolean z = uploadState instanceof UploadState.Error;
                arrayList.add(new RowDelegate.Model(absolutePath, new RowDelegate.Model.MainImage.Image40(new FileImage(file, (FileImage.Placeholder) null, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), 10), z ? LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_cross_circle, Integer.valueOf(R$attr.uikit_colorRed), new Color.Solid(R$attr.uikit_colorWhite), BitmapDescriptorFactory.HUE_RED, null, 48) : null, null, false, 28), new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, z ? new TextLocalisedClause(R$string.chooseDocuments_upload_error_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10) : null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, null, false, null, null, null, null, null, null, file, null, 0, 0, 0, 0, 532673496));
            }
        } else {
            arrayList = f0.f322471a;
        }
        a0.x((Iterable) arrayList, arrayList2);
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }
}

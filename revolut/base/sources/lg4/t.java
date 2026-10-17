package lg4;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import ip0.h2;
import ip0.j2;
import ip0.o2;
import ip0.r2;
import ip0.xk;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PhotosUploadSummaryControllerContract$InputData f195065a;

    public t(PhotosUploadSummaryControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f195065a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Float fValueOf2 = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.credit_application_photos_upload_summary_title;
        PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData = this.f195065a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(photosUploadSummaryControllerContract$InputData.f68204b.f19919a), null, 12);
        aim.e eVarB = u.b();
        bz3.f fVar = photosUploadSummaryControllerContract$InputData.f68204b;
        bz3.d dVar = fVar.f19920b;
        bz3.b bVar = fVar.d;
        a1 a1Var = dVar.f19916b;
        if (a1Var != null) {
            eVarB.add(new ImageClause(a1Var.c(), Integer.valueOf(R$attr.uikit_colorAccent), fValueOf2, fValueOf2, 16));
        }
        eVarB.add(new TextLocalisedClause(R$string.credit_application_photos_upload_summary_description, u.c(fVar.f19920b.f19915a), new Click(30, (Integer) null, (Object) null, "REQUIREMENTS_SUBTITLE_ID", false), 8));
        CompositeClause compositeClause = new CompositeClause(u.a(eVarB), sx4.g.e(1), null, null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_photos_upload_summary_submit, u.c(fVar.f19921c), null, 12);
        boolean z = !domainState.f195051a.isEmpty();
        aim.e eVarB2 = u.b();
        aim.e eVarB3 = u.b();
        eVarB3.add(new h2("ADD_PHOTO_ITEM_ID", new ResourceImage(bVar.f19911b.c(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.credit_application_photos_upload_summary_upload, u.c(bVar.f19910a), null, 12), j2.GRID));
        int i2 = 0;
        for (Object obj2 : domainState.f195051a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            ry3.a aVar = (ry3.a) obj2;
            eVarB3.add(new BackgroundSelectionDelegate.Model(a0.d.n("photos_grid_item_", i2), new FileImage(aVar.f258207a, (FileImage.Placeholder) null, (ImageTransformations) null, 14), false, o2.GRID, false, r2.f166084a, null, aVar, 6064));
            i2 = i3;
        }
        aim.e eVarA = u.a(eVarB3);
        int i5 = R$attr.uikit_dp0;
        eVarB2.add(new xk("photos_grid_list_id", eVarA, 3, fValueOf, fValueOf, 0, 0, i5, i5, 63968));
        Unit unit = Unit.f186387a;
        return new r(textLocalisedClause, compositeClause, textLocalisedClause2, z, u.a(eVarB2));
    }
}

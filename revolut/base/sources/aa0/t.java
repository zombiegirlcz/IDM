package aa0;

import com.revolut.feature.backend_flow.domain.models.BackendCardPhotoItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.CameraSource;
import com.revolut.feature.backend_flow.domain.models.CameraUploadItem;
import com.revolut.feature.backend_flow.domain.models.FilesUploadItem;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends c {
    public static BackendFlowUploadItem d(BackendFlowUploadItem backendFlowUploadItem, ArrayList files) {
        if (backendFlowUploadItem instanceof FilesUploadItem) {
            FilesUploadItem filesUploadItem = (FilesUploadItem) backendFlowUploadItem;
            String id10 = filesUploadItem.f63438a;
            boolean z = filesUploadItem.f63439b;
            String buttonTitle = filesUploadItem.f63440c;
            boolean z3 = filesUploadItem.d;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            Intrinsics.checkNotNullParameter(files, "files");
            return new FilesUploadItem(id10, buttonTitle, files, z, z3);
        }
        if (backendFlowUploadItem instanceof CameraUploadItem) {
            CameraUploadItem cameraUploadItem = (CameraUploadItem) backendFlowUploadItem;
            String id11 = cameraUploadItem.f63336a;
            boolean z4 = cameraUploadItem.f63337b;
            String buttonTitle2 = cameraUploadItem.f63338c;
            CameraSource defaultSource = cameraUploadItem.e;
            Intrinsics.checkNotNullParameter(id11, "id");
            Intrinsics.checkNotNullParameter(buttonTitle2, "buttonTitle");
            Intrinsics.checkNotNullParameter(files, "files");
            Intrinsics.checkNotNullParameter(defaultSource, "defaultSource");
            return new CameraUploadItem(id11, z4, buttonTitle2, files, defaultSource);
        }
        if (!(backendFlowUploadItem instanceof BackendCardPhotoItem)) {
            throw new NoWhenBranchMatchedException();
        }
        BackendCardPhotoItem backendCardPhotoItem = (BackendCardPhotoItem) backendFlowUploadItem;
        String id12 = backendCardPhotoItem.f63257a;
        boolean z6 = backendCardPhotoItem.f63258b;
        String buttonTitle3 = backendCardPhotoItem.f63259c;
        Intrinsics.checkNotNullParameter(id12, "id");
        Intrinsics.checkNotNullParameter(buttonTitle3, "buttonTitle");
        Intrinsics.checkNotNullParameter(files, "files");
        return new BackendCardPhotoItem(files, z6, id12, buttonTitle3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    @Override // aa0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.InputItem a(com.revolut.feature.backend_flow.domain.models.InputItem r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa0.t.a(com.revolut.feature.backend_flow.domain.models.InputItem, java.lang.Object):com.revolut.feature.backend_flow.domain.models.InputItem");
    }
}

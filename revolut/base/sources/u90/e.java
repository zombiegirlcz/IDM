package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CameraSource;
import com.revolut.feature.backend_flow.domain.models.CameraUploadItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f278317a;

    public e(b filesMapper) {
        Intrinsics.checkNotNullParameter(filesMapper, "filesMapper");
        this.f278317a = filesMapper;
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        CameraSource unknown;
        CameraSource cameraSource;
        q90.f0 item = (q90.f0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        String buttonTitle = item.getButtonTitle();
        boolean required = item.getRequired();
        ArrayList arrayListA = this.f278317a.a(item.getValue());
        String defaultSource = item.getDefaultSource();
        if (Intrinsics.f(defaultSource, "FRONT")) {
            cameraSource = CameraSource.Front.f63334b;
        } else {
            if (!Intrinsics.f(defaultSource, "REAR")) {
                unknown = new CameraSource.Unknown(item.getDefaultSource());
                return new CameraUploadItem(id10, required, buttonTitle, arrayListA, unknown);
            }
            cameraSource = CameraSource.Back.f63333b;
        }
        unknown = cameraSource;
        return new CameraUploadItem(id10, required, buttonTitle, arrayListA, unknown);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        CameraUploadItem item = (CameraUploadItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63336a;
        String str2 = item.f63338c;
        return new q90.f0(str, item.f63337b, str2, item.e.f63332a, b.b(item.d));
    }
}

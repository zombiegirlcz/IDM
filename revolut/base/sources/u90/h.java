package u90;

import com.revolut.feature.backend_flow.domain.models.BackendCardPhotoItem;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.FilesUploadItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.m1;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f278319b;

    public h(b filesMapper, int i) {
        this.f278318a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(filesMapper, "filesMapper");
                this.f278319b = filesMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(filesMapper, "filesMapper");
                this.f278319b = filesMapper;
                break;
        }
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        switch (this.f278318a) {
            case 0:
                q90.j0 item = (q90.j0) vVar;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                String id10 = item.getId();
                return new BackendCardPhotoItem(this.f278319b.a(item.getValue()), item.getRequired(), id10, item.getButtonTitle());
            default:
                m1 item2 = (m1) vVar;
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                return new FilesUploadItem(item2.getId(), item2.getButtonTitle(), this.f278319b.a(item2.getValue()), item2.getRequired(), item2.getValidate());
        }
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        switch (this.f278318a) {
            case 0:
                BackendCardPhotoItem item = (BackendCardPhotoItem) backendItem;
                Intrinsics.checkNotNullParameter(item, "item");
                return new q90.j0(item.f63257a, item.f63259c, item.f63258b, b.b(item.d));
            default:
                FilesUploadItem item2 = (FilesUploadItem) backendItem;
                Intrinsics.checkNotNullParameter(item2, "item");
                return new m1(item2.f63438a, item2.f63439b, item2.f63440c, item2.d, b.b(item2.e));
        }
    }
}

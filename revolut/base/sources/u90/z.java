package u90;

import com.revolut.feature.backend_flow.domain.models.BackendIconType;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.IconizedSingleChoiceButtonItem;
import com.revolut.feature.backend_flow.domain.models.SummarySectionItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.j3;
import q90.r3;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t90.h f278338b;

    public z(t90.h iconTypeMapper, int i) {
        this.f278337a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(iconTypeMapper, "iconTypeMapper");
                this.f278338b = iconTypeMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(iconTypeMapper, "iconTypeMapper");
                this.f278338b = iconTypeMapper;
                break;
        }
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        switch (this.f278337a) {
            case 0:
                j3 item = (j3) vVar;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                String id10 = item.getId();
                Integer group = item.getGroup();
                String title = item.getTitle();
                String description = item.getDescription();
                q90.b0 value = item.getValue();
                boolean zJ = pd.b.j(value != null ? Boolean.valueOf(value.getValue()) : null);
                boolean zK = pd.b.k(item.getRequired());
                String iconType = item.getIconType();
                return new IconizedSingleChoiceButtonItem(id10, group, title, description, iconType != null ? this.f278338b.a(iconType) : null, zJ, zK);
            default:
                r3 item2 = (r3) vVar;
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                return new SummarySectionItem(item2.getTitle(), item2.getSubtitle(), this.f278338b.a(item2.getIconType()), item2.getSection(), item2.getNextViewId());
        }
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        switch (this.f278337a) {
            case 0:
                IconizedSingleChoiceButtonItem item = (IconizedSingleChoiceButtonItem) backendItem;
                Intrinsics.checkNotNullParameter(item, "item");
                String str = item.f63483a;
                Integer num = item.f63484b;
                String str2 = item.f63485c;
                String str3 = item.d;
                q90.b0 b0Var = new q90.b0(item.f);
                Boolean boolValueOf = Boolean.valueOf(item.f63486g);
                BackendIconType backendIconType = item.e;
                return new j3(str, num, str2, str3, b0Var, boolValueOf, "ICONIZED", null, null, backendIconType != null ? this.f278338b.b(backendIconType) : null);
            default:
                SummarySectionItem item2 = (SummarySectionItem) backendItem;
                Intrinsics.checkNotNullParameter(item2, "item");
                return new r3(item2.f63670a, item2.f63671b, this.f278338b.b(item2.f63672c), item2.d, item2.e);
        }
    }
}

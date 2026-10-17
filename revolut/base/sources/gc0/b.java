package gc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowEntitiesPage;
import com.revolut.feature.backend_flow.domain.models.BackendFlowEntity;
import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.j;
import q90.o;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements a {
    public final BackendFlowEntitiesPage a(j dto) throws Throwable {
        Intrinsics.checkNotNullParameter(dto, "dto");
        boolean zK = pd.b.k(dto.getIsLast());
        Long createdSince = dto.getCreatedSince();
        long jLongValue = createdSince != null ? createdSince.longValue() : 0L;
        List<j.a> entities = dto.getEntities();
        ArrayList arrayList = new ArrayList(w.t(entities, 10));
        for (j.a aVar : entities) {
            String id10 = aVar.getId();
            String title = aVar.getTitle();
            String description = aVar.getDescription();
            String secondaryDescription = aVar.getSecondaryDescription();
            String moreInfoDeeplink = aVar.getMoreInfoDeeplink();
            o icon = aVar.getIcon();
            BackendFlowIcon backendFlowIconA = null;
            if (icon != null) {
                backendFlowIconA = t90.e.a(icon, null);
            }
            arrayList.add(new BackendFlowEntity(id10, title, description, secondaryDescription, backendFlowIconA, aVar.getAssetUrl(), moreInfoDeeplink));
        }
        return new BackendFlowEntitiesPage(jLongValue, arrayList, zK);
    }
}

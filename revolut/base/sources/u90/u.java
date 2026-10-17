package u90;

import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.EntityCellItem;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.f1;
import q90.g1;
import q90.h1;
import q90.i1;
import q90.j1;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f278333b;

    public u(t90.a actionMapper, v entityTypeMapper) {
        this.f278332a = 2;
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(entityTypeMapper, "entityTypeMapper");
        this.f278333b = entityTypeMapper;
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        switch (this.f278332a) {
            case 0:
                f1 item = (f1) vVar;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                return new EntitiesListItem(item.getId(), this.f278333b.a(item.getEntityType()), item.getTitle(), item.getInitialDisplaySize(), null);
            case 1:
                g1 item2 = (g1) vVar;
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                String id10 = item2.getId();
                EntityType entityTypeA = this.f278333b.a(item2.getEntityType());
                boolean required = item2.getRequired();
                j1 value = item2.getValue();
                Set selectedEntities = value != null ? value.getSelectedEntities() : null;
                if (selectedEntities == null) {
                    selectedEntities = zhm.h0.f322473a;
                }
                return new EntitiesSelectionItem(id10, entityTypeA, required, selectedEntities, t90.l.a(item2.getMaxSelected(), item2.getStyle()), null, zhm.z0.h(item2.getPreselectedEntityId()));
            case 2:
                h1 item3 = (h1) vVar;
                Intrinsics.checkNotNullParameter(item3, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                return new EntitiesSummaryItem(item3.getId(), zhm.v.l(item3.getAction() != null ? t90.a.a(item3.getAction()) : null), (BackendEntitiesSummaryItem) null, this.f278333b.a(item3.getEntityType()), item3.getOpenEntitiesListOnTap(), 36);
            default:
                i1 item4 = (i1) vVar;
                Intrinsics.checkNotNullParameter(item4, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                return new EntityCellItem(item4.getId(), this.f278333b.a(item4.getEntityType()), null);
        }
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        String str;
        Action action;
        switch (this.f278332a) {
            case 0:
                EntitiesListItem item = (EntitiesListItem) backendItem;
                Intrinsics.checkNotNullParameter(item, "item");
                return new f1(item.d, item.f63420a, this.f278333b.b(item.f63421b), item.f63422c);
            case 1:
                EntitiesSelectionItem item2 = (EntitiesSelectionItem) backendItem;
                Intrinsics.checkNotNullParameter(item2, "item");
                String str2 = item2.f63423a;
                String strB = this.f278333b.b(item2.f63424b);
                boolean z = item2.f63425c;
                j1 j1Var = new j1(item2.d);
                SelectionStyle style = item2.e;
                Integer numB = t90.l.b(style);
                Intrinsics.checkNotNullParameter(style, "style");
                if (style instanceof SelectionStyle.SingleSelection) {
                    str = "SINGLE_SELECTION";
                } else {
                    if (!(style instanceof SelectionStyle.MultiSelection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "MULTI_SELECTION";
                }
                return new g1(str2, strB, z, numB, (String) zhm.d0.c0(item2.f63426g), str, j1Var);
            case 2:
                EntitiesSummaryItem item3 = (EntitiesSummaryItem) backendItem;
                Intrinsics.checkNotNullParameter(item3, "item");
                String str3 = item3.f63427a;
                List list = item3.f63428b;
                return new h1(str3, (list == null || (action = (Action) zhm.d0.d0(list)) == null) ? null : t90.a.b(action), this.f278333b.b(item3.d), item3.e);
            default:
                EntityCellItem item4 = (EntityCellItem) backendItem;
                Intrinsics.checkNotNullParameter(item4, "item");
                return new i1(item4.f63430a, this.f278333b.b(item4.f63431b));
        }
    }

    public u(v entityTypeMapper, int i) {
        this.f278332a = i;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(entityTypeMapper, "entityTypeMapper");
                this.f278333b = entityTypeMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(entityTypeMapper, "entityTypeMapper");
                this.f278333b = entityTypeMapper;
                break;
        }
    }

    public u(v entityTypeMapper, t90.l selectionStyleMapper) {
        this.f278332a = 1;
        Intrinsics.checkNotNullParameter(entityTypeMapper, "entityTypeMapper");
        Intrinsics.checkNotNullParameter(selectionStyleMapper, "selectionStyleMapper");
        this.f278333b = entityTypeMapper;
    }
}

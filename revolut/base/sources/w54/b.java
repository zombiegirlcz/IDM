package w54;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import sxe.g;
import vkm.v1;
import zhm.d0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends x7a.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.a f294689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f294690b;

    public b(hw3.a birthPlaceInteractor) {
        Intrinsics.checkNotNullParameter(birthPlaceInteractor, "birthPlaceInteractor");
        this.f294689a = birthPlaceInteractor;
        this.f294690b = r0.g();
    }

    public static Data i() {
        List listC = u.c(new RowDelegate.Model("LIST_ID_EMPTY_STATE", new RowDelegate.Model.MainImage.Image56((Image) com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D097", null, null, null, 30), (CircleBadgeModel) null, false, 14), new TextLocalisedClause(R$string.birth_place_city_search_hint_result_empty, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new Data(listC, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new x54.a((BirthCity) r0.h(d0.J0(ids), this.f294690b));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new w29.a(25), new w2.d(this), new go2.a(query, this, selectedModelIds, 1));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new g(query, obj2, this, (Continuation) null));
    }
}

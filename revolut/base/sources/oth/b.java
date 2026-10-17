package oth;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CitizenshipGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zi0.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements kbl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CitizenshipGroup f229592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CitizenshipGroup f229593b;

    public b(CitizenshipGroup suggestedCitizeships, CitizenshipGroup allCitizenships) {
        Intrinsics.checkNotNullParameter(suggestedCitizeships, "suggestedCitizeships");
        Intrinsics.checkNotNullParameter(allCitizenships, "allCitizenships");
        this.f229592a = suggestedCitizeships;
        this.f229593b = allCitizenships;
    }

    @Override // kbl.a
    public final Flow a() {
        return c.i(this.f229592a.f105578b);
    }

    @Override // kbl.a
    public final Clause b() {
        return new TextClause(this.f229592a.f105577a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // kbl.a
    public final Clause c() {
        return new TextClause(this.f229593b.f105577a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // kbl.a
    public final Flow d() {
        return c.i(this.f229593b.f105578b);
    }
}

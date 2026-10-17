package afg;

import a2g.m;
import a9d.p;
import ael.r0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cfg.e f4065a;

    public j(cfg.e suggestedExperiencesItemsMapper) {
        Intrinsics.checkNotNullParameter(suggestedExperiencesItemsMapper, "suggestedExperiencesItemsMapper");
        this.f4065a = suggestedExperiencesItemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f4052b, new r0(this, 26), new p(this, 25), new a15.n(this, domainState, 12));
        Data data = domainState.f4051a;
        return new g((Clause) iii.c.f(data, new r0(27), new p(26), new m(13)), ((cfi.g) data.getContent()) != null ? new TextLocalisedClause(R$string.hotels_booking_details_suggested_experiences_subtitle, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), 10) : null, list, data.getContent() != null);
    }
}

package wf0;

import com.revolut.feature.feedback.api.domain.Feedback;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, bg0.a.class, "toDomain", "toDomain(Lcom/revolut/core/faq/data/network/model/FaqFeedbackDto;)Lcom/revolut/feature/feedback/api/domain/Feedback;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        cg0.h p0 = (cg0.h) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String id10 = p0.getId();
        String entity = p0.getEntity();
        Boolean boolValueOf = Boolean.valueOf(p0.getScore() == 1);
        List tags = p0.getTags();
        if (tags == null) {
            tags = zhm.f0.f322471a;
        }
        List list = tags;
        String comment = p0.getComment();
        if (comment == null) {
            comment = "";
        }
        return new Feedback(id10, entity, boolValueOf, list, comment, new Date(p0.getCreatedDate()));
    }
}

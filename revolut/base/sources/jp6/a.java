package jp6;

import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.feedback.api.domain.FeedbackConfig;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import com.revolut.feature.feedback.api.domain.TagsFeedback;
import hp6.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static Feedback a(hp6.c dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        String entity = dto.getEntity();
        Boolean boolValueOf = Boolean.valueOf(dto.getScore() == 1);
        List tags = dto.getTags();
        if (tags == null) {
            tags = f0.f322471a;
        }
        List list = tags;
        String comment = dto.getComment();
        if (comment == null) {
            comment = "";
        }
        return new Feedback(id10, entity, boolValueOf, list, comment, new Date(dto.getCreatedDate()));
    }

    public static FeedbackConfig b(hp6.b dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String asset = dto.getAsset();
        String title = dto.getTitle();
        String description = dto.getDescription();
        List positiveTags = dto.getTagsScored().getPositiveTags();
        ArrayList arrayList = new ArrayList(w.t(positiveTags, 10));
        Iterator it8 = positiveTags.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((d) it8.next()));
        }
        List neutralTags = dto.getTagsScored().getNeutralTags();
        ArrayList arrayList2 = new ArrayList(w.t(neutralTags, 10));
        Iterator it9 = neutralTags.iterator();
        while (it9.hasNext()) {
            arrayList2.add(c((d) it9.next()));
        }
        List negativeTags = dto.getTagsScored().getNegativeTags();
        ArrayList arrayList3 = new ArrayList(w.t(negativeTags, 10));
        Iterator it10 = negativeTags.iterator();
        while (it10.hasNext()) {
            arrayList3.add(c((d) it10.next()));
        }
        return new FeedbackConfig(asset, title, description, new TagsFeedback(arrayList3, arrayList, arrayList2));
    }

    public static FeedbackTag c(d dVar) {
        return new FeedbackTag(dVar.getTag(), dVar.getLabel());
    }
}

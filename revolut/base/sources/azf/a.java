package azf;

import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import cp5.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qzf.j0;
import vyf.b;
import zyf.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final TravelExperiencesSummary a(szf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        String name = aVar.getName();
        List images = aVar.getImages();
        String description = aVar.getDescription();
        j0 ratings = aVar.getRatings();
        return new TravelExperiencesSummary(id10, name, images, description, ratings != null ? f.a(ratings) : null, c.G(aVar.getStartingPrice()), b.b(aVar.getCancellationPolicy()));
    }
}

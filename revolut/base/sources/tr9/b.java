package tr9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import do3.n;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import vq9.j;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements nq9.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f273762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq9.c f273763b;

    public b(thf.c transactionCategoryResourcesMapper, nq9.c membersMappers) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(membersMappers, "membersMappers");
        this.f273762a = transactionCategoryResourcesMapper;
        this.f273763b = membersMappers;
    }

    public final Image a(oq9.i bill, n user) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        Intrinsics.checkNotNullParameter(user, "user");
        return ((e) this.f273763b).e(bill.h(), user);
    }

    public final Image b(oq9.i bill) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        if (!(bill instanceof oq9.h)) {
            if (bill instanceof oq9.g) {
                return j.d;
            }
            throw new NoWhenBranchMatchedException();
        }
        oq9.h hVar = (oq9.h) bill;
        String str = hVar.f227828m;
        String str2 = hVar.f227829n;
        thf.c cVar = this.f273762a;
        if (str2 == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return ((wjf.e) cVar).h(lowerCase);
        }
        ImageTransformations imageTransformations = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG);
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return new UrlImage(str2, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(((wjf.e) cVar).h(lowerCase2)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, imageTransformations, (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
    }
}

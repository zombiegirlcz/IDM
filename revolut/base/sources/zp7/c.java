package zp7;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import efm.r;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ll7.h;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import rd0.e;
import y7a.w;
import ymk.u;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a8a.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f324183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f324184b;

    public c(ll7.a profileRepository) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        this.f324183a = profileRepository;
        this.f324184b = r0.g();
    }

    @Override // a8a.d
    public final boolean b(String query, i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = ((SingleChoiceDelegate.Model) model).f;
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
        return d0.J((String) obj2, query, true);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Set set = ids;
        Occupation occupation = (Occupation) this.f324184b.get(zhm.d0.a0(set));
        if (occupation != null) {
            return new d(occupation);
        }
        throw new IllegalStateException(("occupation with id " + zhm.d0.a0(set) + " not found in map " + this.f324184b).toString());
    }

    @Override // a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        return e.c(new u(e.b(((h) this.f324183a).d.f(Unit.f186387a, false)), this, 14), g.f186406a);
    }
}

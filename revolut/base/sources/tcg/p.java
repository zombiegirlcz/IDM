package tcg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.search.PropertyType;
import com.revolut.kompot.common.R$string;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a f269799b;

    public /* synthetic */ p(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, int i) {
        this.f269798a = i;
        this.f269799b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f269798a;
        Continuation continuation = null;
        int i2 = 0;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar = this.f269799b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
                return Boolean.TRUE;
            case 1:
                r7a.i output = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof r7a.h) {
                    aVar.l2(new s(aVar, continuation, i2), new yi5.b(26));
                } else if ((output instanceof r7a.e) || (output instanceof r7a.f)) {
                    aVar.X1(new y0(null, new nii.z(new TextLocalisedClause(com.revolut.feature.travel.common.api.R$string.travel_common_location_error_no_permission, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                } else {
                    if (!(output instanceof r7a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        throw new IllegalStateException("Unhandled secondary click");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                }
                return Unit.f186387a;
            default:
                HotelsProperty property = (HotelsProperty) obj2;
                Intrinsics.checkNotNullParameter(property, "property");
                Object obj3 = lfi.a.f194929a;
                Intrinsics.checkNotNullParameter(property, "<this>");
                PropertyType propertyType = new PropertyType(property.f97981a, property.f97982b, property.f97987l.f98039a);
                return (aVar.o.f93936a ? aVar.f93940q.m(propertyType) : pfm.m.f235744a).f(efm.d0.m(new Pair(propertyType, property)));
        }
    }

    public /* synthetic */ p(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, com.revolut.kompot.navigable.vc.modal.a aVar2) {
        this.f269798a = 1;
        this.f269799b = aVar;
    }
}

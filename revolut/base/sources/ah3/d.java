package ah3;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checklist_challenges.api.navigation.ChecklistCollectionDestination;
import efm.d0;
import grl.k9;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f4880a;

    public d(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f4880a = navigator;
    }

    public static ChecklistCollectionDestination b(jf0.c cVar) {
        String strE = cVar.e(3);
        if (strE.length() <= 0) {
            return null;
        }
        k9 k9Var = k9.Accounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ChecklistCollectionDestination(strE, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "checklist") && Intrinsics.f(cVar.e(2), "collection") && b(cVar) != null;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        ChecklistCollectionDestination checklistCollectionDestinationB = b(cVar);
        if (checklistCollectionDestinationB != null) {
            return new h(checklistCollectionDestinationB, null);
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return ue0.e.F(cVar, Boolean.FALSE);
    }
}

package k5e;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.R$string;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f181485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f181486c;

    public /* synthetic */ h(qwd.m mVar, boolean z) {
        this.f181484a = 1;
        this.f181486c = mVar;
        this.f181485b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f181484a) {
            case 0:
                String str = (String) this.f181486c;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                if (!this.f181485b) {
                    return f0.f322471a;
                }
                List list = (List) getDefaultErrorItems.invoke(new iii.d(10, null, false, false, str.concat("_error")));
                yp0.b.k(list, 0, 0, 0, 0, 31);
                return list;
            case 1:
                qwd.m mVar = (qwd.m) this.f181486c;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new f3(new CurrencyImage(mVar.f249865c.f306286a, (ImageTransformations) null, new TextLocalisedClause(R$string.crypto_staking_single_stake_accessibility_label_currency_picker_icon, null, null, 14), 6), new MoneyClause(new dj0.d(0L, mVar.f249865c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, this.f181485b, h3.ERROR, false);
            default:
                sa6.b bVar = (sa6.b) this.f181486c;
                Data collectionData = (Data) obj2;
                Data charitiesData = (Data) obj3;
                Intrinsics.checkNotNullParameter(collectionData, "collectionData");
                Intrinsics.checkNotNullParameter(charitiesData, "charitiesData");
                if (charitiesData.getLoading() && this.f181485b) {
                    return new Data(null, null, true, 3, null);
                }
                List list2 = (List) charitiesData.getContent();
                if (list2 == null) {
                    return new Data(null, charitiesData.getError(), charitiesData.getLoading(), 1, null);
                }
                za6.b bVar2 = (za6.b) collectionData.getContent();
                if (bVar2 == null) {
                    return new Data(null, collectionData.getError(), collectionData.getLoading(), 1, null);
                }
                List list3 = list2;
                int iB = q0.b(w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list3) {
                    linkedHashMap.put(((ba6.l) obj4).f13938a, obj4);
                }
                List list4 = bVar2.e;
                bVar.getClass();
                ArrayList charities = sa6.b.a(linkedHashMap, list4);
                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                Intrinsics.checkNotNullParameter(charities, "charities");
                return new Data(new ba6.f(bVar2.f320569a, bVar2.f320570b, bVar2.f320571c, bVar2.d, charities, bVar2.f), null, false, 6, null);
        }
    }

    public /* synthetic */ h(boolean z, Object obj2, int i) {
        this.f181484a = i;
        this.f181485b = z;
        this.f181486c = obj2;
    }
}

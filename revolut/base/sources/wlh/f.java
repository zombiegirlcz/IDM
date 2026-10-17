package wlh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk2.x;
import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements uih.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f298489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f298490b;

    public f(l stockBuyBlockItemFactory, m stockLendingItemFactory, a complexBondsAssessmentItemFactory, kpj.f wealthAccountHeaderUiMapper, o wealthGiaMarginProductItemFactory) {
        Intrinsics.checkNotNullParameter(stockBuyBlockItemFactory, "stockBuyBlockItemFactory");
        Intrinsics.checkNotNullParameter(stockLendingItemFactory, "stockLendingItemFactory");
        Intrinsics.checkNotNullParameter(complexBondsAssessmentItemFactory, "complexBondsAssessmentItemFactory");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthGiaMarginProductItemFactory, "wealthGiaMarginProductItemFactory");
        this.f298489a = complexBondsAssessmentItemFactory;
        this.f298490b = wealthAccountHeaderUiMapper;
    }

    public final List a(q0 wealthAccountHolderType, Data settingsData, Data tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
        Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        return (List) iii.c.f(settingsData, new x(wealthAccountHolderType, 9), new wf0.b(26), new vh2.o(this, tradingLegalEntityInformation, 20));
    }

    public final ListSubheaderDelegate.Model b(Data data, n2l.j jVar, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) iii.c.f(data, new wl3.d(9), new wf0.b(28), new vh2.o(this, jVar, 19)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp16, 0, 0, 57338);
    }
}

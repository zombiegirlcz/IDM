package ccb;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$UiData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements jki.i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f22991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bcb.e f22992c;
    public final AccountId d;
    public final String e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bcb.b f22993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f22994h;
    public final acb.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f22995j;
    public final TransferScheduleData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Image f22996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MoneyBoxAmountInputScreenContract$UiData f22997m;

    public i(String targetInputAmount, xi0.b targetCurrency, bcb.e eVar, AccountId accountId, String str, dj0.d sourcePocketBalance, bcb.b bVar, k moneyFlowType, acb.b bVar2, List validationErrors, TransferScheduleData transferScheduleData, Image image, MoneyBoxAmountInputScreenContract$UiData uiData) {
        Intrinsics.checkNotNullParameter(targetInputAmount, "targetInputAmount");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        Intrinsics.checkNotNullParameter(moneyFlowType, "moneyFlowType");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        this.f22990a = targetInputAmount;
        this.f22991b = targetCurrency;
        this.f22992c = eVar;
        this.d = accountId;
        this.e = str;
        this.f = sourcePocketBalance;
        this.f22993g = bVar;
        this.f22994h = moneyFlowType;
        this.i = bVar2;
        this.f22995j = validationErrors;
        this.k = transferScheduleData;
        this.f22996l = image;
        this.f22997m = uiData;
    }

    public static i a(i iVar, String str, bcb.e eVar, AccountId accountId, String str2, dj0.d dVar, bcb.b bVar, acb.b bVar2, List list, Image image, MoneyBoxAmountInputScreenContract$UiData moneyBoxAmountInputScreenContract$UiData, int i) {
        String targetInputAmount = (i & 1) != 0 ? iVar.f22990a : str;
        xi0.b targetCurrency = iVar.f22991b;
        bcb.e eVar2 = (i & 4) != 0 ? iVar.f22992c : eVar;
        AccountId accountId2 = (i & 8) != 0 ? iVar.d : accountId;
        String str3 = (i & 16) != 0 ? iVar.e : str2;
        dj0.d sourcePocketBalance = (i & 32) != 0 ? iVar.f : dVar;
        bcb.b bVar3 = (i & 64) != 0 ? iVar.f22993g : bVar;
        k moneyFlowType = iVar.f22994h;
        acb.b bVar4 = (i & 256) != 0 ? iVar.i : bVar2;
        List validationErrors = (i & 512) != 0 ? iVar.f22995j : list;
        TransferScheduleData transferScheduleData = iVar.k;
        iVar.getClass();
        Image image2 = (i & 4096) != 0 ? iVar.f22996l : image;
        MoneyBoxAmountInputScreenContract$UiData uiData = (i & 8192) != 0 ? iVar.f22997m : moneyBoxAmountInputScreenContract$UiData;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(targetInputAmount, "targetInputAmount");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        Intrinsics.checkNotNullParameter(moneyFlowType, "moneyFlowType");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        return new i(targetInputAmount, targetCurrency, eVar2, accountId2, str3, sourcePocketBalance, bVar3, moneyFlowType, bVar4, validationErrors, transferScheduleData, image2, uiData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f22990a, iVar.f22990a) && this.f22991b.equals(iVar.f22991b) && Intrinsics.f(this.f22992c, iVar.f22992c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f22993g, iVar.f22993g) && this.f22994h == iVar.f22994h && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f22995j, iVar.f22995j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f22996l, iVar.f22996l) && Intrinsics.f(this.f22997m, iVar.f22997m);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f22991b, this.f22990a.hashCode() * 31, 31);
        bcb.e eVar = this.f22992c;
        int iHashCode = (iJ + (eVar == null ? 0 : eVar.hashCode())) * 31;
        AccountId accountId = this.d;
        int iHashCode2 = (iHashCode + (accountId == null ? 0 : accountId.hashCode())) * 31;
        String str = this.e;
        int iC = v7.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        bcb.b bVar = this.f22993g;
        int iHashCode3 = (this.f22994h.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        acb.b bVar2 = this.i;
        int iD = p.a.d((iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f22995j);
        TransferScheduleData transferScheduleData = this.k;
        int iHashCode4 = (iD + (transferScheduleData == null ? 0 : transferScheduleData.hashCode())) * 961;
        Image image = this.f22996l;
        return this.f22997m.hashCode() + ((iHashCode4 + (image != null ? image.hashCode() : 0)) * 31);
    }
}

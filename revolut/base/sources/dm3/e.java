package dm3;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f115827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarModel.Default f115828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f115829c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f115830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f115831h;
    public final b6k.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f115832j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k71.q f115833l;

    public e(zm3.a contact, AvatarModel.Default contactImage, Data transactionsContent, Data scheduledTransfersContent, Data groupsContent, Data paymentSettings, Data planGiftingState, boolean z, b6k.e recipientAnalytics, boolean z3, boolean z4, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(contactImage, "contactImage");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(scheduledTransfersContent, "scheduledTransfersContent");
        Intrinsics.checkNotNullParameter(groupsContent, "groupsContent");
        Intrinsics.checkNotNullParameter(paymentSettings, "paymentSettings");
        Intrinsics.checkNotNullParameter(planGiftingState, "planGiftingState");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f115827a = contact;
        this.f115828b = contactImage;
        this.f115829c = transactionsContent;
        this.d = scheduledTransfersContent;
        this.e = groupsContent;
        this.f = paymentSettings;
        this.f115830g = planGiftingState;
        this.f115831h = z;
        this.i = recipientAnalytics;
        this.f115832j = z3;
        this.k = z4;
        this.f115833l = transactionsExtraData;
    }

    public static e a(e eVar, Data data, Data data2, Data data3, Data data4, Data data5, boolean z, b6k.e eVar2, boolean z3, boolean z4, k71.q qVar, int i) {
        zm3.a contact = eVar.f115827a;
        AvatarModel.Default contactImage = eVar.f115828b;
        if ((i & 4) != 0) {
            data = eVar.f115829c;
        }
        Data transactionsContent = data;
        Data scheduledTransfersContent = (i & 8) != 0 ? eVar.d : data2;
        Data groupsContent = (i & 16) != 0 ? eVar.e : data3;
        Data paymentSettings = (i & 32) != 0 ? eVar.f : data4;
        Data planGiftingState = (i & 64) != 0 ? eVar.f115830g : data5;
        boolean z6 = (i & 128) != 0 ? eVar.f115831h : z;
        b6k.e recipientAnalytics = (i & 256) != 0 ? eVar.i : eVar2;
        boolean z11 = (i & 512) != 0 ? eVar.f115832j : z3;
        boolean z12 = (i & 1024) != 0 ? eVar.k : z4;
        k71.q transactionsExtraData = (i & 2048) != 0 ? eVar.f115833l : qVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(contactImage, "contactImage");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(scheduledTransfersContent, "scheduledTransfersContent");
        Intrinsics.checkNotNullParameter(groupsContent, "groupsContent");
        Intrinsics.checkNotNullParameter(paymentSettings, "paymentSettings");
        Intrinsics.checkNotNullParameter(planGiftingState, "planGiftingState");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new e(contact, contactImage, transactionsContent, scheduledTransfersContent, groupsContent, paymentSettings, planGiftingState, z6, recipientAnalytics, z11, z12, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f115827a, eVar.f115827a) && Intrinsics.f(this.f115828b, eVar.f115828b) && Intrinsics.f(this.f115829c, eVar.f115829c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f115830g, eVar.f115830g) && this.f115831h == eVar.f115831h && Intrinsics.f(this.i, eVar.i) && this.f115832j == eVar.f115832j && this.k == eVar.k && Intrinsics.f(this.f115833l, eVar.f115833l);
    }

    public final int hashCode() {
        return this.f115833l.hashCode() + j6.a.c(j6.a.c((this.i.hashCode() + j6.a.c(kii.e.c(this.f115830g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f115829c, (this.f115828b.hashCode() + (this.f115827a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31, this.f115831h)) * 31, 31, this.f115832j), 31, this.k);
    }
}

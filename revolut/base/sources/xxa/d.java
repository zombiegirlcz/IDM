package xxa;

import androidx.room.util.DBUtil;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.referrals.promo.api.invitation.models.ChatInvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.EmptyChatInvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.InvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.RecipientData;
import com.revolut.feature.referrals.promo.api.invitation.models.ReferralsInvitationModel;
import com.revolut.feature.referrals.promo.impl.invitation.service.ReferralsInvitationService;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sx2.h;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralsInvitationService f309461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sxa.d f309462b;

    static {
        Intrinsics.checkNotNullExpressionValue(new TypeToken<List<? extends RecipientData>>() { // from class: com.revolut.feature.referrals.promo.impl.invitation.repository.ReferralsInvitationRepositoryImpl$Companion$LIST_OF_RECIPIENT_DATA_TYPE$1
        }.getType(), "getType(...)");
    }

    public d(ReferralsInvitationService referralsInvitationService, sxa.d referralsInvitationDao, ue0.c referralsInvitationStorage) {
        Intrinsics.checkNotNullParameter(referralsInvitationService, "referralsInvitationService");
        Intrinsics.checkNotNullParameter(referralsInvitationDao, "referralsInvitationDao");
        Intrinsics.checkNotNullParameter(referralsInvitationStorage, "referralsInvitationStorage");
        this.f309461a = referralsInvitationService;
        this.f309462b = referralsInvitationDao;
        final int i = 0;
        final int i2 = 1;
        new f(new Function2(this) { // from class: xxa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f309460b;

            {
                this.f309460b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        RecipientData recipientData = (RecipientData) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(recipientData, "recipientData");
                        d0<wxa.d> invitationPromos = this.f309460b.f309461a.getInvitationPromos(recipientData.f81810a, recipientData.f81811b, recipientData.f81812c.f297794a);
                        xx9.d dVar = new xx9.d(28, new xx9.f(8));
                        invitationPromos.getClass();
                        i iVar = new i(invitationPromos, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        RecipientData recipientData2 = (RecipientData) obj2;
                        ReferralsInvitationModel invitation = (ReferralsInvitationModel) obj3;
                        Intrinsics.checkNotNullParameter(recipientData2, "recipientData");
                        Intrinsics.checkNotNullParameter(invitation, "invitation");
                        sxa.d dVar2 = this.f309460b.f309462b;
                        String id10 = d.a(recipientData2);
                        Intrinsics.checkNotNullParameter(invitation, "<this>");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        EmptyChatInvitationPromo emptyChatInvitationPromo = invitation.f81813a;
                        Intrinsics.checkNotNullParameter(emptyChatInvitationPromo, "<this>");
                        sxa.b bVar = new sxa.b(emptyChatInvitationPromo.f81805a, emptyChatInvitationPromo.f81806b, emptyChatInvitationPromo.f81807c, emptyChatInvitationPromo.d, emptyChatInvitationPromo.e);
                        ChatInvitationPromo chatInvitationPromo = invitation.f81814b;
                        Intrinsics.checkNotNullParameter(chatInvitationPromo, "<this>");
                        sxa.a aVar = new sxa.a(chatInvitationPromo.f81802a, chatInvitationPromo.f81803b, chatInvitationPromo.f81804c, chatInvitationPromo.d, chatInvitationPromo.e);
                        InvitationPromo invitationPromo = invitation.f81815c;
                        Intrinsics.checkNotNullParameter(invitationPromo, "<this>");
                        sxa.c cVar = new sxa.c(invitationPromo.f81808a, invitationPromo.f81809b);
                        InvitationPromo invitationPromo2 = invitation.d;
                        Intrinsics.checkNotNullParameter(invitationPromo2, "<this>");
                        sxa.c cVar2 = new sxa.c(invitationPromo2.f81808a, invitationPromo2.f81809b);
                        InvitationPromo invitationPromo3 = invitation.e;
                        Intrinsics.checkNotNullParameter(invitationPromo3, "<this>");
                        sxa.f fVar = new sxa.f(id10, bVar, aVar, cVar, cVar2, new sxa.c(invitationPromo3.f81808a, invitationPromo3.f81809b));
                        dVar2.getClass();
                        DBUtil.performBlocking(dVar2.f266387a, false, true, new h(dVar2, fVar, 1));
                        return Unit.f186387a;
                }
            }
        }, null, null, new xw9.c(this, 4), new Function2(this) { // from class: xxa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f309460b;

            {
                this.f309460b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        RecipientData recipientData = (RecipientData) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(recipientData, "recipientData");
                        d0<wxa.d> invitationPromos = this.f309460b.f309461a.getInvitationPromos(recipientData.f81810a, recipientData.f81811b, recipientData.f81812c.f297794a);
                        xx9.d dVar = new xx9.d(28, new xx9.f(8));
                        invitationPromos.getClass();
                        i iVar = new i(invitationPromos, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        RecipientData recipientData2 = (RecipientData) obj2;
                        ReferralsInvitationModel invitation = (ReferralsInvitationModel) obj3;
                        Intrinsics.checkNotNullParameter(recipientData2, "recipientData");
                        Intrinsics.checkNotNullParameter(invitation, "invitation");
                        sxa.d dVar2 = this.f309460b.f309462b;
                        String id10 = d.a(recipientData2);
                        Intrinsics.checkNotNullParameter(invitation, "<this>");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        EmptyChatInvitationPromo emptyChatInvitationPromo = invitation.f81813a;
                        Intrinsics.checkNotNullParameter(emptyChatInvitationPromo, "<this>");
                        sxa.b bVar = new sxa.b(emptyChatInvitationPromo.f81805a, emptyChatInvitationPromo.f81806b, emptyChatInvitationPromo.f81807c, emptyChatInvitationPromo.d, emptyChatInvitationPromo.e);
                        ChatInvitationPromo chatInvitationPromo = invitation.f81814b;
                        Intrinsics.checkNotNullParameter(chatInvitationPromo, "<this>");
                        sxa.a aVar = new sxa.a(chatInvitationPromo.f81802a, chatInvitationPromo.f81803b, chatInvitationPromo.f81804c, chatInvitationPromo.d, chatInvitationPromo.e);
                        InvitationPromo invitationPromo = invitation.f81815c;
                        Intrinsics.checkNotNullParameter(invitationPromo, "<this>");
                        sxa.c cVar = new sxa.c(invitationPromo.f81808a, invitationPromo.f81809b);
                        InvitationPromo invitationPromo2 = invitation.d;
                        Intrinsics.checkNotNullParameter(invitationPromo2, "<this>");
                        sxa.c cVar2 = new sxa.c(invitationPromo2.f81808a, invitationPromo2.f81809b);
                        InvitationPromo invitationPromo3 = invitation.e;
                        Intrinsics.checkNotNullParameter(invitationPromo3, "<this>");
                        sxa.f fVar = new sxa.f(id10, bVar, aVar, cVar, cVar2, new sxa.c(invitationPromo3.f81808a, invitationPromo3.f81809b));
                        dVar2.getClass();
                        DBUtil.performBlocking(dVar2.f266387a, false, true, new h(dVar2, fVar, 1));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, 230);
    }

    public static String a(RecipientData recipientData) {
        return com.google.android.gms.internal.mlkit_vision_face.a.p(recipientData.f81810a, "_", recipientData.f81811b, "_", recipientData.f81812c.f297794a);
    }
}

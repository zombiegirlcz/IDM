package cya;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tya.j f110070a;

    public b(tya.j referralItemMapper) {
        Intrinsics.checkNotNullParameter(referralItemMapper, "referralItemMapper");
        this.f110070a = referralItemMapper;
    }

    public final ArrayList a(tya.d type, List invites, n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(invites, "invites");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = invites.iterator();
        while (it8.hasNext()) {
            RowDelegate.Model modelA = this.f110070a.a((ActiveOrPastInviteeDetails) it8.next(), type, referralCampaignV4Type);
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        return arrayList;
    }
}

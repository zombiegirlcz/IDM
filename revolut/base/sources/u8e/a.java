package u8e;

import ccb.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.z;
import twb.b0;
import u4i.u;
import vkm.v1;
import wsg.n;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ybb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f278182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f278183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.a f278184c;
    public final l80.e d;
    public final o7.d e;
    public final c4i.a f;

    public a(g6e.d subaccountInteractor, n walletInteractor, ppg.a customisedVaultInteractor, l80.e dateProvider, o7.d validator) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f278182a = subaccountInteractor;
        this.f278183b = walletInteractor;
        this.f278184c = customisedVaultInteractor;
        this.d = dateProvider;
        this.e = validator;
        this.f = c4i.a.VAULT_TRANSFER;
    }

    @Override // ybb.d
    public final vkm.d a(xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return qk.d.n(this.f278183b, currency, accountId);
    }

    @Override // ybb.d
    public final v1 d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new v1(new b0(this, id10, (Continuation) null, 7));
    }

    @Override // ybb.d
    public final c4i.a e() {
        return this.f;
    }

    @Override // ybb.d
    public final Object f(String str, y yVar) {
        return zbb.b.f320865b;
    }

    @Override // ybb.d
    public final vkm.d g(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return rd0.e.b(zi0.c.F(nim.a.w(ppg.a.a(this.f278184c, id10), new u8c.c(3)), LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_wallet, null, new Color.Composite(R$attr.uikit_colorTerracotta, R$attr.uikit_colorTransparent, ho0.a.OVERLAY), BitmapDescriptorFactory.HUE_RED, null, 48)));
    }

    @Override // ybb.d
    public final Flow h(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return mo3.a.g(nim.a.v(((z) this.f278182a).u(id10), new u8c.c(2)), null, new u(9), 1);
    }

    @Override // ybb.d
    public final List i(bcb.g validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        List list = this.e.z(validationData.f14429a).f316033b;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((yqi.b) it8.next()) instanceof srf.a) {
                    TransferScheduleData transferScheduleData = validationData.f14430b;
                    Long lValueOf = transferScheduleData != null ? Long.valueOf(transferScheduleData.f104285a) : null;
                    if (lValueOf == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (!((l80.f) this.d).c(lValueOf.longValue())) {
                        list = null;
                    }
                    return list == null ? f0.f322471a : list;
                }
            }
        }
        return list;
    }
}

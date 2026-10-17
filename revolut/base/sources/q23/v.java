package q23;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cards_core.R$string;
import ip0.pb0;
import ip0.y10;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f241526a;

    public v(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f241526a = languageProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.i iVar;
        TextLocalisedClause textLocalisedClause;
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f241513c;
        boolean z = domainState.f241512b;
        Boolean bool = domainState.f241516j;
        qv0.i iVar2 = (qv0.i) iii.c.f(data, new q09.a(this), new pyb.g(this, 21), new pv7.t(this, 5));
        final int i = 0;
        qv0.i iVar3 = (qv0.i) iii.c.f(domainState.f241511a, new Function1(this) { // from class: q23.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f241525b;

            {
                this.f241525b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Function0 it8 = (Function0) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f241525b.getClass();
                        return new pb0("ADDRESS_ROW_LIST_ID");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f241525b.getClass();
                        return new pb0("DELIVERY_TO_LIST_ID");
                }
            }
        }, new pyb.g(22), new ox2.d(this, domainState, 26));
        TextLocalisedClause textLocalisedClause2 = null;
        if (domainState.k) {
            final int i2 = 1;
            iVar = (qv0.i) iii.c.f(domainState.i, new Function1(this) { // from class: q23.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v f241525b;

                {
                    this.f241525b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f241525b.getClass();
                            return new pb0("ADDRESS_ROW_LIST_ID");
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f241525b.getClass();
                            return new pb0("DELIVERY_TO_LIST_ID");
                    }
                }
            }, new pyb.g(23), new p40.n(this, domainState, 21));
        } else {
            iVar = null;
        }
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        eVarB2.add(iVar2);
        n14.e.b(eVarB2, iVar3);
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        aim.e eVarB3 = zhm.u.b();
        n14.e.b(eVarB3, iVar);
        aim.e eVarA2 = zhm.u.a(eVarB3);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA2);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.f(bool, bool2)) {
            List listC = zhm.u.c(new sa("WARNING_FIELD_ID", (Clause) new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_warning_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_warning_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB.addAll(listC);
        }
        aim.e eVarA3 = zhm.u.a(eVarB);
        TextLocalisedClause textLocalisedClause3 = Intrinsics.f(bool, bool2) ? new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_title, null, null, 14) : z ? new TextLocalisedClause(R$string.cards_verify_delivery_address_force_profile_address_title, null, null, 14) : new TextLocalisedClause(R$string.cards_verify_delivery_address_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = (z && Intrinsics.f(bool, bool2)) ? new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_cta_virtual_card, null, null, 14) : Intrinsics.f(bool, bool2) ? new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_cta_change_address, null, null, 14) : z ? new TextLocalisedClause(R$string.cards_verify_delivery_address_continue, null, null, 14) : new TextLocalisedClause(R$string.cards_verify_delivery_address_confirm, null, null, 14);
        if (!z || !Intrinsics.f(bool, bool2)) {
            if (Intrinsics.f(bool, bool2)) {
                textLocalisedClause = new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_cta_virtual_card, null, null, 14);
            } else if (!z) {
                textLocalisedClause = new TextLocalisedClause(R$string.cards_verify_delivery_address_edit, null, null, 14);
            }
            textLocalisedClause2 = textLocalisedClause;
        }
        return new s(eVarA3, textLocalisedClause3, textLocalisedClause4, textLocalisedClause2);
    }
}

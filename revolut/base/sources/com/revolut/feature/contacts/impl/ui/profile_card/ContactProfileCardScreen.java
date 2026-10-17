package com.revolut.feature.contacts.impl.ui.profile_card;

import aii.q;
import cli.k;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.contacts.impl.ui.profile_card.ContactProfileCardScreen;
import com.revolut.feature.contacts.impl.ui.profile_card.ContactProfileCardScreenContract$ContactProfileCardInputData;
import com.revolut.feature.profile_card.BaseProfileCardScreen;
import kji.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import vl3.l;
import vl3.m;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/impl/ui/profile_card/ContactProfileCardScreen;", "Lcom/revolut/feature/profile_card/BaseProfileCardScreen;", "Lcli/k;", "Laii/q;", "Lkji/f;", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactProfileCardScreen extends BaseProfileCardScreen<k, q> implements f {
    public final ContactProfileCardScreenContract$ContactProfileCardInputData R;
    public final Integer S;
    public final Object T;
    public final Object U;

    public ContactProfileCardScreen(ContactProfileCardScreenContract$ContactProfileCardInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = inputData;
        this.S = inputData.f66016b ? Integer.valueOf(R$style.UiKitTheme_Mono) : Integer.valueOf(R$style.UiKitTheme_Transparent);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: jm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactProfileCardScreen f175935b;

            {
                this.f175935b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ContactProfileCardScreen contactProfileCardScreen = this.f175935b;
                        qji.b bVarU2 = contactProfileCardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.contacts.impl.ui.profile_card.di.ContactProfileCardScreenInjector");
                        l lVar = (l) bVarU2;
                        vl3.k kVar = lVar.f290220b;
                        l lVar2 = lVar.f290221c;
                        ContactProfileCardScreenContract$ContactProfileCardInputData contactProfileCardScreenContract$ContactProfileCardInputData = contactProfileCardScreen.R;
                        contactProfileCardScreenContract$ContactProfileCardInputData.getClass();
                        return new m(kVar, lVar2, contactProfileCardScreenContract$ContactProfileCardInputData);
                    default:
                        return (e) ((m) this.f175935b.T.getValue()).f290224c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: jm3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactProfileCardScreen f175935b;

            {
                this.f175935b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ContactProfileCardScreen contactProfileCardScreen = this.f175935b;
                        qji.b bVarU2 = contactProfileCardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.contacts.impl.ui.profile_card.di.ContactProfileCardScreenInjector");
                        l lVar = (l) bVarU2;
                        vl3.k kVar = lVar.f290220b;
                        l lVar2 = lVar.f290221c;
                        ContactProfileCardScreenContract$ContactProfileCardInputData contactProfileCardScreenContract$ContactProfileCardInputData = contactProfileCardScreen.R;
                        contactProfileCardScreenContract$ContactProfileCardInputData.getClass();
                        return new m(kVar, lVar2, contactProfileCardScreenContract$ContactProfileCardInputData);
                    default:
                        return (e) ((m) this.f175935b.T.getValue()).f290224c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (jm3.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    public final fpa.e d3() {
        return (jm3.e) this.U.getValue();
    }
}

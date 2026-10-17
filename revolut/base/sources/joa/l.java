package joa;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f176918a;

    public l(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f176918a = featureToggleInteractor;
    }

    public static RowDelegate.Model d(l lVar, String str, TextLocalisedClause textLocalisedClause, int i, Integer num, Object obj2, int i2) {
        Integer numValueOf = (i2 & 32) != 0 ? Integer.valueOf(R$attr.uikit_colorAccent) : num;
        Object obj3 = (i2 & 64) != 0 ? null : obj2;
        lVar.getClass();
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, numValueOf, (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, obj3, null, 0, 0, 0, 0, 532675544);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f176897b;
        Data data2 = domainState.f176896a;
        Data data3 = domainState.f176898c;
        return new e(i2b.a.o((List) iii.c.f(t1.v(data, data2, data3, domainState.i), new jn2.a(this, 19), new jme.f(8), new j(this, domainState, 0)), (List) iii.c.f(t1.t(data2, data3), new jn2.a(20), new jme.f(9), new j75.i(this, 11))));
    }

    public final RowDelegate.Model b(boolean z) {
        return d(this, "ID_ALL_ACCOUNTS", new TextLocalisedClause(R$string.profileHome_settings_item_account_details_title, null, null, 14), z ? R$drawable.uikit_icn_24_coins : R$drawable.uikit_icn_24_bank, null, null, 116);
    }

    public final RowDelegate.Model c() {
        return d(this, "ID_PERSONAL_DETAILS", new TextLocalisedClause(R$string.profileHome_settings_item_personal_details_title, null, null, 14), R$drawable.uikit_icn_24_profile, null, null, 116);
    }

    public final RowDelegate.Model e(int i) {
        return d(this, "ID_EXIT_TERMINATE", new TextLocalisedClause(R.string.terminate_account_dialog_profile_terminate_button, null, null, 14), R$drawable.uikit_icn_24_broken_heart, Integer.valueOf(i), null, 84);
    }
}

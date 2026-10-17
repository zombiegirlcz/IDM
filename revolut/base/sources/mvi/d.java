package mvi;

import aw0.ka;
import bti.n;
import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AccessPassWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.p0;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import gim.i;
import grl.t9;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f209257w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f209257w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f209257w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Integer num;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List list = (List) pair.f186385a;
        String str = (String) pair.f186386b;
        if (list.isEmpty()) {
            return f.a(this.f209257w);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            n nVar = ((AsftPass) obj3).f98714b;
            if (nVar == n.ACTIVE || nVar == n.CREATED) {
                arrayList.add(obj3);
            }
        }
        AsftPass asftPass = (AsftPass) d0.z0(arrayList, new k2j.d(new c(), 13));
        String str2 = this.f209257w;
        if (asftPass == null) {
            return f.a(str2);
        }
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.DATA, AnalyticsContext.INSTANCE);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.asft_widget_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.asft_common_template_placeholder, u.c(asftPass.i), null, 12);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_qr;
        int i2 = R$attr.uikit_colorForeground;
        AvatarModel.Default r102 = new AvatarModel.Default(LayeredImage.Companion.b(companion, i, Integer.valueOf(i2), R$attr.uikit_colorGreyTone10, 8.0f, Float.valueOf(24.0f), null, 32), null, null, null, null, null, 126);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.asft_home_section_date_and_time, null, null, 14);
        ZoneId zoneId = asftPass.f98718j.toZoneId();
        int i3 = R$string.asft_checkout_top_block_date_and_time;
        Instant instant = asftPass.f98715c;
        TimeClause timeClause = new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, zoneId, 4);
        long epochMilli = instant.toEpochMilli();
        TimeClause.Format.TimeDefault timeDefault = TimeClause.Format.TimeDefault.f57977b;
        com.revolut.core.ui_kit.delegates.widgets.c cVar = new com.revolut.core.ui_kit.delegates.widgets.c(new TextLocalisedClause(i3, v.k(timeClause, new TimeClause(epochMilli, timeDefault, null, zoneId, 4), new TimeClause(instant.plusSeconds(1800L).toEpochMilli(), timeDefault, null, zoneId, 4)), null, 12), textLocalisedClause5);
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.asft_home_section_status, null, null, 14);
        f fVar = this.v;
        int i5 = b.f209256a[fVar.d.a(asftPass).ordinal()];
        if (i5 == 1) {
            textLocalisedClause = textLocalisedClause3;
            num = null;
            textLocalisedClause2 = new TextLocalisedClause(R$string.asft_home_section_preparing_pass, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
        } else if (i5 == 2) {
            textLocalisedClause = textLocalisedClause3;
            num = null;
            textLocalisedClause2 = new TextLocalisedClause(R$string.asft_home_section_available_in, u.c(new TimeClause(asftPass.d.toEpochMilli() - ((l80.f) fVar.f209262c).b().toEpochMilli(), new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0.MINUTES)), null, null, 12)), null, 12);
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            num = null;
            textLocalisedClause2 = new TextLocalisedClause(R$string.asft_home_section_ready_to_use, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 10);
            textLocalisedClause = textLocalisedClause3;
        }
        return new AccessPassWidgetDelegate.Model(str2, textLocalisedClause, textLocalisedClause4, r102, new com.revolut.core.ui_kit.delegates.widgets.d(cVar, new com.revolut.core.ui_kit.delegates.widgets.c(textLocalisedClause2, textLocalisedClause6), 4), new AnalyticsContext(w0VarE), new nvi.a(asftPass, str, str2, new AnalyticsContext(w0VarE), new ViewableRecordItem$Type.ViewableRecord(num)));
    }
}

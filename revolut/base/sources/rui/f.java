package rui;

import aw0.o9;
import com.revolut.core.ui_kit.models.NameClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassAdmission;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import ip0.b00;
import java.time.Instant;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements Function2 {
    public static aim.e a(AsftPass pass, AsftPassAdmission passAdmission) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(passAdmission, "passAdmission");
        b00 b00Var = new b00(new TextClause(pass.f98717h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.asft_pass_details_terminal, null, null, 14));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_pass_details_date, null, null, 14);
        Instant instant = pass.f98715c;
        long epochMilli = instant.toEpochMilli();
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
        TimeZone timeZone = pass.f98718j;
        b00 b00Var2 = new b00(new TimeClause(epochMilli, dateMedium, null, timeZone.toZoneId(), 4), textLocalisedClause);
        b00 b00Var3 = new b00(new TimeClause(instant.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, timeZone.toZoneId(), 4), new TextLocalisedClause(R$string.asft_pass_details_time_slot, null, null, 14));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.asft_pass_details_traveller, null, null, 14);
        String str = passAdmission.e;
        if (str == null) {
            str = "";
        }
        b00 b00Var4 = new b00(new NameClause(str, passAdmission.f, 12), textLocalisedClause2);
        aim.e eVarB = u.b();
        eVarB.add(b00Var);
        eVarB.add(b00Var2);
        eVarB.add(b00Var3);
        eVarB.add(b00Var4);
        return u.a(eVarB);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        return a((AsftPass) obj2, (AsftPassAdmission) obj3);
    }
}

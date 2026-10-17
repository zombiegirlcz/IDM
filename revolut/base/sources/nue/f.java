package nue;

import com.revolut.domain.models.topup.methods.TopUpMethodBanner$Type;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import hx7.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import xue.d;
import xue.f;
import yte.o;
import yte.p;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static TopupMethod.OtherMethod.AdditionalData a(f.a aVar) {
        f.a.b supportedInstitutions = aVar.getSupportedInstitutions();
        TopupMethod.OtherMethod.AdditionalData.SupportedInstitutions supportedInstitutions2 = null;
        if (supportedInstitutions != null) {
            int total = supportedInstitutions.getTotal();
            List institutions = supportedInstitutions.getInstitutions();
            ArrayList arrayList = new ArrayList(w.t(institutions, 10));
            Iterator it8 = institutions.iterator();
            while (it8.hasNext()) {
                que.a logo = ((f.a.C1713a) it8.next()).getLogo();
                arrayList.add(new TopupMethod.OtherMethod.AdditionalData.SupportedInstitution(logo != null ? l.B(logo) : null));
            }
            supportedInstitutions2 = new TopupMethod.OtherMethod.AdditionalData.SupportedInstitutions(total, arrayList);
        }
        return new TopupMethod.OtherMethod.AdditionalData(supportedInstitutions2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public static TopupMethod.OtherMethod b(xue.f topUpMethodDto) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(topUpMethodDto, "topUpMethodDto");
        try {
            TopupMethodType topupMethodTypeValueOf = TopupMethodType.valueOf(topUpMethodDto.getType());
            String title = topUpMethodDto.getTitle();
            String description = topUpMethodDto.getDescription();
            que.a logo = topUpMethodDto.getLogo();
            io3.b bVarB = logo != null ? l.B(logo) : null;
            List supportedCurrencyCodes = topUpMethodDto.getSupportedCurrencyCodes();
            List<String> tags = topUpMethodDto.getTags();
            if (tags != null) {
                arrayList = new ArrayList();
                for (String str : tags) {
                    p.Companion.getClass();
                    p pVarA = o.a(str);
                    if (pVarA != null) {
                        arrayList.add(pVarA);
                    }
                }
            } else {
                arrayList = f0.f322471a;
            }
            ?? r87 = arrayList;
            String fundsArrivalTimeDescription = topUpMethodDto.getFundsArrivalTimeDescription();
            f.a additionalData = topUpMethodDto.getAdditionalData();
            return new TopupMethod.OtherMethod(topupMethodTypeValueOf, title, description, bVarB, supportedCurrencyCodes, r87, fundsArrivalTimeDescription, additionalData != null ? a(additionalData) : null);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public static TopupMethod.StoredMethod.LogoBadge c(d.b dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        try {
            return new TopupMethod.StoredMethod.LogoBadge(TopupMethod.StoredMethod.LogoBadge.Icon.valueOf(dto.getIcon()), TopupMethod.StoredMethod.LogoBadge.Style.valueOf(dto.getStyle()));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public static TopupMethod.StoredMethod.Outage d(d.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new TopupMethod.StoredMethod.Outage(cVar.getTitle(), cVar.getMessage(), cVar.getSummary());
    }

    public static h71.a e(xue.e dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        try {
            TopUpMethodBanner$Type topUpMethodBanner$TypeValueOf = TopUpMethodBanner$Type.valueOf(dto.getType());
            String title = dto.getTitle();
            String description = dto.getDescription();
            if (description == null) {
                description = "";
            }
            return new h71.a(topUpMethodBanner$TypeValueOf, title, description, dto.getSupportedCurrencyCodes());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public static Pair f(d.a aVar, String pocketType) {
        io3.l lVar;
        TopupMethod.AutoTopUpState.State state;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        io3.l[] lVarArrValues = io3.l.values();
        int length = lVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                lVar = null;
                break;
            }
            lVar = lVarArrValues[i2];
            if (a0.z(lVar.name(), pocketType, true)) {
                break;
            }
            i2++;
        }
        if (lVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unexpected pocketType in StoredMethodDto.AutoTopUpDto: ", pocketType));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            lVar = io3.l.UNKNOWN;
        }
        String autoTopUp = aVar.getAutoTopUp();
        TopupMethod.AutoTopUpState.State[] stateArrValues = TopupMethod.AutoTopUpState.State.values();
        int length2 = stateArrValues.length;
        while (true) {
            if (i >= length2) {
                state = null;
                break;
            }
            state = stateArrValues[i];
            if (a0.z(state.name(), autoTopUp, true)) {
                break;
            }
            i++;
        }
        if (state == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("Unexpected AutoTopup state in StoredMethodDto.AutoTopUpDto: ", aVar.getAutoTopUp()));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
            state = TopupMethod.AutoTopUpState.State.UNAVAILABLE;
        }
        return new Pair(lVar, new TopupMethod.AutoTopUpState(state));
    }
}

package com.revolut.data.database.models.openbanking.mapper;

import com.revolut.data.database.models.openbanking.ExternalInstitutionBranchEntity;
import com.revolut.data.database.models.openbanking.ExternalInstitutionEntity;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsWithBranches;
import com.revolut.data.database.models.openbanking.TopupSettingsEntity;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import ho3.c;
import io3.a;
import io3.b;
import io3.n;
import io3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0002\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0002\u0010\n\u001a\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\u0004\u0010\u000b\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/core/model/domain/wallet/openbanking/ExternalInstitution;", "Lcom/revolut/data/database/models/openbanking/ExternalInstitutionsWithBranches;", "toEntity", "(Lcom/revolut/feature/core/model/domain/wallet/openbanking/ExternalInstitution;)Lcom/revolut/data/database/models/openbanking/ExternalInstitutionsWithBranches;", "toDomain", "(Lcom/revolut/data/database/models/openbanking/ExternalInstitutionsWithBranches;)Lcom/revolut/feature/core/model/domain/wallet/openbanking/ExternalInstitution;", "Lho3/a;", "", "institutionId", "Lcom/revolut/data/database/models/openbanking/ExternalInstitutionBranchEntity;", "(Lho3/a;Ljava/lang/String;)Lcom/revolut/data/database/models/openbanking/ExternalInstitutionBranchEntity;", "(Lcom/revolut/data/database/models/openbanking/ExternalInstitutionBranchEntity;)Lho3/a;", "", "Lio3/a;", "getPocketLogoMapping", "()Ljava/util/Map;", "pocketLogoMapping", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExternalInstitutionEntityMapperKt {
    private static final Map<String, a> getPocketLogoMapping() {
        return r0.k(new Pair("Base64", a.BASE64), new Pair("URL", a.URL));
    }

    @NotNull
    public static final ExternalInstitution toDomain(@NotNull ExternalInstitutionsWithBranches externalInstitutionsWithBranches) {
        ArrayList arrayList;
        c cVarValueOf;
        Intrinsics.checkNotNullParameter(externalInstitutionsWithBranches, "<this>");
        String id10 = externalInstitutionsWithBranches.getInstitution().getId();
        String name = externalInstitutionsWithBranches.getInstitution().getName();
        b bVar = new b((a) u1.u(externalInstitutionsWithBranches.getInstitution().getLogoType(), getPocketLogoMapping()), externalInstitutionsWithBranches.getInstitution().getLogo());
        List<ExternalInstitutionBranchEntity> branches = externalInstitutionsWithBranches.getBranches();
        if (branches != null) {
            List<ExternalInstitutionBranchEntity> list = branches;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDomain((ExternalInstitutionBranchEntity) it8.next()));
            }
        } else {
            arrayList = null;
        }
        boolean paymentInitiation = externalInstitutionsWithBranches.getInstitution().getPaymentInitiation();
        boolean infoProvider = externalInstitutionsWithBranches.getInstitution().getInfoProvider();
        String system = externalInstitutionsWithBranches.getInstitution().getTopupSettings().getSystem();
        go3.b.Companion.getClass();
        o oVar = new o((n) u1.u(system, go3.a.a()), externalInstitutionsWithBranches.getInstitution().getTopupSettings().getRecurrenceSupported());
        List<String> requirements = externalInstitutionsWithBranches.getInstitution().getRequirements();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it9 = requirements.iterator();
        while (it9.hasNext()) {
            try {
                cVarValueOf = c.valueOf((String) it9.next());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, e, h0Var);
                cVarValueOf = null;
            }
            if (cVarValueOf != null) {
                arrayList2.add(cVarValueOf);
            }
        }
        return new ExternalInstitution(id10, name, bVar, arrayList, paymentInitiation, infoProvider, oVar, arrayList2, externalInstitutionsWithBranches.getInstitution().getMandateInitiation(), false, true, externalInstitutionsWithBranches.getInstitution().getTags(), externalInstitutionsWithBranches.getInstitution().getDescription());
    }

    @NotNull
    public static final ExternalInstitutionsWithBranches toEntity(@NotNull ExternalInstitution externalInstitution) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(externalInstitution, "<this>");
        String str = externalInstitution.f66107a;
        String str2 = externalInstitution.f66108b;
        b bVar = externalInstitution.f66109c;
        String str3 = bVar.f163143b;
        String strG = u1.g(bVar.f163142a, getPocketLogoMapping());
        boolean z = externalInstitution.e;
        boolean z3 = externalInstitution.f;
        o oVar = externalInstitution.f66110g;
        n nVar = oVar.f163167a;
        go3.b.Companion.getClass();
        TopupSettingsEntity topupSettingsEntity = new TopupSettingsEntity(u1.g(nVar, go3.a.a()), oVar.f163168b);
        List list = externalInstitution.f66111h;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((c) it8.next()).name());
        }
        ExternalInstitutionEntity externalInstitutionEntity = new ExternalInstitutionEntity(str, str2, str3, strG, z, z3, topupSettingsEntity, arrayList2, externalInstitution.i, externalInstitution.f66113l, externalInstitution.f66114m);
        List list2 = externalInstitution.d;
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList.add(toEntity((ho3.a) it9.next(), externalInstitution.f66107a));
            }
        } else {
            arrayList = null;
        }
        return new ExternalInstitutionsWithBranches(externalInstitutionEntity, arrayList);
    }

    private static final ho3.a toDomain(ExternalInstitutionBranchEntity externalInstitutionBranchEntity) {
        return new ho3.a(externalInstitutionBranchEntity.getId(), externalInstitutionBranchEntity.getName());
    }

    private static final ExternalInstitutionBranchEntity toEntity(ho3.a aVar, String str) {
        return new ExternalInstitutionBranchEntity(aVar.f154218a, aVar.f154219b, str);
    }
}

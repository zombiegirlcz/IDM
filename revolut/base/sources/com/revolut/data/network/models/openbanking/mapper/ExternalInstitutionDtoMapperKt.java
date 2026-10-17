package com.revolut.data.network.models.openbanking.mapper;

import com.revolut.data.network.models.openbanking.ExternalInstitutionDto;
import com.revolut.data.network.models.openbanking.ExternalInstitutionStatusDto;
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
import ro3.j;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0011\u0010\u0002\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\u0002\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u0002\u0010\u000f\"\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0081T¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0081T¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u0012\u0004\b\u0016\u0010\u0014\"\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto;", "Lcom/revolut/feature/core/model/domain/wallet/openbanking/ExternalInstitution;", "toDomain", "(Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto;)Lcom/revolut/feature/core/model/domain/wallet/openbanking/ExternalInstitution;", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionStatusDto;", "Lho3/b;", "(Lcom/revolut/data/network/models/openbanking/ExternalInstitutionStatusDto;)Lho3/b;", "Lro3/a;", "Lio3/b;", "(Lro3/a;)Lio3/b;", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$BranchDto;", "Lho3/a;", "(Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$BranchDto;)Lho3/a;", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;", "", "(Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;)Z", "", "EXTERNAL_INSTITUTION_STATUS_HEALTHY", "Ljava/lang/String;", "getEXTERNAL_INSTITUTION_STATUS_HEALTHY$annotations", "()V", "EXTERNAL_INSTITUTION_STATUS_UNHEALTHY", "getEXTERNAL_INSTITUTION_STATUS_UNHEALTHY$annotations", "", "Lio3/a;", "getPocketLogoMapping", "()Ljava/util/Map;", "pocketLogoMapping", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExternalInstitutionDtoMapperKt {

    @NotNull
    public static final String EXTERNAL_INSTITUTION_STATUS_UNHEALTHY = "UNHEALTHY";

    @NotNull
    public static final String EXTERNAL_INSTITUTION_STATUS_HEALTHY = "HEALTHY";

    public static /* synthetic */ void getEXTERNAL_INSTITUTION_STATUS_HEALTHY$annotations() {
    }

    public static /* synthetic */ void getEXTERNAL_INSTITUTION_STATUS_UNHEALTHY$annotations() {
    }

    @NotNull
    public static final Map<String, a> getPocketLogoMapping() {
        return r0.k(new Pair("Base64", a.BASE64), new Pair("URL", a.URL));
    }

    @NotNull
    public static final ExternalInstitution toDomain(@NotNull ExternalInstitutionDto externalInstitutionDto) {
        ArrayList arrayList;
        o oVar;
        c cVarValueOf;
        Intrinsics.checkNotNullParameter(externalInstitutionDto, "<this>");
        String id10 = externalInstitutionDto.getId();
        String name = externalInstitutionDto.getName();
        b domain = toDomain(externalInstitutionDto.getLogo());
        List<ExternalInstitutionDto.BranchDto> branches = externalInstitutionDto.getBranches();
        List list = null;
        if (branches != null) {
            List<ExternalInstitutionDto.BranchDto> list2 = branches;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator<T> it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDomain((ExternalInstitutionDto.BranchDto) it8.next()));
            }
        } else {
            arrayList = null;
        }
        boolean paymentInitiation = externalInstitutionDto.getPaymentInitiation();
        boolean infoProvider = externalInstitutionDto.getInfoProvider();
        j topupSettings = externalInstitutionDto.getTopupSettings();
        if (topupSettings != null) {
            String system = topupSettings.getSystem();
            go3.b.Companion.getClass();
            oVar = new o((n) u1.u(system, go3.a.a()), topupSettings.getRecurrenceSupported());
        } else {
            o.Companion.getClass();
            oVar = o.f163166c;
        }
        List<ExternalInstitutionDto.Requirement> requirements = externalInstitutionDto.getRequirements();
        if (requirements != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it9 = requirements.iterator();
            while (it9.hasNext()) {
                try {
                    cVarValueOf = c.valueOf(((ExternalInstitutionDto.Requirement) it9.next()).getValue());
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
            list = arrayList2;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        List list3 = list;
        Boolean mandateInitiation = externalInstitutionDto.getMandateInitiation();
        boolean zBooleanValue = mandateInitiation != null ? mandateInitiation.booleanValue() : false;
        Boolean nameSharingOnPaymentSupported = externalInstitutionDto.getNameSharingOnPaymentSupported();
        boolean zBooleanValue2 = nameSharingOnPaymentSupported != null ? nameSharingOnPaymentSupported.booleanValue() : false;
        ExternalInstitutionDto.HealthDto health = externalInstitutionDto.getHealth();
        boolean domain2 = health != null ? toDomain(health) : true;
        List<String> tags = externalInstitutionDto.getTags();
        if (tags == null) {
            tags = f0.f322471a;
        }
        return new ExternalInstitution(id10, name, domain, arrayList, paymentInitiation, infoProvider, oVar, list3, zBooleanValue, zBooleanValue2, domain2, tags, externalInstitutionDto.getDescription());
    }

    @NotNull
    public static final ho3.b toDomain(@NotNull ExternalInstitutionStatusDto externalInstitutionStatusDto) {
        Intrinsics.checkNotNullParameter(externalInstitutionStatusDto, "<this>");
        return new ho3.b(externalInstitutionStatusDto.getInstitutionId(), ho3.d.valueOf(externalInstitutionStatusDto.getState()));
    }

    @NotNull
    public static final b toDomain(@NotNull ro3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new b((a) u1.u(aVar.getType(), getPocketLogoMapping()), aVar.getValue());
    }

    private static final ho3.a toDomain(ExternalInstitutionDto.BranchDto branchDto) {
        return new ho3.a(branchDto.getId(), branchDto.getName());
    }

    private static final boolean toDomain(ExternalInstitutionDto.HealthDto healthDto) {
        String general = healthDto.getGeneral();
        if (Intrinsics.f(general, "HEALTHY")) {
            return true;
        }
        if (Intrinsics.f(general, "UNHEALTHY")) {
            return false;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown external institution health status: ", healthDto.getGeneral()));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return false;
    }
}

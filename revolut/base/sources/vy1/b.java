package vy1;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasAttributes;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.time.LocalDate;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import wy1.e;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Alias a(e eVar) {
        String type;
        Long blockedUntil;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String value = eVar.getValue();
        AliasType.Companion companion = AliasType.INSTANCE;
        String type2 = eVar.getType();
        companion.getClass();
        AliasType aliasTypeA = AliasType.Companion.a(type2);
        Object obj2 = null;
        if (aliasTypeA != null) {
            AliasStatus.Companion companion2 = AliasStatus.INSTANCE;
            String status = eVar.getStatus();
            String ownerAgent = eVar.getOwnerAgent();
            companion2.getClass();
            AliasStatus aliasStatusA = AliasStatus.Companion.a(status, ownerAgent);
            if (aliasStatusA != null) {
                wy1.b attributes = eVar.getAttributes();
                String name = eVar.getName();
                String ongoingClaimOperationId = eVar.getOngoingClaimOperationId();
                Boolean blockExtendable = attributes != null ? attributes.getBlockExtendable() : null;
                LocalDate localDateI = (attributes == null || (blockedUntil = attributes.getBlockedUntil()) == null) ? null : oc.c.I(blockedUntil.longValue());
                if (attributes != null && (type = attributes.getCapability()) != null) {
                    zz1.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    Iterator<E> it8 = zz1.b.a().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (type.equals(((zz1.b) next).b())) {
                            obj2 = next;
                            break;
                        }
                    }
                    obj2 = (zz1.b) obj2;
                }
                return new Alias(aliasTypeA, value, aliasStatusA, new AliasAttributes(name, blockExtendable, localDateI, ongoingClaimOperationId, (zz1.b) obj2));
            }
        }
        return null;
    }

    public static final e b(Alias alias) {
        wy1.b bVar;
        Intrinsics.checkNotNullParameter(alias, "<this>");
        String str = alias.f61879b;
        String str2 = alias.f61878a.f61891a;
        AliasStatus aliasStatus = alias.f61880c;
        String str3 = aliasStatus.f61884a;
        AliasAttributes aliasAttributes = alias.d;
        String str4 = aliasAttributes.d;
        Intrinsics.checkNotNullParameter(aliasAttributes, "<this>");
        Boolean bool = aliasAttributes.f61882b;
        LocalDate localDate = aliasAttributes.f61883c;
        if (bool == null && localDate == null) {
            bVar = null;
        } else {
            Long lValueOf = localDate != null ? Long.valueOf(oc.c.N(localDate)) : null;
            zz1.b bVar2 = aliasAttributes.e;
            bVar = new wy1.b(bool, lValueOf, bVar2 != null ? bVar2.b() : null);
        }
        String str5 = aliasAttributes.f61881a;
        AliasStatus.OCCUPIED occupied = aliasStatus instanceof AliasStatus.OCCUPIED ? (AliasStatus.OCCUPIED) aliasStatus : null;
        return new e(str2, str, str3, bVar, str4, str5, occupied != null ? occupied.f61889b : null);
    }
}

package or2;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import qr2.l;
import tof.i3;
import tof.k3;
import tof.l2;
import tof.l3;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static kr2.e a(l dto) {
        k3 k3VarA;
        l2 l2VarC;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        String ownerId = dto.getOwnerId();
        String name = dto.getName();
        String logo = dto.getLogo();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(dto.getActiveSince());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        String category = dto.getCategory();
        if (category == null || (l2VarC = l3.c(category)) == null) {
            i3.Companion.getClass();
            k3VarA = i3.a.a();
        } else {
            k3VarA = new k3(l2VarC);
        }
        return new kr2.e(id10, ownerId, name, logo, instantOfEpochMilli, k3VarA, dto.getBrandId(), dto.getMerchantId());
    }

    public static kr2.e b(rr2.a entity) {
        k3 k3VarA;
        l2 l2VarC;
        Intrinsics.checkNotNullParameter(entity, "entity");
        String id10 = entity.getId();
        String ownerId = entity.getOwnerId();
        String name = entity.getName();
        String logo = entity.getLogo();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(entity.getActiveSince());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        String category = entity.getCategory();
        if (category == null || (l2VarC = l3.c(category)) == null) {
            i3.Companion.getClass();
            k3VarA = i3.a.a();
        } else {
            k3VarA = new k3(l2VarC);
        }
        return new kr2.e(id10, ownerId, name, logo, instantOfEpochMilli, k3VarA, entity.getBrandId(), entity.getMerchantId());
    }

    public static rr2.a c(kr2.e domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        return new rr2.a(domain.e.toEpochMilli(), domain.f188643a, domain.f188644b, domain.f188645c, domain.d, domain.f.getId(), domain.f188646g, domain.f188647h);
    }
}

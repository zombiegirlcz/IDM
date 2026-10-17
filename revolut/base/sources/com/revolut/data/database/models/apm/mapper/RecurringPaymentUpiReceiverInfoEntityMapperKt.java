package com.revolut.data.database.models.apm.mapper;

import com.revolut.data.database.models.apm.UpiReceiverEmbeddedEntity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rua.a;
import rua.b;
import rua.c;
import rua.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrua/d;", "Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;", "toEmbeddedEntity", "(Lrua/d;)Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;", "toDomain", "(Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;)Lrua/d;", "Lrua/c;", "getName", "(Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;)Lrua/c;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentUpiReceiverInfoEntityMapperKt {
    @NotNull
    public static final c getName(@NotNull UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(upiReceiverEmbeddedEntity, "<this>");
        String fullName = upiReceiverEmbeddedEntity.getFullName();
        if (fullName != null && fullName.length() != 0) {
            return new b(upiReceiverEmbeddedEntity.getFullName());
        }
        String firstName = upiReceiverEmbeddedEntity.getFirstName();
        if (firstName == null || firstName.length() == 0) {
            throw new IllegalArgumentException("first name for UPI receiver can't be empty");
        }
        return new a(upiReceiverEmbeddedEntity.getFirstName(), upiReceiverEmbeddedEntity.getLastName());
    }

    @NotNull
    public static final d toDomain(@NotNull UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(upiReceiverEmbeddedEntity, "<this>");
        return new d(getName(upiReceiverEmbeddedEntity), upiReceiverEmbeddedEntity.getAccount());
    }

    @NotNull
    public static final UpiReceiverEmbeddedEntity toEmbeddedEntity(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        c cVar = dVar.f257508a;
        if (cVar instanceof a) {
            a aVar = cVar instanceof a ? (a) cVar : null;
            String str = aVar != null ? aVar.f257505a : null;
            a aVar2 = cVar instanceof a ? (a) cVar : null;
            return new UpiReceiverEmbeddedEntity(str, aVar2 != null ? aVar2.f257506b : null, null, dVar.f257509b, 4, null);
        }
        if (!(cVar instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        b bVar = cVar instanceof b ? (b) cVar : null;
        return new UpiReceiverEmbeddedEntity(null, null, bVar != null ? bVar.f257507a : null, dVar.f257509b, 3, null);
    }
}

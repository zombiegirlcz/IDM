package com.revolut.data.database.models.transfer.mapper;

import com.revolut.data.database.models.transfer.TransferOverseaGoodsDetailsEmbeddedEntity;
import com.revolut.data.database.models.transfer.TransferReasonEmbeddedEntity;
import com.revolut.data.database.models.transfer.TransferReasonTypeEmbeddedEntity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import krf.d;
import krf.e;
import mrf.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\b\u001a\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0007H\u0000¢\u0006\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;", "Lkrf/c;", "toDomain", "(Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;)Lkrf/c;", "toEmbeddedEntity", "(Lkrf/c;)Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;", "Lcom/revolut/data/database/models/transfer/TransferOverseaGoodsDetailsEmbeddedEntity;", "Lmrf/a;", "(Lcom/revolut/data/database/models/transfer/TransferOverseaGoodsDetailsEmbeddedEntity;)Lmrf/a;", "(Lmrf/a;)Lcom/revolut/data/database/models/transfer/TransferOverseaGoodsDetailsEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonEmbeddedEntityMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferReasonTypeEmbeddedEntity.values().length];
            try {
                iArr[TransferReasonTypeEmbeddedEntity.PREDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferReasonTypeEmbeddedEntity.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final c toDomain(@NotNull TransferReasonEmbeddedEntity transferReasonEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(transferReasonEmbeddedEntity, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferReasonEmbeddedEntity.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new d(transferReasonEmbeddedEntity.getDescription());
            }
            throw new NoWhenBranchMatchedException();
        }
        String code = transferReasonEmbeddedEntity.getCode();
        if (code == null) {
            throw new IllegalArgumentException("Code must exists for predefined reasons");
        }
        String description = transferReasonEmbeddedEntity.getDescription();
        TransferOverseaGoodsDetailsEmbeddedEntity exportDetails = transferReasonEmbeddedEntity.getExportDetails();
        return new e(code, description, exportDetails != null ? toDomain(exportDetails) : null);
    }

    @NotNull
    public static final TransferReasonEmbeddedEntity toEmbeddedEntity(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (!(cVar instanceof e)) {
            if (cVar instanceof d) {
                return new TransferReasonEmbeddedEntity(TransferReasonTypeEmbeddedEntity.CUSTOM, null, ((d) cVar).f188860a, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        TransferReasonTypeEmbeddedEntity transferReasonTypeEmbeddedEntity = TransferReasonTypeEmbeddedEntity.PREDEFINED;
        e eVar = (e) cVar;
        String str = eVar.f188861a;
        String str2 = eVar.f188862b;
        a aVar = eVar.f188863c;
        return new TransferReasonEmbeddedEntity(transferReasonTypeEmbeddedEntity, str, str2, aVar != null ? toEmbeddedEntity(aVar) : null);
    }

    @NotNull
    public static final a toDomain(@NotNull TransferOverseaGoodsDetailsEmbeddedEntity transferOverseaGoodsDetailsEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(transferOverseaGoodsDetailsEmbeddedEntity, "<this>");
        return new a(transferOverseaGoodsDetailsEmbeddedEntity.getProductName(), transferOverseaGoodsDetailsEmbeddedEntity.getOriginCountry(), transferOverseaGoodsDetailsEmbeddedEntity.getShippingFrom(), transferOverseaGoodsDetailsEmbeddedEntity.getDestinationCountry());
    }

    @NotNull
    public static final TransferOverseaGoodsDetailsEmbeddedEntity toEmbeddedEntity(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new TransferOverseaGoodsDetailsEmbeddedEntity(aVar.f208116a, aVar.f208117b, aVar.f208118c, aVar.d);
    }
}

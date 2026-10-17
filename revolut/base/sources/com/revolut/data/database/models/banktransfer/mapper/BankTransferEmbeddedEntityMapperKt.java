package com.revolut.data.database.models.banktransfer.mapper;

import com.revolut.data.database.models.banktransfer.BankTransferTypeEmbeddedEntity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kq2.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;", "Lkq2/m;", "toDomain", "(Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;)Lkq2/m;", "toEmbeddedEntity", "(Lkq2/m;)Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BankTransferEmbeddedEntityMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BankTransferTypeEmbeddedEntity.values().length];
            try {
                iArr[BankTransferTypeEmbeddedEntity.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[m.values().length];
            try {
                iArr2[m.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final m toDomain(@NotNull BankTransferTypeEmbeddedEntity bankTransferTypeEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(bankTransferTypeEmbeddedEntity, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[bankTransferTypeEmbeddedEntity.ordinal()] == 1) {
            return m.STANDARD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BankTransferTypeEmbeddedEntity toEmbeddedEntity(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (WhenMappings.$EnumSwitchMapping$1[mVar.ordinal()] == 1) {
            return BankTransferTypeEmbeddedEntity.STANDARD;
        }
        return null;
    }
}

package com.revolut.data.database.models.wallet.account;

import ibd.a;
import ibd.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\b\u001a\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0007H\u0000¢\u0006\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;", "Libd/a;", "toDomain", "(Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;)Libd/a;", "toEmbeddedEntity", "(Libd/a;)Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;", "Lcom/revolut/data/database/models/wallet/account/AccountTypeEntity;", "Libd/b;", "(Lcom/revolut/data/database/models/wallet/account/AccountTypeEntity;)Libd/b;", "(Libd/b;)Lcom/revolut/data/database/models/wallet/account/AccountTypeEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class WalletAccountDetailsEntityMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AccountTypeEntity.values().length];
            try {
                iArr[AccountTypeEntity.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountTypeEntity.PERSONAL_VAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountTypeEntity.GROUP_VAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountTypeEntity.BILL_POCKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountTypeEntity.SAVINGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountTypeEntity.JOINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountTypeEntity.JOINT_VAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountTypeEntity.JOINT_SAVINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountTypeEntity.PRO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountTypeEntity.PRO_VAULT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccountTypeEntity.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccountTypeEntity.JUNIOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccountTypeEntity.JUNIOR_VAULT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AccountTypeEntity.JUNIOR_SAVINGS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[b.PERSONAL_VAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[b.GROUP_VAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[b.BILL_POCKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[b.SAVINGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[b.JOINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[b.JOINT_VAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[b.JOINT_SAVINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[b.PRO.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[b.PRO_VAULT.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[b.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[b.JUNIOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[b.JUNIOR_VAULT.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[b.JUNIOR_SAVINGS.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final a toDomain(@NotNull WalletAccountDetailsEntity walletAccountDetailsEntity) {
        Intrinsics.checkNotNullParameter(walletAccountDetailsEntity, "<this>");
        String id10 = walletAccountDetailsEntity.getId();
        xi0.a aVar = xi0.b.Companion;
        String currency = walletAccountDetailsEntity.getCurrency();
        aVar.getClass();
        return new a(id10, xi0.a.a(currency), toDomain(walletAccountDetailsEntity.getType()));
    }

    @NotNull
    public static final WalletAccountDetailsEntity toEmbeddedEntity(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new WalletAccountDetailsEntity(aVar.f160145a, aVar.f160146b.f306286a, toEmbeddedEntity(aVar.f160147c));
    }

    @NotNull
    public static final b toDomain(@NotNull AccountTypeEntity accountTypeEntity) {
        Intrinsics.checkNotNullParameter(accountTypeEntity, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[accountTypeEntity.ordinal()]) {
            case 1:
                return b.PERSONAL;
            case 2:
                return b.PERSONAL_VAULT;
            case 3:
                return b.GROUP_VAULT;
            case 4:
                return b.BILL_POCKET;
            case 5:
                return b.SAVINGS;
            case 6:
                return b.JOINT;
            case 7:
                return b.JOINT_VAULT;
            case 8:
                return b.JOINT_SAVINGS;
            case 9:
                return b.PRO;
            case 10:
                return b.PRO_VAULT;
            case 11:
                return b.UNKNOWN;
            case 12:
                return b.JUNIOR;
            case 13:
                return b.JUNIOR_VAULT;
            case 14:
                return b.JUNIOR_SAVINGS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final AccountTypeEntity toEmbeddedEntity(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case 1:
                return AccountTypeEntity.PERSONAL;
            case 2:
                return AccountTypeEntity.PERSONAL_VAULT;
            case 3:
                return AccountTypeEntity.GROUP_VAULT;
            case 4:
                return AccountTypeEntity.BILL_POCKET;
            case 5:
                return AccountTypeEntity.SAVINGS;
            case 6:
                return AccountTypeEntity.JOINT;
            case 7:
                return AccountTypeEntity.JOINT_VAULT;
            case 8:
                return AccountTypeEntity.JOINT_SAVINGS;
            case 9:
                return AccountTypeEntity.PRO;
            case 10:
                return AccountTypeEntity.PRO_VAULT;
            case 11:
                return AccountTypeEntity.UNKNOWN;
            case 12:
                return AccountTypeEntity.JUNIOR;
            case 13:
                return AccountTypeEntity.JUNIOR_VAULT;
            case 14:
                return AccountTypeEntity.JUNIOR_SAVINGS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

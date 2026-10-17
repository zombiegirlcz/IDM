package com.revolut.data.network.models.recurringpayment.mapper;

import fva.e;
import ibd.f;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq2.c;
import kq2.m;
import o9l.q;
import o9l.r;
import o9l.t;
import o9l.v;
import o9l.x;
import org.jetbrains.annotations.NotNull;
import qua.p;
import rd0.d;
import sua.b;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u0013\u0010\b\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\f*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\b\u001a\u00020\u0012*\u00020\u0011H\u0000¢\u0006\u0004\b\b\u0010\u0013\u001a\u0013\u0010\b\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\b\u0010\u0016\"#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lo9l/r;", "Lcom/revolut/feature/core/model/domain/wallet/WalletId;", "walletId", "Lqua/p;", "toDomainSafe-E67O_EE", "(Lo9l/r;Ljava/lang/String;)Lqua/p;", "toDomainSafe", "toDomain-E67O_EE", "toDomain", "Lo9l/v;", "Libd/f;", "(Lo9l/v;)Libd/f;", "Lo9l/t;", "Lfva/e;", "(Lo9l/t;)Lfva/e;", "toDto", "(Lfva/e;)Lo9l/t;", "Lo9l/q;", "Lsua/b;", "(Lo9l/q;)Lsua/b;", "Lo9l/x;", "Lkq2/m;", "(Lo9l/x;)Lkq2/m;", "", "", "Lkq2/c;", "chargeBearerTypeMapping", "Ljava/util/Map;", "getChargeBearerTypeMapping", "()Ljava/util/Map;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentDtoMapperKt {

    @NotNull
    private static final Map<String, c> chargeBearerTypeMapping = r0.k(new Pair("SHARED", c.SHARED), new Pair("DEBTOR", c.DEBTOR));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v.CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v.DISCONFIRMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[v.DEACTIVATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[v.CANCELLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[v.SUSPENDED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[v.RAISED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[t.values().length];
            try {
                iArr2[t.ADHOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[t.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[t.BI_WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[t.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[t.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[t.HALF_YEARLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[t.YEARLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[t.DAILY.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[t.TWICE_WEEKLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[t.TEN_DAYS.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[t.BI_MONTHLY.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[t.TRIMESTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[t.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[e.values().length];
            try {
                iArr3[e.ADHOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[e.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[e.BI_WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[e.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[e.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[e.HALF_YEARLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[e.YEARLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[e.DAILY.ordinal()] = 8;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[e.TWICE_WEEKLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[e.TEN_DAYS.ordinal()] = 10;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[e.BI_MONTHLY.ordinal()] = 11;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[e.TRIMESTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[e.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[x.values().length];
            try {
                iArr4[x.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[x.PERSONAL_ACC.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @NotNull
    public static final Map<String, c> getChargeBearerTypeMapping() {
        return chargeBearerTypeMapping;
    }

    @NotNull
    public static final f toDomain(v vVar) {
        switch (vVar == null ? -1 : WhenMappings.$EnumSwitchMapping$0[vVar.ordinal()]) {
            case 1:
                return f.ACTIVE;
            case 2:
                return f.INACTIVE;
            case 3:
                return f.BLOCKED;
            case 4:
                return f.PENDING;
            case 5:
                return f.CONFIRMED;
            case 6:
                return f.DISCONFIRMED;
            case 7:
                return f.DEACTIVATED;
            case 8:
                return f.CANCELLED;
            case 9:
                return f.SUSPENDED;
            case 10:
                return f.RAISED;
            default:
                return f.UNKNOWN;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: toDomain-E67O_EE, reason: not valid java name */
    public static final p m3756toDomainE67O_EE(@NotNull r toDomain, String str) {
        Intrinsics.checkNotNullParameter(toDomain, "$this$toDomain");
        return RecurringPaymentDtoMapper.INSTANCE.m3755toDomainE67O_EE(toDomain, str);
    }

    /* JADX INFO: renamed from: toDomain-E67O_EE$default, reason: not valid java name */
    public static /* synthetic */ p m3757toDomainE67O_EE$default(r rVar, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m3756toDomainE67O_EE(rVar, str);
    }

    /* JADX INFO: renamed from: toDomainSafe-E67O_EE, reason: not valid java name */
    public static final p m3758toDomainSafeE67O_EE(@NotNull r toDomainSafe, String str) {
        Intrinsics.checkNotNullParameter(toDomainSafe, "$this$toDomainSafe");
        try {
            return m3756toDomainE67O_EE(toDomainSafe, str);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    /* JADX INFO: renamed from: toDomainSafe-E67O_EE$default, reason: not valid java name */
    public static /* synthetic */ p m3759toDomainSafeE67O_EE$default(r rVar, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m3758toDomainSafeE67O_EE(rVar, str);
    }

    @NotNull
    public static final t toDto(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[eVar.ordinal()]) {
            case 1:
                return t.ADHOC;
            case 2:
                return t.WEEKLY;
            case 3:
                return t.BI_WEEKLY;
            case 4:
                return t.MONTHLY;
            case 5:
                return t.QUARTERLY;
            case 6:
                return t.HALF_YEARLY;
            case 7:
                return t.YEARLY;
            case 8:
                return t.DAILY;
            case 9:
                return t.TWICE_WEEKLY;
            case 10:
                return t.TEN_DAYS;
            case 11:
                return t.BI_MONTHLY;
            case 12:
                return t.TRIMESTER;
            case 13:
                throw new IllegalStateException("UNKNOWN frequency can not be converted to DTO");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final e toDomain(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[tVar.ordinal()]) {
            case 1:
                return e.ADHOC;
            case 2:
                return e.WEEKLY;
            case 3:
                return e.BI_WEEKLY;
            case 4:
                return e.MONTHLY;
            case 5:
                return e.QUARTERLY;
            case 6:
                return e.HALF_YEARLY;
            case 7:
                return e.YEARLY;
            case 8:
                return e.DAILY;
            case 9:
                return e.TWICE_WEEKLY;
            case 10:
                return e.TEN_DAYS;
            case 11:
                return e.BI_MONTHLY;
            case 12:
                return e.TRIMESTER;
            case 13:
                return e.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final b toDomain(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return new b(qVar.getId());
    }

    @NotNull
    public static final m toDomain(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[xVar.ordinal()];
        if (i == 1) {
            return m.STANDARD;
        }
        if (i == 2) {
            return m.STANDARD;
        }
        throw new NoWhenBranchMatchedException();
    }
}

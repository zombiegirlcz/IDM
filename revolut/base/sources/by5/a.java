package by5;

import com.google.android.gms.tasks.Task;
import com.google.protobuf.m;
import com.revolut.data.model.Data;
import f2b.b;
import fag.h0;
import g0c.h;
import g1k.k;
import gul.z;
import igm.p;
import iii.c;
import j9k.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kfm.o;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import lmm.d;
import p2b.f;
import p2b.j;
import txf.n;
import u2f.l;
import vd0.i;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements m, o, igm.o, p, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19741a;

    public /* synthetic */ a(int i) {
        this.f19741a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public md6.t a(com.revolut.feature_move_money.api.model.AccountWrapper r5) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.a.a(com.revolut.feature_move_money.api.model.AccountWrapper):md6.t");
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f19741a) {
            case 19:
                return isj.a.f168302a.invoke(obj2);
            default:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length != 9) {
                    throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
                }
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                Object obj5 = objArr[2];
                Object obj6 = objArr[3];
                Object obj7 = objArr[4];
                Object obj8 = objArr[5];
                Object obj9 = objArr[6];
                Object obj10 = objArr[7];
                Object obj11 = objArr[8];
                throw null;
        }
    }

    public List b(ArrayList redeemTypes, Data userVouchersData) {
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        Intrinsics.checkNotNullParameter(userVouchersData, "userVouchersData");
        return (redeemTypes.size() == 1 && redeemTypes.contains(l.GIFT_CARDS)) ? (List) c.f(userVouchersData, new k(this, 16), new h(22), new fq7.k(this, 5)) : f0.f322471a;
    }

    @Override // com.google.protobuf.m
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // lmm.d
    public void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        emm.h.Companion.getClass();
        emm.h.f127697a.j(4, message, null);
    }

    @Override // igm.p
    public boolean test(Object obj2) {
        return true;
    }

    public a(Task internal) {
        this.f19741a = 28;
        Intrinsics.checkNotNullParameter(internal, "internal");
    }

    public a(i storageInitialiser) {
        this.f19741a = 4;
        Intrinsics.checkNotNullParameter(storageInitialiser, "storageInitialiser");
    }

    public a(l6i.c savingsMoveAccountToLegalEntityMapper) {
        this.f19741a = 25;
        Intrinsics.checkNotNullParameter(savingsMoveAccountToLegalEntityMapper, "savingsMoveAccountToLegalEntityMapper");
    }

    public a(g2f.l userVouchersMapper) {
        this.f19741a = 13;
        Intrinsics.checkNotNullParameter(userVouchersMapper, "userVouchersMapper");
    }

    public a(z securityBalanceBuilder) {
        this.f19741a = 15;
        Intrinsics.checkNotNullParameter(securityBalanceBuilder, "securityBalanceBuilder");
    }

    public a(nvd.a stakingRewardsDomainMapper, ovd.a stakingRewardsDtoMapper, pvd.a stakingRewardsEntityMapper) {
        this.f19741a = 29;
        Intrinsics.checkNotNullParameter(stakingRewardsDomainMapper, "stakingRewardsDomainMapper");
        Intrinsics.checkNotNullParameter(stakingRewardsDtoMapper, "stakingRewardsDtoMapper");
        Intrinsics.checkNotNullParameter(stakingRewardsEntityMapper, "stakingRewardsEntityMapper");
    }

    public a(n travelFavoriteRepository) {
        this.f19741a = 3;
        Intrinsics.checkNotNullParameter(travelFavoriteRepository, "travelFavoriteRepository");
    }

    public a(ybl.d portfolioInteractor, j cfdPerformanceInteractor, kge.d cfdPositionsInteractor, f cfdPositionsSorterInteractor, b cfdPerformanceTracker) {
        this.f19741a = 1;
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(cfdPerformanceInteractor, "cfdPerformanceInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionsSorterInteractor, "cfdPositionsSorterInteractor");
        Intrinsics.checkNotNullParameter(cfdPerformanceTracker, "cfdPerformanceTracker");
    }

    public a(k9k.b transferDataBuilder, c0 quoteInteractor, r9k.k errorStateProvider, b9k.f checksExtensionFactory, p96.a reviewRequirementResolverFactory) {
        this.f19741a = 21;
        Intrinsics.checkNotNullParameter(transferDataBuilder, "transferDataBuilder");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(errorStateProvider, "errorStateProvider");
        Intrinsics.checkNotNullParameter(checksExtensionFactory, "checksExtensionFactory");
        Intrinsics.checkNotNullParameter(reviewRequirementResolverFactory, "reviewRequirementResolverFactory");
    }

    public a(lnh.d popularAssetsNavigationProvider) {
        this.f19741a = 20;
        Intrinsics.checkNotNullParameter(popularAssetsNavigationProvider, "popularAssetsNavigationProvider");
    }

    public a(h0 repository, e dateProvider) {
        this.f19741a = 18;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public a(l4i.a amountConverter, int i) {
        this.f19741a = i;
        switch (i) {
            case 27:
                Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
                break;
            default:
                Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
                break;
        }
    }
}

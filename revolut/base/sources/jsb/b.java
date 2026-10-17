package jsb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import thf.c;
import tof.k3;
import tof.l2;
import wjf.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f178168a;

    public b(c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f178168a = transactionCategoryResourcesMapper;
    }

    public final zvl.b a(zvl.a category) {
        l2 l2Var;
        Intrinsics.checkNotNullParameter(category, "category");
        switch (a.f178167a[category.ordinal()]) {
            case 1:
                l2Var = l2.FEE;
                break;
            case 2:
                l2Var = l2.CASHBACK;
                break;
            case 3:
                l2Var = l2.CASH;
                break;
            case 4:
                l2Var = l2.TRANSFERS;
                break;
            case 5:
                l2Var = l2.CARD;
                break;
            case 6:
                l2Var = l2.HEALTH;
                break;
            case 7:
                l2Var = l2.GENERAL;
                break;
            case 8:
                l2Var = l2.SERVICES;
                break;
            case 9:
                l2Var = l2.TRAVEL;
                break;
            case 10:
                l2Var = l2.TRANSPORT;
                break;
            case 11:
                l2Var = l2.ACCOMMODATION;
                break;
            case 12:
                l2Var = l2.UTILITIES;
                break;
            case 13:
                l2Var = l2.SHOPPING;
                break;
            case 14:
                l2Var = l2.FINANCIAL;
                break;
            case 15:
                l2Var = l2.FURNITURE;
                break;
            case 16:
                l2Var = l2.HARDWARE;
                break;
            case 17:
                l2Var = l2.GROCERIES;
                break;
            case 18:
                l2Var = l2.FUEL;
                break;
            case 19:
                l2Var = l2.ENTERTAINMENT;
                break;
            case 20:
                l2Var = l2.SOFTWARE;
                break;
            case 21:
                l2Var = l2.RESTAURANTS;
                break;
            case 22:
                l2Var = l2.ADVERTISING;
                break;
            case 23:
                l2Var = l2.EDUCATION;
                break;
            case 24:
                l2Var = l2.GOVERNMENT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new zvl.b(((e) this.f178168a).i(new k3(l2Var), null, null));
    }
}

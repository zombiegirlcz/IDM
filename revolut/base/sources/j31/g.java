package j31;

import com.google.gson.reflect.TypeToken;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.database.models.wallet.account.AccountDetailsEntity;
import com.revolut.data.network.models.wallet.account.AccountDetailsDto;
import com.revolut.data.network.models.wallet.account.PixDto;
import com.revolut.data.network.models.wallet.account.TedDto;
import com.revolut.data.network.services.wallet.AccountsService;
import com.revolut.feature.address.models.Address;
import efm.d0;
import io3.l;
import is6.t;
import ivb.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import pfm.r;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements z71.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f170929g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountsService f170930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f170931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f170932c;
    public final dfm.c d;
    public final qsg.b e;
    public final w4l.f f;

    static {
        Type type = new TypeToken<List<? extends AccountDetailsEntity>>() { // from class: com.revolut.data.repositories.wallet.account.RevolutBankAccountsRepositoryImpl$Companion$ACCOUNT_DETAILS_LIST_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f170929g = type;
    }

    public g(AccountsService accountsService, ue0.c storage, ne0.d memoryCache, go3.b walletMapper, dfm.c accountDetailsMapper, qsg.b walletsRepository) {
        Intrinsics.checkNotNullParameter(accountsService, "accountsService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        Intrinsics.checkNotNullParameter(accountDetailsMapper, "accountDetailsMapper");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        this.f170930a = accountsService;
        this.f170931b = storage;
        this.f170932c = memoryCache;
        this.d = accountDetailsMapper;
        this.e = walletsRepository;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: j31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f170921b;

            {
                this.f170921b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ue0.c cVar = this.f170921b.f170931b;
                        String strE = g.e(params.a(), params.b());
                        List<n71.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (n71.b domain : list2) {
                            Intrinsics.checkNotNullParameter(domain, "domain");
                            String id10 = domain.getId();
                            String strD = domain.D();
                            String strA = domain.a();
                            String strI = domain.i();
                            String strN = domain.n();
                            String currency = domain.getCurrency();
                            String strT = domain.t();
                            Address addressF = domain.f();
                            no3.b bVarC = addressF != null ? oo3.a.c(addressF) : null;
                            String strM = domain.m();
                            Boolean boolY = domain.y();
                            Boolean boolX = domain.x();
                            Boolean boolE = domain.e();
                            Boolean boolW = domain.w();
                            String strC = domain.C();
                            String strF = domain.F();
                            String strD2 = domain.d();
                            String strR = domain.r();
                            String strH = domain.h();
                            String strG = domain.G();
                            String strU = domain.u();
                            l pocketType = domain.B();
                            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                            String strG2 = u1.g(pocketType, hb9.b.g());
                            String strS = domain.s();
                            n71.a aVarA = domain.A();
                            PixDto pixDtoF = aVarA != null ? pyd.c.f(aVarA) : null;
                            n71.c cVarE = domain.E();
                            arrayList.add(new AccountDetailsEntity(id10, strD, strA, strI, strN, currency, strT, bVarC, strM, boolY, boolX, boolE, boolW, strC, strF, strD2, strR, strH, strG, strU, strG2, strS, cVarE != null ? pyd.c.g(cVarE) : null, pixDtoF, domain.l(), domain.p(), domain.o(), domain.b(), domain.c(), domain.q(), domain.k(), domain.v()));
                        }
                        cVar.G(arrayList, strE, kii.e.o(AccountDetailsEntity.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        l pocketType2 = params2.b();
                        AccountId accountIdA = params2.a();
                        g gVar = this.f170921b;
                        AccountsService accountsService2 = gVar.f170930a;
                        String strG3 = null;
                        AccountId.Joint joint = accountIdA instanceof AccountId.Joint ? (AccountId.Joint) accountIdA : null;
                        String str = joint != null ? joint.f51413b : null;
                        if (pocketType2 == l.MERCHANT) {
                            Intrinsics.checkNotNullParameter(pocketType2, "pocketType");
                            strG3 = u1.g(pocketType2, hb9.b.g());
                        }
                        d0<List<AccountDetailsDto>> accounts = accountsService2.getAccounts(str, strG3);
                        i iVar = new i(new t(gVar, pocketType2, 26), 23);
                        accounts.getClass();
                        ufm.i iVar2 = new ufm.i(accounts, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        d params3 = (d) obj2;
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        this.f170921b.f170932c.f(g.e(params3.a(), params3.b()), list3);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: j31.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f170925b;

            {
                this.f170925b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l lVar;
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f170925b.f170932c.get(g.e(params.a(), params.b()));
                    default:
                        d params2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List list = (List) this.f170925b.f170931b.T2(g.e(params2.a(), params2.b()), g.f170929g);
                        if (list == null) {
                            return null;
                        }
                        List<AccountDetailsEntity> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (AccountDetailsEntity entity : list2) {
                            Intrinsics.checkNotNullParameter(entity, "entity");
                            String id10 = entity.getId();
                            String sortCode = entity.getSortCode();
                            String accountNumber = entity.getAccountNumber();
                            String bankName = entity.getBankName();
                            String bic2 = entity.getBic();
                            String currency = entity.getCurrency();
                            String iban = entity.getIban();
                            no3.b address = entity.getAddress();
                            Address addressA = address != null ? oo3.a.a(address) : null;
                            String beneficiaryName = entity.getBeneficiaryName();
                            Boolean personal = entity.getPersonal();
                            Boolean local = entity.getLocal();
                            Boolean activate = entity.getActivate();
                            Boolean kycRequired = entity.getKycRequired();
                            String requiredReference = entity.getRequiredReference();
                            String transferTime = entity.getTransferTime();
                            String achRoutingNumber = entity.getAchRoutingNumber();
                            String bsb2 = entity.getBsb();
                            String bankCode = entity.getBankCode();
                            String transitNumber = entity.getTransitNumber();
                            String institutionNumber = entity.getInstitutionNumber();
                            String pocketType = entity.getPocketType();
                            if (pocketType != null) {
                                Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                                lVar = (l) u1.u(pocketType, hb9.b.g());
                            } else {
                                lVar = l.CURRENT;
                            }
                            l lVar2 = lVar;
                            String fedwireRoutingNumber = entity.getFedwireRoutingNumber();
                            PixDto pix = entity.getPix();
                            n71.a aVarD = pix != null ? pyd.c.d(pix) : null;
                            TedDto ted2 = entity.getTed();
                            arrayList.add(new n71.b(id10, currency, sortCode, accountNumber, bankName, bic2, iban, addressA, beneficiaryName, personal, local, activate, kycRequired, requiredReference, transferTime, achRoutingNumber, bsb2, bankCode, transitNumber, institutionNumber, lVar2, fedwireRoutingNumber, aVarD, ted2 != null ? pyd.c.e(ted2) : null, entity.getBankNameCode(), entity.getBranchName(), entity.getBranchCode(), entity.getAccountType(), entity.getAccountTypeCode(), entity.getBranchNameLatin(), entity.getBankNameAndAddress(), entity.getIntermediaryBic()));
                        }
                        return c6d.b.N(arrayList);
                }
            }
        };
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: j31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f170921b;

            {
                this.f170921b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        d params = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ue0.c cVar = this.f170921b.f170931b;
                        String strE = g.e(params.a(), params.b());
                        List<n71.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (n71.b domain : list2) {
                            Intrinsics.checkNotNullParameter(domain, "domain");
                            String id10 = domain.getId();
                            String strD = domain.D();
                            String strA = domain.a();
                            String strI = domain.i();
                            String strN = domain.n();
                            String currency = domain.getCurrency();
                            String strT = domain.t();
                            Address addressF = domain.f();
                            no3.b bVarC = addressF != null ? oo3.a.c(addressF) : null;
                            String strM = domain.m();
                            Boolean boolY = domain.y();
                            Boolean boolX = domain.x();
                            Boolean boolE = domain.e();
                            Boolean boolW = domain.w();
                            String strC = domain.C();
                            String strF = domain.F();
                            String strD2 = domain.d();
                            String strR = domain.r();
                            String strH = domain.h();
                            String strG = domain.G();
                            String strU = domain.u();
                            l pocketType = domain.B();
                            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                            String strG2 = u1.g(pocketType, hb9.b.g());
                            String strS = domain.s();
                            n71.a aVarA = domain.A();
                            PixDto pixDtoF = aVarA != null ? pyd.c.f(aVarA) : null;
                            n71.c cVarE = domain.E();
                            arrayList.add(new AccountDetailsEntity(id10, strD, strA, strI, strN, currency, strT, bVarC, strM, boolY, boolX, boolE, boolW, strC, strF, strD2, strR, strH, strG, strU, strG2, strS, cVarE != null ? pyd.c.g(cVarE) : null, pixDtoF, domain.l(), domain.p(), domain.o(), domain.b(), domain.c(), domain.q(), domain.k(), domain.v()));
                        }
                        cVar.G(arrayList, strE, kii.e.o(AccountDetailsEntity.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        l pocketType2 = params2.b();
                        AccountId accountIdA = params2.a();
                        g gVar = this.f170921b;
                        AccountsService accountsService2 = gVar.f170930a;
                        String strG3 = null;
                        AccountId.Joint joint = accountIdA instanceof AccountId.Joint ? (AccountId.Joint) accountIdA : null;
                        String str = joint != null ? joint.f51413b : null;
                        if (pocketType2 == l.MERCHANT) {
                            Intrinsics.checkNotNullParameter(pocketType2, "pocketType");
                            strG3 = u1.g(pocketType2, hb9.b.g());
                        }
                        d0<List<AccountDetailsDto>> accounts = accountsService2.getAccounts(str, strG3);
                        i iVar = new i(new t(gVar, pocketType2, 26), 23);
                        accounts.getClass();
                        ufm.i iVar2 = new ufm.i(accounts, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        d params3 = (d) obj2;
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        this.f170921b.f170932c.f(g.e(params3.a(), params3.b()), list3);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: j31.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f170925b;

            {
                this.f170925b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l lVar;
                switch (i5) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f170925b.f170932c.get(g.e(params.a(), params.b()));
                    default:
                        d params2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List list = (List) this.f170925b.f170931b.T2(g.e(params2.a(), params2.b()), g.f170929g);
                        if (list == null) {
                            return null;
                        }
                        List<AccountDetailsEntity> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (AccountDetailsEntity entity : list2) {
                            Intrinsics.checkNotNullParameter(entity, "entity");
                            String id10 = entity.getId();
                            String sortCode = entity.getSortCode();
                            String accountNumber = entity.getAccountNumber();
                            String bankName = entity.getBankName();
                            String bic2 = entity.getBic();
                            String currency = entity.getCurrency();
                            String iban = entity.getIban();
                            no3.b address = entity.getAddress();
                            Address addressA = address != null ? oo3.a.a(address) : null;
                            String beneficiaryName = entity.getBeneficiaryName();
                            Boolean personal = entity.getPersonal();
                            Boolean local = entity.getLocal();
                            Boolean activate = entity.getActivate();
                            Boolean kycRequired = entity.getKycRequired();
                            String requiredReference = entity.getRequiredReference();
                            String transferTime = entity.getTransferTime();
                            String achRoutingNumber = entity.getAchRoutingNumber();
                            String bsb2 = entity.getBsb();
                            String bankCode = entity.getBankCode();
                            String transitNumber = entity.getTransitNumber();
                            String institutionNumber = entity.getInstitutionNumber();
                            String pocketType = entity.getPocketType();
                            if (pocketType != null) {
                                Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                                lVar = (l) u1.u(pocketType, hb9.b.g());
                            } else {
                                lVar = l.CURRENT;
                            }
                            l lVar2 = lVar;
                            String fedwireRoutingNumber = entity.getFedwireRoutingNumber();
                            PixDto pix = entity.getPix();
                            n71.a aVarD = pix != null ? pyd.c.d(pix) : null;
                            TedDto ted2 = entity.getTed();
                            arrayList.add(new n71.b(id10, currency, sortCode, accountNumber, bankName, bic2, iban, addressA, beneficiaryName, personal, local, activate, kycRequired, requiredReference, transferTime, achRoutingNumber, bsb2, bankCode, transitNumber, institutionNumber, lVar2, fedwireRoutingNumber, aVarD, ted2 != null ? pyd.c.e(ted2) : null, entity.getBankNameCode(), entity.getBranchName(), entity.getBranchCode(), entity.getAccountType(), entity.getAccountTypeCode(), entity.getBranchNameLatin(), entity.getBankNameAndAddress(), entity.getIntermediaryBic()));
                        }
                        return c6d.b.N(arrayList);
                }
            }
        };
        final int i6 = 0;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: j31.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f170921b;

            {
                this.f170921b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        d params = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ue0.c cVar = this.f170921b.f170931b;
                        String strE = g.e(params.a(), params.b());
                        List<n71.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (n71.b domain : list2) {
                            Intrinsics.checkNotNullParameter(domain, "domain");
                            String id10 = domain.getId();
                            String strD = domain.D();
                            String strA = domain.a();
                            String strI = domain.i();
                            String strN = domain.n();
                            String currency = domain.getCurrency();
                            String strT = domain.t();
                            Address addressF = domain.f();
                            no3.b bVarC = addressF != null ? oo3.a.c(addressF) : null;
                            String strM = domain.m();
                            Boolean boolY = domain.y();
                            Boolean boolX = domain.x();
                            Boolean boolE = domain.e();
                            Boolean boolW = domain.w();
                            String strC = domain.C();
                            String strF = domain.F();
                            String strD2 = domain.d();
                            String strR = domain.r();
                            String strH = domain.h();
                            String strG = domain.G();
                            String strU = domain.u();
                            l pocketType = domain.B();
                            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                            String strG2 = u1.g(pocketType, hb9.b.g());
                            String strS = domain.s();
                            n71.a aVarA = domain.A();
                            PixDto pixDtoF = aVarA != null ? pyd.c.f(aVarA) : null;
                            n71.c cVarE = domain.E();
                            arrayList.add(new AccountDetailsEntity(id10, strD, strA, strI, strN, currency, strT, bVarC, strM, boolY, boolX, boolE, boolW, strC, strF, strD2, strR, strH, strG, strU, strG2, strS, cVarE != null ? pyd.c.g(cVarE) : null, pixDtoF, domain.l(), domain.p(), domain.o(), domain.b(), domain.c(), domain.q(), domain.k(), domain.v()));
                        }
                        cVar.G(arrayList, strE, kii.e.o(AccountDetailsEntity.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params2 = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        l pocketType2 = params2.b();
                        AccountId accountIdA = params2.a();
                        g gVar = this.f170921b;
                        AccountsService accountsService2 = gVar.f170930a;
                        String strG3 = null;
                        AccountId.Joint joint = accountIdA instanceof AccountId.Joint ? (AccountId.Joint) accountIdA : null;
                        String str = joint != null ? joint.f51413b : null;
                        if (pocketType2 == l.MERCHANT) {
                            Intrinsics.checkNotNullParameter(pocketType2, "pocketType");
                            strG3 = u1.g(pocketType2, hb9.b.g());
                        }
                        d0<List<AccountDetailsDto>> accounts = accountsService2.getAccounts(str, strG3);
                        i iVar = new i(new t(gVar, pocketType2, 26), 23);
                        accounts.getClass();
                        ufm.i iVar2 = new ufm.i(accounts, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        d params3 = (d) obj2;
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        this.f170921b.f170932c.f(g.e(params3.a(), params3.b()), list3);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String e(AccountId accountId, l lVar) {
        if (f.f170928a[lVar.ordinal()] == 1) {
            return "MERCHANT_ACCOUNTS_DEFAULT_KEY";
        }
        if (accountId instanceof AccountId.Personal) {
            return "ACCOUNTS_DEFAULT_KEY";
        }
        if (accountId instanceof AccountId.Joint) {
            return j6.a.q("JOINT_ACCOUNTS_DEFAULT_KEY_", ((AccountId.Joint) accountId).f51412a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final r d(AccountId accountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.b bVarActivatePocket = this.f170930a.activatePocket(pocket.getId());
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        pfm.a aVarE = bVarActivatePocket.e(this.f.g(new d(accountId, l.CURRENT), true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }
}

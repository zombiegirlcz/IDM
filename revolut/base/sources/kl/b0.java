package kl;

import aw0.j8;
import aw0.o9;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopAccount;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopPaymentAccountSection;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.interactor.WaitlistDomainException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.IOException;
import java.io.InputStream;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 implements igm.o, l8.j, kfm.o, y2j.d, zp0.c, nd.i, kfm.p, igm.g, pc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f185144b;

    public /* synthetic */ b0(Object obj2, int i) {
        this.f185143a = i;
        this.f185144b = obj2;
    }

    public static RevolutShopPaymentAccountSection j(ArrayList arrayList, d3c.l0 l0Var, io3.l lVar) {
        ArrayList<io3.d> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((io3.d) obj2).e == lVar) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (io3.d dVar : arrayList2) {
            String str = dVar.f163145a;
            String str2 = dVar.d;
            long j2 = dVar.i;
            xi0.a aVar = xi0.b.Companion;
            String str3 = dVar.f163147c;
            aVar.getClass();
            arrayList3.add(new RevolutShopAccount(str, str2, new dj0.d(j2, xi0.a.a(str3)), null, dVar.e == io3.l.MERCHANT));
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            return new RevolutShopPaymentAccountSection(l0Var, arrayList3);
        }
        return null;
    }

    @Override // l8.j
    public int a(int i, byte[] bArr) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f185144b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i2;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        Disposable it8 = (Disposable) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        hx7.e.f(((nl.g1) this.f185144b).f216910a);
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f185143a) {
            case 0:
                z message = (z) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                Observable observableJust = Observable.just(message);
                Long l2 = message.f185255c;
                return observableJust.delay(l2 != null ? l2.longValue() : 0L, TimeUnit.MILLISECONDS, ((e0) this.f185144b).f185173m.getSingle());
            case 6:
                return ((lak.l) this.f185144b).invoke(obj2);
            case 10:
                return ((lak.l) this.f185144b).invoke(obj2);
            case 14:
                return ((m08.i) this.f185144b).invoke(obj2);
            case 15:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 9) {
                    return ((kfm.n) this.f185144b).f(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
                }
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            default:
                return ((ne0.e) this.f185144b).invoke(obj2);
        }
    }

    @Override // l8.j
    public int b() {
        return (d() << 8) | d();
    }

    @Override // y2j.d
    public j8 c(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        TextClause textClause = new TextClause(n61.j.d(beneficiary), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        AccountFieldType[] filterTypes = {AccountFieldType.ACCOUNT_NUMBER, AccountFieldType.BRAZIL_BRANCH_NUMBER};
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(filterTypes, "filterTypes");
        TextClause textClause2 = new TextClause(f61.a.u(beneficiary, (AccountFieldType[]) Arrays.copyOf(filterTypes, 2)), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        m3j.j jVar = (m3j.j) this.f185144b;
        return new j8(textClause, textClause2, jVar.a(beneficiary), jVar.b(beneficiary), 16);
    }

    @Override // l8.j
    public short d() throws IOException {
        int i = ((InputStream) this.f185144b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // nd.i
    public Object e(String str) {
        nd.q qVar = (nd.q) this.f185144b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it8 = arrayList.iterator();
        Exception exc2 = null;
        while (it8.hasNext()) {
            try {
                return qVar.a(str, (Provider) it8.next());
            } catch (Exception e) {
                if (exc2 == null) {
                    exc2 = e;
                }
            }
        }
        return qVar.a(str, null);
    }

    public l2f.a f(String loyaltyProgrammeName, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(loyaltyProgrammeName, "loyaltyProgrammeName");
        ServerError serverErrorC = error instanceof HttpException ? ((sf0.h) this.f185144b).c((HttpException) error) : error instanceof ServerErrorException ? ((ServerErrorException) error).f : null;
        Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
        if (numValueOf != null && numValueOf.intValue() == 100003) {
            return new l2f.a(new nii.y0(null, new nii.l0(new TextLocalisedClause(R$string.miles_account_registration_registration_error_name_mismatch_title, null, null, 14), new TextLocalisedClause(R$string.miles_account_registration_registration_error_name_mismatch_description, zhm.u.c(new TextClause(loyaltyProgrammeName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, new TextLocalisedClause(R$string.trade_rev_points_common_got_it, null, null, 14), null, null, false, null, 1012), false, 5), true);
        }
        if (numValueOf == null || numValueOf.intValue() != 100001) {
            return new l2f.a(new nii.y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5), false);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_account_registration_registration_error_account_not_found_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.miles_account_registration_registration_error_account_not_found_description, null, null, 14);
        List listK = zhm.v.k(new TextLocalisedClause(R$string.miles_account_registration_sign_up_prompt_title, null, null, 14), new TextLocalisedClause(R$string.miles_account_registration_sign_up_prompt_link_placeholder, null, new Click(30, (Integer) null, (Object) null, "ERROR_DIALOG_SIGN_UP_ITEM_ID", false), 10));
        kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
        m70.a.t(t0Var);
        return new l2f.a(new nii.y0(null, new nii.l0(textLocalisedClause, new CompositeClause(zhm.v.k(textLocalisedClause2, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, new TextLocalisedClause(R$string.trade_rev_points_common_got_it, null, null, 14), null, null, false, null, 1012), false, 5), true);
    }

    public WaitlistDomainException g(PricingPlanWaitlistEntry entry, HttpException httpException) throws IOException {
        String strString;
        Object objA;
        gok.a aVar;
        ResponseBody responseBodyErrorBody;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(httpException, "httpException");
        Response<?> response = httpException.response();
        if (response == null || (responseBodyErrorBody = response.errorBody()) == null) {
            strString = null;
        } else {
            mmm.h hVarClone = responseBodyErrorBody.source().getBuffer().clone();
            ulm.s1 s1Var = ResponseBody.Companion;
            ulm.b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            strString = ulm.s1.b(hVarClone, b1VarContentType, jContentLength).string();
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = (lok.a) ((kg.o) this.f185144b).c(strString, lok.a.class);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        lok.a aVar2 = (lok.a) objA;
        if (aVar2 == null) {
            return null;
        }
        int code = aVar2.getCode();
        if (code != 1000099) {
            switch (code) {
                case 1000001:
                    aVar = gok.a.EXPIRED;
                    break;
                case 1000002:
                    aVar = gok.a.INVITE_COUNT_LIMIT;
                    break;
                case 1000003:
                    aVar = gok.a.REGION_UNAVAILABLE;
                    break;
                case 1000004:
                    aVar = gok.a.ENTRY_COMPLETED;
                    break;
                default:
                    aVar = null;
                    break;
            }
        } else {
            aVar = gok.a.UNKNOWN;
        }
        if (aVar != null) {
            return new WaitlistDomainException(entry, aVar, httpException);
        }
        return null;
    }

    public efm.d0 h() {
        ael.t0 t0Var = (ael.t0) ((ybl.l) this.f185144b);
        ufm.i iVar = new ufm.i(te0.w.H0(t0Var.f(), t0Var.g()), new o5i.a(20, new o95.b(20)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public wkm.l i() {
        aw.u uVar = (aw.u) ((xv.d) this.f185144b);
        return vkm.q.H(new ie6.q(2, 28, null), new a3i.i(((bw.q) uVar.f10210a).e, uVar, 24));
    }

    @Override // zp0.c
    public void k(String extractedValue, String amount, boolean z) throws Throwable {
        Object objA;
        int i = this.f185143a;
        Object obj2 = this.f185144b;
        switch (i) {
            case 20:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                com.revolut.feature_move_money.impl.topup.a aVar = (com.revolut.feature_move_money.impl.topup.a) ((MoveMoneyTopupScreen) obj2).d();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    xi0.b bVar = c8g.a.m(aVar.M2()).f115083b;
                    aVar.H2(aVar.M, new n8i.b1(aVar, new dj0.d(aVar.f97419p.b(amount, bVar.f306286a), bVar), 1));
                    objA = Unit.f186387a;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) ((EditCustomProductScreen) obj2).d();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                w80.b bVar2 = aVar2.f60804p;
                cli.y yVar = aVar2.f60807s;
                aVar2.H2(yVar, new oe1.j(amount, bVar2.b(amount, ((oe1.g) ((j2) yVar.f22677a).getValue()).f224507a.f306286a), z ? od1.b.AMOUNT : od1.b.NONE, 0));
                return;
        }
    }

    @Override // l8.j
    public long skip(long j2) throws IOException {
        InputStream inputStream = (InputStream) this.f185144b;
        if (j2 < 0) {
            return 0L;
        }
        long j3 = j2;
        while (j3 > 0) {
            long jSkip = inputStream.skip(j3);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j3 -= jSkip;
        }
        return j2 - j3;
    }

    @Override // kfm.p
    public /* synthetic */ boolean test(Object obj2) {
        return ((Boolean) ((m2j.g) this.f185144b).invoke(obj2)).booleanValue();
    }

    @Override // pc.c
    public Object zza() {
        return ((oc.f) this.f185144b).f224008a;
    }

    public b0(lak.l function) {
        this.f185143a = 6;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185144b = function;
    }

    public b0(lak.l function, byte b4) {
        this.f185143a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185144b = function;
    }

    public b0(m08.i function) {
        this.f185143a = 14;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185144b = function;
    }

    public b0(m2j.g function) {
        this.f185143a = 23;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185144b = function;
    }

    public b0(ne0.e function) {
        this.f185143a = 26;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185144b = function;
    }

    public b0(ax.a cameraCharacteristicsProvider) {
        this.f185143a = 8;
        Intrinsics.checkNotNullParameter(cameraCharacteristicsProvider, "cameraCharacteristicsProvider");
        this.f185144b = cameraCharacteristicsProvider;
    }

    public b0(emh.d wealthTradeCommonMapper) {
        this.f185143a = 16;
        Intrinsics.checkNotNullParameter(wealthTradeCommonMapper, "wealthTradeCommonMapper");
        this.f185144b = wealthTradeCommonMapper;
    }

    public b0(mx4.z creditScreenConstructorMapper) {
        this.f185143a = 22;
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        this.f185144b = creditScreenConstructorMapper;
    }

    public b0(ybl.l configInteractor) {
        this.f185143a = 27;
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f185144b = configInteractor;
    }

    public b0(ha3.f cardsConfigInteractor) {
        this.f185143a = 2;
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        this.f185144b = cardsConfigInteractor;
    }

    public b0(om8.c juniorPartnershipsAvailabilityInteractor) {
        this.f185143a = 13;
        Intrinsics.checkNotNullParameter(juniorPartnershipsAvailabilityInteractor, "juniorPartnershipsAvailabilityInteractor");
        this.f185144b = juniorPartnershipsAvailabilityInteractor;
    }

    public b0(r86.b deviceDetailsInfoMapper) {
        this.f185143a = 18;
        Intrinsics.checkNotNullParameter(deviceDetailsInfoMapper, "deviceDetailsInfoMapper");
        this.f185144b = deviceDetailsInfoMapper;
    }

    public b0(f61.a beneficiaryAccountFieldsNameMapper, m3j.j beneficiaryAvatarMapper) {
        this.f185143a = 12;
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldsNameMapper, "beneficiaryAccountFieldsNameMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        this.f185144b = beneficiaryAvatarMapper;
    }

    public b0(kg.o gson) {
        this.f185143a = 7;
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f185144b = gson;
    }

    public b0(hyk.a onboardingRepository) {
        this.f185143a = 11;
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.f185144b = onboardingRepository;
    }

    public b0(npe.d countryPickerInteractor) {
        this.f185143a = 25;
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        this.f185144b = countryPickerInteractor;
    }

    public b0(j9l.a moneyCalculator) {
        this.f185143a = 5;
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f185144b = moneyCalculator;
    }

    public b0(wsg.b newWalletsInteractor) {
        this.f185143a = 1;
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f185144b = newWalletsInteractor;
    }

    public b0(xv.d framesProvider) {
        this.f185143a = 9;
        Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
        this.f185144b = framesProvider;
    }

    public b0(sf0.h serverErrorParser) {
        this.f185143a = 3;
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f185144b = serverErrorParser;
    }
}

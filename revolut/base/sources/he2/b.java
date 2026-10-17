package he2;

import android.view.ViewGroup;
import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingProduct;
import cu8.r0;
import dcl.q;
import dr3.j;
import dr3.k;
import e8.d0;
import er9.b0;
import igm.o;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks;
import le3.z;
import zhm.a0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements bi.b, z8.a, TypeCheckingProcedureCallbacks, j60.d, o, igm.g, pkm.b, kfm.o, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151527a;

    public /* synthetic */ b(int i) {
        this.f151527a = i;
    }

    public static /* synthetic */ void c(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // pkm.b
    public kotlin.time.d a() {
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        Intrinsics.checkNotNullParameter(instantNow, "<this>");
        pkm.g gVar = kotlin.time.d.Companion;
        long epochSecond = instantNow.getEpochSecond();
        int nano = instantNow.getNano();
        gVar.getClass();
        return pkm.g.a(nano, epochSecond);
    }

    @Override // igm.g
    public void accept(Object obj2) {
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f151527a) {
            case 21:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length != 5) {
                    throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
                }
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                Object obj5 = objArr[2];
                Object obj6 = objArr[3];
                Object obj7 = objArr[4];
                throw null;
            default:
                return z.f194507a.invoke(obj2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    public boolean assertEqualTypeConstructors(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (typeConstructor == null) {
            c(3);
            throw null;
        }
        if (typeConstructor2 != null) {
            return typeConstructor.equals(typeConstructor2);
        }
        c(4);
        throw null;
    }

    @Override // j60.d
    public ViewGroup b(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return controller.C2().h3();
    }

    @Override // z8.a
    public Object create() {
        return new d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r5 = this;
            java.lang.String r0 = "xiaomi"
            java.lang.String r1 = "oneplus"
            java.lang.String r2 = "samsung"
            java.lang.String r3 = "oppo"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = zhm.v.k(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            if (r1 == 0) goto L21
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L21
            goto L3f
        L21:
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r1 = kotlin.text.a0.z(r3, r1, r2)
            if (r1 == 0) goto L25
            goto L4e
        L3f:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "sm"
            boolean r0 = kotlin.text.a0.H(r0, r1, r2)
            if (r0 == 0) goto L4f
        L4e:
            return r2
        L4f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: he2.b.d():boolean");
    }

    public ArrayList e(List stakingProducts) {
        StakingProduct stakingProduct;
        Intrinsics.checkNotNullParameter(stakingProducts, "stakingProducts");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = stakingProducts.iterator();
        while (it8.hasNext()) {
            nwd.d stakingProductDto = (nwd.d) it8.next();
            Intrinsics.checkNotNullParameter(stakingProductDto, "stakingProductDto");
            try {
                String strB = stakingProductDto.getId();
                StakingInfo stakingInfoB = lvd.a.b(stakingProductDto);
                StakingModes stakingModesA = lvd.a.a(stakingProductDto);
                xi0.a aVar = xi0.b.Companion;
                String strA = stakingProductDto.getCurrency();
                aVar.getClass();
                stakingProduct = new StakingProduct(strB, stakingInfoB, stakingModesA, xi0.a.a(strA));
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                stakingProduct = null;
            }
            if (stakingProduct != null) {
                arrayList.add(stakingProduct);
            }
        }
        return arrayList;
    }

    public CompositeClause f(ej0.b bVar, ej0.b bVar2) {
        if (bVar == null || bVar2 == null) {
            return null;
        }
        BigDecimal bigDecimalB = wt5.a.b(bVar2, bVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimalB.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return u5l.a.f(bigDecimalMultiply);
    }

    @Override // bi.b
    public void g(bi.c cVar) {
        int i;
        String str = cVar.f15340a;
        int i2 = cVar.d;
        int length = str.length();
        if (i2 < length) {
            char cCharAt = str.charAt(i2);
            i = 0;
            while (ksj.b.o(cCharAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    cCharAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char cCharAt2 = str.charAt(cVar.d);
            char cCharAt3 = str.charAt(cVar.d + 1);
            if (ksj.b.o(cCharAt2) && ksj.b.o(cCharAt3)) {
                cVar.d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                cVar.d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = cVar.a();
        int iT = ksj.b.t(str, cVar.d, 0);
        if (iT == 0) {
            if (!ksj.b.q(cA)) {
                cVar.d((char) (cA + 1));
                cVar.d++;
                return;
            } else {
                cVar.d((char) 235);
                cVar.d((char) (cA - 127));
                cVar.d++;
                return;
            }
        }
        if (iT == 1) {
            cVar.d((char) 230);
            cVar.e = 1;
            return;
        }
        if (iT == 2) {
            cVar.d((char) 239);
            cVar.e = 2;
            return;
        }
        if (iT == 3) {
            cVar.d((char) 238);
            cVar.e = 3;
        } else if (iT == 4) {
            cVar.d((char) 240);
            cVar.e = 4;
        } else {
            if (iT != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iT)));
            }
            cVar.d((char) 231);
            cVar.e = 5;
        }
    }

    public ArrayList h(String sectionId, List items) {
        List listC;
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : items) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            CreditCardModel creditCardModel = (CreditCardModel) obj2;
            String listId = com.google.android.gms.internal.mlkit_vision_face.a.k(i, sectionId, "_");
            if (creditCardModel instanceof CreditCardCellModel) {
                listC = lt4.b.d(listId, (CreditCardCellModel) creditCardModel);
            } else {
                if (!(creditCardModel instanceof CreditCardLargeButtonModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardLargeButtonModel item = (CreditCardLargeButtonModel) creditCardModel;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(item, "item");
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButtonA = lt4.g.a(item.f68846c);
                TextClause textClause = new TextClause(item.f68844a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                CreditCardModelAction creditCardModelAction = item.f68845b;
                listC = u.c(new LargeActionButtonDelegate.Model(listId, defaultFilledButtonA, null, textClause, false, null, null, creditCardModelAction != null ? lt4.g.d(creditCardModelAction) : null, null, 744));
            }
            a0.x(listC, arrayList);
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public String toString() {
        switch (this.f151527a) {
            case 22:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public b(n80.b buildInfo) {
        this.f151527a = 8;
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
    }

    public b(r0 kycRequiredActionTransformer, z5j.d orderFlowCommandProvider) {
        this.f151527a = 3;
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(orderFlowCommandProvider, "orderFlowCommandProvider");
    }

    public b(lvd.a stakingProductDtoMapper) {
        this.f151527a = 24;
        Intrinsics.checkNotNullParameter(stakingProductDtoMapper, "stakingProductDtoMapper");
    }

    public b(v8i.c recurringPaymentMapper) {
        this.f151527a = 20;
        Intrinsics.checkNotNullParameter(recurringPaymentMapper, "recurringPaymentMapper");
    }

    public b(g7i.d hintProvider, g7i.b errorProvider) {
        this.f151527a = 13;
        Intrinsics.checkNotNullParameter(hintProvider, "hintProvider");
        Intrinsics.checkNotNullParameter(errorProvider, "errorProvider");
    }

    public b(z58.c travelRevPointsBannerControllerModelExtensionProvider) {
        this.f151527a = 5;
        Intrinsics.checkNotNullParameter(travelRevPointsBannerControllerModelExtensionProvider, "travelRevPointsBannerControllerModelExtensionProvider");
    }

    public b(z58.c revPointsOptInExtension, byte b4) {
        this.f151527a = 15;
        Intrinsics.checkNotNullParameter(revPointsOptInExtension, "revPointsOptInExtension");
    }

    public b(lt4.b creditCardCellModelMapper, lt4.e creditCardLargeButtonModelMapper) {
        this.f151527a = 26;
        Intrinsics.checkNotNullParameter(creditCardCellModelMapper, "creditCardCellModelMapper");
        Intrinsics.checkNotNullParameter(creditCardLargeButtonModelMapper, "creditCardLargeButtonModelMapper");
    }

    public b(wt5.a cryptoInvestmentsCalculations) {
        this.f151527a = 6;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
    }

    public b(ynj.g balanceCalculator) {
        this.f151527a = 14;
        Intrinsics.checkNotNullParameter(balanceCalculator, "balanceCalculator");
    }

    public b(thf.g transactionsItemMapper, pt5.f activityWidgetMapper) {
        this.f151527a = 7;
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(activityWidgetMapper, "activityWidgetMapper");
    }

    public b(nji.b controllerUtils) {
        this.f151527a = 19;
        Intrinsics.checkNotNullParameter(controllerUtils, "controllerUtils");
    }

    public b() {
        this.f151527a = 29;
        od0.i collateralBalanceGroupsProvider = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(collateralBalanceGroupsProvider, "collateralBalanceGroupsProvider");
    }

    public b(b0 repository, cl3.a contactsInteractor) {
        this.f151527a = 28;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
    }

    public b(b bVar, hsh.h hVar, q qVar) {
        this.f151527a = 17;
    }

    public b(boc.b actionUIResourcesMapper) {
        this.f151527a = 12;
        Intrinsics.checkNotNullParameter(actionUIResourcesMapper, "actionUIResourcesMapper");
    }

    public b(j rowItemDtoMapper, dr3.i labeledRowItemDtoMapper, k textItemDtoMapper, dr3.b carouselItemDtoMapper, dr3.c cellDetailsItemDtoMapper) {
        this.f151527a = 9;
        Intrinsics.checkNotNullParameter(rowItemDtoMapper, "rowItemDtoMapper");
        Intrinsics.checkNotNullParameter(labeledRowItemDtoMapper, "labeledRowItemDtoMapper");
        Intrinsics.checkNotNullParameter(textItemDtoMapper, "textItemDtoMapper");
        Intrinsics.checkNotNullParameter(carouselItemDtoMapper, "carouselItemDtoMapper");
        Intrinsics.checkNotNullParameter(cellDetailsItemDtoMapper, "cellDetailsItemDtoMapper");
    }
}

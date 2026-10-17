package kye;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190772a;

    public /* synthetic */ l0(int i) {
        this.f190772a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        boolean z = false;
        switch (this.f190772a) {
            case 0:
                Throwable error = (Throwable) obj2;
                t61.g gVar = (t61.g) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (gVar == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable error3 = (Throwable) obj2;
                t61.g gVar2 = (t61.g) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (gVar2 == null) {
                    return error3;
                }
                return null;
            case 3:
                SelectedMethod selectedMethod = (SelectedMethod) obj2;
                SelectedMethod selectedMethod2 = (SelectedMethod) obj3;
                if (selectedMethod instanceof SelectedMethod.StoredMethod.Card) {
                    SelectedMethod.StoredMethod.Card card = (SelectedMethod.StoredMethod.Card) selectedMethod;
                    if (card.f90908j == null && (selectedMethod2 instanceof SelectedMethod.StoredMethod.Card)) {
                        SelectedMethod.StoredMethod.Card card2 = (SelectedMethod.StoredMethod.Card) selectedMethod2;
                        if (card2.f90908j == null && Intrinsics.f(card.f90903a, card2.f90903a) && card.k == card2.k) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return null;
            case 5:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 6:
                Throwable error4 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (fVar == null) {
                    return error4;
                }
                return null;
            case 7:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), new lw0.h(lw0.i.AVATAR));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "getDefaultErrorItems");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "getDefaultErrorItems");
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "getDefaultErrorItems");
                return null;
            case 11:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 12:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                CdnImage cdnImage = l13.m.f191444a;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return l13.m.b(new l13.g(false, false, false));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new l1k.k(null, null, l1k.o.b());
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 18:
                Throwable th11 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                if (th11 != null) {
                    throw th11;
                }
                throw new NoSuchElementException("Remote deeplink requests not found");
            case 19:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 20:
                Throwable th12 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th12;
                }
                return null;
            case 21:
                Throwable th13 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                if (th13 != null) {
                    throw th13;
                }
                throw new NoSuchElementException("Card requests not found");
            case 22:
                Throwable th14 = (Throwable) obj2;
                if (((rp0.y) obj3) == null) {
                    return th14;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 24:
                Throwable error6 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool == null) {
                    return error6;
                }
                return null;
            case 25:
                Throwable error7 = (Throwable) obj2;
                wel.e eVar = (wel.e) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (eVar == null) {
                    return error7;
                }
                return null;
            case 26:
                Throwable error8 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool2 == null) {
                    return error8;
                }
                return null;
            case 27:
                Throwable error9 = (Throwable) obj2;
                wel.e eVar2 = (wel.e) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (eVar2 == null) {
                    return error9;
                }
                return null;
            case 28:
                Throwable error10 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (iVar == null) {
                    return error10;
                }
                return null;
            default:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
        }
    }

    public /* synthetic */ l0(Object obj2, int i) {
        this.f190772a = i;
    }
}

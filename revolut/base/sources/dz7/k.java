package dz7;

import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerContract$Configuration;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerPresenter$ApplicationIdRetrieveError;
import com.revolut.feature.selfserve.sow.impl.ui.note.SowNoteFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import e0f.z;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121274a;

    public /* synthetic */ k(int i) {
        this.f121274a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        boolean z = true;
        switch (this.f121274a) {
            case 0:
                List petIds = (List) obj2;
                Intrinsics.checkNotNullParameter(petIds, "petIds");
                return petIds;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return dzb.k.b();
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return iii.c.c(2);
            case 3:
                dze.c update = (dze.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return dze.c.a(update, false, 14);
            case 4:
                dze.c update2 = (dze.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return dze.c.a(update2, false, 11);
            case 5:
                dze.c update3 = (dze.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return dze.c.a(update3, false, 7);
            case 6:
                dze.c update4 = (dze.c) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return dze.c.a(update4, true, 13);
            case 7:
                dze.c update5 = (dze.c) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return dze.c.a(update5, false, 13);
            case 8:
                ForbearanceSpinnerContract$Configuration it8 = (ForbearanceSpinnerContract$Configuration) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.f69946a;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (Object obj3 : list) {
                    int i = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList2.add(new Pair((Clause) obj3, it8.f69947b.get(i)));
                    i = i;
                }
                return arrayList2;
            case 9:
                k3l.j it9 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9 instanceof k3l.h);
            case 10:
                NaviCommand it10 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return r6.b.g(null, null, null, 7, it10);
            case 11:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 instanceof ForbearanceSpinnerPresenter$ApplicationIdRetrieveError);
            case 12:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 13:
                InputTextDelegate.TextData it12 = (InputTextDelegate.TextData) obj2;
                int i2 = SowNoteFragment.g0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f52598b;
            case 14:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                Iterator it13 = cards.iterator();
                if (!it13.hasNext()) {
                    return null;
                }
                String str = ((t61.g) it13.next()).d;
                throw null;
            case 15:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                if (((t61.g) it14.getContent()) != null) {
                    throw null;
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 16:
                Data it15 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                try {
                    Object content = it15.getContent();
                    if (content != null) {
                        List list2 = (List) content;
                        arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it16 = list2.iterator();
                        while (it16.hasNext()) {
                            arrayList.add(z.f((t61.g) it16.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    return new Data(arrayList, it15.getError(), it15.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, it15.getLoading());
                }
            case 17:
                Data issuerData = (Data) obj2;
                Intrinsics.checkNotNullParameter(issuerData, "issuerData");
                try {
                    Object content2 = issuerData.getContent();
                    return new Data(content2 != null ? t61.j.a((t61.j) content2) : null, issuerData.getError(), issuerData.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, issuerData.getLoading());
                }
            case 18:
                Data it17 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                try {
                    Object content3 = it17.getContent();
                    return new Data(content3 != null ? z.f((t61.g) content3) : null, it17.getError(), it17.getLoading());
                } catch (Throwable th12) {
                    return new Data(null, th12, it17.getLoading());
                }
            case 19:
                Data walletData = (Data) obj2;
                Intrinsics.checkNotNullParameter(walletData, "walletData");
                fo3.c cVar = (fo3.c) walletData.getContent();
                if (cVar != null) {
                    efm.r rVarJust = efm.r.just(Boolean.valueOf(((cVar.e > 0 || cVar.f136804g != null) ? 1 : 0) ^ 1));
                    if (rVarJust != null) {
                        return rVarJust;
                    }
                }
                return efm.r.empty();
            case 20:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 21:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSetL = a1.l(config.P, config.O);
                Set set = config.Q;
                ArrayList arrayList3 = new ArrayList(w.t(set, 10));
                Iterator it18 = set.iterator();
                while (it18.hasNext()) {
                    arrayList3.add(((xi0.b) it18.next()).f306286a);
                }
                return a1.l(linkedHashSetL, arrayList3);
            case 22:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fo3.c cVar2 = (fo3.c) pair.f186385a;
                if (!ngm.n.p(((yt8.c) pair.f186386b).f316662a) && cVar2.h() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                com.revolut.domain.models.topup.methods.b it19 = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.d;
            case 24:
                xel.f it20 = (xel.f) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f304713a;
            case 25:
                return BorderKt.drawContentWithoutBorder$lambda$0((ContentDrawScope) obj2);
            case 26:
                return AndroidOverscroll_androidKt.defaultOverscrollFactory((CompositionLocalAccessorScope) obj2);
            case 27:
                return ProgressSemanticsKt.progressSemantics$lambda$1((SemanticsPropertyReceiver) obj2);
            case 28:
                return ScrollState.Saver$lambda$1(((Integer) obj2).intValue());
            default:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                while (i < 4) {
                    arrayListP.add(nb0.b(pb0.Companion, String.valueOf(i), false, 0, false, 30));
                    i++;
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f121274a = i;
    }
}

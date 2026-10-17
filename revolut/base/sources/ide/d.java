package ide;

import ahe.m0;
import boh.f;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.shared.help_centre.api.faq.FaqEntriesScreenDestination;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import o97.l;
import o97.m;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import wf0.a0;
import z87.e;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f160478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f160479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f160480c;

    public d(a0 faqSearchInteractor, n sharedHelpWidgetsInteractor) {
        Intrinsics.checkNotNullParameter(faqSearchInteractor, "faqSearchInteractor");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        this.f160478a = faqSearchInteractor;
        this.f160479b = r.HELPCENTRE;
        this.f160480c = m.FAQ;
    }

    @Override // z87.e
    public final m a() {
        return this.f160480c;
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        return rd0.e.c(new m0(rd0.e.e(new ghk.a0(f.e(rd0.e.b(remoteObservable), new i25.e(this, searchQuery, 17)), this, 29), h0.f322473a, new i23.c(3, 2, null)), 5), g.f186406a);
    }

    @Override // z87.f
    public final r h() {
        return this.f160479b;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        String str2;
        if (kotlin.text.a0.H(str, "LIST_ID_SEARCH_ITEM.", false)) {
            Object obj2 = yVar.f223136b;
            FaqMetaData faqMetaData = obj2 instanceof FaqMetaData ? (FaqMetaData) obj2 : null;
            if (faqMetaData != null && (str2 = faqMetaData.f51419a) != null) {
                return new l(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(str2, 6), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61)));
            }
        } else if (str.equals("LIST_ID_SEARCH_TITLE")) {
            Object obj3 = yVar.f223136b;
            FaqEntriesScreenDestination.InputData inputData = obj3 instanceof FaqEntriesScreenDestination.InputData ? (FaqEntriesScreenDestination.InputData) obj3 : null;
            if (inputData != null) {
                return new l(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new FaqEntriesScreenDestination(new FaqEntriesScreenDestination.InputData(inputData.f86104a, inputData.f86105b)), false, (Integer) null, 0, 61)));
            }
        }
        return o97.e.f223096a;
    }
}

package nhe;

import com.google.common.collect.ImmutableMap;
import g48.r0;
import java.util.LinkedHashMap;
import java.util.Map;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import rp0.l0;
import zhm.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f215448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oqk.l f215449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ahe.n f215450c;
    public final ahe.t d;
    public final uge.e e;
    public final wsg.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f215451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ang.f f215452h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f215453j;

    public t(ImmutableMap navigationHandlerProviders, oqk.l transactionsWidgetActionExtensionProvider, ahe.n hiddenPlaceholdersRepository, ahe.t totalWealthInteractor, uge.e addNewProductDestinationFactory, wsg.b walletsInteractor, r0 jointAccountsInteractor, ang.f userInteractor, g accountDetailsPickerMapper, c0 apmHomeActionDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigationHandlerProviders, "navigationHandlerProviders");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(hiddenPlaceholdersRepository, "hiddenPlaceholdersRepository");
        Intrinsics.checkNotNullParameter(totalWealthInteractor, "totalWealthInteractor");
        Intrinsics.checkNotNullParameter(addNewProductDestinationFactory, "addNewProductDestinationFactory");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsPickerMapper, "accountDetailsPickerMapper");
        Intrinsics.checkNotNullParameter(apmHomeActionDestinationResolver, "apmHomeActionDestinationResolver");
        this.f215448a = navigationHandlerProviders;
        this.f215449b = transactionsWidgetActionExtensionProvider;
        this.f215450c = hiddenPlaceholdersRepository;
        this.d = totalWealthInteractor;
        this.e = addNewProductDestinationFactory;
        this.f = walletsInteractor;
        this.f215451g = jointAccountsInteractor;
        this.f215452h = userInteractor;
        this.i = accountDetailsPickerMapper;
        this.f215453j = apmHomeActionDestinationResolver;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Map map = this.f215448a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((yfe.d) entry.getValue()).a());
        }
        oqk.k kVarA = this.f215449b.a(bottomDialogExtension, popupMenuDialogDisplayer);
        f fVar = new f(this.f, this.f215451g, this.f215452h, this.i);
        return new s(linkedHashMap, kVarA, this.f215450c, this.d, bottomDialogExtension, popupMenuDialogDisplayer, shotDialogDisplayer, this.e, fVar, this.f215453j);
    }
}

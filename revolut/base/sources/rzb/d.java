package rzb;

import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ozb.e;
import zjh.j;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f258582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f258583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f258584c;

    public d(f01.c uiKitResources, e revPointsDisclaimerUIMapper, j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(revPointsDisclaimerUIMapper, "revPointsDisclaimerUIMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f258582a = uiKitResources;
        this.f258583b = revPointsDisclaimerUIMapper;
        this.f258584c = legalEntityDisclaimerMapper;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(nb0.a(pb0.Companion, String.valueOf(i), false, 6));
        }
        return arrayList;
    }
}

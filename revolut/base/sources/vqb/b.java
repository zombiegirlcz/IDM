package vqb;

import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f291367a;

    public b(q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f291367a = deeplinkParser;
    }

    public final SlotChecklistFetchConfig a(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        jf0.c cVarD = ((s06.c) this.f291367a).d(deeplink);
        String str = null;
        if (cVarD != null && Intrinsics.f(cVarD.e(1), "slots") && Intrinsics.f(cVarD.e(2), "checklists")) {
            String strE = cVarD.e(3);
            if (strE.length() != 0) {
                String strE2 = cVarD.e(4);
                if (strE2.length() != 0) {
                    String str2 = (String) cVarD.d.get("targetId");
                    if (str2 != null && str2.length() != 0) {
                        str = str2;
                    }
                    return new SlotChecklistFetchConfig(strE, str, strE2);
                }
            }
        }
        return null;
    }
}

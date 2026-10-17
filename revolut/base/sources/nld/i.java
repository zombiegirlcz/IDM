package nld;

import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f217121a;

    public i(qld.b stepMainImageMapper, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(stepMainImageMapper, "stepMainImageMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f217121a = uiKitResources;
    }

    public final int a(String str) {
        int iA = this.f217121a.a(str);
        if (iA != 0) {
            return iA;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str, " not found"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return R$drawable.uikit_icn_24_revolut;
    }
}

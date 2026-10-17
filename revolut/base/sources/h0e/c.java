package h0e;

import kotlin.jvm.internal.Intrinsics;
import wxd.z;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f148376a = new c();

    private c() {
    }

    public static String a(z setting) {
        Intrinsics.checkNotNullParameter("documents-hub:custom-filter", "listIdPrefix");
        Intrinsics.checkNotNullParameter(setting, "setting");
        return j6.a.q("documents-hub:custom-filter:", setting.b());
    }
}

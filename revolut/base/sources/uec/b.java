package uec;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f279331b = j6.a.q(",", m70.a.o(t0.f186434a));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f279332a;

    public b(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f279332a = languageProvider;
    }

    public static String a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str = (String) obj2;
            if (str != null && !d0.W(str)) {
                arrayList.add(obj2);
            }
        }
        List list2 = (List) ue0.e.M(arrayList);
        if (list2 != null) {
            return zhm.d0.k0(list2, ", ", null, null, 0, null, 62);
        }
        return null;
    }
}

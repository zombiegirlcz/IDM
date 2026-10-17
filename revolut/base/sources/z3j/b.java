package z3j;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usc.a f319297a;

    public b(usc.a ibanValidator) {
        Intrinsics.checkNotNullParameter(ibanValidator, "ibanValidator");
        this.f319297a = ibanValidator;
    }

    public static boolean a(String str, wi0.b bVar, wi0.b bVar2, String str2) {
        if (bVar.equals(bVar2)) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        return !new Regex(j6.a.q("^", str)).a(str2);
    }
}

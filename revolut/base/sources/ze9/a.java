package ze9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ye9.e;
import yqi.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements f {

    @NotNull
    public static final C1782a Companion = new C1782a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f321646a = new Regex("^.*[a-zA-Z].*$");

    /* JADX INFO: renamed from: ze9.a$a, reason: collision with other inner class name */
    public static final class C1782a {
        private C1782a() {
        }
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        String validationData = (String) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (!f321646a.f(validationData)) {
            return new yqi.d(validationData, e.f312825a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}

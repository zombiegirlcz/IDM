package dwi;

import java.text.Normalizer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.n0 f120441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ewi.a f120442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Regex f120443c;

    public n0(hwi.n0 repository, ewi.a textNormalizer) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(textNormalizer, "textNormalizer");
        this.f120441a = repository;
        this.f120442b = textNormalizer;
        this.f120443c = new Regex("\\s+");
    }

    public static int a(String str, String str2) {
        int iT = kotlin.text.d0.T(str, str2, 0, true, 2);
        if (iT != -1) {
            return iT != 0 ? 1 : 3;
        }
        return 0;
    }

    public final String b(String input) {
        ewi.a aVar = this.f120442b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        String strNormalize = Normalizer.normalize(input, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        Regex regex = aVar.f130296a;
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return regex.replace(strNormalize, "");
    }
}

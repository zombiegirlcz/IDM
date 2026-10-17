package e55;

import dr3.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nx4.f1;
import z45.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f122769a;

    public a(g creditPromptContentDtoMapper, f1 headerDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        Intrinsics.checkNotNullParameter(headerDtoMapper, "headerDtoMapper");
        this.f122769a = creditPromptContentDtoMapper;
    }

    public static b a(j55.a aVar) {
        return new b(aVar.getText(), b(aVar.getAction()));
    }

    public static z45.a b(String str) {
        z45.a aVar;
        if (str != null) {
            z45.a[] aVarArrValues = z45.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i];
                if (a0.z(aVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return z45.a.UNKNOWN;
    }
}
